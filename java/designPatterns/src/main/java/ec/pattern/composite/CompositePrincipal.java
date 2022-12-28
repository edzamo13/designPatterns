package ec.com.patrones.diseño.patron.composite;

/**
 * Clase principal del ejemplo del patrón Composite
 *
 * @author SEAS - Estudios abiertos.
 */
public class CompositePrincipal {

    /**
     * Metodo main con el desarrollo del ejemplo.
     *
     * @param args String[] parametros.
     */
    public static void main(String[] args) {
        //Creamos un nuevo pedido
        Pedido pedido = new Pedido("SEAS - Estudios Abiertos");
        //Producto que se vende a peso y a un precio por kilogramo.
        ProductoPeso jamon = new ProductoPeso(5.0, 10.0, "Jamón Ibérico", "Embutidos");
        ProductoPeso lomo =
                new ProductoPeso(0.8, 5.0, "Lomo Ibérico", "Embutidos");
        //Producto que se vende a un precio por unidad y por un numero de 
        //unidades determinadas.
        ProductoUnitario paqueteDeEspaguetis =
                new ProductoUnitario(3, 1.50, "Paquete de espaguetis", "Pasta");
        ProductoUnitario vino =
                new ProductoUnitario(6, 2.25, "Botella de vino", "Vinos");
        //Producto compuesto de varios productos.
        ProductoCompuesto cestaDeNavidad = new ProductoCompuesto();
        //Añadimos los productos individuales al producto compuesto.
        cestaDeNavidad.addProducto(vino);
        cestaDeNavidad.addProducto(lomo);
        //Añadimos los productos al pedido.
        pedido.addProducto(jamon);
        pedido.addProducto(paqueteDeEspaguetis);
        //Mostramos el importe.
        System.out.println("El importe total es: " + pedido.getImporteTotal());
        pedido.addProducto(cestaDeNavidad);
        System.out.println("El importe total es: " + pedido.getImporteTotal());
    }
}
