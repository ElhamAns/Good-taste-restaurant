package restaurant;

import java.awt.Toolkit;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class CustHomepage extends javax.swing.JFrame {

    /**
     * Creates new form CustHomepage
     */
    public CustHomepage() 
    {
        super("Customer Homepage");
        initComponents();
        setIconImage();
    }
    
    private void setIconImage() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.jpg")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CustHomepage_Panel = new javax.swing.JPanel();
        CustHomepage_Label1 = new javax.swing.JLabel();
        CustHomepage_Label2 = new javax.swing.JLabel();
        CustHomepage_order = new javax.swing.JButton();
        CustHomepage_viewInfo = new javax.swing.JButton();
        CustHomepage_BackButton = new javax.swing.JButton();
        CustHomepage_feedback = new javax.swing.JButton();
        CustHomepage_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CustHomepage_Panel.setLayout(null);

        CustHomepage_Label1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        CustHomepage_Label1.setText("What do you want");
        CustHomepage_Panel.add(CustHomepage_Label1);
        CustHomepage_Label1.setBounds(20, 40, 290, 50);

        CustHomepage_Label2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        CustHomepage_Label2.setText("to do?");
        CustHomepage_Panel.add(CustHomepage_Label2);
        CustHomepage_Label2.setBounds(110, 90, 100, 50);

        CustHomepage_order.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        CustHomepage_order.setText("MenU");
        CustHomepage_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustHomepage_orderActionPerformed(evt);
            }
        });
        CustHomepage_Panel.add(CustHomepage_order);
        CustHomepage_order.setBounds(100, 170, 130, 50);

        CustHomepage_viewInfo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        CustHomepage_viewInfo.setText("view info");
        CustHomepage_viewInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustHomepage_viewInfoActionPerformed(evt);
            }
        });
        CustHomepage_Panel.add(CustHomepage_viewInfo);
        CustHomepage_viewInfo.setBounds(100, 250, 130, 50);

        CustHomepage_BackButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 11)); // NOI18N
        CustHomepage_BackButton.setText("Sign out");
        CustHomepage_BackButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        CustHomepage_BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustHomepage_BackButtonActionPerformed(evt);
            }
        });
        CustHomepage_Panel.add(CustHomepage_BackButton);
        CustHomepage_BackButton.setBounds(10, 10, 100, 20);

        CustHomepage_feedback.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        CustHomepage_feedback.setText("Feedback");
        CustHomepage_feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustHomepage_feedbackActionPerformed(evt);
            }
        });
        CustHomepage_Panel.add(CustHomepage_feedback);
        CustHomepage_feedback.setBounds(100, 330, 130, 50);

        CustHomepage_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/Images/Background logo.jpg"))); // NOI18N
        CustHomepage_Panel.add(CustHomepage_Background);
        CustHomepage_Background.setBounds(0, 0, 330, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CustHomepage_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CustHomepage_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustHomepage_BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustHomepage_BackButtonActionPerformed
        Homepage frame = new Homepage();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CustHomepage_BackButtonActionPerformed

    private void CustHomepage_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustHomepage_orderActionPerformed
        Menu frame = new Menu();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CustHomepage_orderActionPerformed

    private void CustHomepage_viewInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustHomepage_viewInfoActionPerformed
        View_info frame;
        try {
            frame = new View_info();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            this.setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(CustHomepage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CustHomepage_viewInfoActionPerformed

    private void CustHomepage_feedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustHomepage_feedbackActionPerformed
        Feedback frame = new Feedback();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CustHomepage_feedbackActionPerformed

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
            java.util.logging.Logger.getLogger(CustHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustHomepage_BackButton;
    private javax.swing.JLabel CustHomepage_Background;
    private javax.swing.JLabel CustHomepage_Label1;
    private javax.swing.JLabel CustHomepage_Label2;
    private javax.swing.JPanel CustHomepage_Panel;
    private javax.swing.JButton CustHomepage_feedback;
    private javax.swing.JButton CustHomepage_order;
    private javax.swing.JButton CustHomepage_viewInfo;
    // End of variables declaration//GEN-END:variables
}
