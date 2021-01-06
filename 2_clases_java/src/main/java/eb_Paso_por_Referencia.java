
public class eb_Paso_por_Referencia {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        persona1.nombre="Nancy";
        persona1.apellido="Aguilar";
        System.out.println("Persona1 nombre: "+persona1.nombre);
        System.out.println("Persona1 apellido: "+persona1.apellido);
        
        cambiarValor(persona1);
        System.out.println("Persona1 nombre: "+persona1.nombre);
        System.out.println("Persona1 apellido: "+persona1.apellido);
    }
    
    public static void cambiarValor(Persona persona){
        persona.nombre="Ramces";
        persona.apellido="Frutos";
    }
}
