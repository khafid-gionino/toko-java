/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Futaikhi
 */
public class Koneksi {
    public static Connection con;
    
    public static Connection getConnection(){
        try {            
            con = DriverManager.getConnection("jdbc:mysql://localhost/barang","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Konesi ke Database GAGAL");
        }
        return con;
    }
}
