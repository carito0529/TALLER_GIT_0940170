/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Carito
 */
public class Bus {
    private String placa;
    private String idInterno;
    private String tipoBus;
    private String marca;
    private String estado;
    private String numeroMotor;
    private String numeroPersonasDePie;
    private String numeroPersonasSentadas;
    private String modelo;
    private String fechaCompra;

    public Bus()
    {
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getIdInterno() {
        return idInterno;
    }

    public void setIdInterno(String idInterno) {
        this.idInterno = idInterno;
    }

    public String getTipoBus() {
        return tipoBus;
    }

    public void setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getNumeroPersonasDePie() {
        return numeroPersonasDePie;
    }

    public void setNumeroPersonasDePie(String numeroPersonasDePie) {
        this.numeroPersonasDePie = numeroPersonasDePie;
    }

    public String getNumeroPersonasSentadas() {
        return numeroPersonasSentadas;
    }

    public void setNumeroPersonasSentadas(String numeroPersonasSentadas) {
        this.numeroPersonasSentadas = numeroPersonasSentadas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
