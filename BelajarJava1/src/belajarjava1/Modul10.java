/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package belajarjava1;

/**
 *
 * @author sulistia
 */
public class Modul10 extends javax.swing.JFrame {

    /**
     * Creates new form Modul10
     */
    public Modul10() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eData1 = new javax.swing.JTextField();
        eData2 = new javax.swing.JTextField();
        eHasil = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        eData3 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menFile = new javax.swing.JMenu();
        menProses = new javax.swing.JMenu();
        menBersih = new javax.swing.JMenu();
        menPersegi = new javax.swing.JMenu();
        meItLuasPersegi = new javax.swing.JMenuItem();
        meltKelilingPersegi = new javax.swing.JMenuItem();
        menLingkaran = new javax.swing.JMenu();
        meItLuasLingkaran = new javax.swing.JMenuItem();
        meItKelilingLingkaran = new javax.swing.JMenuItem();
        menSegitiga = new javax.swing.JMenu();
        meItLuasSegitiga = new javax.swing.JMenuItem();
        meItKelilingSegitiga = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data 1");

        jLabel2.setText("Data 2");

        jLabel3.setText("Hasil");

        jLabel4.setText("Data 3");

        menFile.setText("File");
        jMenuBar1.add(menFile);

        menProses.setText("Proses");

        menBersih.setText("Bersih");
        menProses.add(menBersih);

        menPersegi.setText("Persegi Panjang");

        meItLuasPersegi.setText("Luas");
        meItLuasPersegi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meItLuasPersegiStateChanged(evt);
            }
        });
        meItLuasPersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meItLuasPersegiActionPerformed(evt);
            }
        });
        menPersegi.add(meItLuasPersegi);

        meltKelilingPersegi.setText("Keliling");
        meltKelilingPersegi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meltKelilingPersegiStateChanged(evt);
            }
        });
        meltKelilingPersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meltKelilingPersegiActionPerformed(evt);
            }
        });
        menPersegi.add(meltKelilingPersegi);

        menProses.add(menPersegi);

        menLingkaran.setText("Lingkaran");

        meItLuasLingkaran.setText("Luas");
        meItLuasLingkaran.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meItLuasLingkaranStateChanged(evt);
            }
        });
        meItLuasLingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meItLuasLingkaranActionPerformed(evt);
            }
        });
        menLingkaran.add(meItLuasLingkaran);

        meItKelilingLingkaran.setText("Keliling");
        meItKelilingLingkaran.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meItKelilingLingkaranStateChanged(evt);
            }
        });
        meItKelilingLingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meItKelilingLingkaranActionPerformed(evt);
            }
        });
        menLingkaran.add(meItKelilingLingkaran);

        menProses.add(menLingkaran);

        menSegitiga.setText("Segitiga");

        meItLuasSegitiga.setText("Luas");
        meItLuasSegitiga.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meItLuasSegitigaStateChanged(evt);
            }
        });
        meItLuasSegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meItLuasSegitigaActionPerformed(evt);
            }
        });
        menSegitiga.add(meItLuasSegitiga);

        meItKelilingSegitiga.setText("Keliling");
        meItKelilingSegitiga.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meItKelilingSegitigaStateChanged(evt);
            }
        });
        meItKelilingSegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meItKelilingSegitigaActionPerformed(evt);
            }
        });
        menSegitiga.add(meItKelilingSegitiga);

        menProses.add(menSegitiga);

        jMenuBar1.add(menProses);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eData1)
                    .addComponent(eData2)
                    .addComponent(eData3, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(eHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(eData3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(eHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meltKelilingPersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meltKelilingPersegiActionPerformed
       
    }//GEN-LAST:event_meltKelilingPersegiActionPerformed

    private void meItKelilingSegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meItKelilingSegitigaActionPerformed
        
    }//GEN-LAST:event_meItKelilingSegitigaActionPerformed

    private void meItKelilingLingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meItKelilingLingkaranActionPerformed
        
    }//GEN-LAST:event_meItKelilingLingkaranActionPerformed

    private void meItLuasPersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meItLuasPersegiActionPerformed
        
    }//GEN-LAST:event_meItLuasPersegiActionPerformed

    private void meItLuasLingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meItLuasLingkaranActionPerformed
        
    }//GEN-LAST:event_meItLuasLingkaranActionPerformed

    private void meItLuasSegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meItLuasSegitigaActionPerformed
        
    }//GEN-LAST:event_meItLuasSegitigaActionPerformed

    private void meItLuasPersegiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meItLuasPersegiStateChanged
        int Data1 = Integer.parseInt(eData1.getText());
        int Data2 = Integer.parseInt(eData2.getText());
        int Hasil;
        Hasil = Data1*Data2;
        eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meItLuasPersegiStateChanged

    private void meltKelilingPersegiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meltKelilingPersegiStateChanged
        int Data1 = Integer.parseInt(eData1.getText());
        int Data2 = Integer.parseInt(eData2.getText());
        int Hasil;
        Hasil = 2*(Data1+Data2);
        eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meltKelilingPersegiStateChanged

    private void meItLuasLingkaranStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meItLuasLingkaranStateChanged
        double Data1 = Integer.parseInt(eData1.getText());
        double Hasil;
        Hasil = Math.PI*Data1*Data1;
        eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meItLuasLingkaranStateChanged

    private void meItKelilingLingkaranStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meItKelilingLingkaranStateChanged
        double Data1 = Integer.parseInt(eData1.getText());
        double Hasil;
        Hasil = 2*Math.PI*Data1;
        eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meItKelilingLingkaranStateChanged

    private void meItLuasSegitigaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meItLuasSegitigaStateChanged
        int Data1 = Integer.parseInt(eData1.getText());
        int Data2 = Integer.parseInt(eData2.getText());
        double Hasil;
        Hasil = 0.5*Data1*Data2;
        eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meItLuasSegitigaStateChanged

    private void meItKelilingSegitigaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meItKelilingSegitigaStateChanged
        int Data1 = Integer.parseInt(eData1.getText());
        int Data2 = Integer.parseInt(eData2.getText());
        int Data3 = Integer.parseInt(eData3.getText());
        int Hasil;
        Hasil = Data1+Data2+Data3;
        eHasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_meItKelilingSegitigaStateChanged

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
            java.util.logging.Logger.getLogger(Modul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modul10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eData1;
    private javax.swing.JTextField eData2;
    private javax.swing.JTextField eData3;
    private javax.swing.JTextField eHasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem meItKelilingLingkaran;
    private javax.swing.JMenuItem meItKelilingSegitiga;
    private javax.swing.JMenuItem meItLuasLingkaran;
    private javax.swing.JMenuItem meItLuasPersegi;
    private javax.swing.JMenuItem meItLuasSegitiga;
    private javax.swing.JMenuItem meltKelilingPersegi;
    private javax.swing.JMenu menBersih;
    private javax.swing.JMenu menFile;
    private javax.swing.JMenu menLingkaran;
    private javax.swing.JMenu menPersegi;
    private javax.swing.JMenu menProses;
    private javax.swing.JMenu menSegitiga;
    // End of variables declaration//GEN-END:variables
}
