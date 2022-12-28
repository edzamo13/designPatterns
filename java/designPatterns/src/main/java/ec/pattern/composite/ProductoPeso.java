package ec.com.patrones.diseño.patron.composite;

/**
 * Clase que define los productos que se cobran al peso.
 *
 * @author SEAS - Estudios abiertos.
 */
public class ProductoPeso implements IPrecio {

    private double peso;
    private double precioPorPeso;
    private String nombre;
    private String categoria;

    /**
     * Constructor parametrizado de los objetos.
     *
     * @param peso double peso del producto.
     * @param precioPorPeso double precio por unidad de peso.
     * @param nombre String nombre del producto.
     * @param categoria String categoria del producto.
     */
    public ProductoPeso(double peso, double precioPorPeso, String nombre, String categoria) {
        this.peso = peso;
        this.precioPorPeso = precioPorPeso;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    /**
     * Getter del peso del producto.
     *
     * @return double peso.
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Setter del peso del producto.
     *
     * @param peso double peso.
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Getter del peso por producto.
     *
     * @return double precio por peso.
     */
    public double getPrecioPorPeso() {
        return precioPorPeso;
    }

    /**
     * Setter del precio por unidad de peso del producto.
     *
     * @param precioPorPeso double precio por unidad peso.
     */
    public void setPrecioPorPeso(double precioPorPeso) {
        this.precioPorPeso = precioPorPeso;
    }

    /**
     * Getter del nombre.
     *
     * @return String nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre.
     *
     * @param nombre String nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de la categoria.
     *
     * @return String nombre de la categoria del producto.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Setter de la categoria.
     *
     * @param categoria String categoria del producto.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Metodo implementado obligatoriamente por la interfaz IPrecio que devuelve
     * el importe total del producto.
     *
     * @return double importe total.
     */
    public double getImporteTotal() {
        return getPrecioPorPeso() * getPeso();
    }
}
