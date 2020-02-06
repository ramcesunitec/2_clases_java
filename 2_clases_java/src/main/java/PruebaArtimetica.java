
import java.util.Scanner;


public class PruebaArtimetica {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
               
        System.out.print("El primer numero: ");
        String c=scanner.nextLine();
        System.out.print("El segundo numero: ");
        String d=scanner.nextLine();
        int a=Integer.parseInt(c);
        int b=Integer.parseInt(d);      
        
        //Se crea un objeto
        Aritmetica aritmetica=new Aritmetica();
        
        int resultado=aritmetica.sumar(a,b);
        
        System.out.println("Resultado= "+resultado);
       
    }
}
