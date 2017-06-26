
package br.com.trabalhofinal.view;

import br.com.trabalhofinal.controller.ControllerInfoAdm;
import br.com.trabalhofinal.model.Cliente;
import br.com.trabalhofinal.model.Pedido;
import br.com.trabalhofinal.model.Produto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class TelaInfoAdm extends javax.swing.JInternalFrame {

 private EtchedBorder bordaSelecionada;
 private Cliente cliente;
 private Pedido pedido;
 private ArrayList<Cliente> clientes;
 private ArrayList<Produto> produtos;

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
 
 
 
    public TelaInfoAdm() {
        initComponents();
        ((BasicInternalFrameUI)this.getUI()).setNorthPane(null); //retirar o painel superior
        bordaSelecionada = new EtchedBorder(new Color(0, 191, 255), null);
        ControllerInfoAdm.setRefTInfoAdm(this);
        cliente = new Cliente();
        pedido = new Pedido();
        ControllerInfoAdm.inicializarTela();
    }


    public Pedido getPedido(){
        return this.pedido;
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoGrupo = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itensTb = new javax.swing.JTable();
        pesquisaPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        buscarBtn = new javax.swing.JButton();
        buscarTf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        pedidosTb = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientesTb = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        comboClientes = new javax.swing.JComboBox<>();
        organizarClientesBt = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        produtosTb = new javax.swing.JTable();
        comboProdutos = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        organizarProdutosBt = new javax.swing.JButton();

        setBorder(null);

        jPanel4.setBackground(new java.awt.Color(67, 192, 152));

        jLabel9.setFont(new java.awt.Font("Liberation Mono", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/adm.png"))); // NOI18N
        jLabel9.setText("Informações administrativas");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        itensTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(itensTb);

        pesquisaPanel.setBackground(new java.awt.Color(255, 255, 255));
        pesquisaPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pesquisaPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/procurar.png"))); // NOI18N

        jSeparator7.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator7.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jSeparator7.setOpaque(true);
        jSeparator7.setPreferredSize(new java.awt.Dimension(50, 1));

        buscarBtn.setBackground(new java.awt.Color(102, 153, 255));
        buscarBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        buscarBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pesquisaPanelLayout = new javax.swing.GroupLayout(pesquisaPanel);
        pesquisaPanel.setLayout(pesquisaPanelLayout);
        pesquisaPanelLayout.setHorizontalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarBtn)
                .addContainerGap())
            .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pesquisaPanelLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(buscarTf, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(103, Short.MAX_VALUE)))
        );
        pesquisaPanelLayout.setVerticalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBtn))
                .addContainerGap())
            .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pesquisaPanelLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(buscarTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        pedidosTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        pedidosTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedidosTbMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(pedidosTb);

        jLabel16.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Pedidos");

        jLabel17.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Itens");

        clientesTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        clientesTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesTbMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(clientesTb);

        jLabel18.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Clientes");

        comboClientes.setBackground(new java.awt.Color(255, 255, 255));
        comboClientes.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        comboClientes.setForeground(new java.awt.Color(102, 102, 102));
        comboClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Financeiro", "Qtde.de produtos" }));

        organizarClientesBt.setBackground(new java.awt.Color(241, 142, 57));
        organizarClientesBt.setForeground(new java.awt.Color(255, 255, 255));
        organizarClientesBt.setText("Organizar");
        organizarClientesBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizarClientesBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(organizarClientesBt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pesquisaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizarClientesBt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(82, 92, 100));

        produtosTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(produtosTb);

        comboProdutos.setBackground(new java.awt.Color(255, 255, 255));
        comboProdutos.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        comboProdutos.setForeground(new java.awt.Color(102, 102, 102));
        comboProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Qtde. vendida" }));

        jLabel21.setBackground(new java.awt.Color(53, 54, 65));
        jLabel21.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(215, 215, 215));
        jLabel21.setText("Produtos");
        jLabel21.setOpaque(true);

        organizarProdutosBt.setBackground(new java.awt.Color(241, 142, 57));
        organizarProdutosBt.setForeground(new java.awt.Color(255, 255, 255));
        organizarProdutosBt.setText("Organizar");
        organizarProdutosBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizarProdutosBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(comboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(organizarProdutosBt)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizarProdutosBt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        if(!getInformacaoBusca().isEmpty()) ControllerInfoAdm.buscarCliente();
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void buscarTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarTfFocusGained
        pesquisaPanel.setBorder(bordaSelecionada);
    }//GEN-LAST:event_buscarTfFocusGained

    private void buscarTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarTfFocusLost
        pesquisaPanel.setBorder(new EtchedBorder(null, null));
    }//GEN-LAST:event_buscarTfFocusLost

    private void buscarTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTfActionPerformed
        
    }//GEN-LAST:event_buscarTfActionPerformed

    private void clientesTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesTbMouseClicked
        //Pegar pedidos que aquele cliente realizou
        ControllerInfoAdm.buscarPedidosDoCliente();
    }//GEN-LAST:event_clientesTbMouseClicked

    private void pedidosTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidosTbMouseClicked
        //Pegar os itens do pedido selecionado
        ControllerInfoAdm.buscarItensDoPedido();
    }//GEN-LAST:event_pedidosTbMouseClicked

    private void organizarProdutosBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizarProdutosBtActionPerformed
        ControllerInfoAdm.organizarTabelaProdutos();
    }//GEN-LAST:event_organizarProdutosBtActionPerformed

    private void organizarClientesBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizarClientesBtActionPerformed
        ControllerInfoAdm.organizarTabelaClientes();
    }//GEN-LAST:event_organizarClientesBtActionPerformed

    public String getInformacaoBusca(){
        return buscarTf.getText();
    }
    public JTable getClientesTb(){
        return clientesTb;
    }
    public JTable getPedidosTb(){
        return pedidosTb;
    }
    public JTable getItemsTb(){
        return itensTb;
    }
    public JTable getProdutosTb(){
        return produtosTb;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public int getItemComboProdutoSelecionado(){
        return comboProdutos.getSelectedIndex();
    }
    public int getItemComboClienteSelecionado(){
        return comboClientes.getSelectedIndex();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarTf;
    private javax.swing.JTable clientesTb;
    private javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JComboBox<String> comboProdutos;
    private javax.swing.JTable itensTb;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton organizarClientesBt;
    private javax.swing.JButton organizarProdutosBt;
    private javax.swing.JTable pedidosTb;
    private javax.swing.JPanel pesquisaPanel;
    private javax.swing.JTable produtosTb;
    private javax.swing.ButtonGroup tipoGrupo;
    // End of variables declaration//GEN-END:variables
}
