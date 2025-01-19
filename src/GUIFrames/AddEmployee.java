/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIFrames;

import Classes.Department;
import Classes.Cnction;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddEmployee extends javax.swing.JFrame {
    //this is how i got the deparment list
    //from Department class
    private List<Department> depList;// made it private to use encapsulation methos in OOP

    public AddEmployee() {
        // we are loading all the created depatments to cmbDept when loading the JFrame
        this.depList = new ArrayList<>();
        initComponents();
        try {
            try (Connection con = Cnction.getConnection()) {
                PreparedStatement pst;
                Statement stm = (Statement) con.createStatement();
                ResultSet rs = stm.executeQuery("Select * from departments");
                pst = (PreparedStatement) con.prepareStatement("Select MAX(id) as id from employees");
                ResultSet rs1 = pst.executeQuery();
                while (rs1.next()) {
                    int id = rs1.getInt("id") + 1;
                    lblEmpNo.setText(String.valueOf(id));
                }

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String depname = rs.getString("name");
                    depList.add(new Department(id, depname));
                    cmbDept.addItem(depname);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
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

        pnlAddUser = new javax.swing.JPanel();
        lblempno = new javax.swing.JLabel();
        lblfname = new javax.swing.JLabel();
        lbllname = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblDep = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtAdd = new javax.swing.JTextField();
        cmbDept = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtTel = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmpNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        pnlAddUser.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4), "Add Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 1, 24))); // NOI18N

        lblempno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblempno.setText("EMP No");

        lblfname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblfname.setText("First Name");

        lbllname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbllname.setText("Last Name");

        lblAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAddress.setText("Address");

        lblTel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTel.setText("Tel No");

        lblDep.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDep.setText("Department");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmail.setText("Email");

        cmbDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cmbDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDeptActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Save Icon.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back Icon.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddUserLayout = new javax.swing.GroupLayout(pnlAddUser);
        pnlAddUser.setLayout(pnlAddUserLayout);
        pnlAddUserLayout.setHorizontalGroup(
            pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddUserLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblempno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfname, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(lblTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(lbllname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail)
                    .addComponent(lblDep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101)
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(txtLName)
                        .addComponent(txtAdd)
                        .addComponent(txtEmail)
                        .addComponent(txtTel)
                        .addComponent(lblEmpNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(pnlAddUserLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        pnlAddUserLayout.setVerticalGroup(
            pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddUserLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblempno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfname)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllname)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDep)
                    .addComponent(cmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAddUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDeptActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         if (txtFName.equals("") || txtLName.equals("")
            || txtAdd.equals("") || txtTel.equals("") || txtEmail.equals("") || cmbDept.equals("Select")) {
        JOptionPane.showMessageDialog(rootPane, "Fields must not be empty!", "Error", 1);
    } else {
        // Here We validate Names only have letters
        if (!txtFName.getText().matches("[a-zA-Z]+") || !txtLName.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(rootPane, "Invalid characters in First Name or Last Name!", "Error", 1);
            return;
        }

        //for address we can take any symbol and numbers and letters but for tel no only numbers 0-9
        if (!txtTel.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(rootPane, "Invalid characters in Telephone Number!", "Error", 1);
            return;
        }

        // for email only letters, numbers, and valid email format
        if (!txtEmail.getText().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Email Address!", "Error", 1);
            return;
        }

        // Validate department selection
        if ("Select".equals(cmbDept.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(rootPane, "Select Department", "Error", 1);
            return;
        }

        // if all above are in order then we try the connection 
        try {
            try (Connection con = Cnction.getConnection()) {
                String sql = "insert into employees (fName,lName,address, tel,email,depId) values (?,?,?,?,?,?)";
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                pst.setString(1, txtFName.getText());
                pst.setString(2, txtLName.getText());
                pst.setString(3, txtAdd.getText());
                pst.setInt(4, Integer.parseInt(txtTel.getText()));
                pst.setString(5, txtEmail.getText());

                int selectedDeptId = 0;
                for (Department dept : depList) {
                    if (dept.getName().equals(cmbDept.getSelectedItem().toString())) {
                        selectedDeptId = dept.getId();
                        break;
                    }
                }

                pst.setInt(6, selectedDeptId);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "User Created Successfully!");
                AddEmployee ae = new AddEmployee();
                this.dispose();
                ae.setVisible(true);
            }
        } catch (HeadlessException | NumberFormatException | SQLException ex) {
            System.out.println(ex);
        }
    }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbDept;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDep;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpNo;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblempno;
    private javax.swing.JLabel lblfname;
    private javax.swing.JLabel lbllname;
    private javax.swing.JPanel pnlAddUser;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
