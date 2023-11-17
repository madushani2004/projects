package view;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VArtistHome extends javax.swing.JFrame {

    Color DefaultColor, ClickedColor;

    public VArtistHome() {
        initComponents();

        DefaultColor = new Color(10, 102, 102);
        ClickedColor = new Color(20, 128, 115);

        uploadArt.setBackground(DefaultColor);
        updateArt.setBackground(DefaultColor);
        removeArt.setBackground(DefaultColor);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        artistName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        uploadArt = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        updateArt = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        removeArt = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Artist Home Page");
        setMinimumSize(new java.awt.Dimension(1120, 600));
        setPreferredSize(new java.awt.Dimension(1120, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(20, 128, 115));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Users\\STZ\\Documents\\NetBeansProjects\\ArtGalleryManagement\\src\\icon\\logo2.png")); // NOI18N

        logOut.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setText("Logout");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Art Gallery");

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Users\\STZ\\Documents\\NetBeansProjects\\ArtGalleryManagement\\src\\icon\\man-user.png")); // NOI18N

        artistName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        artistName.setForeground(new java.awt.Color(255, 255, 255));
        artistName.setText(" Artist Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(755, 755, 755)
                        .addComponent(jLabel7)
                        .addGap(103, 103, 103)
                        .addComponent(logOut)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(artistName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logOut)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(artistName)
                        .addGap(12, 12, 12))))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1130, 80));

        jPanel3.setBackground(new java.awt.Color(10, 102, 102));

        uploadArt.setBackground(new java.awt.Color(10, 102, 102));
        uploadArt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadArtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                uploadArtMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(10, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Upload Art Work");

        javax.swing.GroupLayout uploadArtLayout = new javax.swing.GroupLayout(uploadArt);
        uploadArt.setLayout(uploadArtLayout);
        uploadArtLayout.setHorizontalGroup(
            uploadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uploadArtLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        uploadArtLayout.setVerticalGroup(
            uploadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uploadArtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        updateArt.setBackground(new java.awt.Color(10, 102, 102));
        updateArt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateArtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateArtMousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(10, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update Art Work");

        javax.swing.GroupLayout updateArtLayout = new javax.swing.GroupLayout(updateArt);
        updateArt.setLayout(updateArtLayout);
        updateArtLayout.setHorizontalGroup(
            updateArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateArtLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        updateArtLayout.setVerticalGroup(
            updateArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateArtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        removeArt.setBackground(new java.awt.Color(10, 102, 102));
        removeArt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeArtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                removeArtMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(10, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Remove Art Work");

        javax.swing.GroupLayout removeArtLayout = new javax.swing.GroupLayout(removeArt);
        removeArt.setLayout(removeArtLayout);
        removeArtLayout.setHorizontalGroup(
            removeArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeArtLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        removeArtLayout.setVerticalGroup(
            removeArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeArtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uploadArt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateArt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeArt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(uploadArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(updateArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(removeArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 80, 250, 620));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 880, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logOutMouseClicked

    private void uploadArtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadArtMousePressed
        uploadArt.setBackground(ClickedColor);
        updateArt.setBackground(DefaultColor);
        removeArt.setBackground(DefaultColor);
    }//GEN-LAST:event_uploadArtMousePressed

    private void updateArtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateArtMousePressed
        uploadArt.setBackground(DefaultColor);
        updateArt.setBackground(ClickedColor);
        removeArt.setBackground(DefaultColor);
    }//GEN-LAST:event_updateArtMousePressed

    private void removeArtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeArtMousePressed
        uploadArt.setBackground(DefaultColor);
        updateArt.setBackground(DefaultColor);
        removeArt.setBackground(ClickedColor);
    }//GEN-LAST:event_removeArtMousePressed

    private void uploadArtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadArtMouseClicked
        Upload upload1 = new Upload();
        upload1.setArtistName(artistName.getText());
        jDesktopPane1.removeAll();
        jDesktopPane1.add(upload1).setVisible(true);

    }//GEN-LAST:event_uploadArtMouseClicked

    private void updateArtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateArtMouseClicked

        Vupdate update1;
        try {
            update1 = new Vupdate();
            update1.setArtistName(artistName.getText());
            jDesktopPane1.removeAll();
            jDesktopPane1.add(update1).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VArtistHome.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_updateArtMouseClicked

    private void removeArtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeArtMouseClicked
        remove remove1 = new remove();
        remove1.setArtistName(artistName.getText());
        jDesktopPane1.removeAll();
        jDesktopPane1.add(remove1).setVisible(true);
    }//GEN-LAST:event_removeArtMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VArtistHome().setVisible(true);
            }
        });
    }

    public void setArtistName(String artistName) {

        this.artistName.setText(" " + artistName);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel artistName;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logOut;
    private javax.swing.JPanel removeArt;
    private javax.swing.JPanel updateArt;
    private javax.swing.JPanel uploadArt;
    // End of variables declaration//GEN-END:variables

}
