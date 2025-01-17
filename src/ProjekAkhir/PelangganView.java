
package ProjekAkhir;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PelangganView extends javax.swing.JFrame {

    DefaultTableModel TabModel;
    private Object conn;
    ResultSet CariData=null;
    public PelangganView() {
        initComponents();
        tampildata();
    }
    
    public void tampildata(){
         try{
        Object[] row = {"nik","nama","nomor handphone"};
        TabModel = new DefaultTableModel(null, row);
        table.setModel(TabModel);
        jScrollPane1.getViewport().add(table,null);
        
        String sql="SELECT * FROM tb_pelanggan";
        Connection conn = (Connection)koneksi.koneksi_telkom();
        Statement stat = conn.prepareStatement(sql);
        ResultSet set = stat.executeQuery(sql);
        while (set.next()){
            String[] data = {set.getString("Nik"),
                             set.getString("Nama"),
                             set.getString("No_Hp")};
                           
             TabModel.addRow(data);
        }
    }catch (Exception error){
            System.err.println("Error at PelangganView-tampildata, details : "+error.toString());
            JOptionPane.showMessageDialog(this, "Error at PelangganView-tampildata, details : "+error.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nohp = new javax.swing.JTextField();
        nik = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        simpan = new javax.swing.JButton();
        segarkan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("DATA PELANGGAN INDIHOME");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Nik : ");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Nama : ");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("No Handphone : ");

        nohp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        nik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        table.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        table.setForeground(new java.awt.Color(204, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nik", "Nama", "No Handphone"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        simpan.setBackground(new java.awt.Color(255, 255, 255));
        simpan.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        simpan.setForeground(new java.awt.Color(204, 0, 0));
        simpan.setText("Simpan");
        simpan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        segarkan.setBackground(new java.awt.Color(255, 255, 255));
        segarkan.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        segarkan.setForeground(new java.awt.Color(204, 0, 0));
        segarkan.setText("Segarkan");
        segarkan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        segarkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segarkanActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(255, 255, 255));
        hapus.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        hapus.setForeground(new java.awt.Color(204, 0, 0));
        hapus.setText("Hapus");
        hapus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        ubah.setBackground(new java.awt.Color(255, 255, 255));
        ubah.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        ubah.setForeground(new java.awt.Color(204, 0, 0));
        ubah.setText("Ubah");
        ubah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-circled-right-26.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 212, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(segarkan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nohp, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(207, 207, 207)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(83, 83, 83)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(51, 51, 51))))
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segarkan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(714, 714, 714))
        );

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void segarkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segarkanActionPerformed
        // TODO add your handling code here:
    nik.setText("");
    nama.setText("");
    nohp.setText("");
    }//GEN-LAST:event_segarkanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setMaximumFrame();
    }//GEN-LAST:event_formWindowOpened

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
         try{
            String sql = "INSERT INTO tb_pelanggan VALUES('"+nik.getText()+
                                                       "','"+nama.getText()+
                                                       "','"+nohp.getText()+"')";
                    
                Connection conn=(java.sql.Connection)koneksi.koneksi_telkom();
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "berhasil disimpan");
        } catch (Exception e){
            System.out.println("tb_pelanggan.PelangganView.save()" + e);
            JOptionPane.showMessageDialog(null, e);
        }
       tampildata();
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM tb_pelanggan WHERE nik = '" + nik.getText()+ "'";
                                              
            Connection conn=(java.sql.Connection)koneksi.koneksi_telkom();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"YAKIN INGIN MENGHAPUS DATA?");
            
        }catch (Exception error){
       System.err.println("Error at PelangganView-HapusAction, details :"+error.toString());
        JOptionPane.showMessageDialog(this, "Error at PelangganView-HapusAction, details :"+error.toString());
     }
        tampildata();
    }//GEN-LAST:event_hapusActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        try{
            
            String sql = "UPDATE tb_pelanggan SET nama ='"+ nama.getText() +
                                             "', no_hp ='" + nohp.getText() +
                                       "' WHERE nik ='" +nik.getText() +"'";
            Connection conn = koneksi.koneksi_telkom(); 
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "berhasil diedit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        tampildata();
    }//GEN-LAST:event_ubahActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        try{
            int row =table.getSelectedRow();
            String tabel_klik=(table.getModel().getValueAt(row, 0).toString());
            Connection conn=(Connection)koneksi.koneksi_telkom();
            Statement stm =conn.createStatement();
            ResultSet sql = stm.executeQuery("SELECT * FROM tb_pelanggan WHERE nik='"+tabel_klik+"'");
            if(sql.next()){
                String add1 = sql.getString("nik");
                nik.setText(add1);
                String add2 = sql.getString("nama");
                nama.setText(add2);
                String add3 = sql.getString("no_hp");
                nohp.setText(add3);
                
            }
        }catch (Exception error){
            System.err.println("Error at PelangganView-TableAction, details :"+error.toString());
        JOptionPane.showMessageDialog(this, "Error at PelangganView-TableAction, details :"+error.toString());
    
        } 
    }//GEN-LAST:event_tableMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new PemesananView().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PelangganView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nik;
    private javax.swing.JTextField nohp;
    private javax.swing.JButton segarkan;
    private javax.swing.JButton simpan;
    private javax.swing.JTable table;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
private void setMaximumFrame(){
    try{
        this.setExtendedState(MAXIMIZED_BOTH);
    }catch(Exception error){
        System.err.println("Error at PelangganView-setMaximumFrame, details :"+error.toString());
        JOptionPane.showMessageDialog(this, "Error at PelangganView-setMaximumFrame, details :"+error.toString());
    }
}

}
