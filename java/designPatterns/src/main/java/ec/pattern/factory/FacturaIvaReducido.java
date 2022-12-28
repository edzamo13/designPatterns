package ec.com.patrones.diseño.patron.factory;

public class FacturaIvaReducido extends Factura {

	public double getImporteIva() {
		// TODO Auto-generated method stub
		return getImporteIva() * 1.07;
	}

}
