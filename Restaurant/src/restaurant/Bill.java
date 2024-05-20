package restaurant;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.print.PrinterJob;
import java.awt.print.Printable;
import java.awt.print. PrinterException;
import java.awt.Graphics;
import java.awt.print. PageFormat;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import restaurant.Homepage;

public class Bill extends javax.swing.JFrame {
 

    
    
    private static String DEFAULT_QUERY= "SELECT * From customer";
    
    private Connection connection=null;
    private Statement statement=null;
    private ResultSet resultSet=null;
    
    int CustomerNO=CustomerLogin.id;
      double subTotal=0;
      int orderID=0;
      
    public void openDB(){
        try{
            connection=DriverManager.getConnection(Restaurant.DATABASE_URL,Restaurant.USER,Restaurant.PASS);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(DEFAULT_QUERY);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    public void closeDB(){
        try{
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch(SQLException ex){
            ex.printStackTrace();
            
        }
    }/**
     * Creates new form Bill
     */

    public Bill() {
        
        super("Bill");
        initComponents();
        setIconImage();
        
        
              //get order_ID and sub total price, set price after tax 
       try
        {
            connection=DriverManager.getConnection(Restaurant.DATABASE_URL,Restaurant.USER,Restaurant.PASS);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery("select Orders_ID, Total"
                    + " from Orders"
                    + " where Customer_NO = "+CustomerNO);
            
            
            while(resultSet.next())
            {   
                orderID = resultSet.getInt("Orders_ID");
                jTextField_orderID_var.setText(Integer.toString(orderID));
                
                //total
                String st= String.valueOf(resultSet.getDouble("Total"));
                jTextField_TotalNum.setText(st);
                
            }
                
                
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
       
        //insert data to Mysql
        try
        {
            
            String insert = "INSERT INTO Bill (Customer_NO, Orders_ID) VALUES(?,?)";
            Connection con =DriverManager.getConnection(Restaurant.DATABASE_URL,Restaurant.USER,Restaurant.PASS);
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setInt(1,CustomerNO);
            ps.setInt(2,orderID);
            ps.executeUpdate();
            
            ps=con.prepareStatement("SELECT DPurchase FROM bill where Customer_NO = ? AND Orders_ID = ?");
            ps.setInt(1, CustomerNO);
            ps.setInt(2, orderID);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                jTextField_Date_var.setText(rs.getString("DPurchase"));
            }
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
        try
        {
            //connection=DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
            //statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery("SELECT Item, Item_quantity, Price\n" +
                        "FROM cart\n" +
                        "INNER JOIN menu \n" +
                        "WHERE Customer_NO = "+CustomerNO+" and cart.Item_ID = menu.Item_ID;");
            DefaultTableModel model=(DefaultTableModel)cartTable.getModel();
            model.setRowCount(0);
            
            while(resultSet.next())
            {
                
                Object o[] = {resultSet.getString("Item"),resultSet.getInt("Item_quantity"),resultSet.getInt("Price")*resultSet.getInt("Item_quantity"),};
            model.addRow(o);
            //calc sub total
            
            subTotal=subTotal+resultSet.getInt("Price")*resultSet.getInt("Item_quantity");
            //jTextField_subTotalNum.setText(Double.toString(subTotal));
   
            }
            jTextField_subTotalNum.setText(Double.toString(subTotal));
            }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
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

        jPanel1 = new javax.swing.JPanel();
        Bill_Label = new javax.swing.JLabel();
        jLabel_OrderID = new javax.swing.JLabel();
        jLabel_Date = new javax.swing.JLabel();
        jLabel_bounders2 = new javax.swing.JLabel();
        jLabel_bounders3 = new javax.swing.JLabel();
        jLabel_TK = new javax.swing.JLabel();
        jLabel_subTotal = new javax.swing.JLabel();
        jLabel_TAX = new javax.swing.JLabel();
        jLabel_Total = new javax.swing.JLabel();
        jLabel_TAXnum = new javax.swing.JTextField();
        jLabel_TotalSAR = new javax.swing.JTextField();
        jLabel_subTotalSAR = new javax.swing.JTextField();
        jTextField_orderID_var = new javax.swing.JTextField();
        jTextField_Date_var = new javax.swing.JTextField();
        jTextField_subTotalNum = new javax.swing.JTextField();
        jTextField_TotalNum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_Print = new javax.swing.JButton();
        jButton_HP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        Bill_Label.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        Bill_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bill_Label.setText("good taste Restaurant ");
        jPanel1.add(Bill_Label);
        Bill_Label.setBounds(0, 10, 330, 40);

        jLabel_OrderID.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 15)); // NOI18N
        jLabel_OrderID.setText("Order ID");
        jPanel1.add(jLabel_OrderID);
        jLabel_OrderID.setBounds(40, 50, 90, 16);

        jLabel_Date.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 15)); // NOI18N
        jLabel_Date.setText("Date");
        jPanel1.add(jLabel_Date);
        jLabel_Date.setBounds(40, 80, 90, 16);

