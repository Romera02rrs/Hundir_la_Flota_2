public class cBarcos {

    //Declaracion de la variable que sera modificada por cada barco.
    protected int GRANDARIA = 0;

    //Variables que adquieren los valores de los metodos llegir...()
    protected int fila;
    protected int columna;
    protected boolean direccion;


    //Constructor de la super clase Barco
    public cBarcos(){
        GRANDARIA = 0;
    }

    public void assignarCoordenades(int f, int c, boolean d){
        fila = f;
        columna = c;
        direccion = d;
    }
}