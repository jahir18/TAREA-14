package ClasesAbstractas;

public class Alumno extends Persona {

    private String nombre;
    private String apellido;
    private int dni;
    private String fechaNacimiento;
    private int codigo;
    private Curso[] curso;
    private int contador;

    public Alumno(String nombre, String apellido, int dni, String fechaNacimiento, int codigo){

        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.fechaNacimiento=fechaNacimiento;
        this.codigo=codigo;
        this.contador = 0;
        this.curso= new Curso[ 3 ];



    }

    @Override
    public String getNombre(){

        return nombre;
    }

    public void setNombre(String nombre){

        this.nombre=nombre;
    }

    @Override 
    public String getApellido(){

        return apellido;
    }

    public void setApellido(String apellido){

        this.apellido=apellido;
    }
    
    @Override
    public int getDni(){

        return dni;
    }

    public void setDni(int dni){

        this.dni=dni;
    }

    @Override
    public String getFechaNacimiento(){

        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento){

        this.fechaNacimiento=fechaNacimiento;

    }
    

    public int getCodigo(){

        return codigo;
    }

    public void setCodigo(int codigo){

        this.codigo=codigo;
    }
    

    public void setCursos(Curso curso) {

        this.curso[this. contador] = curso;

        this.contador ++;
    }

    public Curso[] getCursos() {
        return curso;
    }

  
        


    
}
