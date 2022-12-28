package ec.com.patrones.diseño.patron.observer;

/**
 * Interfaz que deberan implementar todos aquellos objetos que deban responder a
 * los cambios de estado de los objetos observados.
 *
 * @author SEAS - Estudios Abiertos
 */
public interface IObserver {

    /**
     * Metodo donde se realizara las operaciones asociadas al cambio de estado.
     */
    void update();
}



