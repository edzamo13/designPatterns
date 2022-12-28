package ec.com.patrones.diseño.patron.observer;

/**
 * Interfaz que debera implementar todo aquel objeto del que queramos controlar
 * su estado
 *
 * @author SEAS - Estudios Abiertos
 */
public interface IObservable {

    /**
     * Metodo para añadir un objeto observador al objeto observable,
     * @param observer objeto que implementa la interfaz IObserver.
     */
    void addObserver(IObserver observer);

    /**
     * Metodo para eliminar un objeto observador al objeto observable,
     * @param observer objeto que implementa la interfaz IObserver.
     */
    void removeObserver(IObserver observer);
}


