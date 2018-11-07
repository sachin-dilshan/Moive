
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.pnl;



import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import lk.ijse.edu.movieticketreservation.controller.ManageMealController;
import lk.ijse.edu.movieticketreservation.mdel.MealDTO;
import lk.ijse.edu.movieticketresevation.Generator.IDGenerator;

/**
 *
 * @author sachin dilshan
 */
public class ManageMeals extends javax.swing.JPanel {

    /**
     * Creates new form ManageMeals
     */
    public ManageMeals() {
        initComponents();
        loodAllMeail();
        genarateMealsId();
        txtID.requestFocusInWindow();
        tableMeal.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (tableMeal.getSelectedRow() == -1) {
                    return;
                }
                txtID.setText((String) tableMeal.getValueAt(tableMeal.getSelectedRow(), 0));
                txtName.setText((String) tableMeal.getValueAt(tableMeal.getSelectedRow(), 1));
                txtPrice.setText(tableMeal.getValueAt(tableMeal.getSelectedRow(), 2).toString());
                txtQty.setText(tableMeal.getValueAt(tableMeal.getSelectedRow(), 3).toString());

            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMeal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        butDeletr = new javax.swing.JButton();
        butAdd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        addVoice = new javax.swing.JLabel();
        updateVoice = new javax.swing.JLabel();
        deleteVoice = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Meal ID                   :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Meal Name             :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Unite Price             :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("QTY                         :");

        txtQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceKeyPressed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5))
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 510, 210));

        tableMeal.setAutoCreateRowSorter(true);
        tableMeal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableMeal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meal ID", "Name", " price", "QTY"
            }
        ));
        tableMeal.setGridColor(new java.awt.Color(228, 241, 254));
        tableMeal.setSelectionBackground(new java.awt.Color(0, 255, 0));
        tableMeal.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableMeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMealMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMeal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 500, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/movieticketreservation/img/icons8_McDonald`s_French_Fries_100px_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/movieticketreservation/img/icons8_Coffee_to_Go_100px.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 90, 80));

        jLabel6.setFont(new java.awt.Font("Engravers MT", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Manage Meals");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 340, 40));

        jButton1.setBackground(new java.awt.Color(46, 204, 113));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/movieticketreservation/img/icons8_Software_Installer_40px.png"))); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 130, 40));

        butDeletr.setBackground(new java.awt.Color(46, 204, 113));
        butDeletr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        butDeletr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/movieticketreservation/img/icons8_Trash_40px.png"))); // NOI18N
        butDeletr.setText("Delete");
        butDeletr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeletrActionPerformed(evt);
            }
        });
        jPanel1.add(butDeletr, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, -1, 40));

        butAdd.setBackground(new java.awt.Color(46, 204, 113));
        butAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        butAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/movieticketreservation/img/icons8_Save_40px.png"))); // NOI18N
        butAdd.setText("Add");
        butAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddActionPerformed(evt);
            }
        });
        jPanel1.add(butAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" ");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 850));

        addVoice.setText("Add meal successfully");
        jPanel1.add(addVoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        updateVoice.setText("Update meal successfull");
        jPanel1.add(updateVoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, -1, -1));

        deleteVoice.setText("Delete meal successfully");
        jPanel1.add(deleteVoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        txtPrice.requestFocusInWindow();
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        txtName.requestFocusInWindow();
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        try {
            String mealIds = txtID.getText();

            if (mealIds.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a Meal Id ");
                txtID.selectAll();
                txtID.requestFocusInWindow();
                return;
            }
            String mealNames = txtName.getText();

            if (mealNames.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a Meal name ");
                txtName.selectAll();
                txtName.requestFocusInWindow();
                return;
            }
            String price = txtPrice.getText();

            if (price.matches("[0-9]{1,5}")) {

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Price");
            }
            String qtys = txtPrice.getText();

            if (qtys.matches("[0-9]{1,5}")) {

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Qty");
            }

            String mealId = txtID.getText();
            String mealName = txtName.getText();
            double unitPrice = Double.parseDouble(txtPrice.getText());
            int qty = Integer.parseInt(txtQty.getText());
            MealDTO meal = new MealDTO(mealId, mealName, unitPrice, qty);
            boolean isAdd = ManageMealController.addMeals(meal);
            txtName.setText("");
            txtPrice.setText("");
            txtQty.setText("");
            loodAllMeail();
        } catch (Exception ex) {
            Logger.getLogger(ManageMeals.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        txtQty.requestFocusInWindow();
    }//GEN-LAST:event_txtPriceActionPerformed

    private void tableMealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMealMouseClicked
       tableMeal.setDefaultEditor(Object.class, null);
    }//GEN-LAST:event_tableMealMouseClicked
    private static final String VOICENAME = "kevin16";
    private void butAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddActionPerformed
        try {
            String mealIds = txtID.getText();

            if (mealIds.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a Meal Id ");
                txtID.selectAll();
                txtID.requestFocusInWindow();
                return;
            }
            String mealNames = txtName.getText();

            if (mealNames.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a Meal name ");
                txtName.selectAll();
                txtName.requestFocusInWindow();
                return;
            }
            String price = txtPrice.getText();

            if (price.matches("[0-9]{1,5}")) {

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Price");
            }
            String qtys = txtPrice.getText();

            if (qtys.matches("[0-9]{1,5}")) {

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Qty");
            }

            String mealId = txtID.getText();
            String mealName = txtName.getText();
            double uniteprice = Double.parseDouble(txtPrice.getText());
            int qty = Integer.parseInt(txtQty.getText());
            MealDTO meal = new MealDTO(mealId, mealName, uniteprice, qty);
            boolean isAddd = ManageMealController.addMeals(meal);
            if (isAddd) {
                JOptionPane.showMessageDialog(null, "Add meal successfully");

               
            } else {
                JOptionPane.showMessageDialog(null, "meal Add Faill");
            }
            txtName.setText("");
            txtPrice.setText("");
            txtQty.setText("");
            loodAllMeail();
        } catch (Exception ex) {
            Logger.getLogger(ManageMeals.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_butAddActionPerformed

    private void butDeletrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeletrActionPerformed

        try {

            if (tableMeal.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Select a row");
                return;
            }
            boolean result = ManageMealController.deleteMeal(tableMeal.getValueAt(tableMeal.getSelectedRow(), 0).toString());
            if (result) {
               
                JOptionPane.showMessageDialog(this, "Meail has been deleted successfully");
                txtID.setText("");
                txtName.setText("");
                txtPrice.setText("");
                txtQty.setText("");
                loodAllMeail();

            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete the Meail");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageMeals.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butDeletrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            double unitPrice = Double.parseDouble(txtPrice.getText());
            int qty = Integer.parseInt(txtQty.getText());
            MealDTO meal = new MealDTO(txtID.getText(), txtName.getText(), unitPrice, qty);
            boolean isUpdated = ManageMealController.UpdateMeal(meal);
            if (isUpdated) {
                DefaultTableModel dtm = (DefaultTableModel) tableMeal.getModel();
                dtm.setRowCount(0);

                JOptionPane.showMessageDialog(null, "Updated  successfull");
                
                loodAllMeail();
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageMeals.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyPressed
         String text = txtPrice.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]+[.]?[0-9]{0,2}");
            if (!res) {
                txtPrice.setText(text.substring(0, text.length() - 1));
            }
        }
    }//GEN-LAST:event_txtPriceKeyPressed

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
          String text = txtQty.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]+[.]?[0-9]{0,2}");
            if (!res) {
                txtQty.setText(text.substring(0, text.length() - 1));
            }
        }
    }//GEN-LAST:event_txtQtyKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
         
        String txt = txtName.getText();
        int caretPosition = txtName.getCaretPosition();
        if (!txt.matches("^[A-Za-z// ]*$")) {
            txtName.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            txtName.setCaretPosition(caretPosition - 1);
        }
    }//GEN-LAST:event_txtNameKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addVoice;
    private javax.swing.JButton butAdd;
    private javax.swing.JButton butDeletr;
    private javax.swing.JLabel deleteVoice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMeal;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JLabel updateVoice;
    // End of variables declaration//GEN-END:variables

    private void loodAllMeail() {
        try {

            ArrayList<MealDTO> allMeal = ManageMealController.getAllMeal();
            DefaultTableModel dtm = (DefaultTableModel) tableMeal.getModel();
            dtm.setRowCount(0);
            for (MealDTO mealDTO : allMeal) {

                Object[] rowData = {
                    mealDTO.getMealID(),
                    mealDTO.getMealName(),
                    mealDTO.getUnitPrice(),
                    mealDTO.getQty()
                };

                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageMeals.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void loadMeals() {
        try {
            ArrayList<MealDTO> allMeal = ManageMealController.getAllMeal();
            DefaultTableModel dtm = (DefaultTableModel) tableMeal.getModel();
            dtm.setRowCount(0);
            for (MealDTO mealDTO : allMeal) {
                Object[] rowData = {
                    mealDTO.getMealID(),
                    mealDTO.getMealName(),
                    mealDTO.getUnitPrice(),
                    mealDTO.getQty()
                };
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageMeals.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void genarateMealsId() {
        String orderId;
        try {
            orderId = IDGenerator.getNewID("meal", "MealID", "MID");
            txtID.setText(orderId);
        } catch (SQLException ex) {
            Logger.getLogger(ManageMeals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageMeals.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
