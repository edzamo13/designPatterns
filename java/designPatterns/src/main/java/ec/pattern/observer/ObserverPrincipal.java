package ec.com.patrones.diseño.patron.observer;

/**
 * Clase que lanza el ejemplo del patrón Observer.
 * @author SEAS - Estudios Abiertos
 */
public class ObserverPrincipal {

    /**
     * Metodo principal del ejemplo
     * @param args argumentos iniciales pasados al metodo principal
     */
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        Tiempo tiempo = new Tiempo(23, 59, 50);
        ObservadorDeConsola oConsola = new ObservadorDeConsola(tiempo);
        ObservadorGrafico oGrafico = new ObservadorGrafico(tiempo);
        oGrafico.setVisible(true);
        tiempo.start();
    }
}


