/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import core.Orders;
import dao.OrdersDAO;
import dao.DBConnection;
import java.util.List;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Clorissa & Jeron
 */
public class OrdersFrame extends javax.swing.JFrame {
    private DBConnection conn;
    private List<Orders> orders;
    private OrdersDAO ordersDAO;
    OrdersTableModel model;
    /**
     * Creates new form OrdersFrame
     */
    public OrdersFrame(DBConnection myConn) {
        initComponents();
        this.conn = myConn;
        ordersDAO = new OrdersDAO(this.conn);
        try{
            //Retrieve tuples from Instructor table
            orders = ordersDAO.getAllOrders();          
        }
        catch(Exception exc){
            System.out.println("Error Populating table!" + exc);
        }
        OrdersTableModel model = new OrdersTableModel(orders);
        TableOrders.setModel(model);
        
       // ordersDAO = new OrdersDAO(this.conn);
        
      
        
        
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
        TableOrders = new javax.swing.JTable();
        ButtonAddOrders = new javax.swing.JButton();
        ButtonUpdateButton = new javax.swing.JButton();
        ButtonDeleteButton = new javax.swing.JButton();
        LabelOID = new javax.swing.JLabel();
        LabelPID = new javax.swing.JLabel();
        LabelEID = new javax.swing.JLabel();
        LabelQuantity = new javax.swing.JLabel();
        LabelDRecd = new javax.swing.JLabel();
        TextFieldOID = new javax.swing.JTextField();
        ComboBoxPID = new javax.swing.JComboBox<>();
        ComboBoxEID = new javax.swing.JComboBox<>();
        TextFieldQuantity = new javax.swing.JTextField();
        TextFieldDRecd = new javax.swing.JTextField();
        ButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Product ID", "Employee ID", "Quantity", "Date Received"
            }
        ));
        TableOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableOrdersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableOrders);

        ButtonAddOrders.setText("Add Order");
        ButtonAddOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddOrdersActionPerformed(evt);
            }
        });

        ButtonUpdateButton.setText("Update Order");
        ButtonUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateButtonActionPerformed(evt);
            }
        });

        ButtonDeleteButton.setText("Delete Order");
        ButtonDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteButtonActionPerformed(evt);
            }
        });

        LabelOID.setText("Order ID:");

        LabelPID.setText("Product ID:");

        LabelEID.setText("Employee ID:");

        LabelQuantity.setText("Quantity:");

        LabelDRecd.setText("Date Received:");

        ComboBoxPID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GG2220", "RE1410", "WG3100", "WG3720", "WR0103" }));
        ComboBoxPID.setSelectedIndex(-1);
        ComboBoxPID.setToolTipText("");

        ComboBoxEID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7" }));
        ComboBoxEID.setSelectedIndex(-1);

        TextFieldQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldQuantityActionPerformed(evt);
            }
        });

        TextFieldDRecd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDRecdActionPerformed(evt);
            }
        });

        ButtonReset.setText("Reset");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ComboBoxPID, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelOID)
                                        .addComponent(LabelPID)
                                        .addComponent(LabelEID)
                                        .addComponent(LabelQuantity)
                                        .addComponent(LabelDRecd))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(104, 104, 104)
                                                .addComponent(TextFieldOID, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ComboBoxEID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TextFieldQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(104, 104, 104)
                                            .addComponent(TextFieldDRecd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(ButtonAddOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(ButtonUpdateButton)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonDeleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelOID)
                    .addComponent(TextFieldOID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPID, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEID)
                    .addComponent(ComboBoxEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelQuantity)
                    .addComponent(TextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDRecd)
                    .addComponent(TextFieldDRecd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAddOrders)
                    .addComponent(ButtonUpdateButton)
                    .addComponent(ButtonDeleteButton)
                    .addComponent(ButtonReset))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void ButtonAddOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddOrdersActionPerformed
        // TODO add your handling code here:
        try {
          Orders addOrder = new Orders(Integer.parseInt(TextFieldOID.getText()),ComboBoxPID.getSelectedItem().toString(),Integer.parseInt(ComboBoxEID.getSelectedItem().toString()),Integer.parseInt(TextFieldQuantity.getText()),TextFieldDRecd.getText());
          ordersDAO.addOrders(addOrder);
          JOptionPane.showMessageDialog(this,"Your order has been added!");
          OrdersTableModel model = new OrdersTableModel(ordersDAO.getAllOrders());
          TableOrders.setModel(model);
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Database Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonAddOrdersActionPerformed
     
    private void TextFieldQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldQuantityActionPerformed

    private void TextFieldDRecdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDRecdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDRecdActionPerformed

    private void ButtonResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonResetMouseClicked
                 
    }//GEN-LAST:event_ButtonResetMouseClicked

    private void ButtonResetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonResetKeyPressed
      
    }//GEN-LAST:event_ButtonResetKeyPressed

    private void ButtonUpdateOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonUpdateOrdersMouseClicked
        // TODO add your handling code here:
         
      /* Orders update = new Orders(Integer.parseInt(TextFieldOID.getText()),ComboBoxPID.getSelectedItem().toString(),Integer.parseInt(ComboBoxEID.getSelectedItem().toString()),Integer.parseInt(TextFieldQuantity.getText()), TextFieldDRecd.getText());
        try {
        ordersDAO.updateOrders(update);
        JOptionPane.showMessageDialog(this,"Your item has been updated!");
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Value Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
			// Code for making error messages easier to read
            String error = "";
            if (ex.getMessage().contains("for key 'PRIMARY'"))
                error = "Fund Name is already being used.";
            JOptionPane.showMessageDialog(this, "Database Error : " + error, "Error", JOptionPane.ERROR_MESSAGE);
        } 
        
        */     
    }//GEN-LAST:event_ButtonUpdateOrdersMouseClicked

    private void TableOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableOrdersMouseClicked
        // TODO add your handling code here:
       int selectedRowIndex = TableOrders.getSelectedRow();
       int selectedRowModel = TableOrders.convertRowIndexToModel(selectedRowIndex);
       TextFieldOID.setText(TableOrders.getValueAt(selectedRowModel, 0).toString());
       TextFieldQuantity.setText(TableOrders.getValueAt(selectedRowModel, 3).toString());
       TextFieldDRecd.setText(TableOrders.getValueAt(selectedRowModel, 4).toString());
       ComboBoxEID.setSelectedItem(TableOrders.getValueAt(selectedRowModel, 2).toString());
       ComboBoxPID.setSelectedItem(TableOrders.getValueAt(selectedRowModel, 1).toString());
       //disable add button
       ButtonAddOrders.setEnabled(false);
                                           
    }//GEN-LAST:event_TableOrdersMouseClicked

    private void ButtonDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteButtonActionPerformed
        // TODO add your handling code here:
       int p = JOptionPane.showConfirmDialog(null,"Are you sure you wish to delete this order?","Delete",JOptionPane.YES_NO_OPTION);
       if (p==0)
       {
           try {
          Orders deleteOrder = new Orders(Integer.parseInt(TextFieldOID.getText()),ComboBoxPID.getSelectedItem().toString(),Integer.parseInt(ComboBoxEID.getSelectedItem().toString()),Integer.parseInt(TextFieldQuantity.getText()),TextFieldDRecd.getText());
          ordersDAO.deleteOrders(deleteOrder);
          JOptionPane.showMessageDialog(this,"Your order has been deleted!");
        OrdersTableModel model = new OrdersTableModel(ordersDAO.getAllOrders());
        TableOrders.setModel(model);
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Database Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
         
       }
       else {
           JOptionPane.showMessageDialog(this, "Delete Cancelled");
       }
        
    }//GEN-LAST:event_ButtonDeleteButtonActionPerformed

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
      // TODO add your handling code here:
      
      TextFieldOID.setText("");
      TextFieldQuantity.setText("");
      TextFieldDRecd.setText("");
      ComboBoxEID.setSelectedItem(null);
      ComboBoxPID.setSelectedItem(null); 
      ButtonAddOrders.setEnabled(true);
    }//GEN-LAST:event_ButtonResetActionPerformed

    private void ButtonUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateButtonActionPerformed
        // TODO add your handling code here:
        try {
          Orders updateOrder = new Orders(Integer.parseInt(TextFieldOID.getText()),ComboBoxPID.getSelectedItem().toString(),Integer.parseInt(ComboBoxEID.getSelectedItem().toString()),Integer.parseInt(TextFieldQuantity.getText()),TextFieldDRecd.getText());
          ordersDAO.updateOrders(updateOrder);
          JOptionPane.showMessageDialog(this,"Your order has been updated!");
          OrdersTableModel model = new OrdersTableModel(ordersDAO.getAllOrders());
          TableOrders.setModel(model);
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Database Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonUpdateButtonActionPerformed

                                       

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
            java.util.logging.Logger.getLogger(OrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdersFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddOrders;
    private javax.swing.JButton ButtonDeleteButton;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JButton ButtonUpdateButton;
    private javax.swing.JComboBox<String> ComboBoxEID;
    private javax.swing.JComboBox<String> ComboBoxPID;
    private javax.swing.JLabel LabelDRecd;
    private javax.swing.JLabel LabelEID;
    private javax.swing.JLabel LabelOID;
    private javax.swing.JLabel LabelPID;
    private javax.swing.JLabel LabelQuantity;
    private javax.swing.JTable TableOrders;
    private javax.swing.JTextField TextFieldDRecd;
    private javax.swing.JTextField TextFieldOID;
    private javax.swing.JTextField TextFieldQuantity;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

   
}
