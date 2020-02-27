
import java.util.Scanner;

public class e_Laboratorio_Caja {

    int ancho;
    int alto;
    int profundo;

    public e_Laboratorio_Caja() {
    }

    public e_Laboratorio_Caja(int an, int al, int pro) {
        this.ancho = an;
        this.alto = al;
        this.profundo = pro;
    }

    public int volumen() {
        int volumen = ancho * alto * profundo;
        return volumen;
    }

}
