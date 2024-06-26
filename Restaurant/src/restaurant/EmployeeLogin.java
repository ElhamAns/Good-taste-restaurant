/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurant;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class EmployeeLogin extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeLogin
     */
    Connection con;
    
    public EmployeeLogin() 
    {
        super("Login");
        initComponents();
        setIconImage();
        
        try
        {
            con=DriverManager.getConnection(Restaurant.DATABASE_URL,Restaurant.USER,Restaurant.PASS);
        }
        catch (SQLException ex)                                
        {
            JOptionPane.showMessageDialog(null, ex, "Failed", 2);
        } 
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

        EmpLogin_Panel = new javax.swing.JPanel();
        EmpLogin_Label = new javax.swing.JLabel();
        EmpUsername_Label = new javax.swing.JLabel();
        EmpPassword_Label = new javax.swing.JLabel();
        EmpUser_TextField = new javax.swing.JTextField();
        Emp_EnterButton = new javax.swing.JButton();
        Emp_BackButton = new javax.swing.JButton();
        EmpPassword_PasswordField = new javax.swing.JPasswordField();
        EmpLogin_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EmpLogin_Panel.setLayout(null);

        EmpLogin_Label.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        EmpLogin_Label.setText("Employee login");
        EmpLogin_Panel.add(EmpLogin_Label);
        EmpLogin_Label.setBounds(50, 20, 230, 50);

        EmpUsername_Label.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        EmpUsername_Label.setText("Username");
        EmpLogin_Panel.add(EmpUsername_Label);
        EmpUsername_Label.setBounds(20, 120, 170, 30);

        EmpPassword_Label.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        EmpPassword_Label.setText("Password");
        EmpLogin_Panel.add(EmpPassword_Label);
        EmpPassword_Label.setBounds(20, 200, 100, 30);
        EmpLogin_Panel.add(EmpUser_TextField);
        EmpUser_TextField.setBounds(40, 150, 250, 30);

        Emp_EnterButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        Emp_EnterButton.setText("enter");
        Emp_EnterButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Emp_EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_EnterButtonActionPerformed(evt);
            }
        });
        EmpLogin_Panel.add(Emp_EnterButton);
        Emp_EnterButton.setBounds(60, 380, 100, 30);

        Emp_BackButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        Emp_BackButton.setText("back");
        Emp_BackButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Emp_BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_BackButtonActionPerformed(evt);
            }
        });
        EmpLogin_Panel.add(Emp_BackButton);
        Emp_BackButton.setBounds(180, 380, 100, 30);
        EmpLogin_Panel.add(EmpPassword_PasswordField);
        EmpPassword_PasswordField.setBounds(40, 230, 250, 30);

        EmpLogin_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/Images/Background logo.jpg"))); // NOI18N
        EmpLogin_Panel.add(EmpLogin_Background);
        EmpLogin_Background.setBounds(0, 0, 330, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EmpLogin_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EmpLogin_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Emp_BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_BackButtonActionPerformed

        try 
        {
            con.close();
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
        
        Homepage frame = new Homepage();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Emp_BackButtonActionPerformed

    private void Emp_EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_EnterButtonActionPerformed
        
        PreparedStatement ps;
        ResultSet rs;
        String QUERY;
        String username = EmpUser_TextField.getText();
        String password = String.valueOf(EmpPassword_PasswordField.getPassword());
        
        if (username.equals("") || password.equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Please fill all data", "Error", 2);
        } 
        
        else 
        {
            try 
            {
                QUERY = "SELECT * FROM Employee WHERE EUsername =? AND EPassword =?";

                ps = con.prepareStatement(QUERY);

                ps.setString(1, username);
                ps.setString(2, password);

                rs = ps.executeQuery();

                if (rs.next()) 
                {

                    EmpHomepage frame = new EmpHomepage();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                    this.setVisible(false);
                } 
                
                else 
                {
                    JOptionPane.showMessageDialog(null, "Unregistered user", "Login Failed", 2);
                }

            }//try
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, ex, "Failed", 2);
            }

        }
    }//GEN-LAST:event_Emp_EnterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmpLogin_Background;
    private javax.swing.JLabel EmpLogin_Label;
    private javax.swing.JPanel EmpLogin_Panel;
    private javax.swing.JLabel EmpPassword_Label;
    private javax.swing.JPasswordField EmpPassword_PasswordField;
    private javax.swing.JTextField EmpUser_TextField;
    private javax.swing.JLabel EmpUsername_Label;
    private javax.swing.JButton Emp_BackButton;
    private javax.swing.JButton Emp_EnterButton;
    // End of variables declaration//GEN-END:variables
}
