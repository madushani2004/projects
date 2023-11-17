package view;

import com.sun.jdi.connect.spi.Connection;
import controller.Cupdate;
import model.MyDBConnection;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class Vupdate extends javax.swing.JInternalFrame {

    private String artName;
    File f = null;
    String path = null;
    private ImageIcon format = null;
    String fname = null;
    int s = 0;
    byte[] pimage = null;

    public Vupdate() throws SQLException {

        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        titletxt = new javax.swing.JTextField();
        typeComboBox1 = new javax.swing.JComboBox<>();
        artPrice = new javax.swing.JTextField();
        labelImage = new javax.swing.JLabel();
        imagePath = new javax.swing.JTextField();
        selectfolder = new javax.swing.JButton();
        uploadbtn1 = new javax.swing.JButton();
        uploadCancelbtn = new javax.swing.JButton();
        imageId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchtxt = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 520));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Title               :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Type              :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Price              :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Description    :");

        titletxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titletxt.setForeground(new java.awt.Color(102, 102, 102));

        typeComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nature", "Abstract", "Wildlife", "Portraits", "Cartoon/Comic", "Fantasy", "Landscapes" }));

        artPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        artPrice.setForeground(new java.awt.Color(102, 102, 102));

        labelImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        selectfolder.setBackground(new java.awt.Color(10, 102, 102));
        selectfolder.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        selectfolder.setForeground(new java.awt.Color(255, 255, 255));
        selectfolder.setText("Browse");
        selectfolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectfolderMouseClicked(evt);
            }
        });
        selectfolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectfolderActionPerformed(evt);
            }
        });

        uploadbtn1.setBackground(new java.awt.Color(10, 102, 102));
        uploadbtn1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        uploadbtn1.setForeground(new java.awt.Color(255, 255, 255));
        uploadbtn1.setText("Update");
        uploadbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbtn1ActionPerformed(evt);
            }
        });

        uploadCancelbtn.setBackground(new java.awt.Color(10, 102, 102));
        uploadCancelbtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        uploadCancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        uploadCancelbtn.setText("Cancel");

        imageId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        imageId.setForeground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("ImageId        :");

        jTable1.setBackground(new java.awt.Color(10, 102, 102));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Image Id", "Title ", "Artist Name", "Type ", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        searchLabel.setIcon(new javax.swing.ImageIcon("D:\\Users\\STZ\\Documents\\NetBeansProjects\\ArtGalleryManagement\\src\\icon\\magnifier (2).png")); // NOI18N
        searchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLabelMouseClicked(evt);
            }
        });

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane2.setViewportView(desc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titletxt, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(imageId, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(typeComboBox1, 0, 255, Short.MAX_VALUE)
                            .addComponent(artPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 64, Short.MAX_VALUE)
                        .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectfolder)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 21, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(uploadbtn1)
                .addGap(41, 41, 41)
                .addComponent(uploadCancelbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchLabel)
                            .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imageId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectfolder))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadbtn1)
                    .addComponent(uploadCancelbtn))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 868, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectfolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectfolderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_selectfolderMouseClicked
    public void setArtistName(String artistName) {
        this.artName = artistName;

    }
    private void selectfolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectfolderActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG", "png", "jpeg", "jpg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);

        if (load == fileChooser.APPROVE_OPTION) {
            f = fileChooser.getSelectedFile();
            if (!isValidImageFile(f)) {
                JOptionPane.showMessageDialog(this, "Please select a valid image file.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            path = f.getAbsolutePath();
            imagePath.setText(path);
            ImageIcon li = new ImageIcon(path);
            Image img = li.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            labelImage.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_selectfolderActionPerformed

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private void uploadbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbtn1ActionPerformed

        // Validation: Check if essential fields are empty
        if (imageId.getText().isEmpty() || titletxt.getText().isEmpty()
                || artPrice.getText().isEmpty() || desc.getText().isEmpty() || path == null) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validation: Check if numeric fields contain valid numeric values
        if (!isNumeric(imageId.getText()) || !isNumeric(artPrice.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid numeric values. Please enter valid numbers.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validation: Check if the title contains only alphabetic characters
        if (!titletxt.getText().matches("^[a-zA-Z\\s]+$")) {
            JOptionPane.showMessageDialog(this, "Invalid title format. Please enter a title with only alphabetic characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validation: Check if the price is a valid double value
        try {
            Double.parseDouble(artPrice.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid price format. Please enter a valid number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Check if the image ID exists in the database
        int imgId = Integer.parseInt(imageId.getText());
        if (!imageIdExists(imgId)) {
            JOptionPane.showMessageDialog(this, "Image ID does not exist in the database. Please enter a valid Image ID.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        System.out.println(path);
        System.out.println(f);

        String title;
        String artistName;
        String description;
        String selectedValue = typeComboBox1.getSelectedItem().toString();
        double price = Double.parseDouble(artPrice.getText());
        File f = new File(path);
        title = titletxt.getText();
        //artistName = artistNametxt.getText();
        description = desc.getText();

        try {
            InputStream is = new FileInputStream(f);
            Cupdate cs = new Cupdate();
            cs.updateArt(imgId, title, artName, description, selectedValue, price, path, is);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vupdate.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "File not found.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Vupdate.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error in database operation. " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Vupdate.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Class not found. " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_uploadbtn1ActionPerformed

    private boolean isValidImageFile(File file) {
        String fileName = file.getName();
        return fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png");
    }
// Helper method to check if an image ID exists in the database

    private boolean imageIdExists(int imgId) {
        try {
            Cupdate cs = new Cupdate();
            return cs.imageIdExists(imgId);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Vupdate.class.getName()).log(Level.SEVERE, null, ex);
            return false; // Return false in case of an exception
        }
    }
    private void searchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLabelMouseClicked
        // Validation: Check if a search criteria is provided
        if (searchtxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a search criteria.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String searchCriteria = searchtxt.getText();
            Cupdate cs = new Cupdate();
            ResultSet resultSet = cs.searchArtwork(searchCriteria, artName);

            // You can customize the table model based on your requirements
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Image Id");
            model.addColumn("Title");
            model.addColumn("Artist Name");
            model.addColumn("Type");
            model.addColumn("Price");
            //model.addColumn("Image Path");

            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getInt("imageId"),
                    resultSet.getString("title"),
                    resultSet.getString("artistName"),
                    resultSet.getString("type"),
                    resultSet.getDouble("price"),
                   // resultSet.getString("imagePath")
                });
            }

            jTable1.setModel(model);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Vupdate.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error in database operation. " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField artPrice;
    private javax.swing.JTextArea desc;
    private javax.swing.JTextField imageId;
    private javax.swing.JTextField imagePath;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JButton selectfolder;
    private javax.swing.JTextField titletxt;
    private javax.swing.JComboBox<String> typeComboBox1;
    private javax.swing.JButton uploadCancelbtn;
    private javax.swing.JButton uploadbtn1;
    // End of variables declaration//GEN-END:variables
}
