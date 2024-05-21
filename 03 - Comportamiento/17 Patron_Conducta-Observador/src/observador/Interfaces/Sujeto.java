package observador.Interfaces;

public interface Sujeto {
	void addObserver(Observador o);
	void removeObserver(Observador o);
	void notifyObservers();
}