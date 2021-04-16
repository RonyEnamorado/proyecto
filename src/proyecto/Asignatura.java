
package proyecto;
import java.util.List;

public class Asignatura {

      private Profesor  Profesor_asignado;
      private String    Codigo_asignatura;
      private String Nombre_curso;
      private List <Alumno>     Alumnos; 
      private int num_max_alumno;
      
   public Asignatura() {}
    public Asignatura(Profesor Profesor_asignado, String Codigo_asignatura, List<Alumno> Alumnos, int num_max_alumno,String Nombre_curso) {
        this.Profesor_asignado = Profesor_asignado;
        this.Codigo_asignatura = Codigo_asignatura;
        this.Alumnos = Alumnos;
        this.num_max_alumno = num_max_alumno;
        this.Nombre_curso=Nombre_curso;
    }
    /**
     * @return the Nombre_curso
     */
    public String getNombre_curso() {
        return Nombre_curso;
    }

    /**
     * @param Nombre_curso the Nombre_curso to set
     */
    public void setNombre_curso(String Nombre_curso) {
        this.Nombre_curso = Nombre_curso;
    }

    public Profesor getProfesor_asignado() {
        return Profesor_asignado;
    }


    public void setProfesor_asignado(Profesor Profesor_asignado) {
        this.Profesor_asignado = Profesor_asignado;
    }


    public String getCodigo_asignatura() {
        return Codigo_asignatura;
    }


    public void setCodigo_asignatura(String Codigo_asignatura) {
        this.Codigo_asignatura = Codigo_asignatura;
    }


    public List getAlumnos() {
        return Alumnos;
    }


    public void setAlumnos(Alumno Alumnos) {
        this.Alumnos.add(Alumnos);
    }


    public int getNum_max_alumno() {
        return num_max_alumno;
    }


    public void setNum_max_alumno(int num_max_alumno) {
        this.num_max_alumno = num_max_alumno;
    }

}
