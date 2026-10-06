public class Main {
    public static void main(String[] args) {
        //Creamos los objetos hilos
    Thread hilo1 = new Thread(new Hilo('c', 3));
    Thread hilo2 = new Thread(new Hilo('a', 4));
    Thread hilo3 = new Thread(new Hilo('d', 5));
        //Generamos los distintos hilos
    hilo1.start();
    hilo2.start();
    hilo3.start();
        System.out.println("Fin del main");
    }
}


