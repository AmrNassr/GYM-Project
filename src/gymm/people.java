/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymm;
import java.awt.ComponentOrientation;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author amnassar
 */
public final class people extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
     Connection con ;
     PreparedStatement pst ;
     ResultSet rs;
     public String y ;
     public String datee;
     public  Calendar cal;
     String dayyy ;
    
   
    public people(String x )throws IOException, ParseException {
        initComponents();
        con=DBConnect.connect();
         clear();
         tablelord();
          TableCellRenderer rendererFromHeader = tdetails.getTableHeader().getDefaultRenderer();
JLabel headerLabel = (JLabel) rendererFromHeader;
headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tdetails.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
         tdetails.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
         tdetails.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
         tdetails.getColumnModel().getColumn(3).setCellRenderer( centerRenderer ); 
          cal = new GregorianCalendar();
             
                int month=cal.get(Calendar.MONTH)+1;
             int year = cal.get(Calendar.YEAR);
                 int dayy =cal.get(Calendar.DAY_OF_MONTH);
             dayyy=String.valueOf(dayy);
 if(dayy == 1 || dayy == 2 || dayy == 3 || dayy == 4
         || dayy == 5 || dayy == 6 || dayy == 7 || dayy == 8 || dayy == 9 )
 {
      dayyy=String.valueOf(dayy);
     dayyy="0"+dayyy;
 }
           date1.setText(year+"-"+month+"-"+dayyy);
           datee=date1.getText().toString();
   if(x.equals("admin"))
        {
            save2.setEnabled(true);
          
        }
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdetails = new javax.swing.JTable();
        dateofbirth = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        phone2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        save3 = new javax.swing.JButton();
        save2 = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
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

        tdetails.setBackground(new java.awt.Color(138, 203, 195));
        tdetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Serial", "Name", "Phone", "DateOfBirth", "address"
            }
        ));
        tdetails.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tdetails.setRowHeight(25);
        tdetails.setRowMargin(2);
        tdetails.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tdetails.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tdetails);
        if (tdetails.getColumnModel().getColumnCount() > 0) {
            tdetails.getColumnModel().getColumn(0).setMinWidth(100);
            tdetails.getColumnModel().getColumn(0).setPreferredWidth(100);
            tdetails.getColumnModel().getColumn(0).setMaxWidth(100);
            tdetails.getColumnModel().getColumn(2).setMinWidth(150);
            tdetails.getColumnModel().getColumn(2).setPreferredWidth(150);
            tdetails.getColumnModel().getColumn(2).setMaxWidth(150);
            tdetails.getColumnModel().getColumn(4).setMinWidth(1);
            tdetails.getColumnModel().getColumn(4).setPreferredWidth(1);
            tdetails.getColumnModel().getColumn(4).setMaxWidth(1);
        }

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 920, 230));

        dateofbirth.setDateFormatString("yyyy-MM-dd");
        jPanel10.add(dateofbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 230, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Date Of Birth");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel19.setText("Address");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, -1));

        address.setColumns(20);
        address.setRows(5);
        jScrollPane2.setViewportView(address);

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 270, 50));

        phone2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        phone2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phone2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phone2KeyReleased(evt);
            }
        });
        jPanel10.add(phone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 220, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setText("Serial");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 120, -1));

        phone.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 220, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setText("Phone");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("Name");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, -1));

        name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 220, 30));

        save3.setBackground(new java.awt.Color(138, 203, 195));
        save3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save3.setText("Print");
        save3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save3ActionPerformed(evt);
            }
        });
        jPanel10.add(save3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 180, 40));

        save2.setBackground(new java.awt.Color(138, 203, 195));
        save2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save2.setText("Delete");
        save2.setEnabled(false);
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });
        jPanel10.add(save2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 180, 40));

        save1.setBackground(new java.awt.Color(138, 203, 195));
        save1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save1.setText("Save");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel10.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 200, 50));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        serialid.setText("jLabel1");
        jPanel10.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        date1.setText("jLabel1");
        jPanel10.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, -1, -1));

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

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
          TimeZone tz = TimeZone.getTimeZone("GMT+02");
             Calendar c = Calendar.getInstance(tz);
             String time = String.format("%02d" , c.get(Calendar.HOUR_OF_DAY))+":"+
                     String.format("%02d" , c.get(Calendar.MINUTE));
             String fulldatee=datee+" "+time;
             String namee = name.getText();
             String phonee = phone.getText();
             String serial = phone2.getText();
             String addresss = address.getText();
             String dateofbirthh=((JTextField)dateofbirth.getDateEditor().getUiComponent()).getText();
             if(serialid.getText().trim().isEmpty())
             {
                 if(!name.getText().trim().isEmpty() || !phone.getText().trim().isEmpty())
                 {
                 try {
                     
            String sqll3 = "INSERT INTO gym.people (name,phone,date,dateofbirth,address,serial) VALUES"
                     + " ('"+namee+"','"+phonee+"','"+fulldatee+"','"+dateofbirthh+"','"+addresss+"','"+serial+"')";
             pst = (PreparedStatement)con.prepareStatement(sqll3);
             pst.execute();
             JOptionPane.showMessageDialog(this, "Customer Added Successfully");
             tablelord();
             clear();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "Customer already exists");
         }}
                 else
                 {
                     JOptionPane.showMessageDialog(this, "Please enter name and phone number");
                 }
             }
             else
             {
              try {
                  String sqla = "UPDATE gym.people SET name='"+namee+"',phone='"+phonee+"',serial='"+serial+"',address='"+addresss+"'"
                          + ",dateofbirth='"+dateofbirthh+"' where  serial='"+serialid.getText()+"'";
                  pst=(PreparedStatement) con.prepareStatement(sqla);
                  pst.executeUpdate();
                  JOptionPane.showMessageDialog(this, "Customer Updated Successfully");
                   clear();
                   tablelord();
              } catch (SQLException ex) {
                  Logger.getLogger(people.class.getName()).log(Level.SEVERE, null, ex);
              }
             }
            
        

     
    }//GEN-LAST:event_save1ActionPerformed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Save ?", "Confirmation", dialogButton);
                if(dialogResult == 0) {              
        try {
                String sql = " DELETE FROM gym.people WHERE serial='"+serialid.getText()+"' ";
                pst=(PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Customer Deleted Successfully");
                tablelord();
                 clear();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Customer Has data cann't delete it");
            }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Canceled");
                }
    }//GEN-LAST:event_save2ActionPerformed

    private void save3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save3ActionPerformed
