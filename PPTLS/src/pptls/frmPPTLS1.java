/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pptls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author david
 */
public class frmPPTLS1 extends javax.swing.JFrame {

    /**
     * Creates new form frmPPTLS1
     */
        int piedra,papel,tijera,lagarto,spock,aleatorio;
    int segundos,minutos;
    int contador;
    int marcadorp1;
    int marcadorp2;
        
           Timer temporizador = new Timer(10, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                contador++;
                lblmsegundos.setText(String.valueOf(contador));

                if(contador==10)
                {
                    segundos++;
                    lblmsegundos.setText(String.valueOf("0"));
                    lblSegundos.setText(String.valueOf(segundos));
                    contador=0;
                }
                
                if(segundos==60)
                {
                    minutos++;
                    lblMinutos.setText(String.valueOf(minutos));
                    segundos=0;
                    
                }
                if(segundos<=9)
                    {
                         lblSegundos.setText("0"+String.valueOf(segundos));
                    
                    }                  
                
                
   
               if(minutos==2)
               {
                   temporizador.stop();
                   if(marcadorp1>marcadorp2)
                   {
                     lblresultado.setText("Ganador Jugador1");
                   }

                   else if(marcadorp1<marcadorp2)
                   {
                     lblresultado.setText("Ganador Jugador2");  
                   } 
                   else
                   {
                     lblresultado.setText("Empate");  
                   }
               
               }
               
            }

            
        });
    public frmPPTLS1() {
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

        btnjugar = new javax.swing.JButton();
        btnpapel = new javax.swing.JButton();
        btnpiedra = new javax.swing.JButton();
        btnspock = new javax.swing.JButton();
        btntijera = new javax.swing.JButton();
        btnlagarto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        lblMinutos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSegundos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblmsegundos = new javax.swing.JLabel();
        lblresultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnjugar.setText("Jugar");
        btnjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnjugar);
        btnjugar.setBounds(160, 260, 59, 23);

        btnpapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pptls/papel.jpg"))); // NOI18N
        btnpapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpapelActionPerformed(evt);
            }
        });
        getContentPane().add(btnpapel);
        btnpapel.setBounds(80, 80, 50, 50);

        btnpiedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pptls/piedra.jpg"))); // NOI18N
        btnpiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpiedraActionPerformed(evt);
            }
        });
        getContentPane().add(btnpiedra);
        btnpiedra.setBounds(10, 80, 50, 50);

        btnspock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pptls/spock_1.jpg"))); // NOI18N
        btnspock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnspockActionPerformed(evt);
            }
        });
        getContentPane().add(btnspock);
        btnspock.setBounds(290, 80, 50, 50);

        btntijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pptls/tijera.jpg"))); // NOI18N
        btntijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntijeraActionPerformed(evt);
            }
        });
        getContentPane().add(btntijera);
        btntijera.setBounds(150, 80, 50, 50);

        btnlagarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pptls/lagarto.jpg"))); // NOI18N
        btnlagarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlagartoActionPerformed(evt);
            }
        });
        getContentPane().add(btnlagarto);
        btnlagarto.setBounds(220, 80, 50, 50);

        jLabel1.setText("PPTLS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 30, 69, 14);

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 140, 166, 100);

        lblMinutos.setText("00");
        getContentPane().add(lblMinutos);
        lblMinutos.setBounds(270, 50, 60, 14);

        jLabel4.setText(":");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 50, 50, 14);

        lblSegundos.setText("00");
        getContentPane().add(lblSegundos);
        lblSegundos.setBounds(300, 50, 60, 14);

        jLabel6.setText(":");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 50, 50, 14);

        lblmsegundos.setText("0");
        getContentPane().add(lblmsegundos);
        lblmsegundos.setBounds(330, 50, 80, 14);
        getContentPane().add(lblresultado);
        lblresultado.setBounds(300, 180, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugarActionPerformed
        piedra=1;
        papel=2;
        tijera=3;
        lagarto=4;
        spock=5;
    }//GEN-LAST:event_btnjugarActionPerformed

    private void btnpapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpapelActionPerformed
        txtResultado.setText("");
        txtResultado.append("Papel\n");
        txtResultado.append("vs\n");

        if(papel==aleatorio){
            txtResultado.append("Papel\n");
            txtResultado.append("Empate\n");
        }
        if(piedra==aleatorio){
            txtResultado.append("Piedra\n");
            txtResultado.append("Ganaste\n");
        }
        if(tijera==aleatorio){
            txtResultado.append("Tijera\n");
            txtResultado.append("Perdiste\n");
        }
        if(lagarto==aleatorio){
            txtResultado.append("Lagarto\n");
            txtResultado.append("Ganaste\n");
        }
        if(spock==aleatorio){
            txtResultado.append("Spock\n");
            txtResultado.append("Perdiste\n");
        }
    }//GEN-LAST:event_btnpapelActionPerformed

    private void btnpiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpiedraActionPerformed
        txtResultado.setText("");
        txtResultado.append("Piedra\n");
        txtResultado.append("vs\n");
        aleatorio=(int)(Math.random()*5+1);
        System.out.print(aleatorio);
        if(piedra==aleatorio){
            txtResultado.append("Piedra\n");
            txtResultado.append("Empate\n");
        }
        if(papel==aleatorio){
            txtResultado.append("Papel\n");
            txtResultado.append("Perdiste\n");
        }
        if(tijera==aleatorio){
            txtResultado.append("Tijera\n");
            txtResultado.append("Ganaste\n");
        }
        if(lagarto==aleatorio){
            txtResultado.append("Lagarto\n");
            txtResultado.append("Ganaste\n");
        }
        if(spock==aleatorio){
            txtResultado.append("spock\n");
            txtResultado.append("Perdiste\n");
        }
    }//GEN-LAST:event_btnpiedraActionPerformed

    private void btnspockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnspockActionPerformed
        txtResultado.setText("");
        txtResultado.append("Spock\n");
        txtResultado.append("vs\n");

        if(spock==aleatorio){
            txtResultado.append("Spock\n");
            txtResultado.append("Empate\n");
        }
        if(papel==aleatorio){
            txtResultado.append("Papel\n");
            txtResultado.append("Perdiste\n");
        }
        if(tijera==aleatorio){
            txtResultado.append("Tijera\n");
            txtResultado.append("Ganaste\n");
        }
        if(lagarto==aleatorio){
            txtResultado.append("Lagarto\n");
            txtResultado.append("Perdiste\n");
        }
        if(piedra==aleatorio){
            txtResultado.append("Piedra\n");
            txtResultado.append("Ganaste\n");
        }
    }//GEN-LAST:event_btnspockActionPerformed

    private void btntijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntijeraActionPerformed
        txtResultado.setText("");
        txtResultado.append("Tijera\n");
        txtResultado.append("vs\n");

        if(tijera==aleatorio){
            txtResultado.append("Tijera\n");
            txtResultado.append("Empate\n");
        }
        if(papel==aleatorio){
            txtResultado.append("Papel\n");
            txtResultado.append("Ganaste\n");
        }
        if(piedra==aleatorio){
            txtResultado.append("Piedra\n");
            txtResultado.append("Perdiste\n");
        }
        if(lagarto==aleatorio){
            txtResultado.append("Lagarto\n");
            txtResultado.append("Ganaste\n");
        }
        if(spock==aleatorio){
            txtResultado.append("Spock\n");
            txtResultado.append("Perdiste\n");
        }
    }//GEN-LAST:event_btntijeraActionPerformed

    private void btnlagartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlagartoActionPerformed
        txtResultado.setText("");
        txtResultado.append("Lagarto\n");
        txtResultado.append("vs\n");

        if(lagarto==aleatorio){
            txtResultado.append("Lagarto\n");
            txtResultado.append("Empate\n");
        }
        if(papel==aleatorio){
            txtResultado.append("Papel\n");
            txtResultado.append("Ganaste\n");
        }
        if(tijera==aleatorio){
            txtResultado.append("Tijera\n");
            txtResultado.append("Perdiste\n");
        }
        if(piedra==aleatorio){
            txtResultado.append("Piedra\n");
            txtResultado.append("Perdiste\n");
        }
        if(spock==aleatorio){
            txtResultado.append("Spock\n");
            txtResultado.append("Ganaste\n");
        }
    }//GEN-LAST:event_btnlagartoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        txtResultado.append("Inicia el juego\n");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmPPTLS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPPTLS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPPTLS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPPTLS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPPTLS1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnjugar;
    private javax.swing.JButton btnlagarto;
    private javax.swing.JButton btnpapel;
    private javax.swing.JButton btnpiedra;
    private javax.swing.JButton btnspock;
    private javax.swing.JButton btntijera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JLabel lblSegundos;
    private javax.swing.JLabel lblmsegundos;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
