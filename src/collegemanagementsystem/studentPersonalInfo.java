/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class studentPersonalInfo extends javax.swing.JFrame {

    /**
     * Creates new form studentPersonalInfo
     */
    public studentPersonalInfo() {
        initComponents();
    }

    // Global variables
    Connection conn; // Connection to the MySQL database
    PreparedStatement pst; // To write queries to the database 
    ResultSet rs; // To access tables derived from queries
    DefaultTableModel dtm; // To modify the info table
    String id; // The student's ID
    
    studentPersonalInfo(String id) // Loaded constructor
    {
        initComponents();
        conn = databaseConnection.Connect();
        this.id = id;
        infoLoad();
    }
    
    /*
    infoLoad() is a fetch function which retrieves the student's info from the
    MySQL database and renders them in the table.
    Pre-condition: The student's info is in the database.
    Post-condition: The student's info is rendered in the table.
    */
    private void infoLoad()
    {
        try
        {
            // Load the student's info.
            pst = conn.prepareStatement("select * from student where stuID = ?");
            pst.setString(1, id);
            rs = pst.executeQuery();
            
            // Set the number of the info table's rows to 0.
            dtm = (DefaultTableModel)student_info_table.getModel();
            dtm.setRowCount(0);
            
            // Load the student's info into the table.
            if (rs.next())
            {
                Vector vector = new Vector();
                vector.add(rs.getString("stuID"));
                vector.add(rs.getString("prefix"));
                vector.add(rs.getString("fName"));
                vector.add(rs.getString("mName"));
                vector.add(rs.getString("lName"));
                vector.add(rs.getString("suffix"));
                vector.add(rs.getString("DOB"));
                vector.add(rs.getString("gender"));
                vector.add(rs.getString("ethnicity"));
                vector.add(rs.getString("classification"));
                vector.add(rs.getString("degreeType"));
                vector.add(rs.getString("degreeName"));
                vector.add(rs.getString("email"));
                vector.add(rs.getString("uniEmail"));
                vector.add(rs.getString("username"));
                vector.add(rs.getString("address"));
                vector.add(rs.getString("telNo"));
                vector.add(rs.getString("password"));
                vector.add(rs.getString("college"));
                vector.add(rs.getString("charges"));
                dtm.addRow(vector); // Adds the student's info as one of the table's rows
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(studentPersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
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

        student_info_form = new javax.swing.JPanel();
        prefix_label = new javax.swing.JLabel();
        prefix_combo_box = new javax.swing.JComboBox<>();
        fName_label = new javax.swing.JLabel();
        fName_text_field = new javax.swing.JTextField();
        mName_label = new javax.swing.JLabel();
        mName_text_field = new javax.swing.JTextField();
        lName_label = new javax.swing.JLabel();
        lName_text_field = new javax.swing.JTextField();
        suffix_label = new javax.swing.JLabel();
        suffix_combo_box = new javax.swing.JComboBox<>();
        dob_label = new javax.swing.JLabel();
        dob_text_field = new javax.swing.JFormattedTextField();
        gender_label = new javax.swing.JLabel();
        gender_combo_box = new javax.swing.JComboBox<>();
        ethnicity_label = new javax.swing.JLabel();
        ethnicity_combo_box = new javax.swing.JComboBox<>();
        email_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        address_text_field = new javax.swing.JTextField();
        phone_label = new javax.swing.JLabel();
        phone_text_field = new javax.swing.JFormattedTextField();
        password_label = new javax.swing.JLabel();
        password_text_field = new javax.swing.JPasswordField();
        email_text_field = new javax.swing.JTextField();
        student_info_scroll_pane = new javax.swing.JScrollPane();
        student_info_table = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        backButton = new javax.swing.JMenu();
        logoutButton = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        student_info_form.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        prefix_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prefix_label.setText("Prefix:");

        prefix_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null", "Dr.", "Miss", "Mr.", "Mrs.", "Ms.", "Professor" }));
        prefix_combo_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        fName_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fName_label.setText("First name:");

        mName_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mName_label.setText("Middle name:");

        lName_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lName_label.setText("Last name:");

        suffix_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        suffix_label.setText("Suffix:");

        suffix_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null", "Esq.", "I", "II", "III", "IV", "V", "VI", "VII", "M.D.", "Ph.D.", "Jr.", "Sr." }));
        suffix_combo_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        dob_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dob_label.setText("DOB:");

        dob_text_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y/M/d"))));
        dob_text_field.setToolTipText("YYYY/M/d");

        gender_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gender_label.setText("Gender:");

        gender_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        gender_combo_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ethnicity_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ethnicity_label.setText("Ethnicity:");

        ethnicity_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hispanic or Latino", "American Indian or Alaska Native", "Asian", "Black or African American", "Native Hawaiian or Other Pacific Islander", "White" }));
        ethnicity_combo_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        email_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email_label.setText("Email:");

        address_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        address_label.setText("Address:");

        phone_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phone_label.setText("Phone:");

        try {
            phone_text_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("555-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        password_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password_label.setText("Password:");

        javax.swing.GroupLayout student_info_formLayout = new javax.swing.GroupLayout(student_info_form);
        student_info_form.setLayout(student_info_formLayout);
        student_info_formLayout.setHorizontalGroup(
            student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_info_formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(student_info_formLayout.createSequentialGroup()
                        .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(student_info_formLayout.createSequentialGroup()
                                    .addComponent(prefix_label)
                                    .addGap(18, 18, 18)
                                    .addComponent(prefix_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(student_info_formLayout.createSequentialGroup()
                                    .addComponent(fName_label)
                                    .addGap(18, 18, 18)
                                    .addComponent(fName_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(student_info_formLayout.createSequentialGroup()
                                    .addComponent(mName_label)
                                    .addGap(18, 18, 18)
                                    .addComponent(mName_text_field)))
                            .addGroup(student_info_formLayout.createSequentialGroup()
                                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lName_label)
                                    .addComponent(suffix_label))
                                .addGap(18, 18, 18)
                                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(suffix_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lName_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 81, Short.MAX_VALUE))
                    .addGroup(student_info_formLayout.createSequentialGroup()
                        .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dob_label)
                            .addComponent(gender_label)
                            .addComponent(ethnicity_label)
                            .addComponent(email_label)
                            .addComponent(address_label)
                            .addComponent(phone_label)
                            .addComponent(password_label))
                        .addGap(22, 22, 22)
                        .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(student_info_formLayout.createSequentialGroup()
                                .addComponent(dob_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(student_info_formLayout.createSequentialGroup()
                                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ethnicity_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gender_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        student_info_formLayout.setVerticalGroup(
            student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_info_formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prefix_label)
                    .addComponent(prefix_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fName_label)
                    .addComponent(fName_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mName_label)
                    .addComponent(mName_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lName_label)
                    .addComponent(lName_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suffix_label)
                    .addComponent(suffix_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob_label)
                    .addComponent(dob_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_label)
                    .addComponent(gender_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ethnicity_label)
                    .addComponent(ethnicity_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(email_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_label)
                    .addComponent(address_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone_label)
                    .addComponent(phone_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(student_info_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_label)
                    .addComponent(password_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        student_info_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Prefix", "fName", "mName", "lName", "Suffix", "DOB", "Gender", "Ethnicity", "Classification", "Degree Type", "Degree", "Email", "uniEmail", "Username", "Address", "Phone", "Password", "College", "Charges"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        student_info_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        student_info_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_info_tableMouseClicked(evt);
            }
        });
        student_info_scroll_pane.setViewportView(student_info_table);

        updateButton.setText("Update");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
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
        jMenuBar1.add(backButton);

        logoutButton.setText("Logout");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        jMenuBar1.add(logoutButton);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(student_info_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(student_info_scroll_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student_info_scroll_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(student_info_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateButton)
                            .addComponent(clearButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void student_info_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_info_tableMouseClicked
        // Get the clicked row.
        dtm = (DefaultTableModel)student_info_table.getModel();
        int selectedIndex = student_info_table.getSelectedRow();

        // Set every field in the form to its respective table value.
        prefix_combo_box.setSelectedItem(dtm.getValueAt(selectedIndex, 1));
        fName_text_field.setText(dtm.getValueAt(selectedIndex, 2).toString());
        mName_text_field.setText(dtm.getValueAt(selectedIndex, 3).toString());
        lName_text_field.setText(dtm.getValueAt(selectedIndex, 4).toString());
        suffix_combo_box.setSelectedItem(dtm.getValueAt(selectedIndex, 5));
        dob_text_field.setText(dtm.getValueAt(selectedIndex, 6).toString());
        gender_combo_box.setSelectedItem(dtm.getValueAt(selectedIndex, 7));
        ethnicity_combo_box.setSelectedItem(dtm.getValueAt(selectedIndex, 8));
        email_text_field.setText(dtm.getValueAt(selectedIndex, 12).toString());
        address_text_field.setText(dtm.getValueAt(selectedIndex, 15).toString());
        phone_text_field.setText(dtm.getValueAt(selectedIndex, 16).toString());
        password_text_field.setText(dtm.getValueAt(selectedIndex, 17).toString());
    }//GEN-LAST:event_student_info_tableMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        /*
        Check if the student filled all the text fields. If not, display a pop-up 
        telling them to fill the specified text field. If so, update their info.
        */
        if (fName_text_field.getText().isEmpty() || fName_text_field.getText().length() > 20)
        {
            JOptionPane.showMessageDialog(this, "The 'First name' text field is either "
                                         + "empty or exceeds 20 characters.");
        }
        else if (mName_text_field.getText().isEmpty() || mName_text_field.getText().length() > 20)
        {
            JOptionPane.showMessageDialog(this, "The 'Middle name' text field is either "
                                         + "empty or exceeds 20 characters.");
        }
        else if (lName_text_field.getText().isEmpty() || lName_text_field.getText().length() > 20)
        {
            JOptionPane.showMessageDialog(this, "The 'Last name' text field is either "
                                         + "empty or exceeds 20 characters.");
        }
        else if (dob_text_field.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "The 'DOB' text field is empty.");
        else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", email_text_field.getText())) || email_text_field.getText().length() > 30)
        {
            JOptionPane.showMessageDialog(this, "The 'Email' text field is either "
                                         + "empty or exceeds 30 characters.");
        }
        else if (address_text_field.getText().isEmpty() || address_text_field.getText().length() > 45)
        {
            JOptionPane.showMessageDialog(this, "The 'Email' text field is either "
                                         + "empty or exceeds 45 characters.");
        }
        else if (phone_text_field.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "The 'Phone' text field is empty.");
        else if (password_text_field.getText().isEmpty() || password_text_field.getText().length() > 30)
        {
            JOptionPane.showMessageDialog(this, "The 'Password' text field is either "
                                         + "empty or exceeds 30 characters.");
        }
        else
        {
            try
            {
                // Update each of the selected student's info to its respective field's value.
                String username = email_text_field.getText().substring(0, 
                        email_text_field.getText().indexOf('@'));
                String uniEmail = username + "@mascot.uni.edu";
                
                pst = conn.prepareStatement("update student set prefix = ?, fName = ?, "
                                          + "mName = ?, lName = ?, suffix = ?, DOB = ?, "
                                          + "gender = ?, ethnicity = ?, email = ?, "
                                          + "uniEmail = ?, password = ?, username = ?, "
                                          + "address = ?, phone = ? where stuID = ?");
                pst.setString(1, prefix_combo_box.getSelectedItem().toString());
                pst.setString(2, fName_text_field.getText());
                pst.setString(3, mName_text_field.getText());
                pst.setString(4, lName_text_field.getText());
                pst.setString(5, suffix_combo_box.getSelectedItem().toString());
                pst.setString(6, dob_text_field.getText());
                pst.setString(7, gender_combo_box.getSelectedItem().toString());
                pst.setString(8, ethnicity_combo_box.getSelectedItem().toString());
                pst.setString(9, email_text_field.getText());
                pst.setString(10, uniEmail);
                pst.setString(11, password_text_field.getText());
                pst.setString(12, username);
                pst.setString(13, address_text_field.getText());
                pst.setString(14, phone_text_field.getText());
                pst.setString(15, id);
                pst.executeUpdate();
            
                /*
                Confirm to the student that their info has been updated,
                clear the form, and reload their info.
                */
                JOptionPane.showMessageDialog(this, "Your info is updated.");
                fName_text_field.setText("");
                mName_text_field.setText("");
                lName_text_field.setText("");
                dob_text_field.setText("");
                email_text_field.setText("");
                address_text_field.setText("");
                phone_text_field.setText("");
                password_text_field.setText("");
                infoLoad();
            }
            catch (SQLException ex)
            {
                Logger.getLogger(modifyStudentInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updateButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        // Clear all the text fields.
        fName_text_field.setText("");
        mName_text_field.setText("");
        lName_text_field.setText("");
        dob_text_field.setText("");
        email_text_field.setText("");
        address_text_field.setText("");
        phone_text_field.setText("");
        password_text_field.setText("");
    }//GEN-LAST:event_clearButtonMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // Display studentHome.java.
        this.hide();
        new studentHome(id).setVisible(true);
    }//GEN-LAST:event_backButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // Display Login.java.
        this.hide();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

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
            java.util.logging.Logger.getLogger(studentPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentPersonalInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_label;
    private javax.swing.JTextField address_text_field;
    private javax.swing.JMenu backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel dob_label;
    private javax.swing.JFormattedTextField dob_text_field;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_text_field;
    private javax.swing.JComboBox<String> ethnicity_combo_box;
    private javax.swing.JLabel ethnicity_label;
    private javax.swing.JLabel fName_label;
    private javax.swing.JTextField fName_text_field;
    private javax.swing.JComboBox<String> gender_combo_box;
    private javax.swing.JLabel gender_label;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lName_label;
    private javax.swing.JTextField lName_text_field;
    private javax.swing.JMenu logoutButton;
    private javax.swing.JLabel mName_label;
    private javax.swing.JTextField mName_text_field;
    private javax.swing.JLabel password_label;
    private javax.swing.JPasswordField password_text_field;
    private javax.swing.JLabel phone_label;
    private javax.swing.JFormattedTextField phone_text_field;
    private javax.swing.JComboBox<String> prefix_combo_box;
    private javax.swing.JLabel prefix_label;
    private javax.swing.JPanel student_info_form;
    private javax.swing.JScrollPane student_info_scroll_pane;
    private javax.swing.JTable student_info_table;
    private javax.swing.JComboBox<String> suffix_combo_box;
    private javax.swing.JLabel suffix_label;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
