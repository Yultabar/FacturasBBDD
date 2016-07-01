/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class Cliente {
    
    private int id;		
    private String alias;		
    private String cif;
    private String direccion1;
    private String direccion2;
    private String zona;
    private String pais;
    private String telefono1;	
    private String telefono2;	
    private String contacto;
    private boolean inhabilitado;
    private ArrayList<Porte> listaPortes = new ArrayList<Porte>();
    
    public Cliente(){}
    
    public Cliente(int id){
        this.id = id;
    }

    public Cliente(String alias, String cif,String direccion1,String direccion2, String zona,String pais, String telefono1,
            String telefono2, String contacto) {
        if(!alias.equals("") && !cif.equals("") && !direccion1.equals("") && !direccion2.equals("") && !zona.equals("")){
            this.alias = alias;
            this.cif = cif;
            this.direccion1=direccion1;
            this.direccion2=direccion2;
            this.zona = zona;
            this.pais=pais;
            this.telefono1 = telefono1;
            this.telefono2 = telefono2;
            this.contacto = contacto;
        }
        else{
            JOptionPane.showMessageDialog(null, "Hay campos sin rellenar");
        }
    }

    public ArrayList<Porte> getListaPortes() {
        return listaPortes;
    }

    public void setListaPortes(ArrayList<Porte> listaPortes) {
        this.listaPortes = listaPortes;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion1;
    }

    public void setDireccion(String direccion) {
        this.direccion1 = direccion;
    }
    
    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion) {
        this.direccion2 = direccion;
    }

    public boolean isInhabilitado() {
        return inhabilitado;
    }

    public void setInhabilitado(boolean inhabilitado) {
        this.inhabilitado = inhabilitado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", alias=" + alias + ", cif=" + cif + ", direccion1=" + direccion1 + ", direccion2=" + direccion2 +", zona=" + zona + ", pais=" + pais+", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", contacto=" + contacto + ", inhabilitado=" + inhabilitado + '}';
    }
    
    
    
}
