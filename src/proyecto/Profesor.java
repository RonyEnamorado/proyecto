
package proyecto;


public class Profesor extends Persona {
    private String  Codigo_maestro;
    private String  Rango_maestro;
    private boolean Maestro_temporal;

        public Profesor(
            String Nombre,
            String Apellido,
            int edad,
            String Direccion,
            String Telefono,
            String  Codigo_maestro,
            String  Rango_maestro,
            boolean Maestro_temporal
    ) {
              super.setNombre(Nombre);
              super.setApellido(Apellido);
              super.setEdad(edad);
              super.setDireccion(Direccion);
              super.setTelefono(Telefono);
              this.Codigo_maestro=Codigo_maestro;
              this.Rango_maestro=Rango_maestro;
             this.Maestro_temporal=Maestro_temporal;
    }

    Profesor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getCodigo_maestro() {
        return Codigo_maestro;
    }


    public void setCodigo_maestro(String Codigo_maestro) {
        this.Codigo_maestro = Codigo_maestro;
    }


    public String getRango_maestro() {
        return Rango_maestro;
    }


    public void setRango_maestro(String Rango_maestro) {
        this.Rango_maestro = Rango_maestro;
    }


    public boolean isMaestro_temporal() {
        return Maestro_temporal;
    }


    public void setMaestro_temporal(boolean Mestro_temporal) {
        this.Maestro_temporal = Mestro_temporal;
    }

}
