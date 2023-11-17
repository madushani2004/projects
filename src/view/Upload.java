package view;

import controller.Cupload;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import view.VArtistHome;

public class Upload extends javax.swing.JInternalFrame {

    private String artName;
    File f = null;
    String path = null;
    private ImageIcon format = null;
    String fname = null;
    int s = 0;
    byte[] pimage = null;

    public Upload() {
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
        titletxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        artPrice = new javax.swing.JTextField();
        typeComboBox1 = new javax.swing.JComboBox<>();
        uploadCancelbtn = new javax.swing.JButton();
        selectfolder = new javax.swing.JButton();
        uploadbtn1 = new javax.swing.JButton();
        labelImage = new javax.swing.JLabel();
        imagePath = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(880, 520));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 520));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Title               :");

        titletxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titletxt.setForeground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Description    :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Type              :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Price              :");

        artPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        artPrice.setForeground(new java.awt.Color(102, 102, 102));

        typeComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nature", "Abstract", "Wildlife", "Portraits", "Cartoon/Comic", "Fantasy", "Landscapes" }));
        typeComboBox1.setPreferredSize(new java.awt.Dimension(117, 26));

        uploadCancelbtn.setBackground(new java.awt.Color(10, 102, 102));
        uploadCancelbtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        uploadCancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        uploadCancelbtn.setText("Cancel");
        uploadCancelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadCancelbtnMouseClicked(evt);
            }
        });
        uploadCancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadCancelbtnActionPerformed(evt);
            }
        });

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
        uploadbtn1.setText("Upload");
        uploadbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadbtn1MouseClicked(evt);
            }
        });
        uploadbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbtn1ActionPerformed(evt);
            }
        });

        labelImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imagePath.setMinimumSize(new java.awt.Dimension(64, 26));

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(uploadbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(uploadCancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titletxt)
                            .addComponent(typeComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(artPrice)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectfolder))
                    .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(57, 57, 57)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uploadbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadCancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectfolder)
                            .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 870, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadCancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadCancelbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadCancelbtnMouseClicked

    private void uploadCancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadCancelbtnActionPerformed

        titletxt.setText("");
        artPrice.setText("");
        desc.setText("");
        imagePath.setText("");
    }//GEN-LAST:event_uploadCancelbtnActionPerformed

    private void selectfolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectfolderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_selectfolderMouseClicked
    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isValidImageFile(File file) {
        String fileName = file.getName();
        return fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png");
    }

    public void setArtistName(String artistName) {
        this.artName = artistName;

    }
    private void selectfolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectfolderActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG", "png", "jpeg", "jpg");
        fileChooser.addChoosableFileFilter(fnwf);
        try {
            int load = fileChooser.showOpenDialog(null);

            if (load == JFileChooser.APPROVE_OPTION) {
                f = fileChooser.getSelectedFile();

                // Validation: Check if the selected file is an image
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
        } catch (Exception e) {
            Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Error in file selection.", "File Selection Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_selectfolderActionPerformed

    private void uploadbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadbtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadbtn1MouseClicked
 
    private void uploadbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbtn1ActionPerformed

        if (titletxt.getText().isEmpty() || artPrice.getText().isEmpty()
                || desc.getText().isEmpty() || path == null) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validation: Check if the price is a valid double value
        try {
            Double.parseDouble(artPrice.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid price format. Please enter a valid number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validation: Check if the title contains only alphabetic characters
        if (!titletxt.getText().matches("^[a-zA-Z\\s]+$")) {
            JOptionPane.showMessageDialog(this, "Invalid title format. Please enter a title with only alphabetic characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (path == null) {
            JOptionPane.showMessageDialog(this, "Please select an image file.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validation: Check if numeric fields contain valid numeric values
        if (!isNumeric(artPrice.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid price format. Please enter a valid number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            System.out.println(path);
            System.out.println(f);

            String title = titletxt.getText();
            //String artistName = artistNametxt.getText();
            String description = desc.getText();
            String selectedValue = typeComboBox1.getSelectedItem().toString();
            double price = Double.parseDouble(artPrice.getText());

            File f = new File(path);
            InputStream is = new FileInputStream(f);

            Cupload cs = new Cupload();
            cs.uploadArt(title, artName, description, selectedValue, price, path, is);

            titletxt.setText("");
            artPrice.setText("");
            desc.setText("");
            imagePath.setText("");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "File not found.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error in database operation. " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Class not found. " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_uploadbtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField artPrice;
    private javax.swing.JTextArea desc;
    private javax.swing.JTextField imagePath;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelImage;
    private javax.swing.JButton selectfolder;
    private javax.swing.JTextField titletxt;
    private javax.swing.JComboBox<String> typeComboBox1;
    private javax.swing.JButton uploadCancelbtn;
    private javax.swing.JButton uploadbtn1;
    // End of variables declaration//GEN-END:variables

}
