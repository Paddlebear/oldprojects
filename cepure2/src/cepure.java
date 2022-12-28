
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class cepure extends javax.swing.JFrame {
    public cepure() {
        initComponents();
        rekinat();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        zimetpoga = new javax.swing.JButton();
        tirit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        alfa = new javax.swing.JTextField();
        xgriezt = new javax.swing.JButton();
        ygriezt = new javax.swing.JButton();
        zgriezt = new javax.swing.JButton();
        xspogulis = new javax.swing.JButton();
        yspogulis = new javax.swing.JButton();
        zspogulis = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        procenti = new javax.swing.JTextField();
        xstiept = new javax.swing.JButton();
        ystiept = new javax.swing.JButton();
        zstiept = new javax.swing.JButton();
        xspiest = new javax.swing.JButton();
        yspiest = new javax.swing.JButton();
        zspiest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );

        zimetpoga.setText("cepure");
        zimetpoga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zimetpogaActionPerformed(evt);
            }
        });

        tirit.setText("tīrīt");
        tirit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiritActionPerformed(evt);
            }
        });

        jLabel1.setText("alfa");

        alfa.setText("30");

        xgriezt.setText("griezt pa x");
        xgriezt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xgrieztActionPerformed(evt);
            }
        });

        ygriezt.setText("griezt pa y");
        ygriezt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ygrieztActionPerformed(evt);
            }
        });

        zgriezt.setText("griezt pa z");
        zgriezt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zgrieztActionPerformed(evt);
            }
        });

        xspogulis.setText("x atspoguļot");
        xspogulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xspogulisActionPerformed(evt);
            }
        });

        yspogulis.setText("y atspoguļot");
        yspogulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yspogulisActionPerformed(evt);
            }
        });

        zspogulis.setText("z atspoguļot");
        zspogulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zspogulisActionPerformed(evt);
            }
        });

        jLabel2.setText("par cik % stiept");

        procenti.setText("10");

        xstiept.setText("stiept pa x");
        xstiept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xstieptActionPerformed(evt);
            }
        });

        ystiept.setText("stiept pa y");
        ystiept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ystieptActionPerformed(evt);
            }
        });

        zstiept.setText("stiept pa z");
        zstiept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zstieptActionPerformed(evt);
            }
        });

        xspiest.setText("saspiest pa x");
        xspiest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xspiestActionPerformed(evt);
            }
        });

        yspiest.setText("saspiest pa y");
        yspiest.setToolTipText("");
        yspiest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yspiestActionPerformed(evt);
            }
        });

        zspiest.setText("saspiest pa z");
        zspiest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zspiestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tirit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zimetpoga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alfa)
                            .addComponent(xgriezt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ygriezt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xspogulis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zgriezt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zspogulis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(procenti)
                            .addComponent(xstiept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ystiept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xspiest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yspiest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(zspiest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zstiept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yspogulis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zimetpoga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(xgriezt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ygriezt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zgriezt)
                        .addGap(18, 18, 18)
                        .addComponent(xspogulis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yspogulis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zspogulis)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(procenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xstiept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ystiept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zstiept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(xspiest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yspiest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zspiest)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(tirit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zimetpogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zimetpogaActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        rekinat();
        uz2d();
        zimet();
    }//GEN-LAST:event_zimetpogaActionPerformed

    private void tiritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiritActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        rekinat();
    }//GEN-LAST:event_tiritActionPerformed

    private void xgrieztActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xgrieztActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        int lenkis=Integer.parseInt(alfa.getText());
        double[][] grieztx = {{1, 0, 0},{0,Math.cos(Math.PI/180*lenkis),Math.sin(Math.PI/180*lenkis)},{0,-Math.sin(Math.PI/180*lenkis),Math.cos(Math.PI/180*lenkis)}};
        punkti=reizinat(punkti, grieztx);
        uz2d();
        zimet();
    }//GEN-LAST:event_xgrieztActionPerformed

    private void ygrieztActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ygrieztActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        int lenkis=Integer.parseInt(alfa.getText());
        double[][] griezty = {{Math.cos(Math.PI/180*lenkis), 0, -Math.sin(Math.PI/180*lenkis)},{0, 1, 0},{Math.sin(Math.PI/180*lenkis), 0, Math.cos(Math.PI/180*lenkis)}};
        punkti=reizinat(punkti, griezty);
        uz2d();
        zimet();
    }//GEN-LAST:event_ygrieztActionPerformed

    private void zgrieztActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zgrieztActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        int lenkis=Integer.parseInt(alfa.getText());
        double[][] grieztz = {{Math.cos(Math.PI/180*lenkis), Math.sin(Math.PI/180*lenkis), 0},{-Math.sin(Math.PI/180*lenkis), Math.cos(Math.PI/180*lenkis), 0},{0, 0, 1}};
        punkti=reizinat(punkti, grieztz);
        uz2d();
        zimet();
    }//GEN-LAST:event_zgrieztActionPerformed

    private void xspogulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xspogulisActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        double[][] xspog = {{1,0,0},{0,1,0},{0,0,-1}};
        punkti=reizinat(punkti, xspog);
        uz2d();
        zimet();
    }//GEN-LAST:event_xspogulisActionPerformed

    private void yspogulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yspogulisActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        double[][] yspog = {{-1,0,0},{0,1,0},{0,0,1}};
        punkti=reizinat(punkti, yspog);
        uz2d();
        zimet();
    }//GEN-LAST:event_yspogulisActionPerformed

    private void zspogulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zspogulisActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        double[][] zspog = {{1,0,0},{0,-1,0},{0,0,1}};
        punkti=reizinat(punkti, zspog);
        uz2d();
        zimet();
    }//GEN-LAST:event_zspogulisActionPerformed

    private void xstieptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xstieptActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        double a=Double.parseDouble(procenti.getText());
        a=a/100+1;
        double[][] stieptx = {{a,0,0},{0,1,0},{0,0,1}};
        punkti=reizinat(punkti, stieptx);
        uz2d();
        zimet();
    }//GEN-LAST:event_xstieptActionPerformed

    private void ystieptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ystieptActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        double a=Double.parseDouble(procenti.getText());
        a=a/100+1;
        double[][] stiepty = {{1,0,0},{0,a,0},{0,0,1}};
        punkti=reizinat(punkti, stiepty);
        uz2d();
        zimet();
    }//GEN-LAST:event_ystieptActionPerformed

    private void zstieptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zstieptActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        double a=Double.parseDouble(procenti.getText());
        a=a/100+1;
        double[][] stieptz = {{1,0,0},{0,1,0},{0,0,a}};
        punkti=reizinat(punkti, stieptz);
        uz2d();
        zimet();
    }//GEN-LAST:event_zstieptActionPerformed

    private void xspiestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xspiestActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        double a=Double.parseDouble(procenti.getText());
        a=1-(a/100);
        double[][] spiestx = {{a,0,0},{0,1,0},{0,0,1}};
        punkti=reizinat(punkti, spiestx);
        uz2d();
        zimet();
    }//GEN-LAST:event_xspiestActionPerformed

    private void yspiestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yspiestActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        double a=Double.parseDouble(procenti.getText());
        a=1-(a/100);
        double[][] spiesty = {{1,0,0},{0,a,0},{0,0,1}};
        punkti=reizinat(punkti, spiesty);
        uz2d();
        zimet();
    }//GEN-LAST:event_yspiestActionPerformed

    private void zspiestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zspiestActionPerformed
        Graphics g = jPanel1.getGraphics();
        g.clearRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        double a=Double.parseDouble(procenti.getText());
        a=1-(a/100);
        double[][] spiestz = {{1,0,0},{0,1,0},{0,0,a}};
        punkti=reizinat(punkti, spiestz);
        uz2d();
        zimet();
    }//GEN-LAST:event_zspiestActionPerformed
    
    double[][] punkti = new double[37*25][3];
    double[][] punkti2 = new double[37*25][2];
    double[][] reiz = {{1,0},{0,1},{0.5,0.866025404}};
    
    public double[][] reizinat(double[][] punkti, double[][] r) {
        double[][] rez = new double[punkti.length][r[0].length];
        for (int a=0; a<punkti.length; a++) {
            for (int b=0; b<r[0].length; b++) {
                rez[a][b]=0;
                for (int c=0; c<punkti[0].length; c++) {
                    rez[a][b]=rez[a][b]+punkti[a][c]*r[c][b];
                }
            }
        }
        return rez;
    }
    public void rekinat () {
        int i=0;
        for (int z=120; z>-121; z=z-10){
            for (int x=-180; x<181; x=x+10) {
                double y =40*Math.sin(0.043*Math.sqrt(z*z+x*x));
                punkti[i][0]=x;
                punkti[i][1]=y;
                punkti[i][2]=z;
                i++;
            }
        }
    }
    public void uz2d () {
        double[][] rez = new double[37*25][2];
        for (int a=0; a<punkti.length; a++) {
            for (int b=0; b<reiz[0].length; b++) {
                rez[a][b] = 0;
                for (int c=0; c<punkti[0].length; c++) {
                    rez[a][b] = rez[a][b] + punkti[a][c]*reiz[c][b];
                }
            }
        }
        punkti2 = rez;
    }
    public void zimet () {
        Graphics g =jPanel1.getGraphics();
        for(int i=0; i<37*25-38; i++) {
            if ((i-36)%37!=0) {
                g.setColor(Color.green);
                Polygon p = new Polygon();
                p.addPoint(250+(int)punkti2[i][0], 250-(int)punkti2[i][1]);
                p.addPoint(250+(int)punkti2[i+1][0], 250-(int)punkti2[i+1][1]);
                p.addPoint(250+(int)punkti2[i+38][0], 250-(int)punkti2[i+38][1]);
                p.addPoint(250+(int)punkti2[i+37][0], 250-(int)punkti2[i+37][1]);
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
    private javax.swing.JTextField alfa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField procenti;
    private javax.swing.JButton tirit;
    private javax.swing.JButton xgriezt;
    private javax.swing.JButton xspiest;
    private javax.swing.JButton xspogulis;
    private javax.swing.JButton xstiept;
    private javax.swing.JButton ygriezt;
    private javax.swing.JButton yspiest;
    private javax.swing.JButton yspogulis;
    private javax.swing.JButton ystiept;
    private javax.swing.JButton zgriezt;
    private javax.swing.JButton zimetpoga;
    private javax.swing.JButton zspiest;
    private javax.swing.JButton zspogulis;
    private javax.swing.JButton zstiept;
    // End of variables declaration//GEN-END:variables
}
