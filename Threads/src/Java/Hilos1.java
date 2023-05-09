package Java;

public class Hilos1 implements Runnable {
    String nombreHilo;
    Hilos1(String nombre){
        nombreHilo=nombre;
    }

    public void run(){
        System.out.println("Comenzando "+nombreHilo);
        try {
            for (int contar=0; contar<5; contar++){
                Thread.sleep(100);
                System.out.println("En "+nombreHilo+", el recuento "+contar);
            }
        }catch (InterruptedException exc){
            System.out.println(nombreHilo + "Interrumpido.");
        }
        System.out.println("Terminando "+nombreHilo);
    }


}
