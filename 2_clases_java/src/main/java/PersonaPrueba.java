
public class PersonaPrueba {
    public static void main(String[] args) {
        //Creacion de un objeto
        Persona p1=new Persona();
              
        //Modificamos los vlaores de los atributos del objeto Persona
        p1.nombre="Ramces";
        p1.apellido="Frutos";
        
        //Se accede al objeto persona y llamamos al metodo desplegarNombres
        p1.desplegarNombre();
        
        //Creacion de un segundo objeto
        Persona p2=new Persona();
        p2.nombre="Nancy";
        p2.apellido="Aguilar";
        p2.desplegarNombre();
        
    }
           
           
}
