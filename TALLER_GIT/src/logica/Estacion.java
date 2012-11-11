/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Leonardo
 */
public class Estacion {
    
    public Estacion(){}
    
        private String nombre;
        private String idInterno;
        private String numeroVagones;
        private String estado;
        private String direccion;
        private String empleadoResponsable;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdInterno() {
        return idInterno;
    }

    public void setIdInterno(String idInterno) {
        this.idInterno = idInterno;
    }

    public String getNumeroVagones() {
        return numeroVagones;
    }

    public void setNumeroVagones(String numeroVagones) {
        this.numeroVagones = numeroVagones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmpleadoResponsable() {
        return empleadoResponsable;
    }

    public void setEmpleadoResponsable(String empleadoResponsable) {
        this.empleadoResponsable = empleadoResponsable;
    }
        
}
