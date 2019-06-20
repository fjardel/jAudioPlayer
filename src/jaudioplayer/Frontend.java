package jaudioplayer;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Frontend extends javax.swing.JFrame {
    
    public Frontend() {
        
        initComponents();
        
    }
    
    private Backend back = new Backend();
    private boolean check = true;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLayout = new javax.swing.JPanel();
        timerAudio = new javax.swing.JLabel();
        buttonPrevious = new javax.swing.JButton();
        buttonPlayPlause = new javax.swing.JButton();
        buttonStop = new javax.swing.JButton();
        buttonNext = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        buttonFile = new javax.swing.JButton();
        buttonSequential = new javax.swing.JButton();
        buttonRandom = new javax.swing.JButton();
        nameAudio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jAudioPlayer");
        setResizable(false);

        panelLayout.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        timerAudio.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        timerAudio.setText("00:00");

        buttonPrevious.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        buttonPrevious.setText("|<");

        buttonPlayPlause.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        buttonPlayPlause.setText(">");
        buttonPlayPlause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlayPlauseActionPerformed(evt);
            }
        });

        buttonStop.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        buttonStop.setText("[]");
        buttonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStopActionPerformed(evt);
            }
        });

        buttonNext.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        buttonNext.setText(">|");

        progressBar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N

        buttonFile.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        buttonFile.setText("+");
        buttonFile.setBorder(null);
        buttonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFileActionPerformed(evt);
            }
        });

        buttonSequential.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        buttonSequential.setText("O");
        buttonSequential.setBorder(null);

        buttonRandom.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        buttonRandom.setText("X");
        buttonRandom.setBorder(null);

        nameAudio.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        nameAudio.setText("----");

        javax.swing.GroupLayout panelLayoutLayout = new javax.swing.GroupLayout(panelLayout);
        panelLayout.setLayout(panelLayoutLayout);
        panelLayoutLayout.setHorizontalGroup(
            panelLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayoutLayout.createSequentialGroup()
                        .addComponent(timerAudio)
                        .addGap(18, 18, 18)
                        .addComponent(buttonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonPlayPlause, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonStop, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayoutLayout.createSequentialGroup()
                        .addComponent(buttonFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonSequential, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameAudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayoutLayout.setVerticalGroup(
            panelLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonPlayPlause, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonStop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(timerAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSequential, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("Player de audio feito na linguagem Java");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFileActionPerformed

        /* Metodo para seleção de arquivos */
        try {
            
            back.fileExplorer();
            nameAudio.setText(back.nameAudio);
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(Frontend.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }//GEN-LAST:event_buttonFileActionPerformed

    private void buttonPlayPlauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlayPlauseActionPerformed
         
        if (check == true) {
            
            check = false;
            back.playAudio();//Executando o arquivo de audio
            buttonPlayPlause.setText("||");
            
        } else if (check == false) {
            
            check = true;
            buttonPlayPlause.setText(">");
            
        }
        
    }//GEN-LAST:event_buttonPlayPlauseActionPerformed

    private void buttonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStopActionPerformed
        
        back.stopAudio();
        check = true;
        buttonPlayPlause.setText(">");
        
    }//GEN-LAST:event_buttonStopActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frontend().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFile;
    private javax.swing.JButton buttonNext;
    private javax.swing.JButton buttonPlayPlause;
    private javax.swing.JButton buttonPrevious;
    private javax.swing.JButton buttonRandom;
    private javax.swing.JButton buttonSequential;
    private javax.swing.JButton buttonStop;
    private javax.swing.JLabel nameAudio;
    private javax.swing.JPanel panelLayout;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel timerAudio;
    // End of variables declaration//GEN-END:variables
}
