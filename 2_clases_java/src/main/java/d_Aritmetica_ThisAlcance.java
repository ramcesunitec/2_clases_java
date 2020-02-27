
public class d_Aritmetica_ThisAlcance {

    //atributos
    int a;
    int b;

    public d_Aritmetica_ThisAlcance() {
//        a=5;
//        b=3;
        System.out.println("Ejecutando constructor vacio");
    }

    public d_Aritmetica_ThisAlcance(int a,int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando contructor con 2 elementos");
    }

    public int sumar() {
        return this.a + this.b;
    }
    
    public int restar(){
        return this.a-this.b;
    }
    
    public int multiplicar(){
        return this.a*this.b;
    }
    
    public int dividir(){
        return this.a/this.b;
    }
}
