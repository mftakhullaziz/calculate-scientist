
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.LinkedList;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.JTextField;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MiftakhulAziz&YuliantoPambudi
 */
public class kalkulator extends javax.swing.JFrame {
    String angka="";
    double a, b, hasil;
    int pilih;
    
    
    public kalkulator() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        samadengan1 = new javax.swing.JButton();
        samadengan = new javax.swing.JButton();
        nol = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        tujuh = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        lima = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        min = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        tiga = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        hasill = new javax.swing.JButton();

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        samadengan1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        samadengan1.setText("Exit");
        samadengan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samadengan1ActionPerformed(evt);
            }
        });
        jPanel1.add(samadengan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 80, -1));

        samadengan.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        samadengan.setText("=");
        samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samadenganActionPerformed(evt);
            }
        });
        jPanel1.add(samadengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 50, -1));

        nol.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        nol.setText("0");
        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });
        jPanel1.add(nol, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 50, -1));

        sembilan.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        sembilan.setText("9");
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });
        jPanel1.add(sembilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 50, -1));

        delapan.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        delapan.setText("8");
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });
        jPanel1.add(delapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 50, -1));

        tujuh.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        tujuh.setText("7");
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });
        jPanel1.add(tujuh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, -1));

        clear.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 80, -1));

        bagi.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        bagi.setText("/");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });
        jPanel1.add(bagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 50, -1));

        kali.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        kali.setText("x");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });
        jPanel1.add(kali, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 50, -1));

        enam.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        enam.setText("6");
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });
        jPanel1.add(enam, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 50, -1));

        lima.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        lima.setText("5");
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });
        jPanel1.add(lima, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 50, -1));

        empat.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        empat.setText("4");
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });
        jPanel1.add(empat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, -1));

        delete.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 80, -1));

        min.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        min.setText("-");
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });
        jPanel1.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 50, -1));

        tambah.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel1.add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 50, -1));

        tiga.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        tiga.setText("3");
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });
        jPanel1.add(tiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 50, -1));

        dua.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        dua.setText("2");
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });
        jPanel1.add(dua, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 50, -1));

        satu.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        satu.setText("1");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });
        jPanel1.add(satu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        jPanel2.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 270, 30));

        hasill.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        hasill.setText("Result");
        hasill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasillActionPerformed(evt);
            }
        });
        jPanel2.add(hasill, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 220));

        setSize(new java.awt.Dimension(395, 257));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        display.setText("");
        a = 0.0;
        b = 0.0;
        hasil = 0.0;
        angka = " ";
    }//GEN-LAST:event_clearActionPerformed

    private void hasillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasillActionPerformed
       Automata b= new Automata(display.getText()); 
    }//GEN-LAST:event_hasillActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your hdling code here:
        display.setText(""+display.getText().substring(0, display.getText ().length()-1));
  
    }//GEN-LAST:event_deleteActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_displayActionPerformed
 
    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        // TODO add your handling code here:
        display.setText(display.getText()+"1");
    }//GEN-LAST:event_satuActionPerformed

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
        // TODO add your handling code here:
         display.setText(display.getText()+"2");
    }//GEN-LAST:event_duaActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        
         display.setText(display.getText()+"+");
    }//GEN-LAST:event_tambahActionPerformed

    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
        // TODO add your handling code here:
        display.setText(display.getText()+"-");
    }//GEN-LAST:event_minActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        // TODO add your handling code here:
        display.setText(display.getText()+"*");
    }//GEN-LAST:event_kaliActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        // TODO add your handling code here:
         display.setText(display.getText()+"/");
    }//GEN-LAST:event_bagiActionPerformed

    private void samadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samadenganActionPerformed
        // TODO add your handling code here:
        display.setText(display.getText()+"=");
    }//GEN-LAST:event_samadenganActionPerformed

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
       display.setText(display.getText()+"4");
    }//GEN-LAST:event_empatActionPerformed

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaActionPerformed
       display.setText(display.getText()+"3");
    }//GEN-LAST:event_tigaActionPerformed

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
       display.setText(display.getText()+"5");
    }//GEN-LAST:event_limaActionPerformed

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamActionPerformed
       display.setText(display.getText()+"6");
    }//GEN-LAST:event_enamActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
       display.setText(display.getText()+"7");
    }//GEN-LAST:event_tujuhActionPerformed

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanActionPerformed
       display.setText(display.getText()+"8");
    }//GEN-LAST:event_delapanActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
        display.setText(display.getText()+"9");
    }//GEN-LAST:event_sembilanActionPerformed

    private void nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolActionPerformed
       display.setText(display.getText()+"0");
    }//GEN-LAST:event_nolActionPerformed

    private void samadengan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samadengan1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_samadengan1ActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagi;
    private javax.swing.JButton clear;
    private javax.swing.JButton delapan;
    private javax.swing.JButton delete;
    private javax.swing.JTextField display;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JButton hasill;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kali;
    private javax.swing.JButton lima;
    private javax.swing.JButton min;
    private javax.swing.JButton nol;
    private javax.swing.JButton samadengan;
    private javax.swing.JButton samadengan1;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tiga;
    private javax.swing.JButton tujuh;
    // End of variables declaration//GEN-END:variables
}
