public class main {

    public static void main(String[] args) {

        cTablero tablero = new cTablero();

        System.out.println("Bienvenido a Hundir la Flota");
        tablero.reinicializarTablero();                         //Darle valores en blanco al tablero
        System.out.println("Coloca los barcos");
        tablero.mostrarTablero();                               //Mostrar el tablero por pantalla
        tablero.colocaBarcos();                                 //Ir colocando los barcos en la posicion escogida
        tablero.mostrarTablero();
    }
}
