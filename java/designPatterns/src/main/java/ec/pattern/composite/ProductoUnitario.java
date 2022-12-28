package ec.com.patrones.diseño.patron.composite;

/**
 * Clase que define un producto de precio por unidad.
 * @author SEAS - Estudios abiertos.
 */
public class ProductoUnitario implements IPrecio {

    private int cantidad;
    private double precio;
    private String nombre;
    private String categoria;

    /**
     * Constructor parametrizado de los objetos de esta clase.
     * @param cantidad int numero de unidades del producto.
     * @param precio double precio por unidad.
     * @param nombre String nombre del producto.
     * @param categoria String categoria del producto.
     */
    public ProductoUnitario(int cantidad, double precio, String nombre, String categoria) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    /**
     * Getter de la cantidad de unidades.
     * @return int cantidad.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Setter de la cantidad de unidades.
     * @param cantidad int numero de unidades.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Getter del precio por unidad.
     * @return double precio unitario.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter del precio por unidad.
     * @param precio double precio unitario.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Getter del nombre.
     * @return String nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre.
     * @param nombre String nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de la categoria.
     * @return String nombre de la categoria del producto.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Setter de la categoria.
     * @param categoria String categoria del producto.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Metodo implementado obligatoriamente por la interfaz IPrecio que devuelve
     * el importe total del producto.
     * @return double importe total.
     */
    public double getImporteTotal() {
        return getCantidad() * getPrecio();
    }
}
