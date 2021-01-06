
public class e_Laboratorio_Caja {

    private int ancho;
    private int alto;
    private int profundo;
    
    
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    public e_Laboratorio_Caja() {
    }
    
    

    public e_Laboratorio_Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
//    public e_Laboratorio_Caja() {
//    }
//
//    public e_Laboratorio_Caja(int an, int al, int pro) {
//        setAncho(an);
//        setAlto(al);
//        setProfundo(pro);
//    }
    
    public int volumen() {
        int volumen = getAncho()*getAlto()*getProfundo();
        return volumen;
    }

}
