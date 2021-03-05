public class main {

    public static void main(String[] args) {

        cTablero tablero = new cTablero();

        System.out.println("Bienvenido a Hundir la Flota");
        System.out.println("Coloca los barcos");
        tablero.reinicializarTablero();
        tablero.mostrarTablero();
        tablero.colocaBarcos();
        tablero.mostrarTablero();
    }
}
