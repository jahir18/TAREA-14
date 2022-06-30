package ClasesAbstractas;

public class Curso {

    private String curso;
    private int creditos;

    public Curso( String  curso, int creditos) {

        this.curso=curso;
        this.creditos=creditos;

    }
    

    public  String  getCurso () {
        return curso ;
    }

    public  void  setCurso( String  curso ) {
        this.curso=curso;
    }

    public int getCreditos(){
        return creditos;
    }

    public  void  setCreditos(int creditos) {
        this.creditos=creditos;
    }



    
}
