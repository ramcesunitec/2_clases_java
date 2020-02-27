
import java.util.Scanner;


public class c_PruebaAritmetica_Constructores {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
               
        System.out.print("El primer numero: ");
        String c=scanner.nextLine();
        System.out.print("El segundo numero: ");
        String d=scanner.nextLine();
        int a=Integer.parseInt(c);
        int b=Integer.parseInt(d);      
        
        //Se crea un objeto
        c_Aritmetica_Constructores aritmetica=new c_Aritmetica_Constructores();
        
        aritmetica.a=a;
        aritmetica.b=b;
        
        int resultado=aritmetica.sumar();
        
        System.out.println("Resultado= "+resultado);
        
        //Creacion de un segundo objeto
        c_Aritmetica_Constructores aritmetica2=new c_Aritmetica_Constructores(5,5);
        System.out.println("Resultado2= "+aritmetica2.sumar());
       
    }
}
