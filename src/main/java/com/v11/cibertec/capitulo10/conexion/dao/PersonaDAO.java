package com.v11.cibertec.capitulo10.conexion.dao;

import com.v11.cibertec.capitulo10.conexion.db.Conexion;
import com.v11.cibertec.capitulo10.conexion.entities.Persona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    public void insertar(Persona persona) {

        Connection conexion = Conexion.getConnection();
        try {
            System.out.println("Iniciando Insertar");
            PreparedStatement ps = conexion.prepareStatement("insert into Persona values (?,?,?,?,?,?,?)");
            ps.setInt(1, persona.getCodigoPersona());
            ps.setString(2, persona.getApellidos());
            ps.setString(3, persona.getNombres());
            ps.setString(4, persona.getDireccion());
            ps.setString(5, persona.getCiudad());
            ps.setString(6, persona.getDni());
            ps.setString(7, persona.getEmail());

            ps.execute();
            System.out.println("Persona Insertada");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void insertarSinCodigo(Persona persona) {

        Connection conexion = Conexion.getConnection();
        try {
            System.out.println("Iniciando Insertar sin codigo ");
            PreparedStatement ps = conexion.prepareStatement("insert into Persona( apellidos, nombres, direccion, ciudad,dni, email) values (?,?,?,?,?,?)");
            ps.setString(1, persona.getApellidos());
            ps.setString(2, persona.getNombres());
            ps.setString(3, persona.getDireccion());
            ps.setString(4, persona.getCiudad());
            ps.setString(5, persona.getDni());
            ps.setString(6, persona.getEmail());

            ps.execute();
            System.out.println("Persona Insertada");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<Persona> obtenerPersonas() {
        List<Persona> lista = null;
        try {
            lista = new ArrayList<>();
            Connection cn = Conexion.getConnection();
            ResultSet rs = cn.prepareStatement("Select * from persona").executeQuery();
            while (rs.next()) {
                Persona p = new Persona(rs.getInt("codigoPersona"), rs.getString("nombres"), rs.getString("apellidos"),
                        rs.getString("ciudad"), rs.getString("direccion"), rs.getString("email"), rs.getString("dni"));
                lista.add(p);
            }
            Conexion.cerrarResultSet(rs);
            Conexion.cerrarConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public Persona obtenerPersona(int codigoPersona) {
        Persona persona = null;
        try {
            persona = new Persona();
            Connection cn = Conexion.getConnection();
            PreparedStatement ps =cn.prepareStatement("Select * from persona where codigoPersona = ?");
            ps.setInt(1, codigoPersona);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                persona = new Persona(rs.getInt("codigoPersona"), rs.getString("nombres"), rs.getString("apellidos"),
                        rs.getString("ciudad"), rs.getString("direccion"), rs.getString("email"), rs.getString("dni"));
                
            }
            Conexion.cerrarResultSet(rs);
            Conexion.cerrarConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return persona;
    }
    
    
    public void actualizarPersona(Persona persona){
    
        try {
            Connection cn = Conexion.getConnection();
            PreparedStatement ps = cn.prepareStatement("update persona set nombres=?, apellidos=? where codigoPersona=?");
            ps.setString(1, persona.getNombres());
            ps.setString(2, persona.getApellidos());
            ps.setInt(3, persona.getCodigoPersona());
            ps.execute();
            cn.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void eliminarPersona(Persona persona){
    
        try {
            Connection cn = Conexion.getConnection();
            PreparedStatement ps = cn.prepareStatement("delete from persona where codigoPersona=?");
            ps.setInt(1, persona.getCodigoPersona());
            ps.execute();
            cn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
    }   
    
    
}
