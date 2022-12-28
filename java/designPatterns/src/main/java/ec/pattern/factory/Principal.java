package ec.com.patrones.diseño.patron.factory;

public class Principal {

	public static void main(String[] args) {

		Factura f = FactoriaFacturas.getFactura("iva");
		f.setId(1);
		f.setImporte(5);
		System.out.println(f.getImporteIva());
	}

}
