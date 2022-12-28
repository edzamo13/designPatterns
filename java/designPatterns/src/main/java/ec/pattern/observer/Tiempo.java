package ec.com.patrones.diseño.patron.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

		

/**
 * Clase que define un objeto cuyo estado va a ser observado. En este caso sera
 * un objeto que representa la hora del dia.
 *
 * @author SEAS - Estudios Abiertos
 */
public class Tiempo implements IObservable, Runnable {

    private int segundos;
    private int minutos;
    private int hora;
    private Thread hiloDeEjecucion;
    private ArrayList<IObserver> observers;

    /**
     * Constructor unico de objetos de la clase Tiempo.
     *
     * @param segundos numero entero que representa los segundos.
     * @param minutos numero entero que representa los minutos.
     * @param horas numero entero que representa la hora del dia.
     */
    public Tiempo(int hora, int minutos, int segundos) {
        this.segundos = segundos;			
        this.minutos = minutos;
        this.hora = hora;
        this.observers = new ArrayList<IObserver>();
    }

    /**
     * Metodo para insertar un nuevo IObserver para responder a los cambios de
     * estado.
     *
     * @param observer objeto IObserver que se desea insertar.
     */
    public void addObserver(IObserver observer) {
    	System.out.println("ingresa addObserver");
        observers.add(observer);
    }

    /**
     * Metodo para eliminar un IObserver del ArrayList de observadores del
     * estado del objeto.
     *
     * @param observer objeto IObserver del ArraList "observers" que se desea
     * eliminar.
     */
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    /**
     * Setter de la hora.
     *
     * @param hora int hora a almacenar.
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Setter de los minutos.
     *
     * @param minutos int minutos a almacenar.
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * Setter de los segundos.
     *
     * @param segundos int segundos a almacenar.
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    /**
     * Getter de la hora.
     *
     * @return int hora.
     */
    public int getHora() {
        return hora;
    }

    /**
     * Getter de los minutos.
     *
     * @return int minutos.
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Getter de los segundos.
     *
     * @return int segundos.
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * Getter del ArrayList con los observadores del estado del objeto.
     *
     * @return ArrayList<IObserver> observers.
     */
    public ArrayList<IObserver> getObservers() {
    	System.out.println("lista"+ observers);
        return observers;
    }

    /**
     * Sobreescritura del metodo toString() de la clase Object que define la
     * representacion de este objeto como una cadena.
     *
     * @return String objeto tiempo en modo de cadena de texto.
     */
    @Override
    public String toString() {
        return (getHora() < 10 ? "0" + getHora() : getHora()) + ":" + 
                (getMinutos() < 10 ? "0" + getMinutos() : getMinutos()) + ":" + 
                (getSegundos() < 10 ? "0" + getSegundos() : getSegundos());
    }

    private void notificar() {
        for (Iterator<IObserver> it = observers.iterator(); it.hasNext();) {
            IObserver iObserver = it.next();
            iObserver.update();
        }
    }

    /**
     * Metodo que inicia la ejecucion del hilo con el comportamiento definido.
     */
    public void start() {
        hiloDeEjecucion = new Thread(this);
        hiloDeEjecucion.start();
    }
    
    
    

    /**
     * Metodo que, manteniendo el objeto sincronizado, desarrolla un bucle
     * infinito que analiza los valores del estado del objeto y los modifica
     * cada segundo comprobando si se deben incrementar los minutos y horas.
     */
    public void run() {
        synchronized (this) {
            while (true) {
                try {
                    //Esperamos un segundo.
                    this.wait(1000);
                    //Si el valor de segundos llega a 60.
                    if (getSegundos() + 1 == 60) {
                        //Ponemos los segundos a 0.
                        setSegundos(0);
                        //Si el valor de minutos llega a 60.
                        if (getMinutos() + 1 == 60) {
                            //Ponemos los minutos a 0.
                            setMinutos(0);
                            //Si el valor de las horas llega a 24.
                            if (getHora() + 1 == 24) {
                                //Ponemos el valor de las horas a 0.
                                setHora(0);
                            } else {
                                //Si no incrementamos la hora en una unidad.
                                setHora(getHora() + 1);
                            }
                        } else {
                            //Si no incrementamos los minutos en una unidad.
                            setMinutos(getMinutos() + 1);
                        }
                    } else {
                        //Si no incrementamos los segundos en una unidad.
                        setSegundos(getSegundos() + 1);
                    }
                    //Notificamos a los observadores que se ha producido un cambio
                    //en los valores del estado del objeto.
                    notificar();
                } catch (InterruptedException ex) {
                    //En caso de que se produzca alguna interrupcion del hilo
                    //capturamos la excepcion y mostramos un mensaje.
                    Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE,
                            "Se produjo una excepción en la ejecución.", ex);
                }
            }
        }
    }
}