        jLabel_bounders2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_bounders2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_bounders2.setText("-------------------------------------------------------");
        jPanel1.add(jLabel_bounders2);
        jLabel_bounders2.setBounds(0, 110, 330, 20);

        jLabel_bounders3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_bounders3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_bounders3.setText("-------------------------------------------------------");
        jPanel1.add(jLabel_bounders3);
        jLabel_bounders3.setBounds(0, 440, 330, 20);

        jLabel_TK.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel_TK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TK.setText("THANK YOU");
        jPanel1.add(jLabel_TK);
        jLabel_TK.setBounds(0, 450, 330, 40);

        jLabel_subTotal.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel_subTotal.setText("Sub total: ");
        jPanel1.add(jLabel_subTotal);
        jLabel_subTotal.setBounds(10, 360, 100, 30);

        jLabel_TAX.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel_TAX.setText("Tax: ");
        jPanel1.add(jLabel_TAX);
        jLabel_TAX.setBounds(10, 390, 100, 30);

        jLabel_Total.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel_Total.setText("Total: ");
        jPanel1.add(jLabel_Total);
        jLabel_Total.setBounds(10, 420, 100, 30);

        jLabel_TAXnum.setEditable(false);
        jLabel_TAXnum.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_TAXnum.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jLabel_TAXnum.setText("15%");
        jLabel_TAXnum.setBorder(null);
        jLabel_TAXnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabel_TAXnumActionPerformed(evt);
            }
        });
        jPanel1.add(jLabel_TAXnum);
        jLabel_TAXnum.setBounds(120, 390, 70, 20);

        jLabel_TotalSAR.setEditable(false);
        jLabel_TotalSAR.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_TotalSAR.setFont(new java.awt.Font("Simplified Arabic", 1, 14)); // NOI18N
        jLabel_TotalSAR.setText("SAR");
        jLabel_TotalSAR.setBorder(null);
        jLabel_TotalSAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabel_TotalSARActionPerformed(evt);
            }
        });
        jPanel1.add(jLabel_TotalSAR);
        jLabel_TotalSAR.setBounds(200, 420, 70, 20);

        jLabel_subTotalSAR.setEditable(false);
        jLabel_subTotalSAR.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_subTotalSAR.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jLabel_subTotalSAR.setText("SAR");
        jLabel_subTotalSAR.setBorder(null);
        jLabel_subTotalSAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabel_subTotalSARActionPerformed(evt);
            }
        });
        jPanel1.add(jLabel_subTotalSAR);
        jLabel_subTotalSAR.setBounds(200, 360, 70, 20);

        jTextField_orderID_var.setEditable(false);
        jTextField_orderID_var.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_orderID_var.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTextField_orderID_var.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jTextField_orderID_var);
        jTextField_orderID_var.setBounds(150, 50, 70, 20);

        jTextField_Date_var.setEditable(false);
        jTextField_Date_var.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Date_var.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTextField_Date_var.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField_Date_var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Date_varActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_Date_var);
        jTextField_Date_var.setBounds(150, 80, 140, 20);

        jTextField_subTotalNum.setEditable(false);
        jTextField_subTotalNum.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_subTotalNum.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTextField_subTotalNum.setBorder(null);
        jPanel1.add(jTextField_subTotalNum);
        jTextField_subTotalNum.setBounds(120, 360, 70, 20);

        jTextField_TotalNum.setEditable(false);
        jTextField_TotalNum.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_TotalNum.setFont(new java.awt.Font("Simplified Arabic", 1, 14)); // NOI18N
        jTextField_TotalNum.setBorder(null);
        jPanel1.add(jTextField_TotalNum);
        jTextField_TotalNum.setBounds(120, 420, 70, 20);

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Qty", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cartTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 310, 190);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/Images/Background logo.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 330, 570);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton_Print.setText("Print");
        jButton_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrintActionPerformed(evt);
            }
        });

        jButton_HP.setText("Homepage");
        jButton_HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_HP, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Print, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton_HP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_TAXnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabel_TAXnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_TAXnumActionPerformed

    private void jLabel_TotalSARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabel_TotalSARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_TotalSARActionPerformed

    private void jLabel_subTotalSARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabel_subTotalSARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_subTotalSARActionPerformed

    private void jButton_HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HPActionPerformed
        // TODO add your handling code here:
        
         // go to Homepage
         try{
        statement.executeUpdate("DELETE FROM Cart WHERE Customer_NO="+CustomerNO);
        statement.executeUpdate("DELETE FROM Bill WHERE Customer_NO="+CustomerNO);
        statement.executeUpdate("DELETE FROM Orders WHERE Customer_NO="+CustomerNO);
        
        CustHomepage frame = new CustHomepage();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        this.setVisible(false);
         }
         catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "the eroro"+ex);
         }

    }//GEN-LAST:event_jButton_HPActionPerformed

    private void jButton_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PrintActionPerformed
        // TODO add your handling code here:
        
         // TODO add your handling code here:
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("print bill");
        
        job.setPrintable(new Printable(){
             public int print(Graphics pg, PageFormat pf, int pageNum){
        if (pageNum > 0) {
            return Printable.NO_SUCH_PAGE;
        }
        Graphics2D g2 = (Graphics2D) pg;
        g2.translate(pf.getImageableX(), pf.getImageableY());
        g2.scale(0.24, 0.24);
        
        jPanel1.paint(g2);
        return Printable.PAGE_EXISTS;
        }
        });
        boolean ok = job.printDialog();
        if(ok){
            try{
                job.print();
            }
            catch(PrinterException ex){}
        }

    }//GEN-LAST:event_jButton_PrintActionPerformed

    private void jTextField_Date_varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Date_varActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Date_varActionPerformed

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bill_Label;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton jButton_HP;
    private javax.swing.JButton jButton_Print;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Date;
    private javax.swing.JLabel jLabel_OrderID;
    private javax.swing.JLabel jLabel_TAX;
    private javax.swing.JTextField jLabel_TAXnum;
    private javax.swing.JLabel jLabel_TK;
    private javax.swing.JLabel jLabel_Total;
    private javax.swing.JTextField jLabel_TotalSAR;
    private javax.swing.JLabel jLabel_bounders2;
    private javax.swing.JLabel jLabel_bounders3;
    private javax.swing.JLabel jLabel_subTotal;
    private javax.swing.JTextField jLabel_subTotalSAR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_Date_var;
    private javax.swing.JTextField jTextField_TotalNum;
    private javax.swing.JTextField jTextField_orderID_var;
    private javax.swing.JTextField jTextField_subTotalNum;
    // End of variables declaration//GEN-END:variables
}
