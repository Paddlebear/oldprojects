
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VELGA&KARLO
 */
public class cepure extends javax.swing.JFrame {

    /**
     * Creates new form cepure
     */
    public cepure() {
        initComponents();
        rekinat();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        poga = new javax.swing.JButton();
        panelis = new javax.swing.JPanel();
        cleaning = new javax.swing.JButton();
        xpagralfa = new javax.swing.JButton();
        lenkis = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ypagralfa = new javax.swing.JButton();
        zpagralfa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        xatspog = new javax.swing.JButton();
        yatspog = new javax.swing.JButton();
        zatspog = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        xprocenti = new javax.swing.JSpinner();
        yprocenti = new javax.swing.JSpinner();
        zprocenti = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        xizstiept = new javax.swing.JButton();
        yizstiept = new javax.swing.JButton();
        zizstiept = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        xsaspiest = new javax.swing.JButton();
        ysaspiest = new javax.swing.JButton();
        zsaspiest = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        reizes = new javax.swing.JSpinner();
        palielinat = new javax.swing.JButton();
        samazinat = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        xpikseli = new javax.swing.JSpinner();
        ypikseli = new javax.swing.JSpinner();
        zpikseli = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        parnest = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        poga.setText("Zīmēt");
        poga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogaActionPerformed(evt);
            }
        });

        panelis.setPreferredSize(new java.awt.Dimension(600, 500));

        javax.swing.GroupLayout panelisLayout = new javax.swing.GroupLayout(panelis);
        panelis.setLayout(panelisLayout);
        panelisLayout.setHorizontalGroup(
            panelisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );
        panelisLayout.setVerticalGroup(
            panelisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        cleaning.setText("Tīrīt");
        cleaning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleaningActionPerformed(evt);
            }
        });

        xpagralfa.setText("x asi");
        xpagralfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xpagralfaActionPerformed(evt);
            }
        });

        lenkis.setModel(new javax.swing.SpinnerNumberModel(30, 1, 360, 1));

        jLabel1.setText("Pagr. leņķis");

        jLabel2.setText("Pagriezt pa");

        ypagralfa.setText("y asi");
        ypagralfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ypagralfaActionPerformed(evt);
            }
        });

        zpagralfa.setText("z asi");
        zpagralfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zpagralfaActionPerformed(evt);
            }
        });

        jLabel3.setText("Atspoguļot pret");

        xatspog.setText("x asi");
        xatspog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xatspogActionPerformed(evt);
            }
        });

        yatspog.setText("y asi");
        yatspog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yatspogActionPerformed(evt);
            }
        });

        zatspog.setText("z asi");
        zatspog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zatspogActionPerformed(evt);
            }
        });

        jLabel4.setText("Izstiept/saspiest par ?% pa");

        jLabel5.setText("x");

        xprocenti.setModel(new javax.swing.SpinnerNumberModel(10.0d, 0.0d, 1000.0d, 1.0d));

        yprocenti.setModel(new javax.swing.SpinnerNumberModel(10.0d, 0.0d, 1000.0d, 1.0d));

        zprocenti.setModel(new javax.swing.SpinnerNumberModel(10.0d, 0.0d, 1000.0d, 1.0d));

        jLabel6.setText("y");

        jLabel7.setText("z");

        jLabel8.setText("Izstiept pa");

        xizstiept.setText("x asi");
        xizstiept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xizstieptActionPerformed(evt);
            }
        });

        yizstiept.setText("y asi");
        yizstiept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yizstieptActionPerformed(evt);
            }
        });

        zizstiept.setText("z asi");
        zizstiept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zizstieptActionPerformed(evt);
            }
        });

        jLabel9.setText("Saspiest pa");

        xsaspiest.setText("x asi");
        xsaspiest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xsaspiestActionPerformed(evt);
            }
        });

        ysaspiest.setText("y asi");
        ysaspiest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ysaspiestActionPerformed(evt);
            }
        });

        zsaspiest.setText("z asi");
        zsaspiest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zsaspiestActionPerformed(evt);
            }
        });

        jLabel10.setText("Palielināt/samazināt cik reizes");

        reizes.setModel(new javax.swing.SpinnerNumberModel(2, 1, 50, 1));

        palielinat.setText("Palielināt");
        palielinat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palielinatActionPerformed(evt);
            }
        });

        samazinat.setText("Samazināt");
        samazinat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samazinatActionPerformed(evt);
            }
        });

        jLabel11.setText("Par cik pikseļiem pārvietot pa");

        jLabel13.setText("x");

        xpikseli.setModel(new javax.swing.SpinnerNumberModel(20, -500, 500, 1));

        ypikseli.setModel(new javax.swing.SpinnerNumberModel(0, -500, 500, 1));

        zpikseli.setModel(new javax.swing.SpinnerNumberModel(0, -500, 500, 1));

        jLabel14.setText("y");

        jLabel15.setText("z");

        parnest.setText("Pārvietot");
        parnest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parnestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(xpikseli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(zpikseli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel14))
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ypikseli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(parnest))))
                    .addComponent(panelis, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(poga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cleaning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lenkis)
                            .addComponent(xpagralfa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ypagralfa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zpagralfa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xatspog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zatspog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reizes)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(xsaspiest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ysaspiest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(zsaspiest))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(xizstiept)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yizstiept)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(zizstiept)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel5))
                                        .addGap(63, 63, 63))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(xprocenti, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yprocenti, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(zprocenti, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(yatspog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(palielinat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(samazinat)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(poga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cleaning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lenkis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xpagralfa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ypagralfa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zpagralfa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xatspog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yatspog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zatspog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xprocenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yprocenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zprocenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xizstiept)
                            .addComponent(yizstiept)
                            .addComponent(zizstiept))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xsaspiest)
                            .addComponent(ysaspiest)
                            .addComponent(zsaspiest))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reizes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(palielinat)
                            .addComponent(samazinat)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xpikseli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zpikseli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ypikseli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parnest))))
                .addGap(8, 8, 8)
                .addComponent(jLabel12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pogaActionPerformed
        tirit();
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_pogaActionPerformed

    private void cleaningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleaningActionPerformed
        tirit();
    }//GEN-LAST:event_cleaningActionPerformed

    private void xpagralfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xpagralfaActionPerformed
        noresettirit();
        int a = (Integer)lenkis.getValue();
        double [][] pagralfax = {{1, 0, 0},{0, Math.cos(Math.PI/180*a), Math.sin(Math.PI/180*a)},{0, -Math.sin(Math.PI/180*a), Math.cos(Math.PI/180*a)}};
        punkti = reizina(pagralfax, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_xpagralfaActionPerformed

    private void ypagralfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ypagralfaActionPerformed
        noresettirit();
        int a = (Integer)lenkis.getValue();
        double [][] pagralfay = {{Math.cos(Math.PI/180*a), 0, -Math.sin(Math.PI/180*a)},{0, 1, 0},{Math.sin(Math.PI/180*a), 0, Math.cos(Math.PI/180*a)}};
        punkti = reizina(pagralfay, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_ypagralfaActionPerformed

    private void zpagralfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zpagralfaActionPerformed
        noresettirit();
        int a = (Integer)lenkis.getValue();
        double [][] pagralfaz = {{Math.cos(Math.PI/180*a), Math.sin(Math.PI/180*a), 0},{-Math.sin(Math.PI/180*a), Math.cos(Math.PI/180*a), 0},{0, 0, 1}};
        punkti = reizina(pagralfaz, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_zpagralfaActionPerformed

    private void xatspogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xatspogActionPerformed
        noresettirit();
        punkti = reizina(atspogx, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_xatspogActionPerformed

    private void yatspogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yatspogActionPerformed
        noresettirit();
        punkti = reizina(atspogy, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_yatspogActionPerformed

    private void zatspogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zatspogActionPerformed
        noresettirit();
        punkti = reizina(atspogz, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_zatspogActionPerformed

    private void xizstieptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xizstieptActionPerformed
        noresettirit();
        double a = (Double)xprocenti.getValue();
        double [][] stiepsana = {{1+(a/100),0,0},{0,1,0},{0,0,1}};
        punkti = reizina(stiepsana, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_xizstieptActionPerformed

    private void yizstieptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yizstieptActionPerformed
        noresettirit();
        double a = (Double)yprocenti.getValue();
        double [][] stiepsana = {{1,0,0},{0,1+(a/100),0},{0,0,1}};
        punkti = reizina(stiepsana, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_yizstieptActionPerformed

    private void zizstieptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zizstieptActionPerformed
        noresettirit();
        double a = (Double)zprocenti.getValue();
        double [][] stiepsana = {{1,0,0},{0,1,0},{0,0,1+(a/100)}};
        punkti = reizina(stiepsana, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_zizstieptActionPerformed

    private void xsaspiestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xsaspiestActionPerformed
        noresettirit();
        double a = (Double)xprocenti.getValue();
        double [][] stiepsana = {{1-(a/100),0,0},{0,1,0},{0,0,1}};
        punkti = reizina(stiepsana, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_xsaspiestActionPerformed

    private void ysaspiestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ysaspiestActionPerformed
        noresettirit();
        double a = (Double)yprocenti.getValue();
        double [][] stiepsana = {{1,0,0},{0,1-(a/100),0},{0,0,1}};
        punkti = reizina(stiepsana, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_ysaspiestActionPerformed

    private void zsaspiestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zsaspiestActionPerformed
        noresettirit();
        double a = (Double)zprocenti.getValue();
        double [][] stiepsana = {{1,0,0},{0,1,0},{0,0,1-(a/100)}};
        punkti = reizina(stiepsana, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_zsaspiestActionPerformed

    private void palielinatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palielinatActionPerformed
        noresettirit();
        int a = (Integer)reizes.getValue();
        double [][] stiepsana = {{a,0,0},{0,a,0},{0,0,a}};
        punkti = reizina(stiepsana, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_palielinatActionPerformed

    private void samazinatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samazinatActionPerformed
        noresettirit();
        int a = (Integer)reizes.getValue();
        double b = 1/(double)a;
        double [][] stiepsana = {{b,0,0},{0,b,0},{0,0,b}};
        punkti = reizina(stiepsana, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_samazinatActionPerformed

    private void parnestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parnestActionPerformed
        noresettirit();
        int a = (Integer)xpikseli.getValue();
        int b = (Integer)ypikseli.getValue();
        int c = (Integer)zpikseli.getValue();
        double [][] parnesana = {{a, b, c}};
        punkti = pieskaita(parnesana, punkti);
        punkti2 = reizina(reiz, punkti);
        zimet();
    }//GEN-LAST:event_parnestActionPerformed
    double [][] punkti = new double[37*25][3];
    double [][] punkti2 = new double[37*25][2];
    double [][] reiz = {{1,0},{0,1},{0.5, 0.866025404}};
    double [][] atspogx = {{1,0,0},{0,1,0},{0,0,-1}};
    double [][] atspogy = {{-1,0,0},{0,1,0},{0,0,1}};
    double [][] atspogz = {{1,0,0},{0,-1,0},{0,0,1}};
    //0.866025404
    public void rekinat () {
        int i = 0;
        for (int z = 120; z > -121; z=z-10){
            for (int x = -180; x < 181; x=x+10) {
                double y = 40*Math.sin(0.043*Math.sqrt(z*z+x*x));
                punkti[i][0] = x;
                punkti[i][1] = y;
                punkti[i][2] = z;
                i++;
            }
        }
    }
    public double[][] reizina(double[][] r, double[][] punkti) {
        double[][] rez = new double[punkti.length][r[0].length];
        for (int a = 0; a < punkti.length; a++) {
            for (int b = 0; b < r[0].length; b++) {
                rez[a][b] = 0;
                for (int c = 0; c < punkti[0].length; c++) {
                    rez[a][b] = rez[a][b] + punkti[a][c]*r[c][b];
                }
            }
        }
        return rez;
    }
    public double[][] pieskaita (double[][] p, double[][] punkti) {
        double[][] rez = new double[punkti.length][punkti[0].length];
        for (int i = 0; i < punkti.length; i++){
            for (int j = 0; j < punkti[0].length; j++) {
                rez[i][j] = punkti[i][j] + p[0][j];
            }
        }
        return rez;
    }
    public void tirit () {
        Graphics g = panelis.getGraphics();
        g.clearRect(0, 0, panelis.getWidth(), panelis.getHeight());
        rekinat();
    }
    public void noresettirit () {
        Graphics g = panelis.getGraphics();
        g.clearRect(0, 0, panelis.getWidth(), panelis.getHeight());
    }
    public void zimet () {
        Graphics g = panelis.getGraphics();
        int a = 270;
        for(int i = 0; i < 37*25-38; i++) {
            if (i%37 != 36) {
                Polygon p = new Polygon();
                p.addPoint(a-(int)punkti2[i][0], a-(int)punkti2[i][1]);
                p.addPoint(a-(int)punkti2[i+37][0], a-(int)punkti2[i+37][1]);
                p.addPoint(a-(int)punkti2[i+38][0], a-(int)punkti2[i+38][1]);
                p.addPoint(a-(int)punkti2[i+1][0], a-(int)punkti2[i+1][1]);
                g.setColor(Color.white);
                g.fillPolygon(p);
                g.setColor(Color.black);
                g.drawPolygon(p);
                
            }
        }
    }

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
            java.util.logging.Logger.getLogger(cepure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cepure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cepure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cepure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cepure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleaning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JSpinner lenkis;
    private javax.swing.JButton palielinat;
    private javax.swing.JPanel panelis;
    private javax.swing.JButton parnest;
    private javax.swing.JButton poga;
    private javax.swing.JSpinner reizes;
    private javax.swing.JButton samazinat;
    private javax.swing.JButton xatspog;
    private javax.swing.JButton xizstiept;
    private javax.swing.JButton xpagralfa;
    private javax.swing.JSpinner xpikseli;
    private javax.swing.JSpinner xprocenti;
    private javax.swing.JButton xsaspiest;
    private javax.swing.JButton yatspog;
    private javax.swing.JButton yizstiept;
    private javax.swing.JButton ypagralfa;
    private javax.swing.JSpinner ypikseli;
    private javax.swing.JSpinner yprocenti;
    private javax.swing.JButton ysaspiest;
    private javax.swing.JButton zatspog;
    private javax.swing.JButton zizstiept;
    private javax.swing.JButton zpagralfa;
    private javax.swing.JSpinner zpikseli;
    private javax.swing.JSpinner zprocenti;
    private javax.swing.JButton zsaspiest;
    // End of variables declaration//GEN-END:variables
}