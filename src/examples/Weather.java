package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;

public class Weather extends javax.swing.JFrame {
    /** Creates new form Find */
    public Weather() {
        initComponents();
        dangerLabel.setVisible(false);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ice = new javax.swing.JCheckBox();
        dry = new javax.swing.JCheckBox();
        rain = new javax.swing.JCheckBox();
        snow = new javax.swing.JCheckBox();
        wind = new javax.swing.JCheckBox();
        cold = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        dangerLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        temperatureText = new javax.swing.JTextField();
        precipitationText = new javax.swing.JTextField();
        snowText = new javax.swing.JTextField();
        windText = new javax.swing.JTextField();
        iceText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        temperatureLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Find");

        ice.setText("Ice");
        ice.setName("iceCheckBox"); // NOI18N
        ice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iceActionPerformed(evt);
            }
        });

        dry.setText("Dry");
        dry.setName("dryCheckbox"); // NOI18N
        dry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dryActionPerformed(evt);
            }
        });

        rain.setText("Rain");
        rain.setName("rainCheckbox"); // NOI18N

        snow.setText("Snow");
        snow.setName("snowCheckbox"); // NOI18N

        wind.setText("Wind");
        wind.setName("windCheckbox"); // NOI18N

        cold.setText("Cold");
        cold.setName("coldCheckbox"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WEATHER");

        dangerLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dangerLabel.setForeground(new java.awt.Color(255, 0, 0));
        dangerLabel.setText("Danger !");
        dangerLabel.setName("dangerLabel"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Test");

        temperatureText.setText("Temperature");
        temperatureText.setName("temperatureBox"); // NOI18N

        precipitationText.setText("Precipitation");
        precipitationText.setToolTipText("");
        precipitationText.setName("precipitationBox"); // NOI18N
        precipitationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precipitationTextActionPerformed(evt);
            }
        });

        snowText.setText("Snow Depth");
        snowText.setToolTipText("");
        snowText.setName("snowBox"); // NOI18N

        windText.setText("Wind");
        windText.setName("windBox"); // NOI18N

        iceText.setText("Ice");
        iceText.setName("iceBox"); // NOI18N

        jButton1.setText("Submit");
        jButton1.setName("submitButton"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        temperatureLabel.setText("Temperature");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(203, 203, 203)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 297, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(temperatureLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(185, 185, 185)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 297, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 79, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                            .add(95, 95, 95)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(dry, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(ice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(58, 58, 58)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(layout.createSequentialGroup()
                                    .add(rain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(66, 66, 66)
                                    .add(wind, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                    .add(snow, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(cold, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(dangerLabel))
                .add(0, 121, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(122, 122, 122)
                        .add(temperatureText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(precipitationText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(snowText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(windText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(iceText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(296, 296, 296)
                        .add(jButton1)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(dangerLabel)
                .add(47, 47, 47)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(temperatureLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 10, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(wind, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(41, 41, 41)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(dry, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(snow, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cold, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(111, 111, 111)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(temperatureText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(precipitationText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(snowText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(windText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(iceText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 33, Short.MAX_VALUE)
                .add(jButton1)
                .add(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dryActionPerformed

    private void iceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //Read the values from the checkboxes
        boolean considerIce = ice.isSelected();
        boolean considerRain = rain.isSelected();
        boolean considerWind = wind.isSelected();
        boolean considerDry = dry.isSelected();
        boolean considerSnow = snow.isSelected();
        boolean considerCold = cold.isSelected();
        
        String command = "python test.py ";
        
        if(considerIce){
            command += "1 ";
        }else{
            command += "0 ";
        }
        
        if(considerRain){
            command += "1 ";
        }else{
            command += "0 ";
        }
        
        if(considerWind){
            command += "1 ";
        }else{
            command += "0 ";
        }
        
        if(considerDry){
            command += "1 ";
        }else{
            command += "0 ";
        }
        
        if(considerSnow){
            command += "1 ";
        }else{
            command += "0 ";
        }
        
        if(considerCold){
            command += "1 ";
        }else{
            command += "0 ";
        }
        
        command += temperatureText.getText() + " " + precipitationText.getText() + " " + snowText.getText() + " " + windText.getText() + " " + iceText.getText();
        System.out.println(command);
        //Execute the Python SVM
        String s = null;
        try {
            Process p = Runtime.getRuntime().exec(command);
            
            BufferedReader stdInput = new BufferedReader(new
                         InputStreamReader(p.getInputStream()));
            
            BufferedReader stdError = new BufferedReader(new
                         InputStreamReader(p.getErrorStream()));
            
            s = stdInput.readLine();
            System.out.println(s);
            if(s.equals("[ 1.]")){
                dangerLabel.setVisible(true);
            } else{
                dangerLabel.setVisible(false);
                
            }  
        } catch (IOException ex) {
            Logger.getLogger(Weather.class.getName()).log(Level.SEVERE, null, ex);
        }
        temperatureLabel.setText(temperatureText.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void precipitationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precipitationTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precipitationTextActionPerformed
    
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Weather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Weather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Weather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Weather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Weather().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cold;
    private javax.swing.JLabel dangerLabel;
    private javax.swing.JCheckBox dry;
    private javax.swing.JCheckBox ice;
    private javax.swing.JTextField iceText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField precipitationText;
    private javax.swing.JCheckBox rain;
    private javax.swing.JCheckBox snow;
    private javax.swing.JTextField snowText;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JTextField temperatureText;
    private javax.swing.JCheckBox wind;
    private javax.swing.JTextField windText;
    // End of variables declaration//GEN-END:variables
    
}
