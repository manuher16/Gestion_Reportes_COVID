import java.util.List;
import java.util.ArrayList;

public class Region {
	private List<Pais> paises =new ArrayList<>();
	private String nombre;
	private double pSocial;
	private double pHealtyl;
	private double pFreedom;
	private double pGenerosity;
	private double pPerception;
	private String altaPaisCorrupcion;
	private double valorPaisCorrupcion;
	private String altaPaisgenorisidad;
	private double valorPaisGenerosidad;
	
	public Region(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.pSocial=0;
		this.pFreedom=0;
		this.pGenerosity=0;
		this.pPerception=0;
		this.pHealtyl=0;
		this.altaPaisCorrupcion="corrupto";
		this.altaPaisgenorisidad="generoso";
		this.valorPaisCorrupcion=0;
		this.valorPaisGenerosidad=0;
	}
	public void promediar() {
		
		for(Pais pais:this.paises) {
			this.pSocial=this.pSocial+pais.getSocialSupport();
			this.pHealtyl=this.pHealtyl+pais.getHealthyLifeExpectancy();
			this.pFreedom=this.pFreedom+pais.getFreedomChoice();
			this.pGenerosity=this.pGenerosity+pais.getGenerosity();
			this.pPerception=this.pPerception+pais.getPerceptionsCorruption();
			
			if(this.valorPaisCorrupcion<pais.getPerceptionsCorruption()) {
				
				this.valorPaisCorrupcion=pais.getPerceptionsCorruption();
				this.altaPaisCorrupcion=pais.getNombre();
			}
			if(this.valorPaisGenerosidad<pais.getGenerosity()) {
				
				this.valorPaisGenerosidad=pais.getGenerosity();
				this.altaPaisgenorisidad=pais.getNombre();
			}
		}
		System.out.printf("\n=============La region: %s======================\nTiene las siguientes Medias\n\n• “Social support”: %s\n• “Healthy life expectancy”: %s\n• “Freedom to make life choices”: %s\n• “Generosity”: %s\n• “Perceptions of corruption”: %s\n• País con la más alta percepción de corrupción: %s\n• País con la mas alta generosidad: %s\n\n", this.nombre,this.pSocial,this.pHealtyl,this.pFreedom,this.pGenerosity,this.pPerception,this.altaPaisCorrupcion,this.altaPaisgenorisidad);
		
	}
	public List<Pais> getPaises() {
		return this.paises;
	}
	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}
	public void agregarPais(String nombre,double SocialSupport,double HealthyLifeExpectancy,double FreedomChoice,double Generosity,double PerceptionsCorruption) {
		paises.add(new Pais( nombre, SocialSupport, HealthyLifeExpectancy, FreedomChoice, Generosity, PerceptionsCorruption));
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getFormatoCVS() {
		StringBuilder resultado=new StringBuilder("Country name;Social support;Healthy life expectancy;Freedom to make life choices;Generosity;Perceptions of corruption\n");
		for(Pais pais:this.paises) {
			resultado.append(pais.toString());
		}
		
		return resultado.toString();
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
