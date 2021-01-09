
public class ec_Return_y_Null {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        persona1.nombre="Nancy";
        persona1.apellido="Aguilar";
        System.out.println("Persona1 nombre: "+persona1.nombre);
        System.out.println("Persona1 apellido: "+persona1.apellido);
        
        persona1=cambiarValor(persona1);
        System.out.println("Persona1 nombre: "+persona1.nombre);
        System.out.println("Persona1 apellido: "+persona1.apellido);
        
    }
    
    
    public static Persona cambiarValor(Persona persona){
        persona.nombre="Ramces";
        persona.apellido="Frutos";
        return persona;
    }
}
