import java.util.Locale;
import java.util.Scanner;

public class cTablero {

    Scanner leer = new Scanner(System.in);

    //Variables constates
    private final int FILA = 8;     //Tamaño de la fila en el tablero
    private final int COLUMNA = 8;  //Tamaño de la columna en el tablero

    //Variables


    //Objetos
    private cPortaAviones p;    //Tamaño 5
    private cBuque b;           //Tamaño 4
    private cSubmarino s;       //Tamaño 3
    private cCrucero c;         //Tamaño 2
    private cLancha l;          //Tamaño 1

    //Arays y matrices
    private char[][] ocupados;  //Tablero visual que muestra la posicion de los barcos
    private int[][] disparos;   //Tablero que almacena los disparos

    //Constructor de la clase Tablero
    public cTablero() {

        //Inicializacion de variables

        //Inicializacionde arrays y matrices
        ocupados = new char[FILA][COLUMNA];
        disparos = new int[FILA][COLUMNA];
    }

    //Metodo que obtiene la posicion de la fila → 1-8
    public int leerFila() {
        int posFila;
        System.out.println("Introduce la fila (1 - 8)");
        posFila = leer.nextInt();
        return posFila -1;
    }

    //metodo que obtiene la posicion de la columna ↓ A-H
    public int leerColumna() {
        String posColumnaString;
        int posColumna;
        System.out.println("Introduce la columna (A - H)");
        posColumnaString = leer.next();
       /* if (posColumnaString.equalsIgnoreCase("A")) {
            return posColumna = 0;
        } else if(posColumnaString.equalsIgnoreCase("B")){
            return posColumna = 1;
        } else if(posColumnaString.equalsIgnoreCase("C")){
            return posColumna = 2;
        } else if(posColumnaString.equalsIgnoreCase("D")){
            return posColumna = 3;
        } else if(posColumnaString.equalsIgnoreCase("E")){
            return posColumna = 4;
        } else if(posColumnaString.equalsIgnoreCase("F")){
            return posColumna = 5;
        } else if(posColumnaString.equalsIgnoreCase("G")){
            return posColumna = 6;
        } else if (posColumnaString.equalsIgnoreCase("H")){
            return posColumna = 7;
        }else{
            return posColumna = 0;
        }*/
        switch (posColumnaString.toUpperCase()){
            case ("A") -> {return posColumna = 0;}
            case ("B") -> {return posColumna = 1;}
            case ("C") -> {return posColumna = 2;}
            case ("D") -> {return posColumna = 3;}
            case ("E") -> {return posColumna = 4;}
            case ("F") -> {return posColumna = 5;}
            case ("G") -> {return posColumna = 6;}
            case ("H") -> {return posColumna = 7;}
        }
        return posColumna = 0;
    }

    //metodo que obtiene la direccion en la que quieres colocar el barco
    public boolean leerDireccion(){
        boolean direccion;
        String hv;
        System.out.println("introduce la direccion del barco (V - H)");
        hv = leer.next();
        if (hv.equalsIgnoreCase("V")) {
            return direccion = true;
        }else{
            return direccion = false;
        }
    }

    //Metodo que coloca los barcos en la posicion escogida
    public void colocaBarcos() {
        int fila;
        int columna;
        boolean direccion;

        //Colocar el portaAviones
        fila = leerFila();
        columna = leerColumna();
        direccion = leerDireccion();
        //p.colocar(fila, columna, direccion);
        p.GRANDARIA = 5;

        if (fila > 4 && columna > 4){
            System.out.println("Error");
        }else{
            if(direccion == true){
                if (fila > 5){
                    System.out.println("Error");
                }else{
                    for (int i = 0; i < p.GRANDARIA; i++) {
                        ocupados[fila][columna+i] = 'P';
                    }
                }
            }else{
                if (columna > 5){
                    System.out.println("Error");
                }else{
                    for (int i = 0; i < p.GRANDARIA; i++){
                        ocupados[fila+1][columna] = 'P';
                    }
                }
            }
        }
    }

    public int dispara(){
        int posDisparo=0;
        return posDisparo;
    }

    //Metodo que mantendra el juego en ejecucion hasta que no queden barcos
    public void jugar(){
        do{
            int posFila = leerFila();
            int posColumna = leerColumna();
            dispara();                          //Dispara(posFila, posColumna)
        }while (false);                         //Barcos undidos = true
    }

    //Metodo que muestra reinicializa el tablero
    public void reinicializarTablero(){
        for (int i = 0; i < FILA; i++){
            for (int j = 0; j < COLUMNA; j++) {
                ocupados[i][j] = ' ';
            }
        }
    }

    //Metodo que muesrta el tablero por pantalla
    public void mostrarTablero(){
        System.out.println("    A    B    C    D    E    F    G    H");
        for (int i = 0; i < FILA; i++) {
            System.out.println("  ╔═══╗╔═══╗╔═══╗╔═══╗╔═══╗╔═══╗╔═══╗╔═══╗");
            System.out.print((i+1)+" ");
            for (int j = 0; j < COLUMNA; j++) {
                System.out.print("║ " +ocupados[i][j]+ " ║");
            }
            System.out.println("\n  ╚═══╝╚═══╝╚═══╝╚═══╝╚═══╝╚═══╝╚═══╝╚═══╝");
        }
    }
}