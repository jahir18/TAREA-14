package ClasesAbstractas;

public class Matricula {

    private String fecha;
    private Alumno[] alumno;
    private int contador;


    public Matricula(String fecha){

        this.fecha=fecha;
        this.contador = 0;
        this.alumno = new Alumno[ 1 ];
       
    }

    public String getFecha(){

        return fecha;
    }



    public  void  setAlumno(Alumno alumno) {

       this.alumno[this.contador ++] =alumno;
    }

    
    public  Alumno[] getAlumno () {

        return alumno;
    }

    
    
}
