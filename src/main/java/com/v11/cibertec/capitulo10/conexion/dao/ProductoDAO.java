package com.v11.cibertec.capitulo10.conexion.dao;

import com.v11.cibertec.capitulo10.conexion.db.Conexion;
import com.v11.cibertec.capitulo10.conexion.entities.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    public void insertar(Producto producto) {

        Connection conexion = Conexion.getConnection();
        try {
            System.out.println("Iniciando Insertar");
            PreparedStatement ps = conexion.prepareStatement("insert into producto values (?,?,?)");
            ps.setInt(1, producto.getCodigoProducto());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());

            ps.execute();
            System.out.println("Producto Insertado");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void insertarSinCodigo(Producto producto) {

        Connection conexion = Conexion.getConnection();
        try {
            System.out.println("Iniciando Insertar sin codigo ");
            PreparedStatement ps = conexion.prepareStatement("insert into producto( nombre, precio) values (?,?)");
            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());

            ps.execute();
            System.out.println("Producto Insertado");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void actualizarProducto(Producto producto){

        try {
            Connection cn = Conexion.getConnection();
            PreparedStatement ps = cn.prepareStatement("update producto set nombre=?, precio=? where codigoProducto=?");
            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getCodigoProducto());
            ps.execute();
            cn.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void eliminarProducto(Producto producto){

        try {
            Connection cn = Conexion.getConnection();
            PreparedStatement ps = cn.prepareStatement("delete from producto where codigoProducto=?");
            ps.setInt(1, producto.getCodigoProducto());
            ps.execute();
            cn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public List<Producto> obtieneProductos(){
        List<Producto> lista = null;
        try{
            lista = new ArrayList<>();
            Connection cn = Conexion.getConnection();
            ResultSet rs = cn.prepareStatement("Select * from producto").executeQuery();
            while (rs.next()){
                Producto producto =new Producto(rs.getInt("codigoProducto"),rs.getString("nombre"),rs.getDouble("precio"));
                lista.add(producto);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return lista;
    }

    public Producto obtenerProducto(int codigoProducto) {
        Producto producto = null;
        try {
            producto = new Producto();
            Connection cn = Conexion.getConnection();
            PreparedStatement ps =cn.prepareStatement("Select * from producto where codigoProducto = ?");
            ps.setInt(1, codigoProducto);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                producto = new Producto(rs.getInt("codigoProducto"), rs.getString("nombre"), rs.getDouble("precio"));
            }
            Conexion.cerrarResultSet(rs);
            Conexion.cerrarConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return producto;
    }
}
