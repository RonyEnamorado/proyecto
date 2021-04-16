
package proyecto;


public class Alumno extends Persona {
   private String Carrera;
    private int CantidadClase;
    private String Cuenta;

    public Alumno (){}
    public Alumno(
            String Nombre,
            String Apellido,
            int edad,
            String Direccion,
            String Telefono,
            String Carrera,
            int CantidadClase,
            String Cuenta
    ) {
              super.setNombre(Nombre);
              super.setApellido(Apellido);
              super.setEdad(edad);
              super.setDireccion(Direccion);
              super.setTelefono(Telefono);
              this.Carrera=Carrera;
              this.CantidadClase=CantidadClase;
              this.Cuenta=Cuenta;
    }
    public String getCarrera() {
        return Carrera;
    }

    /**
     * @param Carrera the Carrera to set
     */
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    /**
     * @return the CantidadClase
     */
    public int getCantidadClase() {
        return CantidadClase;
    }

    /**
     * @param CantidadClase the CantidadClase to set
     */
    public void setCantidadClase(int CantidadClase) {
        this.CantidadClase = CantidadClase;
    }

    /**
     * @return the Cuenta
     */
    public String getCuenta() {
        return Cuenta;
    }

    /**
     * @param Cuenta the Cuenta to set
     */
    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }
 
    
}
