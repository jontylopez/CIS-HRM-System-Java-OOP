/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIFrames;

import Classes.Department;
import Classes.Cnction;
import Classes.EditEmployees;
import Classes.Role;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Janith
 */
public class SearchEmp extends javax.swing.JFrame {

    List<Department> depList;
    //@Override
    //public void 

    /**
     * Creates new form SearchEmp
     */
    public SearchEmp() {
        initComponents();

        this.depList = new ArrayList<>();
        try {
            Connection con = Cnction.getConnection();
            PreparedStatement pst;
            Statement stm = (Statement) con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from departments");
            while (rs.next()) {
                int id = rs.getInt("id");
                String depname = rs.getString("name");
                depList.add(new Department(id, depname));
                cmbDept.addItem(depname);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        if ("HR Manager".equals(Role.role)) {
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
        }
        if ("HR Assistant".equals(Role.role)) {
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            //here we used extracted role from Role class to enable or disable buttons
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

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpData = new javax.swing.JTable();
        txtEmpNo = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        cmbDept = new javax.swing.JComboBox<>();
        btnSrch = new javax.swing.JButton();
        lblEmpNo = new javax.swing.JLabel();
        lblFName = new javax.swing.JLabel();
        lblLName = new javax.swing.JLabel();
        lblDept = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Search Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back Icon.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblEmpData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEmpData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Emp Id", "First Name", "Last Name", "Address", "Tel No", "Email", "Dep ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEmpData);
        if (tblEmpData.getColumnModel().getColumnCount() > 0) {
            tblEmpData.getColumnModel().getColumn(0).setResizable(false);
            tblEmpData.getColumnModel().getColumn(1).setResizable(false);
            tblEmpData.getColumnModel().getColumn(2).setResizable(false);
            tblEmpData.getColumnModel().getColumn(3).setResizable(false);
            tblEmpData.getColumnModel().getColumn(4).setResizable(false);
            tblEmpData.getColumnModel().getColumn(5).setResizable(false);
            tblEmpData.getColumnModel().getColumn(6).setResizable(false);
        }

        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });

        cmbDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cmbDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDeptActionPerformed(evt);
            }
        });

        btnSrch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search.png"))); // NOI18N
        btnSrch.setText("Search");
        btnSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrchActionPerformed(evt);
            }
        });

        lblEmpNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmpNo.setText("EMP No");

        lblFName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFName.setText("First Name");

        lblLName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLName.setText("Last Name");

        lblDept.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDept.setText("Department");

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Save Icon.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete Icon.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblDept, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(lblLName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmpNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFName)
                            .addComponent(txtEmpNo)
                            .addComponent(cmbDept, 0, 139, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addComponent(btnSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addGap(122, 122, 122)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpNo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDept)
                    .addComponent(btnSrch))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack)
                    .addComponent(btnUpdate))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        this.dispose();


    }//GEN-LAST:event_btnBackActionPerformed

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void cmbDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDeptActionPerformed

    private void btnSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrchActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel) tblEmpData.getModel();
        RecordTable.setRowCount(0);

        Connection con = Cnction.getConnection();

        if (txtFName.getText().isEmpty() && txtLName.getText().isEmpty() && txtEmpNo.getText().isEmpty()
                && (cmbDept.getSelectedItem() == null || cmbDept.getSelectedItem().equals("Select"))) {
            JOptionPane.showMessageDialog(null, "Search fields cannot be empty or Select a Department!");
            return;
        }

        StringBuilder sqlBuilder = new StringBuilder("SELECT * FROM employees WHERE 1=1");
        List<Object> parameters = new ArrayList<>();

        if (!txtFName.getText().isEmpty()) {
            sqlBuilder.append(" AND fName LIKE ?");
            parameters.add("%" + txtFName.getText() + "%");
        }

        if (!txtLName.getText().isEmpty()) {
            sqlBuilder.append(" AND lName LIKE ?");
            parameters.add("%" + txtLName.getText() + "%");
        }

        if (!txtEmpNo.getText().isEmpty()) {
            sqlBuilder.append(" AND id = ?");
            parameters.add(Integer.parseInt(txtEmpNo.getText()));
        }

        if (cmbDept.getSelectedItem() != null && !cmbDept.getSelectedItem().equals("Select")) {
            String selectedDept = cmbDept.getSelectedItem().toString();

            try (PreparedStatement depIdQuery = (PreparedStatement) con.prepareStatement("SELECT id FROM departments WHERE name = ?")) {
                depIdQuery.setString(1, selectedDept);
                ResultSet depIdResult = depIdQuery.executeQuery();

                if (depIdResult.next()) {
                    int departmentId = depIdResult.getInt("id");
                    sqlBuilder.append(" AND depId = ?");
                    parameters.add(departmentId);
                } else {
                    System.out.println("Department ID not found for department name: " + selectedDept);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        try (PreparedStatement mainQuery = (PreparedStatement) con.prepareStatement(sqlBuilder.toString())) {
            for (int i = 0; i < parameters.size(); i++) {
                mainQuery.setObject(i + 1, parameters.get(i));
            }

            ResultSet mainResult = mainQuery.executeQuery();

            if (!mainResult.next()) {
                JOptionPane.showMessageDialog(null, "No data found matching the search criteria.");
            } else {
                do {
                    Vector<String> columnData = new Vector<>();
                    for (int i = 1; i <= mainResult.getMetaData().getColumnCount(); i++) {
                        columnData.add(mainResult.getString(i));
                    }
                    RecordTable.addRow(columnData);
                } while (mainResult.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSrchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //here we use EditEmployees class to get the data in the selected row to the next JFrame
        int selectedRow = tblEmpData.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to update.");
        } else {
            EditEmployee ee = new EditEmployee();
            ee.setVisible(true);
            EditEmployees.id = Integer.parseInt(tblEmpData.getValueAt(selectedRow, 0).toString());
            EditEmployees.fName = tblEmpData.getValueAt(selectedRow, 1).toString();
            EditEmployees.lName = tblEmpData.getValueAt(selectedRow, 2).toString();
            EditEmployees.add = tblEmpData.getValueAt(selectedRow, 3).toString();
            EditEmployees.tel = Integer.parseInt(tblEmpData.getValueAt(selectedRow, 4).toString());
            EditEmployees.email = tblEmpData.getValueAt(selectedRow, 5).toString();
            EditEmployees.depId = Integer.parseInt(tblEmpData.getValueAt(selectedRow, 6).toString());
            ee.setData(EditEmployees.id, EditEmployees.fName, EditEmployees.lName, EditEmployees.add, EditEmployees.tel, EditEmployees.email, EditEmployees.depId);
        }
        DefaultTableModel model = (DefaultTableModel) tblEmpData.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblEmpDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpDataMouseClicked

    }//GEN-LAST:event_tblEmpDataMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int id;
        DefaultTableModel RecordTable = (DefaultTableModel) tblEmpData.getModel();
        int selectedRows = tblEmpData.getSelectedRow();
        try {
            id = Integer.parseInt(RecordTable.getValueAt(selectedRows, 0).toString());
            int deleteItem = JOptionPane.showConfirmDialog(null, "Are you sure You want to Delete this Record?", "Warning", JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION) {
                Connection con = Cnction.getConnection();
                PreparedStatement pst;
                pst = (PreparedStatement) con.prepareStatement("delete from employees where id = ?");
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Employee detailes deleted successfully");
                this.dispose();
                SearchEmp se = new SearchEmp();
                se.setVisible(true);
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(SearchEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSrch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbDept;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDept;
    private javax.swing.JLabel lblEmpNo;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblLName;
    private javax.swing.JTable tblEmpData;
    private javax.swing.JTextField txtEmpNo;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    // End of variables declaration//GEN-END:variables

    private PreparedStatement PreparedStatement(String select__from_employee) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
