/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import dataAnalysis.loadData;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import recordingData.Recorder;
import resourceHandler.imageHandler;

/**
 * @author Lucas Zeer-Wanklyn
 */
public class Main extends javax.swing.JFrame {
    
    
    public imageHandler imagesHandler = new imageHandler();
    public loadData loadata = new loadData();
    public int x;
    public Recorder recorder = new Recorder();
    public Boolean isRunning = false;
    public int fileNumber = 0;
    
     public JInternalFrame internalFrame[] = new JInternalFrame[4];
   
     
    public Main() {
        initComponents();
        imagesHandler.ImageLoad();
        System.out.println(imagesHandler.imagePath[0]);
        x = 0;
    }
    //timer START
     public int newTime = 0;//I use this var to keep time for the label
     public final static int ONE_SECOND = 1000;//1000 = 1sec
        
    javax.swing.Timer timer = new javax.swing.Timer(ONE_SECOND, new ActionListener() {
        
        @Override
    public void actionPerformed(ActionEvent evt) {
	newTime += 1;
        System.out.println(newTime);
        timerLabel.setText(Integer.toString(newTime));
            for (int i = 1; i < 100; i++) {
                if (newTime == (10*i)) {
                x = imagesHandler.ChangePictureForward(x);
                imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagesHandler.imagePath[x])));
                
                //End Recording
        System.out.println("Recordding Stopped");
        
        isRunning = false;
        recorder.threadRunner(isRunning);
        
        //captureData
        fileNumber = fileNumber + 1;
        isRunning = true;
        try {
            System.out.println("Start");
            recorder.captureAudio(fileNumber);
            recorder.threadRunner(isRunning);
        } catch (Exception e) {}
        
        
        }
        
       }
     }    
    });
    //timer END
    
    
    

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        timerButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        waveGraph1 = new javax.swing.JInternalFrame();
        waveGraph2 = new javax.swing.JInternalFrame();
        waveGraph3 = new javax.swing.JInternalFrame();
        waveGraph4 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Test Results");

        jButton2.setText("New Test");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 155, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(125, 125, 125))
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(48, 48, 48)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 155, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(492, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(100, 100, 100)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(102, 102, 102)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(207, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(" Name "));

        jLabel1.setText("First Name:");

        jLabel2.setText("Last Name:");

        jTextField1.setText("Bob");

        jTextField2.setText("Peterson");

        jLabel3.setText("Age:");

        jTextField3.setText("35");

        jLabel5.setText("Gender:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gender" }));

        jLabel6.setText("E-mail Address:");

        jButton9.setText("OK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Reset");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(33, 33, 33)
                        .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel3)
                            .add(jLabel1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jTextField3)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jTextField1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel5Layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(jComboBox1, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jTextField2)))
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(14, 14, 14)
                        .add(jLabel6)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 189, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jButton9)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton10)
                        .add(0, 137, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton9)
                    .add(jButton10))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jLabel4.setText("Timer : ");

        timerLabel.setText("0");

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.gif"))); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(imageLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, imageLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab1", jPanel4);

        jButton3.setText("Forward");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        timerButton.setText("Start Timer");
        timerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerButtonActionPerformed(evt);
            }
        });

        jButton5.setText("Test Completed");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(32, 32, 32)
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(timerLabel))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(120, 120, 120)
                                .add(jTabbedPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 408, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(268, 268, 268)
                                .add(timerButton)))
                        .add(18, 18, 18)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButton3)
                            .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel3Layout.createSequentialGroup()
                    .add(24, 24, 24)
                    .add(jButton4)
                    .addContainerGap(596, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(timerLabel))
                        .add(18, 18, 18)
                        .add(jTabbedPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 278, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(175, 175, 175)
                        .add(jButton3)))
                .add(18, 18, 18)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(timerButton)
                    .add(jButton5))
                .addContainerGap(49, Short.MAX_VALUE))
            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel3Layout.createSequentialGroup()
                    .add(182, 182, 182)
                    .add(jButton4)
                    .addContainerGap(217, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        waveGraph1.setBorder(null);
        waveGraph1.setVisible(true);

        org.jdesktop.layout.GroupLayout waveGraph1Layout = new org.jdesktop.layout.GroupLayout(waveGraph1.getContentPane());
        waveGraph1.getContentPane().setLayout(waveGraph1Layout);
        waveGraph1Layout.setHorizontalGroup(
            waveGraph1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 523, Short.MAX_VALUE)
        );
        waveGraph1Layout.setVerticalGroup(
            waveGraph1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 349, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("tab1", waveGraph1);

        waveGraph2.setBorder(null);
        waveGraph2.setVisible(true);

        org.jdesktop.layout.GroupLayout waveGraph2Layout = new org.jdesktop.layout.GroupLayout(waveGraph2.getContentPane());
        waveGraph2.getContentPane().setLayout(waveGraph2Layout);
        waveGraph2Layout.setHorizontalGroup(
            waveGraph2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 523, Short.MAX_VALUE)
        );
        waveGraph2Layout.setVerticalGroup(
            waveGraph2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 349, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("tab2", waveGraph2);

        waveGraph3.setBorder(null);
        waveGraph3.setVisible(true);

        org.jdesktop.layout.GroupLayout waveGraph3Layout = new org.jdesktop.layout.GroupLayout(waveGraph3.getContentPane());
        waveGraph3.getContentPane().setLayout(waveGraph3Layout);
        waveGraph3Layout.setHorizontalGroup(
            waveGraph3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 523, Short.MAX_VALUE)
        );
        waveGraph3Layout.setVerticalGroup(
            waveGraph3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 349, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("tab3", waveGraph3);

        waveGraph4.setBorder(null);
        waveGraph4.setVisible(true);

        org.jdesktop.layout.GroupLayout waveGraph4Layout = new org.jdesktop.layout.GroupLayout(waveGraph4.getContentPane());
        waveGraph4.getContentPane().setLayout(waveGraph4Layout);
        waveGraph4Layout.setHorizontalGroup(
            waveGraph4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 523, Short.MAX_VALUE)
        );
        waveGraph4Layout.setVerticalGroup(
            waveGraph4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 349, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("tab4", waveGraph4);

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .add(54, 54, 54)
                .add(jTabbedPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 544, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane3)
                .add(27, 27, 27))
        );

        jTabbedPane1.addTab("tab4", jPanel6);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
        System.out.println("Test Started...");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        x = imagesHandler.ChangePictureForward(x);
        System.out.println(x);
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagesHandler.imagePath[x])));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        x = imagesHandler.ChangePictureBackward(x);
        System.out.println(imagesHandler.imagePath[x]);
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagesHandler.imagePath[x])));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void timerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerButtonActionPerformed
        timerButton.setText("Stop/Reset");
        if (timer.isRunning()) {
            timer.stop();
            timerLabel.setText("0");
            newTime= 0;
            timerButton.setText("Start Timer");
            
        //End Recording
        System.out.println("Recordding Stopped");
        isRunning = false;
        recorder.threadRunner(isRunning);
        
        }
        else{
            timer.start();  
            //captureData
        fileNumber = fileNumber + 1;
        isRunning = true;
        try {
            System.out.println("Start");
            recorder.captureAudio(fileNumber);
            recorder.threadRunner(isRunning);
        } catch (Exception e) {}
        }
    
    }//GEN-LAST:event_timerButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            jTabbedPane1.setSelectedIndex(3);
            
            internalFrame[0] = waveGraph1;
            internalFrame[1] = waveGraph2;
            internalFrame[2] = waveGraph3;
            internalFrame[3] = waveGraph4;
            
            
            for (int i = 0; i < 4; i++) {
            try {
                loadata.run(i);
                internalFrame[i].getContentPane().setLayout(new BorderLayout());
                internalFrame[i].getContentPane().add(loadata.container, BorderLayout.CENTER);
                internalFrame[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                internalFrame[i].show();
                internalFrame[i].validate();
            }
            
            
            catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
               
            }
            
            }      
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton timerButton;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JInternalFrame waveGraph1;
    private javax.swing.JInternalFrame waveGraph2;
    private javax.swing.JInternalFrame waveGraph3;
    private javax.swing.JInternalFrame waveGraph4;
    // End of variables declaration//GEN-END:variables
}
