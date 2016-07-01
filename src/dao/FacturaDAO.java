/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Cliente;
import dominio.Factura;
import dominio.Porte;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author juan
 */
public class FacturaDAO {
    
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
            return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
    }  
    
    public boolean alta(Factura f) { 
        try {   
            String sql = "INSERT INTO TFacturas(Fecha,TipoIva,TipoRetencion,FechaPorte,Origen,"
                    + "Destino,Precio,Matricula,IdCliente) VALUES(?,?,?,?,?,?,?,?,?)";
                    
            jdbcTemplate.update(sql,f.getFecha(),f.getTipoIva(),f.getTipoRetencion(),f.getFechaPorte(),f.getOrigen(),f.getDestino(),
                    f.getPrecio(),f.getMatricula(),f.getCliente().getId());
            

        } catch (DataAccessException ex) {ex.printStackTrace();return false;}

        return true;         
    }
    
    
    public boolean modificacion(Factura f){
        try{
            String sql = "UPDATE TFacturas SET Origen = ?,Destino = ?,Precio =?,TipoIva = ?, TipoRetencion = ?"
                    + " ,FechaPorte = ? , Fecha =?, Matricula = ?, IdCliente = ? WHERE Id = ?";
            jdbcTemplate.update(sql,f.getOrigen(),f.getDestino(),f.getPrecio(),f.getTipoIva(),f.getTipoRetencion(),
            f.getFechaPorte(),f.getFecha(),f.getMatricula(),f.getCliente().getId(),f.getId());
            return true;
        }catch(DataAccessException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    
    public Factura consulta(int idFactura) {
        String sql = "select * from TFacturas where Id=?";
        Factura factura = jdbcTemplate.queryForObject(sql,new Object[] { idFactura }, new FacturaMapper());
        return factura; 
    }
 
    public ArrayList<Factura> consulta() {
        String sql = "select * from TFacturas";
        ArrayList<Factura> todaslasFacturas =(ArrayList<Factura>) jdbcTemplate.query(sql, new FacturaMapper());
        
        for(Factura f:todaslasFacturas){
            sql = "SELECT * FROM TClientes where Id ="+f.getCliente().getId();
            f.setCliente(jdbcTemplate.queryForObject(sql, new ClienteMapper()));
        }
        return todaslasFacturas; 
    }      
    
    public ArrayList<Factura> consultaParametrizada(int idCliente,String matricula,
        String origen,String destino){
        if(matricula.equals("Seleccione matricula")) matricula="";
        System.out.println("matricula vale"+ matricula);
        String sql="";
        if(idCliente!=-1){
            sql = "SELECT * FROM TFacturas where IdCliente = "
                    + ""+idCliente+" AND Matricula LIKE '%"+matricula+"%' AND Origen LIKE "
                    + "'%"+origen+"%' AND Destino LIKE '%"+destino+"%'";/* AND Fecha BETWEEN"+desde+" AND "+hasta*/;
        }
        else{
            sql = "SELECT * FROM TFacturas where Matricula LIKE '%"+matricula+"%' AND Origen LIKE "
                    + "'%"+origen+"%' AND Destino LIKE '%"+destino+"%'";
        }
        ArrayList<Factura> listaFactFiltradas = (ArrayList<Factura>)jdbcTemplate.query(sql,new FacturaMapper());
        for(Factura f:listaFactFiltradas){
            sql = "SELECT * FROM TClientes where Id ="+f.getCliente().getId();
            f.setCliente(jdbcTemplate.queryForObject(sql, new ClienteMapper()));
        }    
        
        return listaFactFiltradas;
    }
    
}

class FacturaMapper implements RowMapper<Factura> {

    public Factura mapRow(ResultSet rs, int rowNum) throws SQLException {
        Factura factura = new Factura();
        
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(rs.getDate("Fecha"));
        
        factura.setFecha(cal);
                
        
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(rs.getDate("FechaPorte"));
        
        factura.setFechaPorte(cal2);
        
        
        factura.setId(rs.getInt("Id"));
        factura.setTipoIva(rs.getDouble("TipoIva"));
        factura.setTipoRetencion(rs.getDouble("TipoRetencion"));
        factura.setOrigen(rs.getString("Origen"));
        factura.setDestino(rs.getString("Destino"));
        factura.setMatricula(rs.getString("Matricula"));
        factura.setCliente(new Cliente(rs.getInt("IdCliente")));
        factura.setPrecio(rs.getDouble("Precio"));
       
     

        return factura;
    }
}