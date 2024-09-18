package com.v11.cibertec.capitulo10.conexion.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/demotest?serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";

    /**
     * Metodo para obtener la conexion con la base de datos
     *
     * @return
     */
    public static synchronized Connection getConnection() {
        Connection cn = null;
        try {
            // Cargamos el Driver y le indicamos que vamos a usar mysql
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Obtenemos la conexión
            cn = DriverManager.getConnection(URL, USUARIO, CLAVE);

        } catch (Exception e) {
            e.printStackTrace();
            cn = null;
        } finally {
            return cn;
        }
    }

    /**
     * Metodo utilizado para cerrar el resulset de datos
     *
     * @param rs
     */
    public static synchronized void cerrarResultSet(ResultSet rs) {
        try {
            rs.close();
        } catch (Exception e) {
        }
    }

    public static synchronized void cerrarConexion(Connection cn) {
        try {
            cn.close();
        } catch (Exception e) {
        }
    }

}
