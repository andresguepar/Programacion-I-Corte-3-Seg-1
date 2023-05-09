package Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");


        Thread hilo1 = new Thread(new Hilos1("#1"));
        Thread hilo2 = new Thread(new Hilos2("#2"));

        hilo1.start();
        hilo2.start();



        for (int i=0; i<50;i++){
            System.out.print(" .");
        }try{
            Thread.sleep(100);
        }catch (InterruptedException exc){
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal finalizado.");
    }
}
