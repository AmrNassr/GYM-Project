/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymm;

import java.awt.ComponentOrientation;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author amnassar
 */
public final class msrofat extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
       Connection con ;
    PreparedStatement pst ;
    ResultSet rs;
     public String y ;
    public String datee;
      public  Calendar cal;
      String dayyy;
   
    public msrofat() {
        initComponents();
        con=DBConnect.connect();
         clear();
         msroffat();
         comboxfromcombo1();
         AutoCompleteDecorator.decorate(cmtype);
         cal = new GregorianCalendar();
            
                int monthh=cal.get(Calendar.MONTH)+1;
                int yearr = cal.get(Calendar.YEAR);
                 int dayy =cal.get(Calendar.DAY_OF_MONTH);
             dayyy=String.valueOf(dayy);
 if(dayy == 1 || dayy == 2 || dayy == 3 || dayy == 4
         || dayy == 5 || dayy == 6 || dayy == 7 || dayy == 8 || dayy == 9 )
 {
      dayyy=String.valueOf(dayy);
     dayyy="0"+dayyy;
 }
               
           date1.setText(yearr+"-"+monthh+"-"+dayyy);
           datee=date1.getText().toString(); 
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        cmkind = new javax.swing.JComboBox();
        delete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmtype4 = new javax.swing.JComboBox();
        save1 = new javax.swing.JButton();
        save3 = new javax.swing.JButton();
        typename = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cmtype = new javax.swing.JComboBox();
        save = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        amount1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmtype1 = new javax.swing.JComboBox();
        amount = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        comment = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serialid = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/71847608-close-up-of-handshake-on-city-background-with-abstract-sunlight-partnership-concept-double-exposure.jpg"))); // NOI18N

        setMaximumSize(new java.awt.Dimension(980, 690));
        setMinimumSize(new java.awt.Dimension(980, 690));
        setPreferredSize(new java.awt.Dimension(980, 690));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(90, 34));
        jPanel10.setPreferredSize(new java.awt.Dimension(970, 690));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmkind.setEditable(true);
        cmkind.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Treasury", "Personal" }));
        jPanel10.add(cmkind, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 130, 30));

        delete.setBackground(new java.awt.Color(156, 166, 187));
        delete.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel10.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 180, 50));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel13.setText("Expenses");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 180, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel18.setText("Type");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 90, -1));

        cmtype4.setEditable(true);
        cmtype4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmtype4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel10.add(cmtype4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 210, 30));

        save1.setBackground(new java.awt.Color(156, 166, 187));
        save1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save1.setText("بحث");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel10.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 100, 30));

        save3.setBackground(new java.awt.Color(156, 166, 187));
        save3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save3.setText("Add");
        save3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save3ActionPerformed(evt);
            }
        });
        jPanel10.add(save3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 120, 40));

        typename.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(typename, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 200, 30));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel28.setText("Type");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 110, -1));

        cmtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel10.add(cmtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 210, 30));

        save.setBackground(new java.awt.Color(156, 166, 187));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel10.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 180, 40));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel24.setText("Amount");
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 100, 40));

        amount1.setEditable(false);
        amount1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(amount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, 70, 30));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel25.setText("Amount");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 100, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel17.setText("Comment");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 110, 60));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setText("Date");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 190, -1));

        cmtype1.setEditable(true);
        cmtype1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel10.add(cmtype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 210, 30));

        amount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 70, 50));

        comment.setColumns(20);
        comment.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        comment.setRows(5);
        comment.setText("\n");
        jScrollPane2.setViewportView(comment);

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 310, 70));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 570, 370));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 270, 370));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        serialid.setText("jLabel1");
        jPanel10.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        date1.setText("date");
        jPanel10.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
                       try
        {
             int amountt = Integer.parseInt(amount.getText());
        
                   if(cmtype.getSelectedItem().toString().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Please Enter Type");
                }
                else
                {
                     java.util.Date date = cal.getTime();
                                      int mHour = date.getHours();
                                  int mMinute = date.getMinutes();
                                 String dateee=datee+" "+mHour+":"+mMinute;
                     int dialogButton = JOptionPane.YES_NO_OPTION;
                   int dialogResult = JOptionPane.showConfirmDialog(this, "Do You want to save Process", "Confirmation ", dialogButton);
                if(dialogResult == 0) {
                        try{
                            String sql = "INSERT INTO gym.msrofat (kind,type,amount,comment,date,fulldatee) VALUES"
                            + " ('"+cmkind.getSelectedItem().toString()+"','"+cmtype.getSelectedItem().toString()+"','"+amountt+"','"+comment.getText()+"','"+date1.getText().toString()+"','"+dateee+"')";
                            pst = (PreparedStatement)con.prepareStatement(sql);
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Expenses Added successfully");
                            clear();

                        }
                        catch(Exception e ){
                            JOptionPane.showMessageDialog(null,e);
                        }

                    }
                    else
                    {JOptionPane.showMessageDialog(this, "Canceled");

                    }
                    
                }  
                   }
                       catch(Exception e )
                       {
                           JOptionPane.showMessageDialog(this, "Wrong Amount");
                       }
                
               
                
               
              
                

    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

                           try {
                String sql = "DELETE FROM gym.msrofat WHERE (type='"+cmtype4.getSelectedItem().toString()+"' and fulldatee = '"+cmtype1.getSelectedItem().toString()+"');";
                pst=(PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(rootPane, " Deleted successfully");
                cmtype4.setSelectedIndex(0);
                cmtype1.setSelectedIndex(0);
                amount1.setText("");
            } catch (SQLException ex) {
                
            }
           
    }//GEN-LAST:event_deleteActionPerformed

    private void save3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save3ActionPerformed
        String namee = typename.getText();
  if( typename.getText().trim().isEmpty() )
            {
                JOptionPane.showMessageDialog(this, " Please Enter Type Name");
            }
            else
            {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Do You want to save Process", "Confirmation ", dialogButton);
                if(dialogResult == 0) {
                    try{
                        String sql = "INSERT INTO gym.types (name) VALUES"
                        + " ('"+namee+"')";
                        pst = (PreparedStatement)con.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Type added successfully");
                        typename.setText("");
                        
                        cmtype.addItem(namee);

                    }
                    catch(Exception e ){
                        JOptionPane.showMessageDialog(null,"Already exists");
                    }

                }
                else
                {JOptionPane.showMessageDialog(this, "Canceled");

                }

            }
        
    }//GEN-LAST:event_save3ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed

        try
        {

            String sqll="SELECT distinct fulldatee FROM gym.msrofat  where 1=1 ";

            pst=(PreparedStatement) con.prepareStatement(sqll);

            rs=pst.executeQuery();

            while(rs.next()){

                String name = rs.getString("fulldatee");

                cmtype1.removeItem(name);

            }

        }

        catch(Exception ex)

        {
            JOptionPane.showMessageDialog(null,ex);
        }

        try {
            String namee=cmtype4.getSelectedItem().toString();
            String sql="SELECT * FROM gym.msrofat where 1=1 ";

            if(!cmtype4.getSelectedItem().toString().trim().isEmpty())

            {

                sql=sql+" AND type ='"+namee+"'";

            }

            pst=(PreparedStatement) con.prepareStatement(sql);

            rs=pst.executeQuery();

            while(rs.next()){

                String name = rs.getString("fulldatee");

                cmtype1.addItem(name);

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,ex);

        }
    }//GEN-LAST:event_save1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField amount1;
    private javax.swing.JComboBox cmkind;
    private javax.swing.JComboBox cmtype;
    private javax.swing.JComboBox cmtype1;
    private javax.swing.JComboBox cmtype4;
    private javax.swing.JTextArea comment;
    private javax.swing.JLabel date1;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JButton save3;
    private javax.swing.JLabel serialid;
    private javax.swing.JTextField typename;
    // End of variables declaration//GEN-END:variables
public void clear()
{
    typename.setText("");  
    comment.setText(""); 
    cmtype.setSelectedIndex(0);
    amount.setText("");
    
}
public void msroffat()
   {
        try {
             String sql="SELECT name  FROM gym.types ";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String name = rs.getString("name");
                
                cmtype.addItem(name);
                cmtype4.addItem(name);
  
             }

         } catch (SQLException ex) {
             
         }
   }

 public void comboxfromcombo1()
      {
            cmtype1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmsupplier = (JComboBox) event.getSource();

                Object item = event.getItem();
                
                 try {
             String sql="SELECT * FROM gym.msrofat where type='"+cmtype4.getSelectedItem().toString()+"' and fulldatee='"+cmtype1.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
               amount1.setText(rs.getString("amount"));
              }

         } catch (SQLException ex) {
             
         }
                 
         }
        });
       
      }
 


}