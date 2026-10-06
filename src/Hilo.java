public class Hilo implements Runnable{
    private char c;
    private int repeticion;
    public Hilo(char c, int repeticion) {
        this.c = c;
        this.repeticion = repeticion;
    }
    @Override
    public void run() {
        for (int i = 0; i < repeticion; i++) {
            System.out.println("Caracter " + c);
        }

    }
}
