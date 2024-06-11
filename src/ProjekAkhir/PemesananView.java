
package ProjekAkhir;

import static java.awt.Frame.MAXIMIZED_BOTH;
import static java.lang.reflect.Array.set;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PemesananView extends javax.swing.JFrame {
    DefaultTableModel tabmode;
    private Object conn;
    ResultSet Cari=null;
    public PemesananView() {
        initComponents();
        Object[] row = {"no pemesanan","nik", "nama", "no hp", "kode paket", "masa paket", "harga paket", "alamat"};
        tabmode = new DefaultTableModel(null, row);
        table.setModel(tabmode);
        jScrollPane1.getViewport().add(table, null);
        tampildata();
         pelanggan();
         paket();
    }
    
    public void tampildata(){
      hapustable();
        try{
            String sql = "SELECT tb_pelanggan.nik, tb_pelanggan.nama, tb_pelanggan.no_hp," 
                       + "tb_paket.kode_paket, tb_paket.masa_paket, tb_paket.harga_paket,"
                       + "tb_pemesanan.alamat, tb_pemesanan.no_pemesanan"
                       + " FROM tb_pemesanan JOIN tb_pelanggan ON tb_pelanggan.nik= tb_pemesanan.nik "
                       + "INNER JOIN tb_paket ON tb_paket.kode_paket =tb_pemesanan.kode_paket";
            Connection conn=(java.sql.Connection)koneksi.koneksi_telkom();
            Statement stat = conn.createStatement();
            ResultSet set = stat.executeQuery(sql);
            
            while (set.next()){
            String[] data = { set.getString("no_pemesanan"),
                           set.getString("nik"),
                           set.getString("nama"),
                           set.getString("no_hp"),
                           set.getString("kode_paket"),
                           set.getString("masa_paket"),
                           set.getString("harga_paket"),
                           set.getString("alamat"),
            
            };
                           
             tabmode.addRow(data);
        }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }  
}
    
    public void pelanggan(){
    try{
         Connection conn = (Connection)koneksi.koneksi_telkom();
         String sql = "select * from tb_pelanggan";
         Statement stat = conn.createStatement();
         ResultSet res = stat.executeQuery(sql);
         while (res.next()){
             nik.addItem(res.getString("nik"));
         }
    }catch (Exception e){
            JOptionPane.showMessageDialog(null, "gagal tampil pelanggan-PemesananView");
        }
}

public void paket(){
     try{
         Connection conn = (Connection)koneksi.koneksi_telkom();
         String sql = "select * from tb_paket";
         Statement stat = conn.createStatement();
         ResultSet res = stat.executeQuery(sql);
         while (res.next()){
             kode.addItem(res.getString("kode_paket"));
         }
    }catch (Exception e){
            JOptionPane.showMessageDialog(null, "gagal tampil paket-PemesananView");
        }
}

       
    
    public void hapustable(){
        try{
             int row=tabmode.getRowCount();
        for(int a=0;a<row;a++){
            tabmode.removeRow(0);
        }
       
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void hapustext(){
        nama.setText("");
        nohp.setText("");
        masa.setText("");
        harga.setText("");
        alamat.setText("");
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nik = new javax.swing.JComboBox<>();
        nama = new javax.swing.JTextField();
        nohp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kode = new javax.swing.JComboBox<>();
        masa = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        segarkan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        np = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("PEMESANAN PAKET INDIHOME");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("No Pemesanan :");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Nama :");

        nik.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nikActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Kode Paket :");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Masa Paket :");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Harga Paket :");

        kode.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nik", "Nama", "No Hp", "Kode Paket", "Masa Paket", "Harga Paket", "Alamat"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Alamat :");

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane2.setViewportView(alamat);

        simpan.setBackground(new java.awt.Color(255, 255, 255));
        simpan.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        simpan.setForeground(new java.awt.Color(204, 0, 0));
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(255, 255, 255));
        hapus.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        hapus.setForeground(new java.awt.Color(204, 0, 0));
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        ubah.setBackground(new java.awt.Color(255, 255, 255));
        ubah.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        ubah.setForeground(new java.awt.Color(204, 0, 0));
        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        segarkan.setBackground(new java.awt.Color(255, 255, 255));
        segarkan.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        segarkan.setForeground(new java.awt.Color(204, 0, 0));
        segarkan.setText("Segarkan");
        segarkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segarkanActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-logout-26.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-go-back-26.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Nik :");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("No Hp :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nohp, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                        .addComponent(nama, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nik, 0, 318, Short.MAX_VALUE)
                                        .addComponent(np)
                                        .addComponent(kode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(masa, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(segarkan)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel9))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(364, 364, 364)
                .addComponent(jLabel10)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(0, 70, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(masa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hapus)
                                .addComponent(ubah)
                                .addComponent(segarkan)
                                .addComponent(simpan))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(81, 81, 81))
        );

        jScrollPane3.setViewportView(jPanel1);

        getContentPane().add(jScrollPane3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setMaximumFrame();
    }//GEN-LAST:event_formWindowOpened

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:;
       try{
            int row =table.getSelectedRow();
            String tabel_klik= (table.getModel().getValueAt(row, 0).toString());
            Connection conn=(Connection)koneksi.koneksi_telkom();
            Statement stat =conn.createStatement();
            ResultSet sql = stat.executeQuery
            ("select * from tb_pemesanan INNER JOIN tb_paket ON tb_pemesanan.kode_paket = tb_paket.kode_paket INNER JOIN tb_pelanggan ON tb_pemesanan.nik = tb_pelanggan.nik"
                    + " where no_pemesanan= '"+tabel_klik+"'");
            if(sql.next()){
                String add0 = sql.getString("no_pemesanan");
                np.setText(add0);
                String add1 = sql.getString("nik");
                nik.setSelectedItem(add1);
                String add2 = sql.getString("nama");
                nama.setText(add2);
                String add3 = sql.getString("no_hp");
                nohp.setText(add3);
                String add4 = sql.getString("kode_paket");
                kode.setSelectedItem(add4);
                String add5 = sql.getString("masa_paket");
                masa.setText(add5);
                String add6 = sql.getString("harga_paket");
                harga.setText(add6);
                String add7 = sql.getString("alamat");
                alamat.setText(add7);
                
            }
        }catch (Exception e){        
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
         try{
           String sql = "INSERT INTO tb_pemesanan VALUES('"+np.getText()+
                       "','"+nik.getSelectedItem()+
                        "','"+kode.getSelectedItem()+
                        "','"+alamat.getText()+"')";
           Connection conn = koneksi.koneksi_telkom();
           PreparedStatement pst = conn.prepareStatement(sql);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Data Tersimpan");
           tampildata();
        }catch (Exception e){  
            JOptionPane.showMessageDialog(null, e);
        }
        tampildata();
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
 
        hapustable();
       try{
        String sql = "DELETE FROM tb_pemesanan WHERE nik = '"+ nik.getSelectedItem()+"'";
        Connection conn = koneksi.koneksi_telkom();
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Data Terhapus");
        tampildata();
        }catch (Exception e){        
            JOptionPane.showMessageDialog(null, e);
        }
        tampildata();
    }//GEN-LAST:event_hapusActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        hapustable();
        try{
            String sql = "UPDATE tb_pemesanan SET nik='"+nik.getSelectedItem()+ "', kode_paket='"+kode.getSelectedItem()
                    +"', alamat='"+alamat.getText() 
                     + "' WHERE no_pemesanan = '"+np.getText()+"'";
            Connection conn = koneksi.koneksi_telkom();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Diedit");
            tampildata();
        }catch (Exception e){        
            JOptionPane.showMessageDialog(null, e);
        }
        tampildata();
    }//GEN-LAST:event_ubahActionPerformed

    private void segarkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segarkanActionPerformed
        // TODO add your handling code here:
        np.setText("");
        nama.setText("");
        nohp.setText("");
        masa.setText("");
        harga.setText("");
        alamat.setText("");
        
    }//GEN-LAST:event_segarkanActionPerformed

    private void nikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nikActionPerformed
        // TODO add your handling code here:
         try{
            String sql = "select tb_pelanggan.nama, tb_pelanggan.no_hp "
                       + " FROM tb_pelanggan WHERE nik = '" + nik.getSelectedItem() +"'";
        Connection conn = koneksi.koneksi_telkom();
        Statement stat = conn.createStatement();
        ResultSet res = stat.executeQuery(sql);
        while (res.next()){
            Object[] obj = new Object[3];
            obj[0] = res.getString(1);
            obj[1] = res.getString(2);
            nama.setText((String) obj[0]);
            nohp.setText((String) obj[1]);
       
        }
       
    }catch (Exception e){        
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_nikActionPerformed

    private void kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "select tb_paket.masa_paket, tb_paket.harga_paket "
                       + " FROM tb_paket WHERE kode_paket = '" + kode.getSelectedItem() +"'";
        Connection conn = koneksi.koneksi_telkom();
        Statement stat = conn.createStatement();
        ResultSet res = stat.executeQuery(sql);
        while (res.next()){
            Object[] obj = new Object[3];
            obj[0] = res.getString(1);
            obj[1] = res.getString(2);
            masa.setText((String) obj[0]);
            harga.setText((String) obj[1]);
       
        }
       
    }catch (Exception e){        
            JOptionPane.showMessageDialog(null, e);
        }
    
    }//GEN-LAST:event_kodeActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new PelangganView().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new HomeView().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(PemesananView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PemesananView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PemesananView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PemesananView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PemesananView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> kode;
    private javax.swing.JTextField masa;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> nik;
    private javax.swing.JTextField nohp;
    private javax.swing.JTextField np;
    private javax.swing.JButton segarkan;
    private javax.swing.JButton simpan;
    private javax.swing.JTable table;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
private void setMaximumFrame(){
    try{
        this.setExtendedState(MAXIMIZED_BOTH);
    }catch(Exception error){
        System.err.println("Error at PemesananView-setMaximumFrame, details :"+error.toString());
        JOptionPane.showMessageDialog(this, "Error at PemesananView-setMaximumFrame, details :"+error.toString());
    }
}

 
 
 

}
