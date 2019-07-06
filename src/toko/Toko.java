/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Futaikhi
 */
public class Toko {
    public static Connection conn = null;
    public static ResultSet rs = null;
    public static PreparedStatement ps = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FormBarang().main(args);
    }
    
}
