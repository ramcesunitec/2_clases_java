
public class c_Aritmetica_Constructores {

    //atributos
    int a;
    int b;
    
    public c_Aritmetica_Constructores() {
//        a=5;
//        b=3;
        System.out.println("Ejecutando constructor vacio");
    }

    
    public c_Aritmetica_Constructores(int arg1, int arg2) {
        a=arg1;
        b=arg2;
        System.out.println("Ejecutando contructor con 2 elementos");
    }

    
    public int sumar() {
        int resultado = a + b;
        return resultado;
    }
}
