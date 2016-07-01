/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author juan
 */
public class MatriculaDAO {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
            return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
    }  
    
    public boolean alta(String m) { 
        try {   
            String sql = "INSERT INTO TMatriculas VALUES (?)";
            jdbcTemplate.update(sql,m);

        } catch (DataAccessException ex) {ex.printStackTrace();return false;}

        return true;         
    }
    
    public boolean baja(String m) {
        try {
            String sql = "DELETE FROM TMatriculas where Matricula=?";
            jdbcTemplate.update(sql, m);
        } catch (DataAccessException ex) {return false;}
        return true;
    }
            
    public String consulta(String m) {
        String sql = "select * from TMatriculas where Matricula=?";
        String matricula = jdbcTemplate.queryForObject(sql,new Object[] { m }, new MatriculaMapper());
        return matricula; 
    }
 
    public ArrayList<String> consulta() {
        String sql = "select * from TMatriculas";
        ArrayList<String> todaslasMatriculas =(ArrayList<String>) jdbcTemplate.query(sql, new MatriculaMapper());
 
        return todaslasMatriculas; 
    }  
    
}

class MatriculaMapper implements RowMapper<String> {

    public String mapRow(ResultSet rs, int rowNum) throws SQLException {

        return rs.getString("Matricula");
    }
}
