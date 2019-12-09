/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Doador;
import controller.Triagem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Querys;

/**
 *
 * @author leo_m
 */
public class TelaPerguntas extends javax.swing.JFrame {

    /**
     * Creates new form TelaPerguntas
     */
    public TelaPerguntas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private boolean taSelecionado(JRadioButton sim, JRadioButton nao, int pergunta) {
        boolean resultado = true;
        String erro = "Preencha a pergunta sobre ";
        if (!sim.isSelected() && !nao.isSelected()) {
            switch (pergunta) {
                case 1:
                    erro += "Anemia.";
                    break;
                case 2:
                    erro += "HebatiteB.";
                    break;
                case 3:
                    erro += "HepatiteC.";
                    break;
                case 4:
                    erro += "Doença de Chagas.";
                    break;
                case 6:
                    erro += "Sífilis.";
                    break;
                case 7:
                    erro += "AIDS.";
                    break;
                case 8:
                    erro += "HTLV.";
                    break;
            }
            JOptionPane.showMessageDialog(null, erro);
            resultado = false;

        }

        return resultado;
    }

    private boolean yesorNot(JRadioButton sim, JRadioButton nao, int pergunta) {
        boolean resultado;
        if (taSelecionado(sim, nao, pergunta)) {
            resultado = !nao.isSelected();
            return resultado;
        }
        return true;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpAnemia = new javax.swing.ButtonGroup();
        grpHepatiteB = new javax.swing.ButtonGroup();
        grpHepatiteC = new javax.swing.ButtonGroup();
        grpChagas = new javax.swing.ButtonGroup();
        grpSifilis = new javax.swing.ButtonGroup();
        grpAIDS = new javax.swing.ButtonGroup();
        grpHTLV = new javax.swing.ButtonGroup();
        lbTriagem = new javax.swing.JLabel();
        Anemia = new javax.swing.JLabel();
        lbSim1 = new javax.swing.JRadioButton();
        lbNao1 = new javax.swing.JRadioButton();
        HepatiteB = new javax.swing.JLabel();
        lbSim2 = new javax.swing.JRadioButton();
        lbNao2 = new javax.swing.JRadioButton();
        HepatiteC = new javax.swing.JLabel();
        lbSim3 = new javax.swing.JRadioButton();
        lbNao3 = new javax.swing.JRadioButton();
        Chagas = new javax.swing.JLabel();
        lbSim4 = new javax.swing.JRadioButton();
        lbNao4 = new javax.swing.JRadioButton();
        Sifilis = new javax.swing.JLabel();
        lbSim6 = new javax.swing.JRadioButton();
        lbNao6 = new javax.swing.JRadioButton();
        AIDS = new javax.swing.JLabel();
        lbSim7 = new javax.swing.JRadioButton();
        lbNao7 = new javax.swing.JRadioButton();
        HTLV = new javax.swing.JLabel();
        lbSim8 = new javax.swing.JRadioButton();
        lbNao8 = new javax.swing.JRadioButton();
        btnTriagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTriagem.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbTriagem.setText("Triagem");

        Anemia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Anemia.setText("Possui Anemia?");

        grpAnemia.add(lbSim1);
        lbSim1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSim1.setText("Sim");

        grpAnemia.add(lbNao1);
        lbNao1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNao1.setText("Não");

        HepatiteB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HepatiteB.setText("Possui Hepatite B?");

        grpHepatiteB.add(lbSim2);
        lbSim2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSim2.setText("Sim");

        grpHepatiteB.add(lbNao2);
        lbNao2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNao2.setText("Não");

        HepatiteC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HepatiteC.setText("Possui Hepatite C?");

        grpHepatiteC.add(lbSim3);
        lbSim3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSim3.setText("Sim");

        grpHepatiteC.add(lbNao3);
        lbNao3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNao3.setText("Não");

        Chagas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Chagas.setText("Possui doença de Chagas?");

        grpChagas.add(lbSim4);
        lbSim4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSim4.setText("Sim");

        grpChagas.add(lbNao4);
        lbNao4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNao4.setText("Não");

        Sifilis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sifilis.setText("Possui Sifilis?");

        grpSifilis.add(lbSim6);
        lbSim6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSim6.setText("Sim");

        grpSifilis.add(lbNao6);
        lbNao6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNao6.setText("Não");

        AIDS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AIDS.setText("Possui AIDS?");

        grpAIDS.add(lbSim7);
        lbSim7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSim7.setText("Sim");

        grpAIDS.add(lbNao7);
        lbNao7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNao7.setText("Não");

        HTLV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HTLV.setText("Possui HTLV I/II?");

        grpHTLV.add(lbSim8);
        lbSim8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSim8.setText("Sim");

        grpHTLV.add(lbNao8);
        lbNao8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNao8.setText("Não");

        btnTriagem.setText("TERMINAR TRIAGEM");
        btnTriagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(210, 210, 210)
                            .addComponent(Chagas))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(243, 243, 243)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnTriagem)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbSim4)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbNao4)))
                            .addGap(43, 43, 43)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbSim2)
                                        .addGap(27, 27, 27)
                                        .addComponent(lbNao2))
                                    .addComponent(HepatiteB))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HTLV)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lbSim8)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbNao8))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbSim1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbNao1))
                                    .addComponent(Anemia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(Sifilis))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbSim6)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbNao6))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbTriagem)
                                .addGap(11, 11, 11)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbSim3)
                                .addGap(18, 18, 18)
                                .addComponent(lbNao3))
                            .addComponent(HepatiteC)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbSim7)
                                .addGap(18, 18, 18)
                                .addComponent(lbNao7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(AIDS)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTriagem)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Anemia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSim1)
                            .addComponent(lbNao1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AIDS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSim7)
                            .addComponent(lbNao7)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSim6)
                        .addComponent(lbNao6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Sifilis)
                        .addGap(38, 38, 38)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HepatiteB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSim2)
                            .addComponent(lbNao2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HTLV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSim8)
                            .addComponent(lbNao8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HepatiteC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSim3)
                            .addComponent(lbNao3))))
                .addGap(35, 35, 35)
                .addComponent(Chagas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSim4)
                    .addComponent(lbNao4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnTriagem)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTriagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriagemActionPerformed
        Querys qr = new Querys();
        Triagem triagem = new Triagem();
        triagem.setAnemia(yesorNot(lbSim1, lbNao1, 1));
        triagem.setHepatiteB(yesorNot(lbSim2, lbNao2, 2));
        triagem.setHepatiteC(yesorNot(lbSim3, lbNao3, 3));
        triagem.setChagas(yesorNot(lbSim4, lbNao4, 4));
        triagem.setSifilis(yesorNot(lbSim6, lbNao6, 6));
        triagem.setAids(yesorNot(lbSim7, lbNao7, 7));
        triagem.setHtlv(yesorNot(lbSim8, lbNao8, 8));
        triagem.setIdDoador(doador.getIdDoador());
        triagem.leTriagem();
        if(triagem.liberacao()){
            qr.novaTriagem(triagem);
            qr.novaDoacao(doador);
            JOptionPane.showMessageDialog(null, doador.getNomeCompleto()+" liberado para doação!");
            dispose();
            TelaInicial ti = new TelaInicial();
            ti.setVisible(true);
        }
    }//GEN-LAST:event_btnTriagemActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AIDS;
    private javax.swing.JLabel Anemia;
    private javax.swing.JLabel Chagas;
    private javax.swing.JLabel HTLV;
    private javax.swing.JLabel HepatiteB;
    private javax.swing.JLabel HepatiteC;
    private javax.swing.JLabel Sifilis;
    private javax.swing.JButton btnTriagem;
    private javax.swing.ButtonGroup grpAIDS;
    private javax.swing.ButtonGroup grpAnemia;
    private javax.swing.ButtonGroup grpChagas;
    private javax.swing.ButtonGroup grpHTLV;
    private javax.swing.ButtonGroup grpHepatiteB;
    private javax.swing.ButtonGroup grpHepatiteC;
    private javax.swing.ButtonGroup grpSifilis;
    private javax.swing.JRadioButton lbNao1;
    private javax.swing.JRadioButton lbNao2;
    private javax.swing.JRadioButton lbNao3;
    private javax.swing.JRadioButton lbNao4;
    private javax.swing.JRadioButton lbNao6;
    private javax.swing.JRadioButton lbNao7;
    private javax.swing.JRadioButton lbNao8;
    private javax.swing.JRadioButton lbSim1;
    private javax.swing.JRadioButton lbSim2;
    private javax.swing.JRadioButton lbSim3;
    private javax.swing.JRadioButton lbSim4;
    private javax.swing.JRadioButton lbSim6;
    private javax.swing.JRadioButton lbSim7;
    private javax.swing.JRadioButton lbSim8;
    private javax.swing.JLabel lbTriagem;
    // End of variables declaration//GEN-END:variables
    private Doador doador;

    /**
     * @return the doador
     */
    public Doador getDoador() {
        return doador;
    }

    /**
     * @param doador the doador to set
     */
    public void setDoador(Doador doador) {
        this.doador = doador;
    }
}
