/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author HP
 */
public class PatientDetails2 extends javax.swing.JFrame {

    /**
     * Creates new form PatientDetails2
     */
    public PatientDetails2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel2.setText("Patient  ID : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 210, 190, 40);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel3.setText("First Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 280, 170, 30);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel5.setText("Age :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 340, 100, 30);

        jLabel7.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel7.setText("Gender :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 400, 170, 30);

        jLabel9.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel9.setText("Address :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 460, 160, 30);

        jLabel10.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel10.setText("Phone Number :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 520, 150, 30);

        jLabel13.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel13.setText("Disease :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 580, 140, 30);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel4.setText("Second Name :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(650, 280, 190, 30);

        jLabel6.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel6.setText("Maritial Status :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(650, 340, 190, 30);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel8.setText("Date :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(650, 400, 160, 30);

        jLabel11.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel11.setText("City / State :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(650, 500, 160, 30);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel1.setText("PATIENT  DETAILS ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(670, 60, 280, 50);

        jTextField1.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(240, 210, 240, 40);

        jTextField2.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(240, 280, 240, 30);

        jTextField4.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(240, 340, 240, 30);

        jComboBox2.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(240, 400, 240, 30);

        jTextField6.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jPanel1.add(jTextField6);
        jTextField6.setBounds(240, 460, 890, 30);

        jTextField7.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jPanel1.add(jTextField7);
        jTextField7.setBounds(240, 520, 240, 30);

        jTextField9.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jPanel1.add(jTextField9);
        jTextField9.setBounds(240, 580, 240, 30);

        jTextField3.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(870, 280, 260, 30);

        jComboBox1.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Married", "Unmarried" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(870, 340, 260, 30);

        jTextField5.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(870, 390, 260, 30);

        jTextField8.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jPanel1.add(jTextField8);
        jTextField8.setBounds(870, 500, 260, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient_Id", "Fname", "Lname", "Age", "Maritial", "Gender", "Date", "Address", "Phone", "City/State", "Disease"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 660, 1510, 130);

        jButton1.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/add.png"))); // NOI18N
        jButton1.setText("ADD PATIENTS ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 240, 40);

        jButton2.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/update.png"))); // NOI18N
        jButton2.setText("UPDATE PATIENTS ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(240, 0, 280, 40);

        jButton3.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/delete.png"))); // NOI18N
        jButton3.setText("DELETE PATIENTS ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(520, 0, 269, 40);

        jButton4.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/view.png"))); // NOI18N
        jButton4.setText("VIEW PATIENTS ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(790, 0, 250, 40);

        jButton6.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/search.png"))); // NOI18N
        jButton6.setText("SEARCH PATIENTS ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(650, 210, 273, 40);

        jButton5.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/left.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(0, 40, 50, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/pan.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 1510, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1513, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s1=jTextField1.getText();
        String s2=jTextField2.getText();
        String s3=jTextField3.getText();
        String s4=jTextField4.getText();
        String s5=(String) jComboBox1.getSelectedItem();
        String s6=(String) jComboBox2.getSelectedItem();
        String s7=jTextField5.getText();
        String s8=jTextField6.getText();
        String s9=jTextField7.getText();
        String s10=jTextField8.getText();
        String s11=jTextField9.getText();

        try
        {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?user=root&password=");
            Statement st=con.createStatement();
            int a=st.executeUpdate("INSERT INTO patientdetails VALUES('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"')");
            if(a==1)
            {
                JOptionPane.showMessageDialog(this,"Added and Saved Successfully !!!","Added",1);
            }

            else
            {
                JOptionPane.showMessageDialog(this,"Not Added and Not Saved!!!","",2);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        patienttable();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s1=jTextField1.getText();
        String s2=jTextField2.getText();
        String s3=jTextField3.getText();
        String s4=jTextField4.getText();
        String s5=(String) jComboBox1.getSelectedItem();
        String s6=(String) jComboBox2.getSelectedItem();
        String s7=jTextField5.getText();
        String s8=jTextField6.getText();
        String s9=jTextField7.getText();
        String s10=jTextField8.getText();
        String s11=jTextField9.getText();

        try
        {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?user=root&password=");
            Statement st=con.createStatement();
            int a=st.executeUpdate("UPDATE `patientdetails` SET `Pt_Id`='"+s1+"',`Pname`='"+s2+"',`Lname`='"+s3+"',`Age`='"+s4+"',`Maritial`='"+s5+"',`Gender`='"+s6+"',`Date`='"+s7+"',`Address`='"+s8+"',`Phone`='"+9+"',`City_State`='"+s10+"',`Disease`='"+s11+"' WHERE `Pt_Id`='"+s1+"'");
            if(a==1)
            {
                JOptionPane.showMessageDialog(this,"Updated Successfully !!!","Updated",1);
            }

            else
            {
                JOptionPane.showMessageDialog(this,"Not Updated!!!","",2);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        patienttable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String s1=jTextField1.getText();
        String s2=jTextField2.getText();
        String s3=jTextField3.getText();
        String s4=jTextField4.getText();
        String s5=(String) jComboBox1.getSelectedItem();
        String s6=(String) jComboBox2.getSelectedItem();
        String s7=jTextField5.getText();
        String s8=jTextField6.getText();
        String s9=jTextField7.getText();
        String s10=jTextField8.getText();
        String s11=jTextField9.getText();

        try
        {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?user=root&password=");
            Statement st=con.createStatement();
            int a=st.executeUpdate("DELETE FROM patientdetails WHERE `Pt_Id`='"+s1+"'");
            if(a==1)
            {
                JOptionPane.showMessageDialog(this,"Deleted Successfully !!!","Added",1);
            }

            else
            {
                JOptionPane.showMessageDialog(this,"Not Deleted!!!","",2);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        patienttable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String s1=jTextField1.getText();
        String s2=jTextField2.getText();
        String s3=jTextField3.getText();
        String s4=jTextField4.getText();
        String s5=(String) jComboBox1.getSelectedItem();
        String s6=(String) jComboBox2.getSelectedItem();
        String s7=jTextField5.getText();
        String s8=jTextField6.getText();
        String s9=jTextField7.getText();
        String s10=jTextField8.getText();
        String s11=jTextField9.getText();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String s1=jTextField1.getText();

        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?user=root&password=");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM patientdetails WHERE Pt_Id='"+s1+"'");

            while(rs.next()){
                
                jTextField2.setText(rs.getString(2));
        jTextField3.setText(rs.getString(3));
        jTextField4.setText(rs.getString(4));
        jComboBox1.setSelectedItem(rs.getString(5));
        jComboBox2.setSelectedItem(rs.getString(6));
        jTextField5.setText(rs.getString(7));
        jTextField6.setText(rs.getString(8));
        jTextField7.setText(rs.getString(9));
        jTextField8.setText(rs.getString(10));
        jTextField9.setText(rs.getString(11));
                
                DefaultTableModel model;
                model=(DefaultTableModel)jTable1.getModel();
                TableRowSorter<DefaultTableModel>tr= new TableRowSorter<DefaultTableModel>(model);
                jTable1.setRowSorter(tr);
                tr.setRowFilter(RowFilter.regexFilter(jTextField1.getText().trim()));

            }

        }catch(SQLException e){
            System.out.println(e);
        }
        patienttable();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AdminPanel ap=new AdminPanel();
        this.dispose();
        ap.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    
     public void patienttable()
    {
        try{
             Font f=new Font("Consolas",Font.BOLD,12);
             JTableHeader header=jTable1.getTableHeader();
             header.setFont(f);
             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?user=root&password=");
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery("SELECT * FROM patientdetails");
             while(jTable1.getRowCount()>0)
             {
                 ((DefaultTableModel) jTable1.getModel()).removeRow(0);
             }
             int column=rs.getMetaData().getColumnCount();
             while(rs.next())
             {
                Object[] row=new Object[column];
                for(int i=1;i<=column;i++)
                {
                    row[i-1]=rs.getObject(i);
                }
               ((DefaultTableModel) jTable1.getModel()).insertRow(rs.getRow()-1, row);
               
             }
             rs.close();
             con.close();
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"error!!!"+e);
             }
    }
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
            java.util.logging.Logger.getLogger(PatientDetails2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDetails2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDetails2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDetails2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDetails2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
