
import java.util.Scanner;

public class e_Laboratorio_PruebaCaja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dame el ancho= ");
        String an=scanner.nextLine();
        
        System.out.print("Dame el alto= ");
        String al=scanner.nextLine();
        
        System.out.print("Dame la profundidad= ");
        String pro=scanner.nextLine();
        
        int ancho=Integer.parseInt(an);
        int alto=Integer.parseInt(al);
        int profundo=Integer.parseInt(pro);
        
        e_Laboratorio_Caja caja= new e_Laboratorio_Caja(ancho, alto, profundo);
        System.out.println("El volumen es: "+caja.volumen());
    }

}
