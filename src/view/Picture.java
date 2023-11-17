package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Picture extends javax.swing.JPanel {

    /**
     * Creates new form Picture
     */
    public Picture() {
        initComponents();
    }

    public void configure(String title, String artistName, String price, ImageIcon scaledImageIcon) {
        this.title.setText(title);
        this.artistName.setText(artistName);
        this.price.setText(price);
        this.imagelbl.setIcon(scaledImageIcon);
    }

    public JButton getBuyButton() {
        return jButton1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagelbl = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        artistName = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(10, 102, 102));
        setMaximumSize(new java.awt.Dimension(150, 285));

        imagelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagelbl.setIcon(new javax.swing.ImageIcon("D:\\Users\\STZ\\Documents\\NetBeansProjects\\ArtGalleryManagement\\src\\icon\\man-user.png")); // NOI18N

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Title");

        artistName.setBackground(new java.awt.Color(255, 255, 255));
        artistName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        artistName.setForeground(new java.awt.Color(255, 255, 255));
        artistName.setText("Artist Name");

        price.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("$0.00");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(10, 102, 102));
        jButton1.setText("Buy Now");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(artistName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(artistName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel artistName;
    private javax.swing.JLabel imagelbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel price;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
