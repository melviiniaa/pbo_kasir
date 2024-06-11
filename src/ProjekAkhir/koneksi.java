
package ProjekAkhir;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class koneksi {
      private static java.sql.Connection tb_pelanggan;
   public static java.sql.Connection koneksi_telkom() throws SQLException{
       if (tb_pelanggan==null){
           try{
               String db ="jdbc:mysql://localhost:3306/telkom";
               String user = "root";
               String pass = "";
               
               DriverManager.registerDriver(new com.mysql.jdbc.Driver());
               tb_pelanggan = (java.sql.Connection) DriverManager.getConnection(db,user,pass);
           }catch (Exception e) {
               JOptionPane.showMessageDialog(null, "gagal terkoneksi ke database");
           }
       }
       
       return tb_pelanggan;
   }
    
}
