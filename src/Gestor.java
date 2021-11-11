import java.io.FileOutputStream;
import java.io.OutputStream;

public class Gestor extends Thread{
	private String contenido;
	private String nombre;
	public Gestor(String contenido,String nombre) {
		// TODO Auto-generated constructor stub
		this.contenido=contenido;
		this.nombre=nombre;
	}
	public void run(){
		try {
		
		OutputStream os = new FileOutputStream(String.format("%s.csv",this.nombre));  
		os.write(contenido.getBytes());
		}catch (Exception ex) {  
	         ex.printStackTrace();  
	      }  
	}

}
