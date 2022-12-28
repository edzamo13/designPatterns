package ec.com.patrones.diseño.patron.composite;

/**
 * Interfaz que define el comportamiento que queremos propagar por los objetos.
 * @author SEAS - Estudios abiertos.
 */
public interface IPrecio {
    
    /**
     * Metodo que devuelve un valor double correspondiente al precio total del 
     * elemento.
     * @return double importe total del elemento.
     */
    double getImporteTotal();
}
