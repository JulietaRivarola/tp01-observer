public class TermometroCelsius extends Termometro{
	public TermometroCelsius(Weather weather, String nombre) {
		super(weather, nombre);
		this.tipoTemperatura = "°C";
	}
	
	public double getTemperatura() {
		return super.getTemperatura();
	}
}
