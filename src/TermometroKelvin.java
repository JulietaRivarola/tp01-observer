
public class TermometroKelvin extends Termometro {

	public TermometroKelvin(Weather weather, String nombre) {
		super(weather, nombre);
		this.tipoTemperatura = "K";
	}
	
	public double getTemperatura() {
		double temperatura = super.getTemperatura();
	
		return (temperatura  + 273.15);
	}

}
