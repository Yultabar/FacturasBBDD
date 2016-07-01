/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author juan
 */
public class Porte {
    
    private int id;
    private Calendar fecha;
    private String origen;
    private String destino;
    private float precio;
    private String matricula;       
    private Cliente cliente;
    
    private ArrayList<Factura> listaFacturas = new ArrayList<Factura>();

    
    public Porte(){}

    public Porte(Calendar fecha, String origen, String destino, float precio,
            String matricula, Cliente cliente) {
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
        this.matricula = matricula;
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(ArrayList<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    @Override
    public String toString() {
        return "Porte{" + "id=" + id + ", fecha=" + fecha + ", origen=" + origen + ", destino=" + destino + ", precio=" + precio + ", matricula=" + matricula + ", cliente=" + cliente + '}';
    }
    
    

}
