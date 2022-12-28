package labirints;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class Labirints extends javax.swing.JFrame {
    int m,n; //labirinta rindu un kolonnu skaits
    int x, y;
    public Labirints() {
        initComponents();
    }
ArrayList<Integer>[ ] labirints;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lasa = new javax.swing.JButton();
        zime = new javax.swing.JButton();
        panelis = new javax.swing.JPanel();
        notirit = new javax.swing.JButton();
        teksts1 = new javax.swing.JLabel();
        sakrut = new javax.swing.JSpinner();
        teksts2 = new javax.swing.JLabel();
        beigrut = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lasa.setText("Uzzīmēt labirintu");
        lasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lasaActionPerformed(evt);
            }
        });

        zime.setText("Uzzīmēt ceļu");
        zime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelisLayout = new javax.swing.GroupLayout(panelis);
        panelis.setLayout(panelisLayout);
        panelisLayout.setHorizontalGroup(
            panelisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        panelisLayout.setVerticalGroup(
            panelisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        notirit.setText("Notīrīt");
        notirit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notiritActionPerformed(evt);
            }
        });

        teksts1.setText("Sākuma rūtiņa");

        sakrut.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        sakrut.setValue(1);

        teksts2.setText("Beigu rūtiņa");

        beigrut.setValue(1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(panelis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(notirit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(teksts1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(beigrut, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(teksts2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addComponent(sakrut, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(zime)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notirit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teksts1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sakrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teksts2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beigrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lasaActionPerformed
        try { 
            BufferedReader bufRdr  = new BufferedReader(new FileReader("labirints.txt")); 
            String failaRinda = bufRdr.readLine(); //nolasa no faila vienu teksta rindu
            String[] tmp=failaRinda.split(" ");    //sadala to atsevišķos gabaliņos, kurus saliek masīvā tmp
            m=Integer.parseInt(tmp[0]);            //iegūst rindu skaitu
            n=Integer.parseInt(tmp[1]);            //iegūst kolonnu skaitu
            //System.out.println(m+" "+n);           //izvada rindu un kolonnu skaitu testa nolūkiem
            Graphics2D g=(Graphics2D)panelis.getGraphics();
            g.setStroke(new BasicStroke(1));
            for (int i = 0; i <= n; i++) {
                g.drawLine(i*50, 0, i*50, m*50);
            }
            for (int i = 0; i <= m; i++) {
                g.drawLine(0, i*50, n*50, i*50);
            }
            //g.drawLine(0,0, 20*n, 0);               
            g.setColor(panelis.getBackground());
            //g.setColor(Color.red);
            g.setStroke(new BasicStroke(3));
            labirints=new ArrayList[m*n];
            for(int i=0;i<labirints.length;i++){
                failaRinda = bufRdr.readLine();
                tmp=failaRinda.split(" ");
                labirints[i]=new ArrayList<Integer>();
                for(int j=1;j<tmp.length;j++){
                    labirints[i].add(Integer.parseInt(tmp[j]));
                }
            }
            for (int i = 0; i < labirints.length; i++) {
                x = i;
                Iterator it = labirints[i].iterator();
                while(it.hasNext()) {
                    y = (Integer)it.next() - 1;
                    //System.out.println(x +" " +y);
                    if (x - y == 1) {
                        g.drawLine(x%n*50, x/n*50, x%n*50, x/n*50+50);
                    }
                    if (x - y == -1) {
                        g.drawLine(x%n*50+50, x/n*50, x%n*50+50, x/n*50+50);
                    }
                    if ((x-y)/n == 1) {
                        g.drawLine(x%n*50, x/n*50, x%n*50+50, x/n*50);
                    }
                    if ((x-y)/n == -1) {
                        g.drawLine(x%n*50, x/n*50+50, x%n*50+50, x/n*50+50);
                    }
                }
                
            }
//            for(int i=0;i<labirints.length;i++){
//                System.out.print((i)+" kaimiņi: ");
//                Iterator it=labirints[i].iterator();
//                while(it.hasNext()){
//                    int j=(Integer)it.next()-1;  
//                    System.out.print(j+" ");
//                } 
//            System.out.println();
//            }

            //g.drawLine(20*(n-1),0, 20*n, 0);
        } catch (IOException e) { 
            System.err.println(e); 
            System.exit(1); 
    } 
        
    }//GEN-LAST:event_lasaActionPerformed

    private void zimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zimeActionPerformed
        int rs = 1, rb = 1;
        rs = (Integer)sakrut.getValue();
        rb = (Integer)beigrut.getValue();
        zimetCelu(rs,rb);
    }//GEN-LAST:event_zimeActionPerformed

    private void notiritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notiritActionPerformed
        Graphics g=panelis.getGraphics();
        g.clearRect(0, 0, panelis.getWidth(), panelis.getHeight());
    }//GEN-LAST:event_notiritActionPerformed
    public void zimetCelu(int no,int uz){
       Stack<Integer> cels=mekletCelu(no,uz);
       int gar = cels.size();
//       for (int i = 0; i < gar; i++) {
//            System.out.println(cels.pop());
//       } 3 8 7 2
       Graphics g=panelis.getGraphics();
       g.setColor(Color.red);
       for (int i = 0; i < gar-1; i++) {
           x = cels.elementAt(i);
           y = cels.elementAt(i+1);
           if (x - y == 1) {
                g.drawLine(x%n*50+25, x/n*50+25, x%n*50-25, x/n*50+25);
           }
           if (x - y == -1) {
                g.drawLine(x%n*50+25, x/n*50+25, x%n*50+50+25, x/n*50+25);
           }
           if ((x-y)/n == 1) {
                g.drawLine(x%n*50+25, x/n*50+25, x%n*50+25, x/n*50-25);
           }
           if ((x-y)/n == -1) {
                g.drawLine(x%n*50+25, x/n*50+25, x%n*50+25, x/n*50+50+25);
           }
       }
       //g.setColor(Color.red);
       //g.drawLine(25, 25, 25, 75);
    }
    int p, u;
    public Stack<Integer> mekletCelu(int no, int uz){
        int no1 = no-1;
        int uz1 = uz-1;
        Stack<Integer> cels=new Stack();
        boolean apmeklets[] = new boolean[m*n];
        for (int i = 0; i < m*n; i++) {
            apmeklets[i] = false;
        }
        LinkedList<Integer> rinda = new LinkedList<Integer>();
        int[] masivs = new int[m*n];
        for (int i = 0; i < m*n; i++) {
            masivs[i] = -2;
        }
        masivs[no1] = -1;
        rinda.add(no1);
        apmeklets[no1] = true;
        outer:
        while(rinda.isEmpty() == false) {
            p = rinda.remove();
            //System.out.println(p);
            Iterator<Integer> i = labirints[p].listIterator();
            while (i.hasNext()) {
                u = i.next()-1;
                //System.out.println(u);
                if (apmeklets[u] != true) {
                    rinda.add(u);
                    apmeklets[u] = true;
                    masivs[u] = p;
                    if (u == uz1) {
                        break outer;
                    }
                }
            }
        }
        cels.addElement(uz1);
        while (masivs[uz1] != -1) {
            cels.addElement(masivs[uz1]);
            uz1 = masivs[uz1];
        }
        //cels.push(uz1);
        return cels;
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
            java.util.logging.Logger.getLogger(Labirints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Labirints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Labirints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Labirints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Labirints().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner beigrut;
    private javax.swing.JButton lasa;
    private javax.swing.JButton notirit;
    private javax.swing.JPanel panelis;
    private javax.swing.JSpinner sakrut;
    private javax.swing.JLabel teksts1;
    private javax.swing.JLabel teksts2;
    private javax.swing.JButton zime;
    // End of variables declaration//GEN-END:variables
}
