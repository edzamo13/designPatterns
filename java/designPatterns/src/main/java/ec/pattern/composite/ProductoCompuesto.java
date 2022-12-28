package ec.com.patrones.diseño.patron.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que describe todos aquellos productos que pueden estar compuestos por
 * productos mas pequeños.
 *
 * @author SEAS - Estudios abiertos.
 */
public class ProductoCompuesto implements IPrecio {

    /**
     * Coleccion de elementos que implementan la interfaz IPrecio y que componen
     * el producto compuesto.
     */
    private ArrayList<IPrecio> productos;

    /**
     * Constructor minimo que inicializa el array.
     */
    public ProductoCompuesto() {
        productos = new ArrayList<IPrecio>();
    }

    /**
     * Metodo para añadir elementos al array.
     *
     * @param precio IPrecio objeto que implementa esa interfaz.
     */
    public void addProducto(IPrecio precio) {
        productos.add(precio);
    }

    /**
     * Metodo que elimina elementos del producto.
     *
     * @param precio IPrecio elemento a eliminar.
     */
    public void removeProducto(IPrecio precio) {
        productos.remove(precio);
    }

    /**
     * Metodo quu devuelve el ArrayList de productos IPrecio.
     *
     * @return ArrayList<IPrecio> productos.
     */
    public ArrayList<IPrecio> getProductos() {
        return productos;
    }

    /**
     * Metodo que calcula el importe total de todos los productos y sus
     * componentes implementado obligatoriamente por la interfaz IPrecio.
     *
     * @return double importe total.
     */
    public double getImporteTotal() {
        double importeTotal = 0;
        for (Iterator<IPrecio> it = productos.iterator(); it.hasNext();) {
            IPrecio iPrecio = it.next();
            importeTotal += iPrecio.getImporteTotal();
        }
        return importeTotal;
    }
}
