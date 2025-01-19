/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIFrames;

import Classes.Cnction;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;

public class EditEmployee extends javax.swing.JFrame {


    public EditEmployee() {

        initComponents();

    }

    public static String getDepName(int depId) {
        String departmentName = null;

        try (Connection connection = Cnction.getConnection()) {
            String query = "SELECT name FROM departments WHERE id=?";
            try (PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query)) {
                preparedStatement.setInt(1, depId);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        departmentName = resultSet.getString("name");
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return departmentName;
    }

    public void setData(int id, String fName, String lName, String add, int tel, String email, int depId) {
        lblEmpNo.setText(String.valueOf(id));
        txtFName.setText(fName);
        txtLName.setText(lName);
        txtAdd.setText(add);
        txtTel.setText(String.valueOf(tel));
        txtEmail.setText(email);

        // Get department name based on depId
        String departmentName = getDepName(depId);
        lblDept.setText(departmentName);
    }

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
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtTel = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmpNo = new javax.swing.JLabel();
        lblDept = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        pnlAddUser.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4), "Edit Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 1, 24))); // NOI18N

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
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(txtLName)
                    .addComponent(txtAdd)
                    .addComponent(txtEmail)
                    .addComponent(txtTel)
                    .addComponent(lblEmpNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblempno)
                    .addComponent(lblEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddUserLayout.createSequentialGroup()
                        .addComponent(lblDep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                        .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(pnlAddUserLayout.createSequentialGroup()
                        .addComponent(lblDept, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtFName.equals("") || txtLName.equals("")
                || txtAdd.equals("") || txtTel.equals("") || txtEmail.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Fields must not be empty!", "Error", 1);
        } else {
            // Here We validate Names only have letters
            if (!txtFName.getText().matches("[a-zA-Z]+") || !txtLName.getText().matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(rootPane, "Invalid characters in First Name or Last Name!", "Error", 1);
                return;
            }

            //for address we can take any symbol and numbers and letters but for tel no onmy numbers 0-9
            if (!txtTel.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(rootPane, "Invalid characters in Telephone Number!", "Error", 1);
                return;
            }

            // for email only letters, numbers, and valid email format
            if (!txtEmail.getText().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
                JOptionPane.showMessageDialog(rootPane, "Invalid Email Address!", "Error", 1);
                return;
            }
            // if all above are in order then we try the connection 
try {
    try (Connection con = Cnction.getConnection()) {
        String sql = "UPDATE employees SET fName=?, lName=?, address=?, tel=?, email=? WHERE id=?";
        try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
            pst.setString(1, txtFName.getText());
            pst.setString(2, txtLName.getText());
            pst.setString(3, txtAdd.getText());
            pst.setInt(4, Integer.parseInt(txtTel.getText()));
            pst.setString(5, txtEmail.getText());
            pst.setInt(6, Integer.parseInt(lblEmpNo.getText())); 

            int rowsUpdated = pst.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Detail Updated Successfully!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No records updated.");
            }
        }
    }
} catch (SQLException | NumberFormatException ex) {
   
    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage());
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
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDep;
    private javax.swing.JLabel lblDept;
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
