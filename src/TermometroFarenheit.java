public class TermometroFarenheit extends Termometro{
	public TermometroFarenheit(Weather weather, String nombre) {
		super(weather, nombre);
		this.tipoTemperatura = "°F";
	}
	
	public double getTemperatura() {
		double temperatura = super.getTemperatura();
	
		return (temperatura * (9/5)) + 32;
	}
}
