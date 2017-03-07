
import TestCRUD.KoneksiDB;
import com.sun.istack.internal.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkom
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        setTanggal();
        setJam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labeltanggal = new javax.swing.JLabel();
        labeljam = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtKelas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdLaki = new javax.swing.JRadioButton();
        rdPerempuan = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtTempat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tgl = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Reset = new javax.swing.JToggleButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM BIODATA SISWA SMK TELKOM");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 0, 510, 70);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Real Informatic School");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 50, 200, 40);

        labeltanggal.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        labeltanggal.setForeground(new java.awt.Color(255, 255, 255));
        labeltanggal.setText("Tanggal");
        jPanel1.add(labeltanggal);
        labeltanggal.setBounds(710, 10, 80, 30);

        labeljam.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        labeljam.setForeground(new java.awt.Color(255, 255, 255));
        labeljam.setText("Jam");
        jPanel1.add(labeljam);
        labeljam.setBounds(710, 50, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 870, 100);

        jPanel2.setBackground(new java.awt.Color(102, 255, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel3.setText("ISIAN DATA SISWA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 110, 260, 40);

        jPanel3.setBackground(new java.awt.Color(102, 255, 0));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);
        jPanel3.add(txtKelas);
        txtKelas.setBounds(10, 340, 200, 30);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 460, 200, 80);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel4.setText("ALAMAT");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 430, 50, 30);
        jPanel3.add(txtEmail);
        txtEmail.setBounds(10, 400, 200, 30);

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel9.setText("EMAIL");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 370, 50, 30);

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel8.setText("KELAS");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 310, 50, 30);

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel7.setText("JENIS KELAMIN");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 240, 110, 30);

        rdLaki.setText("Laki - Laki");
        rdLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdLakiActionPerformed(evt);
            }
        });
        jPanel3.add(rdLaki);
        rdLaki.setBounds(10, 270, 100, 40);

        rdPerempuan.setText("Perempuan");
        jPanel3.add(rdPerempuan);
        rdPerempuan.setBounds(120, 270, 110, 40);

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel10.setText("TEMPAT LAHIR");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 120, 110, 30);
        jPanel3.add(txtTempat);
        txtTempat.setBounds(10, 150, 200, 30);

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel11.setText("TANGGAL LAHIR");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 180, 110, 30);
        jPanel3.add(tgl);
        tgl.setBounds(10, 210, 200, 30);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel5.setText("NIS");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 0, 50, 30);
        jPanel3.add(txtNIS);
        txtNIS.setBounds(10, 30, 150, 30);

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel6.setText("NAMA");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 60, 50, 30);
        jPanel3.add(txtNama);
        txtNama.setBounds(10, 90, 200, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 150, 260, 550);

        jPanel4.setBackground(new java.awt.Color(51, 255, 51));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        Reset.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Reset.setText("CLEAR");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel4.add(Reset);
        Reset.setBounds(210, 10, 80, 30);

        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnAdd.setText("SAVE");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd);
        btnAdd.setBounds(20, 10, 70, 30);

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete);
        btnDelete.setBounds(100, 10, 90, 30);

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel4.add(btnRefresh);
        btnRefresh.setBounds(310, 10, 90, 30);

        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel4.add(btnEdit);
        btnEdit.setBounds(410, 10, 60, 30);

        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel4.add(btnPrint);
        btnPrint.setBounds(480, 10, 80, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(290, 110, 580, 50);

        jPanel5.setBackground(new java.awt.Color(102, 255, 0));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "TempatLahir", "TanggalLahir", "JenisKelamin", "Kelas", "Email", "Alamat"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(300, 180, 560, 430);

        setBounds(0, 0, 887, 747);
    }// </editor-fold>//GEN-END:initComponents

    private void rdLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdLakiActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalan = dateFormat.format(tgl.getDate());
        //String tanggal = dateFormat.format(tgl.getDate());
        String JK = "";
            if (rdLaki.isSelected()) {
                 JK = "L";
            } 
            if (rdPerempuan.isSelected()) {
                    JK = "P";
            } 
            
        if (txtNIS.getText().equals("") || txtNama.getText().equals("") || tanggalan.equals("") || JK.equals("") ||
            txtKelas.getText().equals("") || txtEmail.getText().equals("") || txtTempat.getText().equals("") ||
            txtAlamat.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error",
                JOptionPane.WARNING_MESSAGE);
        } else {
            String SQL = "INSERT INTO t_siswa (NIS, NamaSiswa, TempatLahir, TanggalLahir, JenisKelamin, Kelas, Email, Alamat)"
                    + "VALUES('"+txtNIS.getText()+"', '"+txtNama.getText()+"', '"+txtTempat.getText()+"', '"+tgl.getDate()+"', '"
                    +JK+"', '"+txtKelas.getText()+"', '"+txtEmail.getText()+"', '"+txtAlamat.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            String NIS = tblData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtTempat.setText("");
        tgl.setDate(null);
        txtNIS.setText("");
        txtKelas.setText("");
        buttonGroup1.clearSelection();
        txtEmail.setText("");
        txtAlamat.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       if ("".equals(txtNIS.getText()) || "".equals(txtAlamat.getText()) ||
            "".equals(txtKelas.getText()) || "".equals(txtNama.getText()) ||
            "".equals(txtEmail.getText()) || "".equals(txtTempat.getText())) {
        JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String JK = "";
                if (rdLaki.isSelected()) {
                    JK = "L";
                } else {
                    JK = "P";
                }
            String SQL = "UPDATE `t_siswa` SET `NamaSiswa`='"+txtNama.getText()
                    +"',`TempatLahir`='"+txtTempat.getText()
                    +"',`TanggalLahir`='"+tgl.getDate()
                    +"',`JenisKelamin`='"+JK
                    +"',`Kelas`='"+txtKelas.getText()
                    +"',`Email`='"+txtEmail.getText()
                    +"',`Alamat`='"+txtAlamat.getText()
                    +"' WHERE NIS="+txtNIS.getText() + "";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if(baris!= -1) {
        txtNIS.setText(tblData.getValueAt(baris,0).toString());
        txtNama.setText(tblData.getValueAt(baris,1).toString());
        txtTempat.setText(tblData.getValueAt(baris,2).toString());
        tgl.getDate().toString();
        //tanggal = dateFormat.format(tanggal.getDate());
        if ("Laki-laki".equals(tblData.getValueAt(baris,4).toString())){
        rdLaki.setSelected(true);
        } else {
        rdPerempuan.setSelected(true);
        }
        txtKelas.setText(tblData.getValueAt(baris,5).toString());
        txtEmail.setText(tblData.getValueAt(baris,6).toString());
        txtAlamat.setText(tblData.getValueAt(baris,7).toString());
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Biodata Siswa SMK Telkom Malang");
        MessageFormat footer = new MessageFormat("Page (0, number, integer)     ");
        try {
            tblData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Reset;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRefresh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labeljam;
    private javax.swing.JLabel labeltanggal;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPerempuan;
    private javax.swing.JTable tblData;
    private com.toedter.calendar.JDateChooser tgl;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTempat;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"NIS", "NamaSiswa", "TempatLahir", "TanggalLahir", "JenisKelamin", "Kelas", "Email", "Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while (rs.next()) {
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String TempatLahir = rs.getString(3);
                String TanggalLahir = rs.getString(4);
                String JenisKelamin = "";
                if ("L".equals(rs.getString(5))) {
                    JenisKelamin = "Laki-Laki";
                } else {
                    JenisKelamin = "Perempuan";
                }
                String Kelas = rs.getString(6);
                String Email = rs.getString(7);
                String Alamat = rs.getString(8);
                String data[] = {NIS, NamaSiswa, TempatLahir, TanggalLahir, JenisKelamin, Kelas, Email, Alamat};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmMain.class).log(Level.SEVERE, null, ex);
        }
        tblData.setModel(dtm); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setTanggal() {
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd/MM/yyyy");
        labeltanggal.setText(kal.format(skrg));
    }
    
    String nol_jam="";
    String nol_menit="";
    String nol_detik="";
    
    public void setJam() {
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if (nilai_jam <= 9) {
                    nol_jam = "0";
                }
                if (nilai_menit <= 9) {
                    nol_menit = "0";
                }
                if (nilai_detik <= 9) {
                    nol_detik = "0";
                }
                
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                labeljam.setText("Jam " + jam + ":" + menit + ":" + detik);
            }
        };
        new Timer(100, taskPerformer).start();
    }
}


