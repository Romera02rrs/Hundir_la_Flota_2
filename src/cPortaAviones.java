public class cPortaAviones extends cBarcos {

    //cBarcos.GRANDARIA = 0

    //Construcotr de la clase Porta Aviones
    public cPortaAviones(){
        GRANDARIA = 5;
    }

    public void colocar(int f, int c, boolean d){
        fila = f;
        columna = c;
        direccion = d;
    }
}
