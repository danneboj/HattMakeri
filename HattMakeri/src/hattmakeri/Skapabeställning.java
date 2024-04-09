/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakeri;



/**
 *
 * @author edwar
 */
public class Skapabeställning extends javax.swing.JFrame {

    /**
     * Creates new form Skapabeställning
     */
    public Skapabeställning() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FärgFält = new javax.swing.JTextField();
        TextilTypsFält = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Modelltextfält = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        StorleksBox = new javax.swing.JComboBox<>();
        TryckFält = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TelnrFält = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NamnFält = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        prisFält = new javax.swing.JTextField();
        Bekräfta = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        leveranssättFält = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        epostFält = new javax.swing.JTextField();
        adressFält = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        leveransadressFält = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        postkodFält = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        betallningFält = new javax.swing.JComboBox<>();
        btnSkrivUt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Färg:");

        jLabel2.setText("Textiltyp:");

        FärgFält.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FärgFältActionPerformed(evt);
            }
        });

        jLabel3.setText("Modell:");

        Modelltextfält.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelltextfältActionPerformed(evt);
            }
        });

        jLabel4.setText("Storlek:");

        StorleksBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "55 cm", "56 cm", "57 cm", "58 cm", "59 cm", "60 cm", "61 cm", "62 cm", "63 cm", "64 cm", "65 cm" }));

        TryckFält.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TryckFältActionPerformed(evt);
            }
        });

        jLabel5.setText("Tryck:");

        jLabel6.setText("Kundens Telnr:");

        TelnrFält.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelnrFältActionPerformed(evt);
            }
        });

        jLabel7.setText("Kundens Namn:");

        jLabel8.setText("Pris:");

        prisFält.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prisFältActionPerformed(evt);
            }
        });

        Bekräfta.setText("Bekräfta");
        Bekräfta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BekräftaActionPerformed(evt);
            }
        });

        jLabel9.setText("Leveranssätt:");

        leveranssättFält.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hämta i butik", "Post" }));

        jLabel10.setText("Kundens adress:");

        jLabel11.setText("Kundens epost:");

        epostFält.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epostFältActionPerformed(evt);
            }
        });

        adressFält.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adressFältActionPerformed(evt);
            }
        });

        jLabel12.setText("Leveransadress:");

        jLabel13.setText("Postkod:");

        postkodFält.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postkodFältActionPerformed(evt);
            }
        });

        jLabel14.setText("Betallsätt:");

        betallningFält.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kort", "Faktura", "Kontant" }));
        betallningFält.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betallningFältActionPerformed(evt);
            }
        });

        btnSkrivUt.setText("Skriv ut");
        btnSkrivUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkrivUtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(postkodFält)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TryckFält, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(leveranssättFält, 0, 142, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FärgFält, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextilTypsFält, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Modelltextfält, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StorleksBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel5)))
                        .addComponent(jLabel9))
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(betallningFält, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TelnrFält)
                            .addComponent(NamnFält)
                            .addComponent(epostFält)
                            .addComponent(adressFält)
                            .addComponent(leveransadressFält)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSkrivUt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prisFält, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Bekräfta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FärgFält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(epostFält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextilTypsFält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelnrFält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modelltextfält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamnFält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StorleksBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adressFält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TryckFält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leveranssättFält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leveransadressFält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(postkodFält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prisFält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(betallningFält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSkrivUt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bekräfta, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FärgFältActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FärgFältActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FärgFältActionPerformed

    private void ModelltextfältActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelltextfältActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelltextfältActionPerformed

    private void TryckFältActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TryckFältActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TryckFältActionPerformed

    private void TelnrFältActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelnrFältActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelnrFältActionPerformed

    private void prisFältActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prisFältActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prisFältActionPerformed

    private void BekräftaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BekräftaActionPerformed
        String färg = FärgFält.getText();
        String textilTyp = TextilTypsFält.getText();
        String modell = Modelltextfält.getText();
        String storlek = (String) StorleksBox.getSelectedItem();
        String tryck = TryckFält.getText();
        String namn = NamnFält.getText();
        String telnr = TelnrFält.getText();
        String adress = adressFält.getText();
        String epost = epostFält.getText();
        String pris = prisFält.getText();
        String leveranssätt = (String) leveranssättFält.getSelectedItem();
        String postkod = postkodFält.getText();
        String leveransadress = leveransadressFält.getText();
        String betallsätt = (String) betallningFält.getSelectedItem();

        BeställningsDetaljer detaljer = new BeställningsDetaljer(färg, textilTyp, modell, storlek, tryck, namn, telnr,
                pris, leveransadress, postkod, adress, epost, leveranssätt, betallsätt);
        detaljer.setVisible(true);
        dispose();
    }//GEN-LAST:event_BekräftaActionPerformed

    private void epostFältActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epostFältActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epostFältActionPerformed

    private void adressFältActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adressFältActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adressFältActionPerformed

    private void postkodFältActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postkodFältActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postkodFältActionPerformed

    private void betallningFältActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betallningFältActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_betallningFältActionPerformed

    private void btnSkrivUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkrivUtActionPerformed
        String modell = Modelltextfält.getText();
        String färg = FärgFält.getText();
        Object objekt = StorleksBox.getSelectedItem();
        String storlek = objekt.toString();
        String tryck = TryckFält.getText();
        String tyg = TextilTypsFält.getText();

        System.out.println("*******************");
        System.out.println("  Hattbeskrivning");
        System.out.println("*******************");
        System.out.println("Modell: " + modell );
        System.out.println("Tyg: " +tyg);
        System.out.println("Färg: " + färg);
        System.out.println("Storlek: " + storlek);
        System.out.println("Tryck: " + tryck);
        System.out.println("******************");
    }//GEN-LAST:event_btnSkrivUtActionPerformed

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
            java.util.logging.Logger.getLogger(Skapabeställning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Skapabeställning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Skapabeställning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Skapabeställning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Skapabeställning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bekräfta;
    private javax.swing.JTextField FärgFält;
    private javax.swing.JTextField Modelltextfält;
    private javax.swing.JTextField NamnFält;
    private javax.swing.JComboBox<String> StorleksBox;
    private javax.swing.JTextField TelnrFält;
    private javax.swing.JTextField TextilTypsFält;
    private javax.swing.JTextField TryckFält;
    private javax.swing.JTextField adressFält;
    private javax.swing.JComboBox<String> betallningFält;
    private javax.swing.JButton btnSkrivUt;
    private javax.swing.JTextField epostFält;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField leveransadressFält;
    private javax.swing.JComboBox<String> leveranssättFält;
    private javax.swing.JTextField postkodFält;
    private javax.swing.JTextField prisFält;
    // End of variables declaration//GEN-END:variables
}
