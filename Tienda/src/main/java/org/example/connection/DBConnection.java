package org.example.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() {

        Connection dbConn = null;
        String dbUrl = "jdbc:mysql://192.168.100.177:3306/tienda";
        String user = "java";
        String password = "Ar0901DsK";

        try
        {
            dbConn = DriverManager.getConnection(dbUrl, user, password);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return dbConn;
    }

    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            System.out.println("Conexion exitosa!    "  + conn);
        } else {
            System.out.println("Error al conectarse");
        }
    }
}
