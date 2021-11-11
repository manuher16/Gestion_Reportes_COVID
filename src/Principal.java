import java.util.ArrayList;
import java.util.List;

public class Principal {

	public Principal() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reporte reporte= new Reporte();
		//Direccion donde se va leer el archivos
		reporte.leerArchivo("DataForFigure2.1WHR2021C2.csv");
		reporte.reportePromedioRegiones();
		
		//Creamos una lista para los hilos
		List<Gestor> hilos=new ArrayList<>();
		for(Region region:reporte.getRegiones()) {
			//asignamos el contenido para generar los archivos por regiones
			hilos.add(new Gestor(region.getFormatoCVS(),region.getNombre()));
		}
		//Iniciamos todos los hilos 
		for(Gestor hilo:hilos) {
			hilo.start();
		}
		
	}

}
