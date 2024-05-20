package restaurant;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Feedback extends javax.swing.JFrame {

    /**
     * Creates new form Feedback
     */
    Connection con;
    
    public Feedback() 
    {
        super("Feedback");
        initComponents();
        setIconImage();
        
        Suggestion_TextField.setLineWrap(true);
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        Feedback_Panel = new javax.swing.JPanel();
        Feedback_Label = new javax.swing.JLabel();
        FoodQuality_Label = new javax.swing.JLabel();
        Service_Label = new javax.swing.JLabel();
        Cleanness_Label = new javax.swing.JLabel();
        FoodQuality_RadioButton1 = new javax.swing.JRadioButton();
        FoodQuality_RadioButton2 = new javax.swing.JRadioButton();
        FoodQuality_RadioButton3 = new javax.swing.JRadioButton();
        FoodQuality_RadioButton4 = new javax.swing.JRadioButton();
        FoodQuality_RadioButton5 = new javax.swing.JRadioButton();
        Service_RadioButton1 = new javax.swing.JRadioButton();
        Service_RadioButton2 = new javax.swing.JRadioButton();
        Service_RadioButton3 = new javax.swing.JRadioButton();
        Service_RadioButton4 = new javax.swing.JRadioButton();
        Service_RadioButton5 = new javax.swing.JRadioButton();
        Cleanness_RadioButton1 = new javax.swing.JRadioButton();
        Cleanness_RadioButton2 = new javax.swing.JRadioButton();
        Cleanness_RadioButton3 = new javax.swing.JRadioButton();
        Cleanness_RadioButton4 = new javax.swing.JRadioButton();
        Cleanness_RadioButton5 = new javax.swing.JRadioButton();
        Suggestion_Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Suggestion_TextField = new javax.swing.JTextArea();
        Feedback_SubmitButton = new javax.swing.JButton();
        Feedback_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Feedback_Panel.setLayout(null);

        Feedback_Label.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        Feedback_Label.setText("Feedback");
        Feedback_Panel.add(Feedback_Label);
        Feedback_Label.setBounds(60, 20, 210, 60);

        FoodQuality_Label.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        FoodQuality_Label.setText("Food quality");
        Feedback_Panel.add(FoodQuality_Label);
        FoodQuality_Label.setBounds(20, 90, 140, 30);

        Service_Label.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        Service_Label.setText("Service");
        Feedback_Panel.add(Service_Label);
        Service_Label.setBounds(20, 160, 80, 30);

        Cleanness_Label.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        Cleanness_Label.setText("Cleanness");
        Feedback_Panel.add(Cleanness_Label);
        Cleanness_Label.setBounds(20, 230, 100, 30);

        FoodQuality_RadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(FoodQuality_RadioButton1);
        FoodQuality_RadioButton1.setText("1");
        Feedback_Panel.add(FoodQuality_RadioButton1);
        FoodQuality_RadioButton1.setBounds(40, 120, 40, 30);

        FoodQuality_RadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(FoodQuality_RadioButton2);
        FoodQuality_RadioButton2.setText("2");
        Feedback_Panel.add(FoodQuality_RadioButton2);
        FoodQuality_RadioButton2.setBounds(90, 120, 40, 30);

        FoodQuality_RadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(FoodQuality_RadioButton3);
        FoodQuality_RadioButton3.setText("3");
        Feedback_Panel.add(FoodQuality_RadioButton3);
        FoodQuality_RadioButton3.setBounds(140, 120, 40, 30);

        FoodQuality_RadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(FoodQuality_RadioButton4);
        FoodQuality_RadioButton4.setText("4");
        Feedback_Panel.add(FoodQuality_RadioButton4);
        FoodQuality_RadioButton4.setBounds(190, 120, 40, 30);

        FoodQuality_RadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(FoodQuality_RadioButton5);
        FoodQuality_RadioButton5.setText("5");
        Feedback_Panel.add(FoodQuality_RadioButton5);
        FoodQuality_RadioButton5.setBounds(240, 120, 50, 30);

        Service_RadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(Service_RadioButton1);
        Service_RadioButton1.setText("1");
        Feedback_Panel.add(Service_RadioButton1);
        Service_RadioButton1.setBounds(40, 190, 40, 30);

        Service_RadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(Service_RadioButton2);
        Service_RadioButton2.setText("2");
        Feedback_Panel.add(Service_RadioButton2);
        Service_RadioButton2.setBounds(90, 190, 40, 30);

        Service_RadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(Service_RadioButton3);
        Service_RadioButton3.setText("3");
        Feedback_Panel.add(Service_RadioButton3);
        Service_RadioButton3.setBounds(140, 190, 40, 30);

        Service_RadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(Service_RadioButton4);
        Service_RadioButton4.setText("4");
        Feedback_Panel.add(Service_RadioButton4);
        Service_RadioButton4.setBounds(190, 190, 40, 30);

        Service_RadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(Service_RadioButton5);
        Service_RadioButton5.setText("5");
        Feedback_Panel.add(Service_RadioButton5);
        Service_RadioButton5.setBounds(240, 190, 40, 30);

        Cleanness_RadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(Cleanness_RadioButton1);
        Cleanness_RadioButton1.setText("1");
        Cleanness_RadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cleanness_RadioButton1ActionPerformed(evt);
            }
        });
        Feedback_Panel.add(Cleanness_RadioButton1);
        Cleanness_RadioButton1.setBounds(40, 260, 40, 30);

        Cleanness_RadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(Cleanness_RadioButton2);
        Cleanness_RadioButton2.setText("2");
        Feedback_Panel.add(Cleanness_RadioButton2);
        Cleanness_RadioButton2.setBounds(90, 260, 40, 30);

        Cleanness_RadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(Cleanness_RadioButton3);
        Cleanness_RadioButton3.setText("3");
        Feedback_Panel.add(Cleanness_RadioButton3);
        Cleanness_RadioButton3.setBounds(140, 260, 40, 30);

        Cleanness_RadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(Cleanness_RadioButton4);
        Cleanness_RadioButton4.setText("4");
        Feedback_Panel.add(Cleanness_RadioButton4);
        Cleanness_RadioButton4.setBounds(190, 260, 40, 30);

        Cleanness_RadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(Cleanness_RadioButton5);
        Cleanness_RadioButton5.setText("5");
        Feedback_Panel.add(Cleanness_RadioButton5);
        Cleanness_RadioButton5.setBounds(240, 260, 40, 30);

        Suggestion_Label.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        Suggestion_Label.setText("Suggestion");
        Feedback_Panel.add(Suggestion_Label);
        Suggestion_Label.setBounds(110, 300, 110, 30);

        Suggestion_TextField.setColumns(20);
        Suggestion_TextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Suggestion_TextField.setRows(5);
        Suggestion_TextField.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Suggestion_TextField);

        Feedback_Panel.add(jScrollPane1);
        jScrollPane1.setBounds(50, 330, 230, 80);

        Feedback_SubmitButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        Feedback_SubmitButton.setText("Submit");
        Feedback_SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Feedback_SubmitButtonActionPerformed(evt);
            }
        });
        Feedback_Panel.add(Feedback_SubmitButton);
        Feedback_SubmitButton.setBounds(110, 420, 110, 30);

        Feedback_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/Images/Background logo.jpg"))); // NOI18N
        Feedback_Panel.add(Feedback_Background);
        Feedback_Background.setBounds(0, 0, 330, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Feedback_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Feedback_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cleanness_RadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cleanness_RadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cleanness_RadioButton1ActionPerformed

    private void Feedback_SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Feedback_SubmitButtonActionPerformed
        String FoodQuality = "";
        if (FoodQuality_RadioButton1.isSelected()) 
        {
            FoodQuality = "1";
        }
        else if (FoodQuality_RadioButton2.isSelected()) 
        {
            FoodQuality = "2";
        } 
        else if (FoodQuality_RadioButton3.isSelected()) 
        {
            FoodQuality = "3";
        } 
        else if (FoodQuality_RadioButton4.isSelected()) 
        {
            FoodQuality = "4";
        } 
        else if (FoodQuality_RadioButton5.isSelected()) 
        {
            FoodQuality = "5";
        }

        String Service = "";
        if (Service_RadioButton1.isSelected()) 
        {
            Service = "1";
        } 
        else if (Service_RadioButton2.isSelected()) 
        {
            Service = "2";
        } 
        else if (Service_RadioButton3.isSelected()) 
        {
            Service = "3";
        } 
        else if (Service_RadioButton4.isSelected()) 
        {
            Service = "4";
        } 
        else if (Service_RadioButton5.isSelected()) 
        {
            Service = "5";
        }

        String Cleanness = "";
        if (Cleanness_RadioButton1.isSelected()) 
        {
            Cleanness = "1";
        } 
        else if (Cleanness_RadioButton2.isSelected()) 
        {
            Cleanness = "2";
        } 
        else if (Cleanness_RadioButton3.isSelected()) 
        {
            Cleanness = "3";
        } 
        else if (Cleanness_RadioButton4.isSelected()) 
        {
            Cleanness = "4";
        } 
        else if (Cleanness_RadioButton5.isSelected()) 
        {
            Cleanness = "5";
        }
        
        String Suggestion = Suggestion_TextField.getText();
        if (Cleanness.equals("") || Service.equals("") || FoodQuality.equals("") || Suggestion.equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Please fill all data", "Error", 2);
        } 
        
        else 
        {
            try 
            {
                PreparedStatement ps;
                String QUERY = "insert into Feedback (Customer_NO, Service, Suggestion, Cleanness, FoodQuality) VALUES(?,?,?,?,?)";

                ps = con.prepareStatement(QUERY);

                ps.setInt(1, CustomerLogin.id);
                ps.setString(2, Service);
                ps.setString(3, Suggestion);
                ps.setString(4, Cleanness);
                ps.setString(5, FoodQuality);

                if (ps.executeUpdate() > 0) 
                {
                    try 
                    {
                        con.close();
                    }
                    catch (SQLException ex) 
                    {
                        ex.printStackTrace();
                    }
                    
                    JOptionPane.showMessageDialog(null, "We appreciate you sending us your feedback", "Done ", 1);
                    CustHomepage frame = new CustHomepage();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                    this.setVisible(false);
                } 
                
                else 
                {
                    JOptionPane.showMessageDialog(null, "Somthing wrong ", "error ", 2);
                } 
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, ex, "error ", 2);
            }
        }
        
    }//GEN-LAST:event_Feedback_SubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cleanness_Label;
    private javax.swing.JRadioButton Cleanness_RadioButton1;
    private javax.swing.JRadioButton Cleanness_RadioButton2;
    private javax.swing.JRadioButton Cleanness_RadioButton3;
    private javax.swing.JRadioButton Cleanness_RadioButton4;
    private javax.swing.JRadioButton Cleanness_RadioButton5;
    private javax.swing.JLabel Feedback_Background;
    private javax.swing.JLabel Feedback_Label;
    private javax.swing.JPanel Feedback_Panel;
    private javax.swing.JButton Feedback_SubmitButton;
    private javax.swing.JLabel FoodQuality_Label;
    private javax.swing.JRadioButton FoodQuality_RadioButton1;
    private javax.swing.JRadioButton FoodQuality_RadioButton2;
    private javax.swing.JRadioButton FoodQuality_RadioButton3;
    private javax.swing.JRadioButton FoodQuality_RadioButton4;
    private javax.swing.JRadioButton FoodQuality_RadioButton5;
    private javax.swing.JLabel Service_Label;
    private javax.swing.JRadioButton Service_RadioButton1;
    private javax.swing.JRadioButton Service_RadioButton2;
    private javax.swing.JRadioButton Service_RadioButton3;
    private javax.swing.JRadioButton Service_RadioButton4;
    private javax.swing.JRadioButton Service_RadioButton5;
    private javax.swing.JLabel Suggestion_Label;
    private javax.swing.JTextArea Suggestion_TextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}