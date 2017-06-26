package br.com.trabalhofinal.view;

import br.com.trabalhofinal.controller.ControllerPedido;
import br.com.trabalhofinal.model.Pedido;
import br.com.trabalhofinal.model.Produto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class TelaPedido extends javax.swing.JInternalFrame {

    private EtchedBorder bordaSelecionada = new EtchedBorder(new Color(0, 191, 255), null);
    private Pedido pedido;

    public TelaPedido() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null); //retirar o painel superior
        ControllerPedido.setRefTelaPedidos(this);
        ControllerPedido.inicializarPedido();

        System.out.println("-------------\ninfo produto pedido: \n" + pedido.getCodPedido());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pesquisaPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        buscarTf = new javax.swing.JTextField();
        procurarBt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itensTb = new javax.swing.JTable();
        cancelarBt = new javax.swing.JButton();
        selecionarClienteBt = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        totalLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        removerBt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        subtotalLbl = new javax.swing.JLabel();
        codigoLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        precouniLbl = new javax.swing.JLabel();
        qtdeTf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        atualizarBt = new javax.swing.JButton();

        setBorder(null);

        jPanel4.setBackground(new java.awt.Color(67, 192, 152));

        jLabel9.setFont(new java.awt.Font("Liberation Mono", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/pedidos.png"))); // NOI18N
        jLabel9.setText("Realizar pedido");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        pesquisaPanel.setBackground(new java.awt.Color(255, 255, 255));
        pesquisaPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pesquisaPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/procurar.png"))); // NOI18N

        jSeparator8.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator8.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator8.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jSeparator8.setOpaque(true);
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 1));

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

        procurarBt.setBackground(new java.awt.Color(102, 153, 255));
        procurarBt.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        procurarBt.setForeground(new java.awt.Color(255, 255, 255));
        procurarBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/procurarproduto.png"))); // NOI18N
        procurarBt.setText("Procurar");
        procurarBt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        procurarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pesquisaPanelLayout = new javax.swing.GroupLayout(pesquisaPanel);
        pesquisaPanel.setLayout(pesquisaPanelLayout);
        pesquisaPanelLayout.setHorizontalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(buscarTf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(procurarBt)
                .addContainerGap())
        );
        pesquisaPanelLayout.setVerticalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pesquisaPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buscarTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesquisaPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(procurarBt)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        itensTb.setForeground(new java.awt.Color(0, 0, 0));
        itensTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        itensTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itensTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itensTb);

        cancelarBt.setBackground(new java.awt.Color(237, 182, 84));
        cancelarBt.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        cancelarBt.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBt.setText("<html>Cancelar<br>Pedido\n</html>");
        cancelarBt.setToolTipText("");
        cancelarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtActionPerformed(evt);
            }
        });

        selecionarClienteBt.setBackground(new java.awt.Color(69, 198, 120));
        selecionarClienteBt.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        selecionarClienteBt.setForeground(new java.awt.Color(255, 255, 255));
        selecionarClienteBt.setText("<html>Selecionar<br>cliente</html>");
        selecionarClienteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarClienteBtActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(82, 92, 100));

        jLabel12.setBackground(new java.awt.Color(53, 56, 61));
        jLabel12.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("R$:");
        jLabel12.setOpaque(true);

        totalLbl.setBackground(new java.awt.Color(53, 56, 61));
        totalLbl.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        totalLbl.setForeground(new java.awt.Color(255, 255, 255));
        totalLbl.setText("00,00");
        totalLbl.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalLbl)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Total a pagar");

        removerBt.setBackground(new java.awt.Color(248, 66, 66));
        removerBt.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        removerBt.setForeground(new java.awt.Color(255, 255, 255));
        removerBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/remove.png"))); // NOI18N
        removerBt.setText("<html>Remover<br>item</html>");
        removerBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selecionarClienteBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removerBt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pesquisaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pesquisaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(removerBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selecionarClienteBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(82, 92, 100));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Subtotal");

        subtotalLbl.setBackground(new java.awt.Color(53, 56, 61));
        subtotalLbl.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        subtotalLbl.setForeground(new java.awt.Color(255, 255, 255));
        subtotalLbl.setText("00,00");
        subtotalLbl.setOpaque(true);

        codigoLbl.setBackground(new java.awt.Color(53, 56, 61));
        codigoLbl.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        codigoLbl.setForeground(new java.awt.Color(255, 255, 255));
        codigoLbl.setText("0");
        codigoLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        codigoLbl.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Preço un.");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Código");

        precouniLbl.setBackground(new java.awt.Color(53, 56, 61));
        precouniLbl.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        precouniLbl.setForeground(new java.awt.Color(255, 255, 255));
        precouniLbl.setText("00,00");
        precouniLbl.setOpaque(true);

        qtdeTf.setBackground(new java.awt.Color(53, 56, 61));
        qtdeTf.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        qtdeTf.setForeground(new java.awt.Color(235, 235, 235));
        qtdeTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        qtdeTf.setText("0");
        qtdeTf.setAlignmentX(1.0F);
        qtdeTf.setAlignmentY(1.0F);
        qtdeTf.setBorder(null);
        qtdeTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qtdeTfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                qtdeTfFocusLost(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Quantidade");

        atualizarBt.setBackground(new java.awt.Color(111, 52, 218));
        atualizarBt.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        atualizarBt.setForeground(new java.awt.Color(255, 255, 255));
        atualizarBt.setText("Atualizar");
        atualizarBt.setToolTipText("");
        atualizarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(qtdeTf)
                        .addComponent(subtotalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(codigoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(precouniLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel16)
                    .addComponent(atualizarBt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qtdeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(precouniLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subtotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(atualizarBt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getBuscarProduto() {
        return buscarTf.getText();
    }
    public JTable getItensTb() {
        return itensTb;
    }
    public JLabel getTotal() {
        return totalLbl;
    }
    public ArrayList<Produto> getListaItens() {
        return this.pedido.getProdutos();
    }
    public int getQtdeSelecionada() {
        return Integer.parseInt(qtdeTf.getText());
    }
    public Pedido getPedido() {
        return this.pedido;
    }
    public void setPedido(Pedido p){
        this.pedido = p;
    }


    
    
    
    private void procurarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarBtActionPerformed
        if (!getBuscarProduto().isEmpty()) {
            ControllerPedido.selecionarProduto();
        }
    }//GEN-LAST:event_procurarBtActionPerformed

    private void cancelarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Tem certeza que quer cancelar este pedido?",
                "Cancelar pedido", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            limparTudo();
        }
    }//GEN-LAST:event_cancelarBtActionPerformed

    private void selecionarClienteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarClienteBtActionPerformed
        ControllerPedido.abrirTelaCliente();
    }//GEN-LAST:event_selecionarClienteBtActionPerformed

    private void qtdeTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qtdeTfFocusLost
    }//GEN-LAST:event_qtdeTfFocusLost

    private void qtdeTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qtdeTfFocusGained
  
    }//GEN-LAST:event_qtdeTfFocusGained

    private void removerBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBtActionPerformed
        ControllerPedido.removerItem();
    }//GEN-LAST:event_removerBtActionPerformed

    private void buscarTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarTfFocusGained
        pesquisaPanel.setBorder(bordaSelecionada);
    }//GEN-LAST:event_buscarTfFocusGained

    private void buscarTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarTfFocusLost
        pesquisaPanel.setBorder(new EtchedBorder(null, null));
    }//GEN-LAST:event_buscarTfFocusLost

    private void atualizarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBtActionPerformed
        ControllerPedido.atualizarItem();
    }//GEN-LAST:event_atualizarBtActionPerformed

    private void itensTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itensTbMouseClicked
        if (itensTb.getRowCount() > 0) {
            preencherInfoItem(pedido.getProdutos().get(itensTb.getSelectedRow()));
        }
    }//GEN-LAST:event_itensTbMouseClicked

    
    
    
    //---------------------------------------------------------------------------
    public void preencherInfoItem(Produto p) {
        codigoLbl.setText("" + p.getCodigo());
        qtdeTf.setText(p.getQtdSelecionada() + "");
        precouniLbl.setText(p.getPrecoVenda() + "");
        subtotalLbl.setText((p.getPrecoVenda() * p.getQtdSelecionada()) + "");
    }
    public void limparTudo() {
        buscarTf.setText("");
        codigoLbl.setText("");
        qtdeTf.setText("");
        precouniLbl.setText("");
        subtotalLbl.setText("");
        ControllerPedido.preencherItensTb();
    }
    public void resetarTela(){
        ControllerPedido.inicializarPedido();
        limparTudo();
        ControllerPedido.preencherItensTb();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarBt;
    private javax.swing.JTextField buscarTf;
    private javax.swing.JButton cancelarBt;
    private javax.swing.JLabel codigoLbl;
    private javax.swing.JTable itensTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel pesquisaPanel;
    private javax.swing.JLabel precouniLbl;
    private javax.swing.JButton procurarBt;
    private javax.swing.JTextField qtdeTf;
    private javax.swing.JButton removerBt;
    private javax.swing.JButton selecionarClienteBt;
    private javax.swing.JLabel subtotalLbl;
    private javax.swing.JLabel totalLbl;
    // End of variables declaration//GEN-END:variables
}
