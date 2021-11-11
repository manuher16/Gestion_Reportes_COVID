
public class Pais {
	private String nombre;
	private double SocialSupport;
	private double HealthyLifeExpectancy;
	private double FreedomChoice;
	private double Generosity;
	private double PerceptionsCorruption;
	public Pais(String nombre,double SocialSupport,double HealthyLifeExpectancy,double FreedomChoice,double Generosity,double PerceptionsCorruption) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.SocialSupport=SocialSupport;
		this.HealthyLifeExpectancy=HealthyLifeExpectancy;
		this.FreedomChoice=FreedomChoice;
		this.Generosity=Generosity;
		this.PerceptionsCorruption=PerceptionsCorruption;
	}
	@Override
	public String toString() {
		return  this.nombre + ";" + this.SocialSupport + ";" + this.HealthyLifeExpectancy + ";" + this.FreedomChoice + ";"
				+ this.Generosity + ";" + this.PerceptionsCorruption+"\n";
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSocialSupport() {
		return this.SocialSupport;
	}
	public void setSocialSupport(double socialSupport) {
		this.SocialSupport = socialSupport;
	}
	public double getHealthyLifeExpectancy() {
		return this.HealthyLifeExpectancy;
	}
	public void setHealthyLifeExpectancy(double healthyLifeExpectancy) {
		this.HealthyLifeExpectancy = healthyLifeExpectancy;
	}
	public double getFreedomChoice() {
		return this.FreedomChoice;
	}
	public void setFreedomChoice(double freedomChoice) {
		this.FreedomChoice = freedomChoice;
	}
	public double getGenerosity() {
		return this.Generosity;
	}
	public void setGenerosity(double generosity) {
		this.Generosity = generosity;
	}
	public double getPerceptionsCorruption() {
		return this.PerceptionsCorruption;
	}
	public void setPerceptionsCorruption(double perceptionsCorruption) {
		this.PerceptionsCorruption = perceptionsCorruption;
	}
	

}
