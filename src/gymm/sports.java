/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymm;
import java.awt.ComponentOrientation;
import java.awt.HeadlessException;
import java.awt.Image;
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
public final class sports extends javax.swing.JInternalFrame {

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
    
   
    public sports( )throws IOException {
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
         tdetails.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
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
        class1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        half = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
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
                "id", "Name", "price", "Hlaf month", "Class"
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
        }

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 920, 230));

        class1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(class1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 70, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setText("class");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setText("Half month");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, -1));

        half.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(half, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 70, 30));

        price.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 70, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setText("Month price");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, -1));

        name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 210, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setText("Name");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 80, -1));

        save2.setBackground(new java.awt.Color(138, 203, 195));
        save2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save2.setText("Delete");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });
        jPanel10.add(save2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 180, 40));

        save1.setBackground(new java.awt.Color(138, 203, 195));
        save1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save1.setText("Save");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel10.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 200, 50));

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
        try
        {TimeZone tz = TimeZone.getTimeZone("GMT+02");
             Calendar c = Calendar.getInstance(tz);
             String time = String.format("%02d" , c.get(Calendar.HOUR_OF_DAY))+":"+
                     String.format("%02d" , c.get(Calendar.MINUTE));
             String fulldatee=datee+" "+time;
             String namee = name.getText();
             int pricee= Integer.parseInt(price.getText());
             int halff= Integer.parseInt(half.getText());
             int classs= Integer.parseInt(class1.getText());
             if(serialid.getText().trim().isEmpty())
             {
                 try {
            String sqll3 = "INSERT INTO gym.sports (name,price,date,half,class) VALUES"
                     + " ('"+namee+"','"+pricee+"','"+fulldatee+"','"+halff+"','"+classs+"')";
             pst = (PreparedStatement)con.prepareStatement(sqll3);
             pst.execute();
             JOptionPane.showMessageDialog(this, "Sport Added Successfully");
             tablelord();
             clear();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, ex);
         }
             }
             else
             {
              try {
                  String sqla = "UPDATE gym.sports SET name='"+namee+"',price='"+pricee+"',date='"+fulldatee+"',half='"+halff+"',class='"+classs+"' where name = '"+name.getText()+"'";
                  pst=(PreparedStatement) con.prepareStatement(sqla);
                  pst.executeUpdate();
                  JOptionPane.showMessageDialog(this, "Sport Updated Successfully");
                   clear();
                   tablelord();
              } catch (SQLException ex) {
                  Logger.getLogger(sports.class.getName()).log(Level.SEVERE, null, ex);
              }
             }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Wrong Price");
        }
        

     
    }//GEN-LAST:event_save1ActionPerformed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Save ?", "Confirmation", dialogButton);
                if(dialogResult == 0) {              
        try {
                String sql = " DELETE FROM gym.sports WHERE id='"+serialid.getText()+"' ";
                pst=(PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Sport Deleted Successfully");
                tablelord();
                 clear();
            } catch (SQLException ex) {
JOptionPane.showMessageDialog(rootPane, ex);
            }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Canceled");
                }
    }//GEN-LAST:event_save2ActionPerformed

    private void tdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetailsMouseClicked
        DefaultTableModel tmodel =(DefaultTableModel)tdetails.getModel();
        //bid,name, price, publisher, book_type, b_code, date, category
        int selectrowindex=tdetails.getSelectedRow();
        name.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        serialid.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        price.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        half.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        class1.setText(tmodel.getValueAt(selectrowindex, 4).toString());
       
        
       

    }//GEN-LAST:event_tdetailsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField class1;
    private javax.swing.JLabel date1;
    private javax.swing.JTextField half;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JButton save1;
    private javax.swing.JButton save2;
    private javax.swing.JLabel serialid;
    private javax.swing.JTable tdetails;
    // End of variables declaration//GEN-END:variables
public void clear()
{
    name.setText(""); 
    serialid.setText(""); 
    price.setText("");
    half.setText("");
    class1.setText("");

}
public void tablelord()
{
    try {
           String sqll = "SELECT * FROM gym.sports";
              pst=(PreparedStatement) con.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails.getModel(); 
                model.setRowCount(0);
              int k = 0;
                while (rs.next())
                {
                    Object row[] = {
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("price"),
                        rs.getString("half"),
                        rs.getString("class"),
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