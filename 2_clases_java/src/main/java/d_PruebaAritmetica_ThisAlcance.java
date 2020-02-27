
import java.util.Scanner;


public class d_PruebaAritmetica_ThisAlcance {
    
    
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
               
        System.out.print("El primer numero: ");
        String c=scanner.nextLine();
        System.out.print("El segundo numero: ");
        String d=scanner.nextLine();
        int a=Integer.parseInt(c);
        int b=Integer.parseInt(d);      
        
        //Variables local
        int operandoA=a;
        int operandoB=b;
        
        //Creamos un objeto de la clase d_Aritmetica_ThisAlcance enviando argumento
        d_Aritmetica_ThisAlcance objeto1=new  d_Aritmetica_ThisAlcance(operandoA,operandoB);
       
        //Imprimimos resultados de las operaciones basicas
         System.out.println("Resultado Suma= "+objeto1.sumar());
         System.out.println("Resultado Resta= "+objeto1.restar());
         System.out.println("Resultado Multiplicacion= "+objeto1.multiplicar());
         System.out.println("Resultado Division= "+objeto1.dividir());
    }
     
}
