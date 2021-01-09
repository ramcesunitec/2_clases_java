
public class ed_Paabra_This {
    public static void main(String[] args) {
        Person person=new Person("Ram","Diaz");
        System.out.println("persona: "+person);
        System.out.println("Nombre: "+person.nombre);
        System.out.println("Apellido: "+person.apellido);
    } 
}

class Person{
    String nombre;
    String apellido;
    
    Person(String nombre, String apellido){
        //super();  Llamada al constructor de la clase padre (object)
        this.nombre=nombre;
        this.apellido=apellido;
        System.out.println("objeto persona usando this"+this);
        new Imprimir().imprimir(this);
    }
     
}

class Imprimir{
    
    public void imprimir(Person person){
        System.out.println("Persona desde imprimir "+person);
        System.out.println("Impresion del objecto actual(this) "+this);

    }
}