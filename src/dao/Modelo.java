/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Cliente;
import dominio.Factura;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author alejandro
 */
public class Modelo {
   
    private ClienteDAO clientes;
    private FacturaDAO facturas;
    private MatriculaDAO matriculas;

    
    //////////MÉTODOS DE CLIENTES.//////////
    
    public boolean altaCliente(Cliente c){
        return clientes.alta(c);
    }
    
    public boolean modificarCliente(Cliente c){
        return clientes.modificacion(c);
    }
    
    public boolean habilitarCliente(int idCliente){
        return clientes.habilitar(idCliente);
    }
    
    public boolean inhabilitarCliente(int idCliente){
        return clientes.inhabilitar(idCliente);
    }
    
    public Cliente consultaClienteId(int id){
        return clientes.consulta(id);
    }
    
    public int consultaIdClientePorAlias(String alias){
        return clientes.consultaIdPorAlias(alias);
    }
    
    public ArrayList<Cliente> consultaTodosClientes(){
        return clientes.consulta();
    }
    
    public ArrayList<Cliente> consultaClienteNombreZona(String alias,String zona){
        return clientes.consultaAliasZona(alias,zona);
    }
    
    public Cliente consulta(Cliente c){ 
        return clientes.consulta(c.getId());
    }
    
    //////////MÉTODOS DE FACTURAS.//////////
    
    
    public boolean altaFactura(Factura f){
        return facturas.alta(f);
    }
    
    public Factura consulta(Factura f){ 
        return facturas.consulta(f.getId());
    }
    
    public boolean modificacionFactura(Factura f){
        return facturas.modificacion(f);
    }
    
    public Factura consultaFacturaPorId(int id){
        return facturas.consulta(id);
    }
    
    public ArrayList<Factura> consultaTodasFacturas(){
        return facturas.consulta();
    }
    
    public ArrayList<Factura> consultaParametrizada(int idCliente,String matricula,
            String origen,String destino){
        return facturas.consultaParametrizada(idCliente, matricula, origen, destino);
    }
    
    
    
    //////////METODOS DE MATRICULAS.//////////
    
    public boolean altaMatricula(String s){
        return matriculas.alta(s);
    }
    
    public boolean bajaMatricula(String s){
        return matriculas.baja(s);
    }
    
    public String consultaMatricula(String s){
        return matriculas.consulta(s);
    }
    
    public ArrayList<String> consultaMatriculas(){
        return matriculas.consulta();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void setClientes(ClienteDAO clientes) {
        this.clientes = clientes;
    }

    public void setFacturas(FacturaDAO facturas) {
        this.facturas = facturas;
    }

    public void setMatriculas(MatriculaDAO matriculas) {
        this.matriculas = matriculas;
    }

  

    public ClienteDAO getClientes() {
        return clientes;
    }

    public FacturaDAO getFacturas() {
        return facturas;
    }

    public MatriculaDAO getMatriculas() {
        return matriculas;
    }

    
    
}
