/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package responsi2_l0122081_sc;
import java.awt.*;
import javax.swing.border.*;
/**
 *
 * @author franklynical
 */


public class frameLogin extends javax.swing.JFrame {

    /**
     * Creates new form frameLogin
     */
    public frameLogin() {
        AccessXML.readXML();
        initComponents();
        getContentPane().setBackground(new java.awt.Color(57, 54, 70));
    }
    
    public static boolean isLogin = true;
    public static String usernameLogin = null;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Username = new javax.swing.JTextField(){
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
        };
        Pass = new javax.swing.JPasswordField(){ @Override protected void paintComponent(Graphics g) {
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
    };
    Login = new javax.swing.JButton(){
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
    };

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(57, 54, 70));
    setForeground(new java.awt.Color(57, 54, 70));
    setResizable(false);

    Username.setBackground(new java.awt.Color(244, 238, 224));
    Username.setForeground(new java.awt.Color(57, 54, 70));
    Username.setText("Username");
    Username.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            UsernameFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            UsernameFocusLost(evt);
        }
    });
    Username.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            UsernameActionPerformed(evt);
        }
    });

    Pass.setBackground(new java.awt.Color(244, 238, 224));
    Pass.setForeground(new java.awt.Color(57, 54, 70));
    Pass.setText("Password");
    Pass.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            PassFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            PassFocusLost(evt);
        }
    });
    Pass.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            PassActionPerformed(evt);
        }
    });

    Login.setBackground(new java.awt.Color(244, 238, 224));
    Login.setForeground(new java.awt.Color(57, 54, 70));
    Login.setText("Login");
    Login.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            LoginMouseClicked(evt);
        }
    });
    Login.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            LoginActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(125, 125, 125)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(125, 125, 125))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(163, 163, 163))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(108, Short.MAX_VALUE)
            .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(51, 51, 51))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
        String username=Username.getText();
        if(username.equals("Username")){
            Username.setText("");
        }
    }//GEN-LAST:event_UsernameFocusGained

    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
        String username=Username.getText();
        if(username.equals("")||username.equals("Username")){
            Username.setText("Username");
        }
    }//GEN-LAST:event_UsernameFocusLost

    private void PassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassFocusGained
        String pass=Pass.getText();
        if(pass.equals("Password")){
            Pass.setText("");
        }
    }//GEN-LAST:event_PassFocusGained

    private void PassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassFocusLost
        String password= Pass.getText();
        if(password.equals("")||password.equals("Password")){
            Pass.setText("Password");
        }
    }//GEN-LAST:event_PassFocusLost

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        String username = Username.getText();
        String password=String.valueOf(Pass.getPassword());
        
        if(User.users.get(username).equals(password)){
            isLogin = true;
            usernameLogin = username;
            frameUtama mainApp = new frameUtama();
            mainApp.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_LoginMouseClicked

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(frameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Username;
    // End of variables declaration//GEN-END:variables
}
