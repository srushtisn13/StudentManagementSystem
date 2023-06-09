/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagementsystem;

/**
 *
 * @author Paul-Vance Pierre Nixon Jr.
 */
public class adminHome extends javax.swing.JFrame {

    /**
     * Creates new form adminHome
     */
    public adminHome() {
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

        update_students_button = new javax.swing.JButton();
        update_staff_button = new javax.swing.JButton();
        update_admins_button = new javax.swing.JButton();
        update_courses_button = new javax.swing.JButton();
        update_colleges_button = new javax.swing.JButton();
        update_departments_button = new javax.swing.JButton();
        update_degrees_button = new javax.swing.JButton();
        admin_home_label = new javax.swing.JLabel();
        adminHome_MenuBar = new javax.swing.JMenuBar();
        logoutButton = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        update_students_button.setText("Update Students");
        update_students_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_students_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_students_buttonMouseClicked(evt);
            }
        });

        update_staff_button.setText("Update Staff");
        update_staff_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_staff_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_staff_buttonMouseClicked(evt);
            }
        });

        update_admins_button.setText("Update Admins");
        update_admins_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_admins_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_admins_buttonMouseClicked(evt);
            }
        });

        update_courses_button.setText("Update Courses");
        update_courses_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_courses_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_courses_buttonMouseClicked(evt);
            }
        });

        update_colleges_button.setText("Update Colleges");
        update_colleges_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_colleges_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_colleges_buttonMouseClicked(evt);
            }
        });

        update_departments_button.setText("Update Departments");
        update_departments_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_departments_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_departments_buttonMouseClicked(evt);
            }
        });

        update_degrees_button.setText("Update Degrees");
        update_degrees_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_degrees_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_degrees_buttonMouseClicked(evt);
            }
        });

        admin_home_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        admin_home_label.setText("Admin Home");

        logoutButton.setText("Logout");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        adminHome_MenuBar.add(logoutButton);

        setJMenuBar(adminHome_MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_students_button)
                    .addComponent(update_courses_button)
                    .addComponent(update_degrees_button))
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_colleges_button)
                    .addComponent(update_staff_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(update_departments_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_admins_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(admin_home_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(admin_home_label)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_students_button)
                    .addComponent(update_staff_button)
                    .addComponent(update_admins_button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_courses_button)
                    .addComponent(update_colleges_button)
                    .addComponent(update_departments_button))
                .addGap(18, 18, 18)
                .addComponent(update_degrees_button)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // Display Login.java.
        this.hide();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void update_students_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_students_buttonMouseClicked
        // Display modifyStudentInfo.java.
        this.hide();
        new modifyStudentInfo().setVisible(true);
    }//GEN-LAST:event_update_students_buttonMouseClicked

    private void update_staff_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_staff_buttonMouseClicked
        // Display modifyStaffInfo.java.
        this.hide();
        new modifyStaffInfo().setVisible(true);
    }//GEN-LAST:event_update_staff_buttonMouseClicked

    private void update_admins_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_admins_buttonMouseClicked
        // Display modifyAdminInfo.java.
        this.hide();
        new modifyAdminInfo().setVisible(true);
    }//GEN-LAST:event_update_admins_buttonMouseClicked

    private void update_courses_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_courses_buttonMouseClicked
        // Display modifyCourseInfo.java.
        this.hide();
        new modifyCourseInfo().setVisible(true);
    }//GEN-LAST:event_update_courses_buttonMouseClicked

    private void update_colleges_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_colleges_buttonMouseClicked
        // Display modifyCollegeInfo.java.
        this.hide();
        new modifyCollegeInfo().setVisible(true);
    }//GEN-LAST:event_update_colleges_buttonMouseClicked

    private void update_departments_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_departments_buttonMouseClicked
        // Display modifyDepartmentInfo.java.
        this.hide();
        new modifyDepartmentInfo().setVisible(true);
    }//GEN-LAST:event_update_departments_buttonMouseClicked

    private void update_degrees_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_degrees_buttonMouseClicked
        // Display modifyDegreeInfo.java.
        this.hide();
        new modifyDegreeInfo().setVisible(true);
    }//GEN-LAST:event_update_degrees_buttonMouseClicked

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
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar adminHome_MenuBar;
    private javax.swing.JLabel admin_home_label;
    private javax.swing.JMenu logoutButton;
    private javax.swing.JButton update_admins_button;
    private javax.swing.JButton update_colleges_button;
    private javax.swing.JButton update_courses_button;
    private javax.swing.JButton update_degrees_button;
    private javax.swing.JButton update_departments_button;
    private javax.swing.JButton update_staff_button;
    private javax.swing.JButton update_students_button;
    // End of variables declaration//GEN-END:variables
}
