/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package responsi2_l0122081_sc;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.time.LocalDate;
import javax.swing.border.Border;

/**
 *
 * @author franklynical
 */

public class frameAnggotaBulanan extends javax.swing.JFrame {

    /**
     * Creates new form frameAnggota
     */
    public frameAnggotaBulanan() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(57, 54, 70));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton(){
            @Override protected void paintComponent(Graphics g) {
                Border b = getBorder();
                if (!isOpaque() && b instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    int w = getWidth() - 1;
                    int h = getHeight() - 1;
                    g2.fill(((RoundedCornerBorder) b).getBorderShape(0, 0, w, h));
                    g2.dispose();
                }
                super.paintComponent(g);
            }

            @Override public void updateUI() {
                super.updateUI();
                setOpaque(false);
                setBorder(new RoundedCornerBorder(8));
            }
        }
        ;
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            @Override protected void paintComponent(Graphics g) {
                Border b = getBorder();
                if (!isOpaque() && b instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    int w = getWidth() - 1;
                    int h = getHeight() - 1;
                    g2.fill(((RoundedCornerBorder) b).getBorderShape(0, 0, w, h));
                    g2.dispose();
                }
                super.paintComponent(g);
            }

            @Override public void updateUI() {
                super.updateUI();
                setOpaque(false);
                setBorder(new RoundedCornerBorder(8));
            }
        }
        ;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField(){
            @Override protected void paintComponent(Graphics g) {
                Border b = getBorder();
                if (!isOpaque() && b instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    int w = getWidth() - 1;
                    int h = getHeight() - 1;
                    g2.fill(((RoundedCornerBorder) b).getBorderShape(0, 0, w, h));
                    g2.dispose();
                }
                super.paintComponent(g);
            }

            @Override public void updateUI() {
                super.updateUI();
                setOpaque(false);
                setBorder(new RoundedCornerBorder(8));
            }
        }
        ;
        ID = new javax.swing.JTextField(){
            @Override protected void paintComponent(Graphics g) {
                Border b = getBorder();
                if (!isOpaque() && b instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    int w = getWidth() - 1;
                    int h = getHeight() - 1;
                    g2.fill(((RoundedCornerBorder) b).getBorderShape(0, 0, w, h));
                    g2.dispose();
                }
                super.paintComponent(g);
            }

            @Override public void updateUI() {
                super.updateUI();
                setOpaque(false);
                setBorder(new RoundedCornerBorder(8));
            }
        }
        ;
        jButton1 = new javax.swing.JButton(){
            @Override protected void paintComponent(Graphics g) {
                Border b = getBorder();
                if (!isOpaque() && b instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    int w = getWidth() - 1;
                    int h = getHeight() - 1;
                    g2.fill(((RoundedCornerBorder) b).getBorderShape(0, 0, w, h));
                    g2.dispose();
                }
                super.paintComponent(g);
            }

            @Override public void updateUI() {
                super.updateUI();
                setOpaque(false);
                setBorder(new RoundedCornerBorder(8));
            }
        }
        ;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton3.setBackground(new java.awt.Color(244, 238, 224));
        jButton3.setFont(new java.awt.Font("Gotham Light", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(109, 93, 110));
        jButton3.setText("Home");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(244, 238, 224));
        jTable1.setFont(new java.awt.Font("Gotham Light", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(109, 93, 110));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Tanggal Mulai", "Buku Dipinjam"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setForeground(new java.awt.Color(244, 238, 224));
        jLabel1.setText("Nama");

        jLabel2.setForeground(new java.awt.Color(244, 238, 224));
        jLabel2.setText("ID");

        Nama.setBackground(new java.awt.Color(244, 238, 224));
        Nama.setFont(new java.awt.Font("Gotham Light", 0, 12)); // NOI18N
        Nama.setForeground(new java.awt.Color(109, 93, 110));
        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });

        ID.setBackground(new java.awt.Color(244, 238, 224));
        ID.setFont(new java.awt.Font("Gotham Light", 0, 12)); // NOI18N
        ID.setForeground(new java.awt.Color(109, 93, 110));

        jButton1.setBackground(new java.awt.Color(244, 238, 224));
        jButton1.setFont(new java.awt.Font("Gotham Light", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(109, 93, 110));
        jButton1.setText("Tambah");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Nama)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton3)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        AccessXML.writeXML();
        frameUtama fu = new frameUtama();
        fu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String iD=ID.getText();
        String nama = Nama.getText();
        LocalDate l = LocalDate.now();
        String s = l.toString();
        int jumlahDipinjam = 0;
        boolean isTetap = true;
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        AnggotaBulanan a = Pinjam.bMap.get(iD);
        
        model.addRow(new Object[]{iD, nama, s, jumlahDipinjam});
        a.setAnggotaBulanan(iD, nama, l , jumlahDipinjam);
        
        AccessXML.writeXML();
        jTable1.setModel(model);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(frameAnggotaBulanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameAnggotaBulanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameAnggotaBulanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameAnggotaBulanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameAnggotaBulanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
