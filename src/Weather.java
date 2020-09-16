
public class Weather extends Observable {
	
	private double temperatura;
	
	public Weather(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public double getTemperatura() {
		return this.temperatura;
	}
	
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
		
		this.notifyObservers();
	}
}
