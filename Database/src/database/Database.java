/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emir Ertürk
 */
public class Database {

    public static final String username = "root";
    public static final String password = "";
    public static final String dbName = "demo";
    public static final String host = "localhost";
    public static final int port = 3307;
    
    public Connection con=null;
    
    public Database(){
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.dbName + "?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadi");
        }
        try {
            con = DriverManager.getConnection(url, Database.username, Database.password);
            System.out.println("Baglanti basarili");
        } catch (SQLException ex) {
            System.out.println("Baglanti basarisiz");
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Database db=new Database();
    }
}
