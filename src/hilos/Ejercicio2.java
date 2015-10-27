package hilos;

import static java.lang.Thread.sleep;

/**
 * * @author dpazolopez **
 */
public class Ejercicio2 extends Thread {

    public Ejercicio2(String nom) {
        super(nom);
    }

    public static void main(String[] args) {

        Ejercicio2 hilo1 = new Ejercicio2("Hilo 1");
        Ejercicio2 hilo2 = new Ejercicio2("Hilo 2");
        Ejercicio2 hilo3 = new Ejercicio2("Hilo 3");
        Ejercicio2 hilo4 = new Ejercicio2("Hilo 4");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
        //Paramos el hilo
        //hiloA.stop();
        //hiloB.stop();
    }
    public void run(){

        try {
            for (int i = 0; i < 5; i++) {
                sleep(1000);
                System.out.println(i + "," + getName());
                // Aquí se retrasa la ejecución un segundo y se captura la
                // posible excepción que genera el método, aunque no se hace
                // nada en el caso de que se produzca

            }
        } catch (InterruptedException ex) {
            System.out.println("Hilo interrumpido");
        }
    }
}