/*InputStream in=null;
      try {
          
          
          String reportpath= "D:\\hossam\\afrad.jasper";
    Map<String,Object> para = new HashMap<String,Object>();
         JasperPrint j = JasperFillManager.fillReport(reportpath, para,con);
            JasperViewer.viewReport(j,false);
      }
     catch (JRException ex) {
         
          JOptionPane.showMessageDialog(null, ex);
        } finally {
        } */
    }//GEN-LAST:event_save3ActionPerformed

    private void tdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetailsMouseClicked
        DefaultTableModel tmodel =(DefaultTableModel)tdetails.getModel();
        //bid,name, price, publisher, book_type, b_code, date, category
        int selectrowindex=tdetails.getSelectedRow();
        name.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        phone2.setText(tmodel.getValueAt(selectrowindex, 0).toString());
         phone.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        serialid.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        address.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        ((JTextField)dateofbirth.getDateEditor().getUiComponent()).setText(tmodel.getValueAt(selectrowindex, 3).toString());
        phone2.setEditable(false);
        
       

    }//GEN-LAST:event_tdetailsMouseClicked

    private void phone2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone2KeyReleased
     
    }//GEN-LAST:event_phone2KeyReleased

    private void phone2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone2KeyPressed
 
         if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
             TimeZone tz = TimeZone.getTimeZone("GMT+02");
             Calendar c = Calendar.getInstance(tz);
             String time = String.format("%02d" , c.get(Calendar.HOUR_OF_DAY))+":"+
                     String.format("%02d" , c.get(Calendar.MINUTE));
             String fulldatee=datee+" "+time;
             String namee = name.getText();
             String phonee = phone.getText();
             String serial = phone2.getText();
             String addresss = address.getText();
        String dateofbirthh=((JTextField)dateofbirth.getDateEditor().getUiComponent()).getText();
        if(!name.getText().trim().isEmpty() || !phone.getText().trim().isEmpty())
                 {
                 try {
                      String sqll = "SELECT serial FROM gym.people where serial ='"+serial+"'";
              pst=(PreparedStatement) con.prepareStatement(sqll);
              rs=pst.executeQuery();
              if (rs.next())
                {
                    JOptionPane.showMessageDialog(this, "this id already exists");
                    phone2.setText("");
                 }
              else
              {
            String sqll3 = "INSERT INTO gym.people (name,phone,date,dateofbirth,address,serial) VALUES"
                     + " ('"+namee+"','"+phonee+"','"+fulldatee+"','"+dateofbirthh+"','"+addresss+"','"+serial+"')";
             pst = (PreparedStatement)con.prepareStatement(sqll3);
             pst.execute();
             JOptionPane.showMessageDialog(this, "Customer Added Successfully");
             tablelord();
             clear();}
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "Customer already exists");
         }}
                 else
                 {
                     JOptionPane.showMessageDialog(this, "Please enter name and phone number");
                 }
        }
    }//GEN-LAST:event_phone2KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JLabel date1;
    private com.toedter.calendar.JDateChooser dateofbirth;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField phone2;
    private javax.swing.JButton save1;
    private javax.swing.JButton save2;
    private javax.swing.JButton save3;
    private javax.swing.JLabel serialid;
    private javax.swing.JTable tdetails;
    // End of variables declaration//GEN-END:variables
public void clear()
{
    name.setText(""); 
    serialid.setText(""); 
    phone.setText(""); 
    phone2.setText("");
    address.setText("");
    phone2.setEditable(true);

}
public void tablelord()
{
    try {
           String sqll = "SELECT * FROM gym.people";
              pst=(PreparedStatement) con.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails.getModel(); 
                model.setRowCount(0);
              int k = 0;
                while (rs.next())
                {
                    Object row[] = {
                        rs.getString("serial"),
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getString("dateofbirth"),
                        rs.getString("address"),
                    
                    
                   
                 
                                };
                    model.addRow(row);
                    k++;
                }
                for(int i = k ;i<11;i++)
                {
                 Object rowData[] = {
                       "",
                     "",
                     "",
                     "",
                     "",
                     "",
                     "",
                     "",
                     "",
                     "",
                     "",
                     "",
                       };
                model.addRow(rowData);
                } 
        }
        catch (SQLException ex) {
            
        }
}
 
}