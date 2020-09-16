import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Weather weather = new Weather(15);
		Termometro termo1 = new TermometroCelsius(weather, "Jorge");
		Termometro termo2 = new TermometroFarenheit(weather, "Miguel");
		Termometro termo3 = new TermometroKelvin(weather, "Juan");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			double temperatura = 0;
			System.out.print("Ingresar la temperatura: ");
			temperatura = s.nextDouble();
			weather.setTemperatura(temperatura);
		}
	}
}
