/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import dominio.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author juan
 */
public class ClienteDAO {
    
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
            return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
    }  
    
    public boolean alta(Cliente c) { 
        try {   
            String sql = "INSERT INTO TClientes (Alias,CIF,Direccion1,Direccion2,Zona,Pais,"
                    + "Telefono1,Telefono2,Contacto) VALUES (?,?,?,?,?,?,?,?,?)";
            jdbcTemplate.update(sql,c.getAlias(),c.getCif(),c.getDireccion(),c.getDireccion2(),
            c.getZona(),c.getPais(),c.getTelefono1(),c.getTelefono2(),c.getContacto());

        } catch (DataAccessException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error, el cliente ya existe");}

        return true;         
    }
    
    public boolean habilitar(int idCliente) {
        try {
            String sql = "UPDATE TClientes SET Inhabilitado=0 where Id = ?";
            jdbcTemplate.update(sql, idCliente);
        } catch (DataAccessException ex) {System.out.println(ex);return false;}
        return true;
    }  
    
    public boolean inhabilitar(int idCliente) {
        try {
            String sql = "UPDATE TClientes SET Inhabilitado=1 where Id = ?";
            jdbcTemplate.update(sql, idCliente);
        } catch (DataAccessException ex) {System.out.println(ex);return false;}
        return true;
    }
    
    public boolean modificacion(Cliente c) {
        try{
            String sql = "UPDATE TClientes SET Alias=?,CIF=?,Direccion1=?,Direccion2=?,"
                    + "Zona=?,Pais=?,Telefono1=?,Telefono2=?,Contacto=? WHERE Id = ?";
            jdbcTemplate.update(sql, c.getAlias(),c.getCif(),c.getDireccion(),c.getDireccion2(),
                    c.getZona(),c.getPais(),c.getTelefono1(),c.getTelefono2(),c.getContacto(),c.getId());

        } catch (DataAccessException ex) {return false;}
        return true;
    }    
    
    public Cliente consulta(int idCliente) {
        String sql = "select * from TClientes where Id=?";
        Cliente cliente = jdbcTemplate.queryForObject(sql,new Object[] { idCliente }, new ClienteMapper());
        return cliente; 
    }
    
    public int consultaIdPorAlias(String alias){
        
        try{String sql = "SELECT * FROM TClientes where Alias=?";
            Cliente cliente = jdbcTemplate.queryForObject(sql, new Object[]{alias},new ClienteMapper());
            System.out.println(cliente);
            return cliente.getId();
        }catch(DataAccessException ex){
            return -1;
        }
        
    }
    
   
    public ArrayList<Cliente> consultaAliasZona(String alias,String zona){
        String sql = "SELECT * FROM TClientes where Alias like '%"+alias+"%' AND Zona like '%"+zona+"%';";
        return (ArrayList<Cliente>)jdbcTemplate.query(sql, new ClienteMapper());
    }
    
    
 
    public ArrayList<Cliente> consulta() {
        String sql = "select * from TClientes";
        ArrayList<Cliente> todoslosClientes =(ArrayList<Cliente>) jdbcTemplate.query(sql, new ClienteMapper());
 
        return todoslosClientes; 
    }
    
    
    
}

class ClienteMapper implements RowMapper<Cliente> {

    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
        Cliente cliente = new Cliente();
        
        cliente.setId(rs.getInt("Id"));
        cliente.setAlias(rs.getString("Alias"));
        cliente.setCif(rs.getString("CIF"));
        cliente.setDireccion(rs.getString("Direccion1"));
        cliente.setDireccion2(rs.getString("Direccion2"));
        cliente.setZona(rs.getString("Zona"));
        cliente.setPais(rs.getString("Pais"));
        cliente.setTelefono1(rs.getString("Telefono1"));
        cliente.setTelefono2(rs.getString("Telefono2"));
        cliente.setContacto(rs.getString("Contacto"));
        
        cliente.setInhabilitado(rs.getBoolean("Inhabilitado"));

        return cliente;
    }
}