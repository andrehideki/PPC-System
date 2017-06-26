package br.com.trabalhofinal.view;

import br.com.trabalhofinal.conexao.Conexao;
import java.io.File;
import java.sql.Connection;

public class Splash extends javax.swing.JFrame {

    private Conexao con;
    private Connection conn;
    private String barra = File.separator;
    private String projeto = System.getProperty("user.dir") + barra + "BancoDeDados";
    private File url = new File("BancoDeDados");
    TelaMenuPrincipal tmp;

    public Splash() {

        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);//Posiciona o frame no meio da tela 
        this.progressoPb.setVisible(true);

        con = new Conexao();
        if (url.exists()) {
            feedbackLbl.setText("Carregando banco de dados...");
            incializarSistema();
        } else {
            feedbackLbl.setText("Criando banco de dados...");
            con.createDB();
            feedbackLbl.setText("Banco de dados criado com sucesso!");
            incializarSistema();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        progressoPb = new javax.swing.JProgressBar();
        feedbackLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(32, 94, 204));

        jLabel8.setBackground(new java.awt.Color(32, 94, 204));
        jLabel8.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("P.P.C.System V.1.0");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Organize os seu produtos, pedidos e clientes de forma fácil e simplificada");

        feedbackLbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        feedbackLbl.setForeground(new java.awt.Color(255, 255, 255));
        feedbackLbl.setText("feedback");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(feedbackLbl)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progressoPb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(46, 46, 46)
                .addComponent(progressoPb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(feedbackLbl)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        new Splash();

    }

    private void incializarSistema() {
        for (int i = 0; i < 80; i++) {
            try {
                Thread.sleep(20);
                progressoPb.setValue(i);
            } catch (InterruptedException ex) {
                System.out.println("Erro:" + ex.getMessage());
            }
        }
        tmp = new TelaMenuPrincipal();
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(20);
                progressoPb.setValue(i+80);
            } catch (InterruptedException ex) {
                System.out.println("Erro:" + ex.getMessage());
            }
        }
        this.setVisible(false);
        tmp.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel feedbackLbl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progressoPb;
    // End of variables declaration//GEN-END:variables
}
