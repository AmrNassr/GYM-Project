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
public final class itemm extends javax.swing.JInternalFrame {

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
    
   
    public itemm( )throws IOException {
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
           total.setText("0");
  
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
        neww = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        serial = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        save1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        serialid = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        half1 = new javax.swing.JTextField();

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "serial", "Name", "number", "price"
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

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 920, 280));

        neww.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        neww.setText("0");
        jPanel10.add(neww, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 70, 30));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel22.setText("Price");
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, -1));

        price.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        price.setText("0");
        jPanel10.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 70, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setText("New");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 50, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setText("Number");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, -1));

        total.setEditable(false);
        total.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        total.setText("0");
        jPanel10.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 70, 30));

        name.setEditable(false);
        name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 210, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setText("Name");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, -1));

        serial.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        serial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serialKeyPressed(evt);
            }
        });
        jPanel10.add(serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 210, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setText("Serial");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, -1));

        save1.setBackground(new java.awt.Color(138, 203, 195));
        save1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save1.setText("Save");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel10.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 200, 50));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        serialid.setText("jLabel1");
        jPanel10.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        date1.setText("jLabel1");
        jPanel10.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, -1, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setText("Number");
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, -1));

        half1.setEditable(false);
        half1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        half1.setText("0");
        jPanel10.add(half1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 70, 30));

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
        {
            TimeZone tz = TimeZone.getTimeZone("GMT+02");
             Calendar c = Calendar.getInstance(tz);
             String time = String.format("%02d" , c.get(Calendar.HOUR_OF_DAY))+":"+
             String.format("%02d" , c.get(Calendar.MINUTE));
             String fulldatee=datee+" "+time;
             String namee = name.getText();
             
             int pricee= Integer.parseInt(price.getText());
             int  number= Integer.parseInt(total.getText());
             int newww= Integer.parseInt(neww.getText());
             int all = number+newww;
             int amount=newww*pricee;
            try {
                String sqlsdd="SELECT serial FROM gym.item where serial='"+serial.getText()+"'";
               pst=(PreparedStatement) con.prepareStatement(sqlsdd);
               rs=pst.executeQuery();
               if(rs.next()){
                    String sqla = "UPDATE gym.item SET total='"+all+"' where name = '"+namee+"' and serial = '"+serial.getText()+"'";
                  pst=(PreparedStatement) con.prepareStatement(sqla);
                  pst.executeUpdate();
                  JOptionPane.showMessageDialog(this, "item added Successfully");
                   clear();
                   tablelord();
               
               }
               else
               {
                   String sqll3 = "INSERT INTO gym.item (serial,name,price,total) VALUES"
                     + " ('"+serial.getText()+"','"+namee+"','"+pricee+"','"+all+"')";
             pst = (PreparedStatement)con.prepareStatement(sqll3);
             pst.execute();
             String sqll4 = "INSERT INTO gym.logs (type,serial,name,price,amount,date,fulldate,number) VALUES"
                     + " ('buy','"+serial.getText()+"','"+namee+"','"+pricee+"','"+amount+"','"+datee+"','"+fulldatee+"','"+newww+"')";
             pst = (PreparedStatement)con.prepareStatement(sqll4);
             pst.execute();
             tablelord();
             clear();
               }
            
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, ex);
         }
             
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        

     
    }//GEN-LAST:event_save1ActionPerformed

    private void tdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetailsMouseClicked
        DefaultTableModel tmodel =(DefaultTableModel)tdetails.getModel();
        //bid,name, price, publisher, book_type, b_code, date, category
        int selectrowindex=tdetails.getSelectedRow();
    }//GEN-LAST:event_tdetailsMouseClicked

    private void serialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serialKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
           try {
               String sqls="SELECT serial FROM gym.item where serial='"+serial.getText()+"'";
               pst=(PreparedStatement) con.prepareStatement(sqls);
               rs=pst.executeQuery();
               if(rs.next()){
                String sqlsa="SELECT * FROM gym.item where serial='"+serial.getText()+"'";
               pst=(PreparedStatement) con.prepareStatement(sqlsa);
               rs=pst.executeQuery();
               if(rs.next()){
                   total.setText(rs.getString("total"));
                   name.setText(rs.getString("name"));
                   price.setText(rs.getString("price"));
               }
               }
               else
               {
                   name.setEditable(true);
                   name.requestFocus();
               }
           } catch (SQLException ex) {
               Logger.getLogger(itemm.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
    }//GEN-LAST:event_serialKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date1;
    private javax.swing.JTextField half1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField neww;
    private javax.swing.JTextField price;
    private javax.swing.JButton save1;
    private javax.swing.JTextField serial;
    private javax.swing.JLabel serialid;
    private javax.swing.JTable tdetails;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
public void clear()
{
    serial.setText(""); 
    serialid.setText(""); 
    name.setText("");
    total.setText("");
    neww.setText("");
    price.setText("");
    name.setEditable(false);

}
public void tablelord()
{
    try {
           String sqll = "SELECT * FROM gym.item";
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
                        rs.getString("total"),
                        rs.getString("price"),
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
