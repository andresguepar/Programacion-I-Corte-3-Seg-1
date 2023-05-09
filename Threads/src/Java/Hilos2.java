package Java;

public class Hilos2 implements Runnable{
    String nombreHilo;
    Hilos2(String nombre){
        nombreHilo=nombre;
    }

    public void run(){
        System.out.println("Comenzando "+nombreHilo);
        try {
            for (int contar=5; contar<10; contar++){
                Thread.sleep(700);
                System.out.println("En "+nombreHilo+", el recuento "+contar);
            }
        }catch (InterruptedException exc){
            System.out.println(nombreHilo + "Interrumpido.");
        }
        System.out.println("Terminando "+nombreHilo);
    }
}
