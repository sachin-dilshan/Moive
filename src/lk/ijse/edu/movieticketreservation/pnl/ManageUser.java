/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.pnl;

import java.awt.Color;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.edu.movieticketeservation.dao.CrudUtil;

import lk.ijse.edu.movieticketreservation.controller.ManagePasswordController;
import lk.ijse.edu.movieticketreservation.mdel.PasswordDTO;
import lk.ijse.edu.movieticketresevation.Generator.PasswordUtil;

/**
 *
 * @author sachin dilshan
 */
public class ManageUser extends javax.swing.JPanel {

    /**
     * Creates new form ManageUser
     */
    public ManageUser() {
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
        txtName = new javax.swing.JTextField();
        txtpasswprd1 = new javax.swing.JPasswordField();
        txtpassword2 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        butUpdate = new javax.swing.JLabel();
        butDelete = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 190, 30));

        txtpasswprd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswprd1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtpasswprd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 190, 30));
        jPanel1.add(txtpassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 190, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/movieticketreservation/img/icons8_Natural_User_Interface_2_100px.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 90, 80));

        jLabel11.setFont(new java.awt.Font("Engravers MT", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Manage User");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/movieticketreservation/img/icons8_User_Groups_100px.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 90, 70));

        butUpdate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        butUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/movieticketreservation/img/icons8_Refresh_40px_1.png"))); // NOI18N
        butUpdate.setText("Update User");
        butUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        butUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                butUpdateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                butUpdateMouseReleased(evt);
            }
        });
        jPanel1.add(butUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 160, 40));

        butDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        butDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/movieticketreservation/img/icons8_Trash_40px.png"))); // NOI18N
        butDelete.setText("Delete User");
        butDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        butDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                butDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                butDeleteMouseReleased(evt);
            }
        });
        jPanel1.add(butDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 160, 40));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel5.setText("PassWord               :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, 20));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel4.setText("User Name              :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel6.setText("Confirm Password  :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, 30));

        jButton1.setText(" Add User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 610, 160, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 430, 210));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 700));

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

    private void butUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butUpdateMousePressed
        butUpdate.setBackground(new Color(41, 110, 123));

    }//GEN-LAST:event_butUpdateMousePressed

    private void butUpdateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butUpdateMouseReleased
        butUpdate.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_butUpdateMouseReleased

    private void butDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butDeleteMousePressed
        butDelete.setBackground(new Color(41, 110, 123));
    }//GEN-LAST:event_butDeleteMousePressed

    private void butDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butDeleteMouseReleased
        butDelete.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_butDeleteMouseReleased

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        txtpasswprd1.requestFocusInWindow();
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtpasswprd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswprd1ActionPerformed
     txtpassword2.requestFocusInWindow();    }//GEN-LAST:event_txtpasswprd1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String userName=txtName.getText();
            String password=txtpassword2.getText();
            String salt=PasswordUtil.getSalt(30);
            String secPw=PasswordUtil.generateSecurePassword(password, salt);
            CrudUtil.executeUpdate("Insert into user values(?,?,?,?)", "001",userName,salt,secPw);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel butDelete;
    private javax.swing.JLabel butUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtpassword2;
    private javax.swing.JPasswordField txtpasswprd1;
    // End of variables declaration//GEN-END:variables
}