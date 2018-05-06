/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import core.Employee;
import dao.EmployeeDAO;
import dao.DBConnection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import java.awt.event.KeyEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
/**
 *
 * @author Luong
 */
public class EmployeeFrame extends javax.swing.JFrame {

    private DBConnection conn;
    private EmployeeDAO employeeDAO;
    private List<Employee> employee;
    private EmployeeTableModel model;
    /**
     * Creates new form EmployeeFrame
     */
    public EmployeeFrame(DBConnection myConn) {
        initComponents();
        this.conn = myConn;
        employeeDAO = new EmployeeDAO(this.conn);
        EmployeeTable.setAutoCreateRowSorter(true);

        
        try{
        employee = employeeDAO.getAllEmployees();

        }
        
        catch(Exception err){
             JOptionPane.showMessageDialog(this, "Error: "+err,"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        model = new EmployeeTableModel(employee);
        EmployeeTable.setModel(model); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        first_name = new javax.swing.JTextField();
        last_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ResetButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        first_name1 = new javax.swing.JTextField();
        EIDTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "EID", "First Name", "Last Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmployeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeTable);
        if (EmployeeTable.getColumnModel().getColumnCount() > 0) {
            EmployeeTable.getColumnModel().getColumn(0).setResizable(false);
            EmployeeTable.getColumnModel().getColumn(1).setResizable(false);
            EmployeeTable.getColumnModel().getColumn(2).setResizable(false);
        }

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        AddButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AddButtonKeyPressed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        UpdateButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UpdateButtonKeyPressed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        DeleteButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DeleteButtonKeyPressed(evt);
            }
        });

        first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_nameActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        ResetButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ResetButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ResetButtonKeyReleased(evt);
            }
        });

        jLabel3.setText("EID");

        first_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_name1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(first_name, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(last_name)
                                .addComponent(first_name1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                            .addComponent(EIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(765, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddButton, DeleteButton, ResetButton, UpdateButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddButton)
                        .addComponent(EIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(first_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UpdateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteButton)
                            .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ResetButton)
                .addGap(0, 243, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddButton, DeleteButton, ResetButton, UpdateButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_nameActionPerformed
 
    private void EmployeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeTableMouseClicked
        // TODO add your handling code here:
       int selectedRowIndex = EmployeeTable.getSelectedRow();
       int selectedRowModel = EmployeeTable.convertRowIndexToModel(selectedRowIndex);
       
       EIDTextField.setText(model.getValueAt(selectedRowModel, 0).toString());
       first_name.setText(model.getValueAt(selectedRowModel, 1).toString());
       last_name.setText(model.getValueAt(selectedRowModel, 2).toString()); 
       
       AddButton.setEnabled(false);
    }//GEN-LAST:event_EmployeeTableMouseClicked

    private void AddButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddButtonKeyPressed
        // TODO add your handling code here:
        /*if (evt.getKeyCode() == KeyEvent.VK_ENTER)            
        {
            AddButton.doClick();
        } */      
    }//GEN-LAST:event_AddButtonKeyPressed

    private void UpdateButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpdateButtonKeyPressed
        // TODO add your handling code here:
        /*if (evt.getKeyCode() == KeyEvent.VK_ENTER)            
        {
            UpdateButton.doClick();
        }*/

    }//GEN-LAST:event_UpdateButtonKeyPressed

    private void DeleteButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeleteButtonKeyPressed
        // TODO add your handling code here:
        /*if (evt.getKeyCode() == KeyEvent.VK_ENTER)            
        {
           DeleteButton.doClick();
        }*/
    }//GEN-LAST:event_DeleteButtonKeyPressed
  
    private void ResetButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResetButtonKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetButtonKeyReleased

    private void ResetButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResetButtonKeyPressed
        // TODO add your handling code here:
        /*if (evt.getKeyCode() == KeyEvent.VK_ENTER)            
        {
            ResetButton.doClick();
        }       
        */
    }//GEN-LAST:event_ResetButtonKeyPressed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:

        try {
          Employee newEmployee = new Employee(Integer.parseInt(EIDTextField.getText()),first_name.getText(),last_name.getText()); 
          employeeDAO.addEmployee(newEmployee);         
          employee = employeeDAO.getAllEmployees();
          JOptionPane.showMessageDialog(this,"Your employee will be added!");
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Database Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        } 
      model = new EmployeeTableModel(employee);
      EmployeeTable.setModel(model);
      EIDTextField.setText("");
      first_name.setText("");
      last_name.setText("");                                             
  
    }                                         
   
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        try {
          Employee newEmployees = new Employee(Integer.parseInt(EIDTextField.getText()),first_name.getText(),last_name.getText());
          employeeDAO.updateEmployee(newEmployees);
          employee = employeeDAO.getAllEmployees();
          JOptionPane.showMessageDialog(this,"Your employee weill be updated!");
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Database Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
      model = new EmployeeTableModel(employee);
      EmployeeTable.setModel(model); 
      EIDTextField.setText("");
      first_name.setText("");
      last_name.setText("");

    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null,"Are you sure you wish to delete this employee?","Delete",JOptionPane.YES_NO_OPTION);
       if (p==0)
       {
           try {
          Employee deleteEmployee = new Employee(Integer.parseInt(EIDTextField.getText()),first_name.getText(),last_name.getText());
          employeeDAO.deleteEmployee(deleteEmployee);
          JOptionPane.showMessageDialog(this,"Your employee will be deleted!");
          employee = employeeDAO.getAllEmployees();

        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Database Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
         
       }
       else {
           JOptionPane.showMessageDialog(this, "Delete Cancelled");
       }
      model = new EmployeeTableModel(employee);
      EmployeeTable.setModel(model); 
      EIDTextField.setText("");
      first_name.setText("");
      last_name.setText("");
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
      AddButton.setEnabled(true);
      EIDTextField.setText("");
      first_name.setText("");
      last_name.setText("");

    }//GEN-LAST:event_ResetButtonActionPerformed

    private void first_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_name1ActionPerformed

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField EIDTextField;
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField first_name;
    private javax.swing.JTextField first_name1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField last_name;
    // End of variables declaration//GEN-END:variables
}
