package com.testelambda.calcuradoralambda;

import java.math.BigDecimal;
import javax.swing.JFrame;

/**
 *
 * @author Tiago
 */
public class Principal extends javax.swing.JFrame {

    private Calculo funcaoCalculo;
    private BigDecimal primeiro;

    public Principal() {
        initComponents();
        primeiro = BigDecimal.ZERO;

        btUm.setActionCommand("1");
        btDois.setActionCommand("2");
        btTres.setActionCommand("3");
        btQuatro.setActionCommand("4");
        btCinco.setActionCommand("5");
        btSeis.setActionCommand("6");
        btSete.setActionCommand("7");
        btOito.setActionCommand("8");
        btNove.setActionCommand("9");
        btZero.setActionCommand("0");
        btPonto.setActionCommand(".");    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txResultado = new javax.swing.JTextField();
        btMMais = new javax.swing.JButton();
        btMMenos = new javax.swing.JButton();
        btSete = new javax.swing.JButton();
        btOito = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        btQuatro = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCinco = new javax.swing.JButton();
        btMultiplicao = new javax.swing.JButton();
        btSeis = new javax.swing.JButton();
        btDois = new javax.swing.JButton();
        btUm = new javax.swing.JButton();
        btNove = new javax.swing.JButton();
        btTres = new javax.swing.JButton();
        btAdicao = new javax.swing.JButton();
        btSubtracao = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();
        btZero = new javax.swing.JButton();
        btPonto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora - Lambdas");

        btMMais.setText("M+");

        btMMenos.setText("M-");

        btSete.setText("7");
        btSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeteActionPerformed(evt);
            }
        });

        btOito.setText("8");
        btOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOitoActionPerformed(evt);
            }
        });

        btDividir.setText("/");
        btDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirActionPerformed(evt);
            }
        });

        btQuatro.setText("4");
        btQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuatroActionPerformed(evt);
            }
        });

        btLimpar.setText("C");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCinco.setText("5");
        btCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCincoActionPerformed(evt);
            }
        });

        btMultiplicao.setText("X");
        btMultiplicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicaoActionPerformed(evt);
            }
        });

        btSeis.setText("6");
        btSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeisActionPerformed(evt);
            }
        });

        btDois.setText("2");
        btDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoisActionPerformed(evt);
            }
        });

        btUm.setText("1");
        btUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUmActionPerformed(evt);
            }
        });

        btNove.setText("9");
        btNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNoveActionPerformed(evt);
            }
        });

        btTres.setText("3");
        btTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTresActionPerformed(evt);
            }
        });

        btAdicao.setText("+");
        btAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicaoActionPerformed(evt);
            }
        });

        btSubtracao.setText("-");
        btSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubtracaoActionPerformed(evt);
            }
        });

        btIgual.setText("=");
        btIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgualActionPerformed(evt);
            }
        });

        btZero.setText("0");
        btZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btZeroActionPerformed(evt);
            }
        });

        btPonto.setText(".");
        btPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btMMais, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btMMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSete, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btOito, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btNove, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btMultiplicao, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btUm, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btZero, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btDois, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btTres, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(btAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(txResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMMais, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMultiplicao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btUm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btZero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btDois, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btTres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirActionPerformed
        funcaoCalculo = (x, y) -> {
            return x.divide(y);
        };
        guardaPrimeiroValor();
    }//GEN-LAST:event_btDividirActionPerformed

    private void btMultiplicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicaoActionPerformed
        funcaoCalculo = (x, y) -> {
            return x.multiply(y);
        };
        guardaPrimeiroValor();
    }//GEN-LAST:event_btMultiplicaoActionPerformed

    private void btSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubtracaoActionPerformed
        funcaoCalculo = (x, y) -> {
            return x.subtract(y);
        };
    }//GEN-LAST:event_btSubtracaoActionPerformed

    private void btAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicaoActionPerformed
        funcaoCalculo = (x, y) -> {
            return x.add(y);
        };
        guardaPrimeiroValor();
    }//GEN-LAST:event_btAdicaoActionPerformed

    private void btIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIgualActionPerformed
        txResultado.setText((funcaoCalculo.calcular(primeiro, new BigDecimal(txResultado.getText()))).toString());          // TODO add your handling code here:
    }//GEN-LAST:event_btIgualActionPerformed

    private void btSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeteActionPerformed
        registrarNumero(evt);
    }//GEN-LAST:event_btSeteActionPerformed

    private void btOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOitoActionPerformed
        registrarNumero(evt);
    }//GEN-LAST:event_btOitoActionPerformed

    private void btNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNoveActionPerformed
        registrarNumero(evt);
    }//GEN-LAST:event_btNoveActionPerformed

    private void btQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuatroActionPerformed
        registrarNumero(evt);
    }//GEN-LAST:event_btQuatroActionPerformed

    private void btCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCincoActionPerformed
        registrarNumero(evt);
    }//GEN-LAST:event_btCincoActionPerformed

    private void btSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeisActionPerformed
        registrarNumero(evt);
    }//GEN-LAST:event_btSeisActionPerformed

    private void btUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUmActionPerformed
        registrarNumero(evt);
    }//GEN-LAST:event_btUmActionPerformed

    private void btDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoisActionPerformed
        registrarNumero(evt);
    }//GEN-LAST:event_btDoisActionPerformed

    private void btTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTresActionPerformed
        registrarNumero(evt);
    }//GEN-LAST:event_btTresActionPerformed

    private void btZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btZeroActionPerformed
        registrarNumero(evt);
    }//GEN-LAST:event_btZeroActionPerformed

    private void btPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPontoActionPerformed
        registrarNumero(evt);
    }//GEN-LAST:event_btPontoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
      txResultado.setText("");      
    }//GEN-LAST:event_btLimparActionPerformed

    public static void main(String args[]) {
        Principal p = new Principal();
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicao;
    private javax.swing.JButton btCinco;
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btDois;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btMMais;
    private javax.swing.JButton btMMenos;
    private javax.swing.JButton btMultiplicao;
    private javax.swing.JButton btNove;
    private javax.swing.JButton btOito;
    private javax.swing.JButton btPonto;
    private javax.swing.JButton btQuatro;
    private javax.swing.JButton btSeis;
    private javax.swing.JButton btSete;
    private javax.swing.JButton btSubtracao;
    private javax.swing.JButton btTres;
    private javax.swing.JButton btUm;
    private javax.swing.JButton btZero;
    private javax.swing.JTextField txResultado;
    // End of variables declaration//GEN-END:variables

    public void guardaPrimeiroValor() {
        this.primeiro = new BigDecimal(txResultado.getText());
        txResultado.setText("");
    }

    private void registrarNumero(java.awt.event.ActionEvent evt) {
        txResultado.setText(evt.getActionCommand() + txResultado.getText());
    }
}
