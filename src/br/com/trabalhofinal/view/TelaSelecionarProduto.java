package br.com.trabalhofinal.view;

import br.com.trabalhofinal.controller.ControllerPedido;
import br.com.trabalhofinal.model.Produto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class TelaSelecionarProduto extends javax.swing.JInternalFrame {

    private EtchedBorder bordaSelecionada = new EtchedBorder(new Color(0, 191, 255), null);
    public Produto p;
    private ArrayList<Produto> produtos;
    

    public TelaSelecionarProduto() {
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior
        ControllerPedido.setRefTelaSelProd(this);
        
    }
    public JTable getTabela(){
        return this.produtosTb;
    }
    public int getQtdeSelecionada(){
        String qtde = qtdeTf.getText();
  
        return qtde.isEmpty()?1: Integer.parseInt(qtdeTf.getText());
    } 
    public String getInformacao(){
        return this.buscarTf.getText();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
   
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtosTb = new javax.swing.JTable();
        selecionarProdutoBt = new javax.swing.JButton();
        cancelarBt = new javax.swing.JButton();
        pesquisaPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        buscarTf = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        qtdeTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(new java.awt.Color(0, 204, 255));

        jPanel1.setBackground(new java.awt.Color(82, 92, 100));

        produtosTb.setForeground(new java.awt.Color(0, 0, 0));
        produtosTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(produtosTb);

        selecionarProdutoBt.setBackground(new java.awt.Color(102, 153, 255));
        selecionarProdutoBt.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        selecionarProdutoBt.setForeground(new java.awt.Color(255, 255, 255));
        selecionarProdutoBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/add.png"))); // NOI18N
        selecionarProdutoBt.setText("Inserir");
        selecionarProdutoBt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        selecionarProdutoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarProdutoBtActionPerformed(evt);
            }
        });

        cancelarBt.setBackground(new java.awt.Color(237, 182, 84));
        cancelarBt.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        cancelarBt.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBt.setText("Cancelar");
        cancelarBt.setToolTipText("");
        cancelarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtActionPerformed(evt);
            }
        });

        pesquisaPanel.setBackground(new java.awt.Color(255, 255, 255));
        pesquisaPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pesquisaPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/procurar.png"))); // NOI18N

        jSeparator7.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator7.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jSeparator7.setOpaque(true);
        jSeparator7.setPreferredSize(new java.awt.Dimension(50, 1));

        buscarTf.setForeground(new java.awt.Color(102, 102, 102));
        buscarTf.setBorder(null);
        buscarTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buscarTfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscarTfFocusLost(evt);
            }
        });
        buscarTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTfActionPerformed(evt);
            }
        });

        buscarBtn.setBackground(new java.awt.Color(102, 153, 255));
        buscarBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        buscarBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pesquisaPanelLayout = new javax.swing.GroupLayout(pesquisaPanel);
        pesquisaPanel.setLayout(pesquisaPanelLayout);
        pesquisaPanelLayout.setHorizontalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buscarBtn)
                .addContainerGap())
            .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pesquisaPanelLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(buscarTf, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(164, Short.MAX_VALUE)))
        );
        pesquisaPanelLayout.setVerticalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buscarBtn)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pesquisaPanelLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(buscarTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        jSeparator8.setForeground(java.awt.Color.white);
        jSeparator8.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jSeparator8.setOpaque(true);
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 1));

        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("QTDE.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelarBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selecionarProdutoBt))
                    .addComponent(pesquisaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(qtdeTf)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pesquisaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtdeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionarProdutoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecionarProdutoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarProdutoBtActionPerformed
        ControllerPedido.inserirProduto();
    }//GEN-LAST:event_selecionarProdutoBtActionPerformed

    private void cancelarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarBtActionPerformed

    private void buscarTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarTfFocusGained
        pesquisaPanel.setBorder(bordaSelecionada);
    }//GEN-LAST:event_buscarTfFocusGained

    private void buscarTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarTfFocusLost
        pesquisaPanel.setBorder(new EtchedBorder(null, null));
    }//GEN-LAST:event_buscarTfFocusLost

    private void buscarTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTfActionPerformed
        
    }//GEN-LAST:event_buscarTfActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        if (!getInformacao().isEmpty()) ControllerPedido.preencherTabelaProdutos(getInformacao());
    }//GEN-LAST:event_buscarBtnActionPerformed

    
    public void abrirTelaPesquisandoInfo(String info){
        this.setVisible(true);
        ControllerPedido.preencherTabelaProdutos(info);
    }
    
    

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarTf;
    private javax.swing.JButton cancelarBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel pesquisaPanel;
    private javax.swing.JTable produtosTb;
    private javax.swing.JTextField qtdeTf;
    private javax.swing.JButton selecionarProdutoBt;
    // End of variables declaration//GEN-END:variables
}
