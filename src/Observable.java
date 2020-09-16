import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T> {
	
	List<Observer> observers = new ArrayList<Observer>();
	
	/**
	 * Notifica a los observers que ocurrio
	 * un cambio en el estado
	 */
	public void notifyObservers() {
		for(Observer observer : observers) {
				observer.update();
		}
	}
	
	/**
	 * Agrega un Observer a la lista
	 * de Observers que escuchan al observable
	 * @param observer Observer a agregar
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * Quita a un observer del listado
	 * de Observers
	 * @param observer Observer a retirar del listado
	 * @return Si fue posible remover al Obserevr
	 */
	public boolean detach(Observer observer) {
		return observers.remove(observer);
	}
	
	public T getState() {
		return null;
	}
}
