package collegemanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        conn = databaseConnection.Connect();
    }

    // Global variables
    Connection conn; 
    PreparedStatement pst; 
    ResultSet rs; 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username_label = new javax.swing.JLabel();
        username_text_field = new javax.swing.JTextField();
        password_label = new javax.swing.JLabel();
        user_type_label = new javax.swing.JLabel();
        user_type_combo_box = new javax.swing.JComboBox<>();
        loginButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        password_text_field = new javax.swing.JPasswordField();
        login_label = new javax.swing.JLabel();
        register_staff_button = new javax.swing.JButton();
        register_admin_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        username_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username_label.setText("Username:");
        username_label.setFocusable(false);

        password_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password_label.setText("Password:");

        user_type_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        user_type_label.setText("Select user type:");

        user_type_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "staff", "student" }));
        user_type_combo_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        login_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        login_label.setText("Login");

        register_staff_button.setText("Register Staff");
        register_staff_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register_staff_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_staff_buttonMouseClicked(evt);
            }
        });
        register_staff_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_staff_buttonActionPerformed(evt);
            }
        });

        register_admin_button.setText("Register Admin");
        register_admin_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register_admin_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_admin_buttonMouseClicked(evt);
            }
        });
        register_admin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_admin_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(password_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(username_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(user_type_label))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(user_type_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(username_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(password_text_field)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(register_admin_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(register_staff_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(login_label)))
                .addGap(0, 197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(login_label)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_label)
                    .addComponent(username_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_label)
                    .addComponent(password_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_type_label)
                    .addComponent(user_type_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(register_staff_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(register_admin_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // Clear both text fields.
        username_text_field.setText("");
        password_text_field.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void register_staff_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_staff_buttonMouseClicked
        // Display registerStaff.java.
        this.hide();
        new registerStaff().setVisible(true);
    }//GEN-LAST:event_register_staff_buttonMouseClicked

    private void register_admin_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_admin_buttonMouseClicked
        // Display registerAdmin.java.
        this.hide();
        new registerAdmin().setVisible(true);
    }//GEN-LAST:event_register_admin_buttonMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        /*
        Check if the user filled the username & password text fields. If not, display a pop-up 
        telling them to fill the specified text field. If so, render the user's
        respective home screen.
        */ 
        if (username_text_field.getText().isEmpty() || password_text_field.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Username and/or password field is empty.");
        else
        {
            try
            {
                /*
                Verify if the user's info's in the database. If not, display a pop-up
                telling them there's an error. If so, render the user's respective
                home screen.
                */ 
                pst = conn.prepareStatement("select * from "
                                         + user_type_combo_box.getSelectedItem().toString()
                                         + " where username = ? and password = ?");
                pst.setString(1, username_text_field.getText());
                pst.setString(2, password_text_field.getText()); 
                rs = pst.executeQuery(); 
                
                if (rs.next())
                {
                    switch (user_type_combo_box.getSelectedItem().toString())
                    {
                        case "admin": // Display adminHome.java
                            this.hide();
                            new adminHome().setVisible(true);
                            break;
                            
                        case "staff": // Display staffHome.java
                            this.hide();
                            new staffHome(rs.getString("staffNo")).setVisible(true);
                            break;
                            
                        case "student": // Display studentHome.java
                            this.hide();
                            new studentHome(rs.getString("stuID")).setVisible(true);
                            break;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Username or password error.");
                    username_text_field.setText("");
                    password_text_field.setText("");
                }
            }
            catch (SQLException ex)
            {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void register_staff_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_staff_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_register_staff_buttonActionPerformed

    private void register_admin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_admin_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_register_admin_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel login_label;
    private javax.swing.JLabel password_label;
    private javax.swing.JPasswordField password_text_field;
    private javax.swing.JButton register_admin_button;
    private javax.swing.JButton register_staff_button;
    private javax.swing.JComboBox<String> user_type_combo_box;
    private javax.swing.JLabel user_type_label;
    private javax.swing.JLabel username_label;
    private javax.swing.JTextField username_text_field;
    // End of variables declaration//GEN-END:variables
}
