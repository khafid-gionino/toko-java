/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko;

import javax.swing.JOptionPane;

/**
 *
 * @author Futaikhi
 */
public class Barang {
    
    public void input(int id,int idJenis,String nama,int harga,int stok){
        try{
            String sql = "insert into barang values (?,?,?,?,?)";
            Toko.ps = Toko.conn.prepareStatement(sql);
            Toko.ps.setInt(1, id);
            Toko.ps.setInt(2, idJenis);
            Toko.ps.setString(3, nama);
            Toko.ps.setInt(4, harga);
            Toko.ps.setInt(5, stok);
            Toko.ps.execute();
            JOptionPane.showMessageDialog(null, "Insert Sukses");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Insert Gagal");
        }
    }
}
