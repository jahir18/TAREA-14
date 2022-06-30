package ClasesAbstractas;

public class Main {

    public static void main(String args[]){

        Curso curso1 = new Curso ( "MATEMATICA 1-",3);
        Curso curso2 = new Curso ( "POGRAMACION ORIENTADA A OBJETOS-", 4);
        Curso curso3 = new Curso ( "ESPAÑOL 1-", 3);

        Docente docente = new Docente ( "FREDDY CLAYDERMAM ","VIRGILIO ARRATEA",750834580,"23/05/1990",634409703);

        Alumno alumno = new Alumno("JAHIR ANTHONY", "TRUJILLO VILCHERREZ", 73948158, "10/06/1999", 2019110764);
       
        alumno.setCursos ( curso1 );
        alumno.setCursos ( curso2 );
        alumno.setCursos ( curso3 );

        Matricula matricula=new Matricula("29/07/2022");
        System.out.println ( "Matricula: "+matricula.getFecha());
        

        for ( Alumno a: matricula.getAlumno()) {
            System.out.println ( "Alumno: "+alumno.getNombre()+alumno.getApellido());
            System.out.println ( "DNI: "+alumno.getDni());
            System.out.println ( "Fecha de nacimiento: "+alumno.getFechaNacimiento());
            System.out.println ( "Codigo: "+alumno.getCodigo());

            System.out.println("----Cursos matriculados----");

            for ( Curso c:alumno.getCursos()) {
                System.out.println ( "Curso: " + c. getCurso()+"Docente: "+docente.getNombre()+"-Creditos: "+c.getCreditos());
                

            }

        }


    }
    
}
