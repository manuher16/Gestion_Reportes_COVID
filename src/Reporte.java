import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Reporte {
	private List<Region> regiones=new ArrayList<>();
	
	public Reporte() {
		// TODO Auto-generated constructor stub
	}
	public void leerArchivo(String path) {
		try{
			List<String> list = new ArrayList<>();
			int count=0;
		    File inputF = new File(path);
		    InputStream inputFS = new FileInputStream(inputF);
		    BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
		  
		    
		    list=br.lines().collect(Collectors.toList());
		    for(String line:list) {
		    	if(count!=0) {
		    		if(!this.verificarRegion(line.split(";")[1],line)) {
		    			
		    		}
		    	}
		    count++;  
		    }
		    br.close();
		  } catch (IOException e) {
		    System.out.println("Errro leer archivo");
		 }
	}
	public boolean verificarRegion(String region,String line) {
		if(this.regiones.size()==0) {
			this.regiones.add(new Region(region));
			this.regiones.get(0).agregarPais(line.split(";")[0], Double.parseDouble(line.split(";")[7].replace(",",".")), Double.parseDouble(line.split(";")[8].replace(",",".")), Double.parseDouble(line.split(";")[9].replace(",",".")), Double.parseDouble(line.split(";")[10].replace(",",".")), Double.parseDouble(line.split(";")[11].replace(",",".")));

			return false;
		}else {
			
			for(int i=0 ;i<this.regiones.size();i++) {
				if(this.regiones.get(i).getNombre().matches(region)) {
					
//					System.out.printf("%s %s %s %s %s %s\n",line.split(";")[0], Double.parseDouble(line.split(";")[7].replace(",",".")), Double.parseDouble(line.split(";")[8].replace(",",".")), Double.parseDouble(line.split(";")[9].replace(",",".")), Double.parseDouble(line.split(";")[10].replace(",",".")), Double.parseDouble(line.split(";")[11].replace(",",".")));
					this.regiones.get(i).agregarPais(line.split(";")[0], Double.parseDouble(line.split(";")[7].replace(",",".")), Double.parseDouble(line.split(";")[8].replace(",",".")), Double.parseDouble(line.split(";")[9].replace(",",".")), Double.parseDouble(line.split(";")[10].replace(",",".")), Double.parseDouble(line.split(";")[11].replace(",",".")));
					return true;
				}
			}
			this.regiones.add(new Region(region));
			return false;
		}
		
	}
	public void reportePromedioRegiones() {
		for(Region region:this.regiones) {
			region.promediar();
		}
	}
	public List<Region> getRegiones() {
		return this.regiones;
	}
	public void setRegiones(List<Region> regiones) {
		this.regiones = regiones;
	}
	

}
