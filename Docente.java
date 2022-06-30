package ClasesAbstractas;

public class Docente extends Persona{

    private String nombre;
    private String apellido;
    private int dni;
    private String fechaNacimiento;
  
    

    public Docente(String nombre, String apellido, int dni, String fechaNacimiento, int codigo){

        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.fechaNacimiento=fechaNacimiento;
       

    }
    
    @Override
    public String getNombre(){

        return nombre;
    }

    @Override 
    public String getApellido(){

        return apellido;
    }
    
    @Override
    public int getDni(){

        return dni;
    }

    @Override
    public String getFechaNacimiento(){

        return fechaNacimiento;
    }
    
    
    
   
}
