public abstract class Termometro implements Observer{
	private Weather observable;
	private String nombre;
	protected String tipoTemperatura;
	
	public Termometro(Weather observable, String nombre) {
		this.observable = observable;
		this.nombre = nombre;
		this.observable.attach(this);
	}
	
	public double getTemperatura() {
		return this.observable.getTemperatura();
	}
	
	public void update() {
		System.out.println(String.format("%s registro el cambio de temperatura: %s %s", this.nombre, this.getTemperatura(), this.tipoTemperatura));
	}
}
