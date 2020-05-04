
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import javax.swing.JTextField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajeev Yadav
 */
public class CreateAccount extends javax.swing.JFrame {
    String Gender;
    int j=0;
    Connection con;
    String filename1,filename2;
    File f1=null,f2=null;
    FileInputStream fis1,fis2;
    byte[] p1,p2;

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
             con=DriverManager.getConnection("jdbc:derby://localhost:1527/Bank","ashish","ashish1212");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Connectio is failed");
        }
         initComponents();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        photo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(47, 107, 135));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Account");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(340, 50, 410, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome To :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 10, 180, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(270, 50, 610, 20);

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(0, 2, 10, 150);

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(1130, 0, 50, 50);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(1070, 0, 50, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CITY BANK");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(340, 10, 160, 30);

        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Customer Name :");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(90, 50, 140, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Branch :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(90, 100, 140, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Account Type :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(90, 150, 140, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Gender :");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(90, 190, 140, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("DOB :");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(90, 240, 140, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Email ID :");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(90, 290, 140, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Initial Deposit :");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(90, 390, 140, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Phone No :");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(90, 340, 140, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Address :");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(90, 440, 140, 30);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(250, 52, 220, 30);
        jPanel3.add(jTextField2);
        jTextField2.setBounds(250, 290, 190, 30);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField3);
        jTextField3.setBounds(250, 340, 160, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(250, 440, 330, 96);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Varanasi", "Allahabad", "Jaunpur", "Lucknow", "Delhi", "Bangalore", "Kolkata", "Panjab", "Hyderabad", " ", " " }));
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(250, 92, 130, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saving", "Current", "Fixed", "Deposite" }));
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(250, 150, 130, 30);

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jPanel3.add(jTextField4);
        jTextField4.setBounds(250, 390, 160, 30);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-name-100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6);
        jPanel6.setBounds(780, 90, 240, 250);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Profile Picture");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(830, 40, 140, 30);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-autograph-100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7);
        jPanel7.setBounds(1050, 90, 230, 250);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(830, 360, 150, 31);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Signature");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(1080, 50, 130, 20);

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setDateFormatCalendar(null);
        jDateChooser1.setDateFormatString("dd-MM-yyyy"); // NOI18N
        jPanel3.add(jDateChooser1);
        jDateChooser1.setBounds(250, 240, 160, 30);

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton1);
        jRadioButton1.setBounds(250, 200, 80, 23);

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jPanel3.add(jRadioButton2);
        jRadioButton2.setBounds(330, 200, 100, 23);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@outlook.com", "@yahoo.com", " " }));
        jPanel3.add(jComboBox3);
        jComboBox3.setBounds(440, 290, 120, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Browse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(1100, 360, 150, 31);

        jButton2.setBackground(java.awt.SystemColor.textHighlight);
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Create");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(630, 470, 160, 50);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-back-100.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1238, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(0, 0, 1364, 739);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
this.setVisible(false);
this.dispose();
Dasbord d=new Dasbord();
d.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
      // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
       jPanel2.setBackground(Color.ORANGE);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
  jPanel2.setBackground(new java.awt.Color(0, 204, 204));      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
jPanel5.setBackground(Color.red);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
jPanel5.setBackground(new java.awt.Color(0, 153, 153));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
jPanel4.setBackground(Color.red);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
jPanel4.setBackground(new java.awt.Color(0, 153, 153));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
this.setVisible(false);
this.dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        setState(ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
   // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFileChooser chooser=new JFileChooser();
       chooser.showOpenDialog(null);
       f1 = chooser.getSelectedFile();
         filename1 = f1.getAbsolutePath();
         try
         {
             File image = new File(filename1);
              fis1=new FileInputStream(image);   
          ByteArrayOutputStream bas= new ByteArrayOutputStream();
          byte[] buf=new byte[1024];
          for(int readbuf; (readbuf=fis1.read(buf))!=-1;)
          {
              bas.write(buf,0,readbuf);
          }
          p1=bas.toByteArray();
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
     ImageIcon image1=new ImageIcon(p1);
                   
                    Image im1=image1.getImage();
                   
                    Image myimg1=im1.getScaledInstance(photo.getWidth(), photo.getHeight(),Image.SCALE_SMOOTH);
                   
                    ImageIcon newImage1=new ImageIcon(myimg1);
                  
                    photo.setIcon(newImage1);
                    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       JFileChooser chooser=new JFileChooser();
       chooser.showOpenDialog(null);
        f2 = chooser.getSelectedFile();
       jLabel18.setIcon(new ImageIcon(f2.toString()));
       filename2=f2.getAbsolutePath();    
       try
       {
           File image2=new File(filename2);
           fis2=new FileInputStream(image2);
          ByteArrayOutputStream bas= new ByteArrayOutputStream();
          byte[] buf=new byte[1024];
          for(int readbuf; (readbuf=fis2.read(buf))!=-1;)
          {
              bas.write(buf,0,readbuf);
          }
          p2=bas.toByteArray();
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
     ImageIcon image1=new ImageIcon(p2);
                   
                    Image im1=image1.getImage();
                   
                    Image myimg1=im1.getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(),Image.SCALE_SMOOTH);
                   
                    ImageIcon newImage1=new ImageIcon(myimg1);
                  
                    jLabel18.setIcon(newImage1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       try{
        String Name=(jTextField1.getText()).toUpperCase();
       String Branch=jComboBox1.getSelectedItem().toString();
       String Type=jComboBox2.getSelectedItem().toString();
        java.util.Date d= jDateChooser1.getDate();
       DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
       String da=df.format(d);
       
       String Emailid=jTextField2.getText()+jComboBox3.getSelectedItem().toString();
       String pno=jTextField3.getText();
       Double balance =Double.parseDouble(jTextField4.getText());
       String adress =jTextArea1.getText();
       System.out.println(adress);
       System.out.println(Gender);
       if(f1==null && f2==null)
        JOptionPane.showMessageDialog(this,"PLEASE UPLOADE PROFILE PHOTO AND SIGNATURE");
       else
       {
       try {
            
            Statement stm=con.createStatement();
          ResultSet r =   stm.executeQuery("select ACC_NO from CREATEACCOUNT");
          if(r.next()==false)
         j=100500;
          else
           {  
                ResultSet r1 =   stm.executeQuery("select ACC_NO from CREATEACCOUNT");
         
              while(r1.next())
              {
                  j=r1.getInt("ACC_NO");
                  System.out.println(j);
              }
          
          }
         j++;
        } 
       
        catch (Exception ex) {
           System.out.println(ex.toString());
        } 
       try {
              String sql="insert into CREATEACCOUNT (NAME,BRANCH,TYPE,DATE,EMAIL_ID,PHONE,BALANCE,ADDRESS,GENDER,ACC_NO,P_PHOTO,S_PHOTO) values(?,?,?,?,?,?,?,?,?,?,?,?)";
             PreparedStatement pts=con.prepareStatement(sql);
            pts.setString(1,Name);
            pts.setString(2,Branch);
            pts.setString(3,Type);
            pts.setString(4, da);
            pts.setString(5, Emailid);
            pts.setString(6, pno);
            pts.setDouble(7,balance);
            pts.setString(8,adress);
            pts.setString(9,Gender);
            pts.setInt(10, j);
             pts.setBytes(11,p1);
            pts.setBytes(12,p2);
             int i = pts.executeUpdate();
            if(i>0)
            JOptionPane.showMessageDialog(this, "ACCOUNT SUCCESSFULY CREATED PLEASE NOTE DOWN ACCOUNT NO : "+j+" " );
            else 
          JOptionPane.showMessageDialog(this, "SOMTHING WORNG");
                  
        } catch (Exception ex) {
           System.out.println(ex);
        }
       }
       }
       catch(NullPointerException e)
       {
           JOptionPane.showMessageDialog(this, "Please fill data");
       }
       catch(NumberFormatException e)
       {
           JOptionPane.showMessageDialog(this, "Please fill Correct data");
       }
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
 Gender="Male";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
Gender ="Female";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
    
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed

    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
         
     // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
         // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel photo;
    // End of variables declaration//GEN-END:variables
}
