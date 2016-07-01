/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Calendar;

/**
 *
 * @author juan
 */
public class Factura {
    
    private int id;
    private Calendar fecha;
    private double tipoIva;
    private double tipoRetencion;
    private Calendar fechaPorte;
    private String origen;
    private String destino;
    private double precio;
    private String matricula;       
    private Cliente cliente;
    
    public Factura(){}

    public Factura(Calendar fecha, double tipoIva, double tipoRetencion, Calendar fechaPorte, String origen, String destino, float precio, String matricula, Cliente cliente) {
        this.fecha = fecha;
        this.tipoIva = tipoIva;
        this.tipoRetencion = tipoRetencion;
        this.fechaPorte = fechaPorte;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
        this.matricula = matricula;
        this.cliente = cliente;
    }

    public Factura(int nroFactura) {
    }

    public Calendar getFechaPorte() {
        return fechaPorte;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setFechaPorte(Calendar fechaPorte) {
        this.fechaPorte = fechaPorte;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public double getTipoIva() {
        return tipoIva;
    }

    public void setTipoIva(double tipoIva) {
        this.tipoIva = tipoIva;
    }

    public double getTipoRetencion() {
        return tipoRetencion;
    }

    public void setTipoRetencion(double tipoRetencion) {
        this.tipoRetencion = tipoRetencion;
    }

 
}
