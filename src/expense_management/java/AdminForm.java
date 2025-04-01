/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package expense_management.java;

import config.DatabaseConfig;
import expense_management.java.dto.UpdateExpenseRequest;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public final class AdminForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    public AdminForm() {
        initComponents();
        getAllExpense();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        title = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        userTitle = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        searchBox = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        staffMenu = new javax.swing.JMenuItem();
        actionMenu = new javax.swing.JMenu();
        logoutMenu = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 900));

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setText("WELCOME ADMIN");

        desc.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        desc.setForeground(new java.awt.Color(255, 0, 0));
        desc.setText("*** You are login as user Admin. You can use CRUD Operator to Create, Read, Update, and Delete user expense records. Thank you!");

        userTable.setBackground(new java.awt.Color(255, 255, 255));
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Date", "Description", "Picture", "Staff Name"
            }
        ));
        userTable.setRowHeight(50);
        jScrollPane1.setViewportView(userTable);

        userTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userTitle.setText("USERS Expences");

        btnCreate.setBackground(new java.awt.Color(0, 204, 0));
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 51, 255));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jMenu2.setText("Services");

        jMenuItem1.setText("Product");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        staffMenu.setText("Staff");
        staffMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffMenuActionPerformed(evt);
            }
        });
        jMenu2.add(staffMenu);

        jMenuBar1.add(jMenu2);

        actionMenu.setText("Actions");
        actionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuActionPerformed(evt);
            }
        });

        logoutMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logoutMenu.setText("Logout");
        logoutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuActionPerformed(evt);
            }
        });
        actionMenu.add(logoutMenu);

        jMenuBar1.add(actionMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addComponent(desc)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)))
                        .addGap(0, 106, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(desc)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTitle)
                    .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String info = """
                      These are fields that we use to create new expense!
                      ---------------------------------------------------------------------
                       - Staff Id
                       - Date
                       - Description
                       - Picture
                      """;

        int res = JOptionPane.showConfirmDialog(rootPane, info, "Create New Expense", JOptionPane.OK_CANCEL_OPTION);

        if (res == JOptionPane.OK_OPTION) {
            System.out.println("OK");
            CreateForm createForm = new CreateForm();
            createForm.setVisible(true);
            dispose();
        } else {
            System.out.println("Cancel");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String url = "jdbc:mysql://localhost:3306/db_java_v1";
        String userDb = "root";
        String passDb = "";

        String query = "DELETE FROM expense WHERE id=?";

        int row = userTable.getSelectedRow();

        int expenseId;

        if (row != 1) {
            int columnCount = userTable.getColumnCount();
            Object[] data = new Object[columnCount];

            for (int i = 0; i < columnCount; i++) {
                data[i] = userTable.getValueAt(row, i);
            }

            String getExpenseIdString = (String) data[0];

            expenseId = Integer.parseInt(getExpenseIdString);

            System.out.println(expenseId);

            if (expenseId != 0) {
                try (Connection cont = DriverManager.getConnection(url, userDb, passDb)) {

                    PreparedStatement stmt = cont.prepareStatement(query);

                    stmt.setInt(1, expenseId);

                    stmt.execute();

                    getAllExpense();

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        UpdateExpenseRequest request = new UpdateExpenseRequest();

        int row = userTable.getSelectedRow();

        if (row != -1) {
            int columnCount = userTable.getColumnCount();
            Object[] data = new Object[columnCount];

            for (int i = 0; i < columnCount; i++) {
                data[i] = userTable.getValueAt(row, i);
            }

            String getExpenseIdString = (String) data[0];
            int expenseId = Integer.parseInt(getExpenseIdString);

            request.setId(expenseId);

            UpdateForm updateForm = new UpdateForm(expenseId);
            updateForm.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update.", "No row selected", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String inputSearch = searchBox.getText();
        
        String sql = "SELECT expense.id, expense.date, expense.description, expense.amount, expense.picture, staff.s_name FROM expense INNER JOIN staff ON expense.s_id=staff.s_id WHERE staff.s_name LIKE LOWER(?)";
        
        try{
            Connection conn = DatabaseConfig.getConnection();
            
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, "%" + inputSearch + "%");
            
            ResultSet rs = pst.executeQuery();
            
            DefaultTableModel table = (DefaultTableModel) userTable.getModel();

            table.setColumnIdentifiers(new Object[]{"No", "Date", "Description", "Amount", "Picture", "Staff Name"});

            table.setNumRows(0);

            int i = 1;

            while (rs.next()) {

                InputStream streamImage = rs.getBinaryStream("picture");
                ImageIcon imageIcon = null;

                try {
                    if (streamImage != null) {
                        BufferedImage image = ImageIO.read(streamImage);

                        int oWidth = image.getWidth();
                        int oHeight = image.getHeight();

                        int nHeight = 50;
                        int nWidth = (int) ((double) nHeight / oHeight * oWidth);

                        imageIcon = new ImageIcon(image);

                        Image img = imageIcon.getImage();
                        Image resize = img.getScaledInstance(nWidth, nHeight, Image.SCALE_SMOOTH);
                        imageIcon = new ImageIcon(resize);
                    }
                } catch (IOException ex) {
                }

                Object[] row = {
                    rs.getString("id"),
                    rs.getDate("date"),
                    rs.getString("description"),
                    rs.getDouble("amount"),
                    imageIcon,
                    rs.getString("s_name")
                };

                table.addRow(row);
            }
            userTable.getColumnModel().getColumn(4).setCellRenderer(new ImageRender());
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void actionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionMenuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_actionMenuActionPerformed

    private void logoutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuActionPerformed
        // TODO add your handling code here:
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutMenuActionPerformed

    private void staffMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffMenuActionPerformed
        // TODO add your handling code here:
        StaffForm staffForm = new StaffForm();
        staffForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_staffMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ProductForm productForm = new ProductForm();
        productForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void getAllExpense() {

        String url = "jdbc:mysql://localhost:3306/db_java_v1";
        String userDb = "root";
        String passDb = "";

        try (Connection cont = DriverManager.getConnection(url, userDb, passDb)) {

            String query = "SELECT expense.id, expense.date, expense.description, expense.amount, expense.picture, staff.s_name FROM expense INNER JOIN staff ON expense.s_id=staff.s_id";

            PreparedStatement stmt = cont.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            //System.out.println(rs.findColumn("s_name"));
            DefaultTableModel table = (DefaultTableModel) userTable.getModel();

            table.setColumnIdentifiers(new Object[]{"No", "Date", "Description", "Amount", "Picture", "Staff Name"});

            table.setNumRows(0);

            int i = 1;

            while (rs.next()) {

                InputStream streamImage = rs.getBinaryStream("picture");
                ImageIcon imageIcon = null;

                try {
                    if (streamImage != null) {
                        BufferedImage image = ImageIO.read(streamImage);

                        int oWidth = image.getWidth();
                        int oHeight = image.getHeight();

                        int nHeight = 50;
                        int nWidth = (int) ((double) nHeight / oHeight * oWidth);

                        imageIcon = new ImageIcon(image);

                        Image img = imageIcon.getImage();
                        Image resize = img.getScaledInstance(nWidth, nHeight, Image.SCALE_SMOOTH);
                        imageIcon = new ImageIcon(resize);
                    }
                } catch (IOException ex) {
                }

                Object[] row = {
                    rs.getString("id"),
                    rs.getDate("date"),
                    rs.getString("description"),
                    rs.getDouble("amount"),
                    imageIcon,
                    rs.getString("s_name")
                };

                table.addRow(row);
            }
            userTable.getColumnModel().getColumn(4).setCellRenderer(new ImageRender());

        } catch (SQLException ex) {

        }

    }

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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu actionMenu;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel desc;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem logoutMenu;
    private javax.swing.JTextField searchBox;
    private javax.swing.JMenuItem staffMenu;
    private javax.swing.JLabel title;
    private javax.swing.JTable userTable;
    private javax.swing.JLabel userTitle;
    // End of variables declaration//GEN-END:variables
}
