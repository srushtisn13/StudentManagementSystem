/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paul-Vance Pierre Nixon Jr.
 */
public class modifyDepartmentInfo extends javax.swing.JFrame {

    /**
     * Creates new form modifyDepartmentInfo
     */
    public modifyDepartmentInfo() {
        initComponents();
        conn = databaseConnection.Connect();
        departmentLoad();
        
        try
        {
            // Load each college's name.
            pst = conn.prepareStatement("select name from college");
            rs = pst.executeQuery();
            
            // Load all the colleges' names into the combo box.
            while (rs.next())
                college_combo_box.addItem(rs.getString("name"));  
        }
        catch (SQLException ex)
        {
            Logger.getLogger(modifyDepartmentInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Global variables
    Connection conn; // Connection to the MySQL database
    PreparedStatement pst; // To write queries to the database 
    ResultSet rs; // To access tables derived from queries
    DefaultTableModel dtm; // To modify the table
    
    
    private void departmentLoad()
    {
        try
        {
            // Load each department's info.
            pst = conn.prepareStatement("select * from department");
            rs = pst.executeQuery();
            
            // Set the number of the table's rows to 0.
            ResultSetMetaData rsd = rs.getMetaData(); // To get the number of columns from the query
            dtm = (DefaultTableModel)dept_info_table.getModel();
            dtm.setRowCount(0);
            
            // Load each department's info into the table.
            while (rs.next())
            {
                Vector vector = new Vector();
                
                for (int index = 1; index <= rsd.getColumnCount(); index++)
                {
                    vector.add(rs.getString("name"));
                    vector.add(rs.getString("college"));
                    vector.add(rs.getString("address"));
                    vector.add(rs.getString("officeNo"));
                    vector.add(rs.getString("email"));
                    vector.add(rs.getString("telNo"));
                    vector.add(rs.getString("faxNo"));
                    vector.add(rs.getString("deptChair_prefix"));
                    vector.add(rs.getString("deptChair_fName"));
                    vector.add(rs.getString("deptChair_mName"));
                    vector.add(rs.getString("deptChair_lName"));
                    vector.add(rs.getString("deptChair_suffix"));
                    vector.add(rs.getString("firstAsstChair_prefix"));
                    vector.add(rs.getString("firstAsstChair_fName"));
                    vector.add(rs.getString("firstAsstChair_mName"));
                    vector.add(rs.getString("firstAsstChair_lName"));
                    vector.add(rs.getString("firstAsstChair_suffix"));
                    vector.add(rs.getString("secAsstChair_prefix"));
                    vector.add(rs.getString("secAsstChair_fName"));
                    vector.add(rs.getString("secAsstChair_mName"));
                    vector.add(rs.getString("secAsstChair_lName"));
                    vector.add(rs.getString("secAsstChair_suffix"));
                }
                
                dtm.addRow(vector); // Adds a department's info as one of the table's rows
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(modifyDepartmentInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dept_info_form = new javax.swing.JPanel();
        name_label = new javax.swing.JLabel();
        name_text_field = new javax.swing.JTextField();
        college_label = new javax.swing.JLabel();
        college_combo_box = new javax.swing.JComboBox<>();
        address_label = new javax.swing.JLabel();
        address_text_field = new javax.swing.JTextField();
        officeNo_label = new javax.swing.JLabel();
        officeNo_text_field = new javax.swing.JFormattedTextField();
        telNo_label = new javax.swing.JLabel();
        telNo_text_field = new javax.swing.JFormattedTextField();
        faxNo_label = new javax.swing.JLabel();
        faxNo_text_field = new javax.swing.JFormattedTextField();
        email_label = new javax.swing.JLabel();
        email_text_field = new javax.swing.JTextField();
        dept_info_scroll_pane = new javax.swing.JScrollPane();
        dept_info_table = new javax.swing.JTable();
        insertButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        modifyDepartmentInfo_MenuBar = new javax.swing.JMenuBar();
        backButton = new javax.swing.JMenu();
        logoutButton = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dept_info_form.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        name_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name_label.setText("Name:");

        college_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        college_label.setText("College:");

        college_combo_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        address_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        address_label.setText("Address:");

        officeNo_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        officeNo_label.setText("Office Number:");

        try {
            officeNo_text_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U-###*")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        telNo_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telNo_label.setText("Phone:");

        try {
            telNo_text_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("555-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        faxNo_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        faxNo_label.setText("Fax:");

        try {
            faxNo_text_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("555-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        email_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email_label.setText("Email:");

        javax.swing.GroupLayout dept_info_formLayout = new javax.swing.GroupLayout(dept_info_form);
        dept_info_form.setLayout(dept_info_formLayout);
        dept_info_formLayout.setHorizontalGroup(
            dept_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dept_info_formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dept_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dept_info_formLayout.createSequentialGroup()
                        .addComponent(address_label)
                        .addGap(18, 18, 18)
                        .addComponent(address_text_field))
                    .addGroup(dept_info_formLayout.createSequentialGroup()
                        .addComponent(officeNo_label)
                        .addGap(18, 18, 18)
                        .addComponent(officeNo_text_field))
                    .addGroup(dept_info_formLayout.createSequentialGroup()
                        .addGroup(dept_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dept_info_formLayout.createSequentialGroup()
                                .addComponent(college_label)
                                .addGap(18, 18, 18)
                                .addComponent(college_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dept_info_formLayout.createSequentialGroup()
                                .addComponent(name_label)
                                .addGap(18, 18, 18)
                                .addComponent(name_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dept_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dept_info_formLayout.createSequentialGroup()
                                    .addComponent(email_label)
                                    .addGap(26, 26, 26)
                                    .addComponent(email_text_field))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dept_info_formLayout.createSequentialGroup()
                                    .addComponent(faxNo_label)
                                    .addGap(37, 37, 37)
                                    .addComponent(faxNo_text_field))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dept_info_formLayout.createSequentialGroup()
                                    .addComponent(telNo_label)
                                    .addGap(18, 18, 18)
                                    .addComponent(telNo_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dept_info_formLayout.setVerticalGroup(
            dept_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dept_info_formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dept_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label)
                    .addComponent(name_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dept_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(college_label)
                    .addComponent(college_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dept_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_label)
                    .addComponent(address_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dept_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(officeNo_label)
                    .addComponent(officeNo_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dept_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNo_label)
                    .addComponent(telNo_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dept_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faxNo_label)
                    .addComponent(faxNo_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dept_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(email_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        dept_info_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "College", "Address", "officeNo", "Email", "telNo", "faxNo", "deptChair_Prefix", "deptChair_fName", "deptChair_mName", "deptChair_lName", "deptChair_Suffix", "firstAsstChair_Prefix", "firstAsstChair_fName", "firstAsstChair_mName", "firstAsstChair_lName", "firstAsstChair_Suffix", "secAsstChair_Prefix", "secAsstChair_fName", "secAsstChair_mName", "secAsstChair_lName", "secAsstChair_Suffix"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        dept_info_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dept_info_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dept_info_tableMouseClicked(evt);
            }
        });
        dept_info_scroll_pane.setViewportView(dept_info_table);

        insertButton.setText("Insert");
        insertButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertButtonMouseClicked(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        backButton.setText("Back");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        modifyDepartmentInfo_MenuBar.add(backButton);

        logoutButton.setText("Logout");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        modifyDepartmentInfo_MenuBar.add(logoutButton);

        setJMenuBar(modifyDepartmentInfo_MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insertButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dept_info_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(dept_info_scroll_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dept_info_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dept_info_scroll_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(clearButton))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        this.hide();
        new adminHome().setVisible(true);
    }//GEN-LAST:event_backButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // Return to Login.java.
        this.hide(); 
        new Login().setVisible(true); // Displays Login.java
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void dept_info_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dept_info_tableMouseClicked
        // Get the clicked row.
        dtm = (DefaultTableModel)dept_info_table.getModel();
        int selectedIndex = dept_info_table.getSelectedRow();
        
        // Set every field in the form to its respective table value.
        name_text_field.setText(dtm.getValueAt(selectedIndex, 0).toString());
        college_combo_box.setSelectedItem(dtm.getValueAt(selectedIndex, 1));
        address_text_field.setText(dtm.getValueAt(selectedIndex, 2).toString());
        officeNo_text_field.setText(dtm.getValueAt(selectedIndex, 3).toString());
        email_text_field.setText(dtm.getValueAt(selectedIndex, 4).toString());
        telNo_text_field.setText(dtm.getValueAt(selectedIndex, 5).toString());
        faxNo_text_field.setText(dtm.getValueAt(selectedIndex, 6).toString());
        
        // Disable the insert button.
        insertButton.setEnabled(false);
    }//GEN-LAST:event_dept_info_tableMouseClicked

    private void insertButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonMouseClicked
        /*
        Check if the admin filled all the text fields. If not, display a pop-up 
        telling them to fill the specified text field. If so, insert the new
        department's info into the database.
        */
        if (name_text_field.getText().isEmpty() || name_text_field.getText().length() > 30)
        {
            JOptionPane.showMessageDialog(this, "The 'Name' text field is either "
                                         + "empty or exceeds 30 characters.");
        }
        else if (address_text_field.getText().isEmpty() || address_text_field.getText().length() > 30)
        {
            JOptionPane.showMessageDialog(this, "The 'Address' text field is either "
                                         + "empty or exceeds 30 characters.");
        }
        else if (officeNo_text_field.getText().isEmpty() || officeNo_text_field.getText().length() > 6)
        {
            JOptionPane.showMessageDialog(this, "The 'Office Number' text field is either "
                                         + "empty or exceeds 6 characters.");
        }
        else if (telNo_text_field.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "The 'Phone' text field is empty.");
        else if (faxNo_text_field.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "The 'Fax Number' text field is empty.");
        else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", email_text_field.getText())) || email_text_field.getText().length() > 30)
        {
            JOptionPane.showMessageDialog(this, "The 'Email' text field is either "
                                         + "invalid or exceeds 30 characters.");
        }
        else
        {
            try
            {
                // Insert the values into the database.
                pst = conn.prepareStatement("insert into department(name, college, address, "
                                         + "officeNo, telNo, faxNo, email) values(?,?,?,?,?,?,?)");
                pst.setString(1, name_text_field.getText());
                pst.setString(2, college_combo_box.getSelectedItem().toString());
                pst.setString(3, address_text_field.getText());
                pst.setString(4, officeNo_text_field.getText());
                pst.setString(5, telNo_text_field.getText());
                pst.setString(6, faxNo_text_field.getText());
                pst.setString(7, email_text_field.getText());
                pst.executeUpdate();
            
                /* Confirm to the admin that a new department's info has been added
                   to the database, clear the form, 
                   and reload all the remaining departments' info.
                */
                JOptionPane.showMessageDialog(this, "New department added.");
                name_text_field.setText("");
                college_combo_box.setSelectedIndex(0);
                address_text_field.setText("");
                officeNo_text_field.setText("");
                telNo_text_field.setText("");
                faxNo_text_field.setText("");
                email_text_field.setText("");
                departmentLoad();
            }
            catch (SQLException ex)
            {
                Logger.getLogger(modifyDepartmentInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_insertButtonMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        /*
        Check if the admin filled all the text fields. If not, display a pop-up 
        telling them to fill the specified text field. If so, update the selected
        department's info.
        */
        if (name_text_field.getText().isEmpty() || name_text_field.getText().length() > 30)
        {
            JOptionPane.showMessageDialog(this, "The 'Name' text field is either "
                                         + "empty or exceeds 30 characters.");
        }
        else if (address_text_field.getText().isEmpty() || address_text_field.getText().length() > 30)
        {
            JOptionPane.showMessageDialog(this, "The 'Address' text field is either "
                                         + "empty or exceeds 30 characters.");
        }
        else if (officeNo_text_field.getText().isEmpty() || officeNo_text_field.getText().length() > 6)
        {
            JOptionPane.showMessageDialog(this, "The 'Office Number' text field is either "
                                         + "empty or exceeds 6 characters.");
        }
        else if (telNo_text_field.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "The 'Phone' text field is empty.");
        else if (faxNo_text_field.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "The 'Fax Number' text field is empty.");
        else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", email_text_field.getText())) || email_text_field.getText().length() > 30)
        {
            JOptionPane.showMessageDialog(this, "The 'Email' text field is either "
                                         + "invalid or exceeds 30 characters.");
        }
        else
        {
            try
            {
                // Get the clicked row.
                dtm = (DefaultTableModel)dept_info_table.getModel();
                int selectedIndex = dept_info_table.getSelectedRow();
            
                // Update each of the selected department's info to its respective field's value.
                pst = conn.prepareStatement("update department set name = ?, college = ?, "
                                         + "address = ?, officeNo = ?, telNo = ?, faxNo = ? "
                                         + "email = ? where name = ?");
                pst.setString(1, name_text_field.getText());
                pst.setString(2, college_combo_box.getSelectedItem().toString());
                pst.setString(3, address_text_field.getText());
                pst.setString(4, officeNo_text_field.getText());
                pst.setString(5, telNo_text_field.getText());
                pst.setString(6, faxNo_text_field.getText());
                pst.setString(7, email_text_field.getText());
                pst.setString(8, dtm.getValueAt(selectedIndex, 0).toString());
                pst.executeUpdate();
            
                /* Confirm to the admin that the selected department's info has been updated,
                   clear the form, and reload each department's info.
                */
                JOptionPane.showMessageDialog(this, "Department's info is updated.");
                insertButton.setEnabled(true); // Enables the Insert button
                name_text_field.setText("");
                college_combo_box.setSelectedIndex(0);
                address_text_field.setText("");
                officeNo_text_field.setText("");
                telNo_text_field.setText("");
                faxNo_text_field.setText("");
                email_text_field.setText("");
                departmentLoad();
            }
            catch (SQLException ex)
            {
                Logger.getLogger(modifyDepartmentInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updateButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        try
        {
            // Get the selected row.
            dtm = (DefaultTableModel)dept_info_table.getModel();
            int selectedIndex = dept_info_table.getSelectedRow();
            
            // Delete the selected department's info from both the database and the table.
            pst = conn.prepareStatement("delete from department where name = ?");
            pst.setString(1, dtm.getValueAt(selectedIndex, 0).toString());
            pst.executeUpdate();
            
            /* Confirm to the admin that the selected department's info has been deleted,
               clear the form, and reload the remaining departments' info.
            */
            JOptionPane.showMessageDialog(this, "Department's info is deleted.");
            insertButton.setEnabled(true); // Enables the Insert button
            name_text_field.setText("");
            college_combo_box.setSelectedIndex(0);
            address_text_field.setText("");
            officeNo_text_field.setText("");
            telNo_text_field.setText("");
            faxNo_text_field.setText("");
            email_text_field.setText("");
            departmentLoad();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(modifyDepartmentInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        // Clear all the text fields.
        name_text_field.setText("");
        college_combo_box.setSelectedIndex(0);
        address_text_field.setText("");
        officeNo_text_field.setText("");
        telNo_text_field.setText("");
        faxNo_text_field.setText("");
        email_text_field.setText("");
    }//GEN-LAST:event_clearButtonMouseClicked

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
            java.util.logging.Logger.getLogger(modifyDepartmentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifyDepartmentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifyDepartmentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifyDepartmentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modifyDepartmentInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_label;
    private javax.swing.JTextField address_text_field;
    private javax.swing.JMenu backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> college_combo_box;
    private javax.swing.JLabel college_label;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel dept_info_form;
    private javax.swing.JScrollPane dept_info_scroll_pane;
    private javax.swing.JTable dept_info_table;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_text_field;
    private javax.swing.JLabel faxNo_label;
    private javax.swing.JFormattedTextField faxNo_text_field;
    private javax.swing.JButton insertButton;
    private javax.swing.JMenu logoutButton;
    private javax.swing.JMenuBar modifyDepartmentInfo_MenuBar;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_text_field;
    private javax.swing.JLabel officeNo_label;
    private javax.swing.JFormattedTextField officeNo_text_field;
    private javax.swing.JLabel telNo_label;
    private javax.swing.JFormattedTextField telNo_text_field;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
