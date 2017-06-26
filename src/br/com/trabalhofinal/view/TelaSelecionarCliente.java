package br.com.trabalhofinal.view;

import br.com.trabalhofinal.controller.ControllerPedido;
import br.com.trabalhofinal.model.Cliente;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class TelaSelecionarCliente extends javax.swing.JInternalFrame {

    private ArrayList<Cliente> clientes;
    private EtchedBorder bordaSelecionada = new EtchedBorder(new Color(0, 191, 255), null);
 

    public TelaSelecionarCliente() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null); //retirar o painel superior
        ControllerPedido.setRefTelaSelCli(this);

    }

    public JTable getTabelaClientes() {
        return clientesTb;
    }
    public String getInformacao() {
        return this.buscarTf.getText();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pesquisaPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        buscarTf = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientesTb = new javax.swing.JTable();
        cancelarBt = new javax.swing.JButton();
        finalizarPedidoBt = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(82, 92, 100));

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
                .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buscarBtn)
                .addContainerGap())
            .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pesquisaPanelLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(buscarTf, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(104, Short.MAX_VALUE)))
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

        clientesTb.setForeground(new java.awt.Color(0, 0, 0));
        clientesTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(clientesTb);

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

        finalizarPedidoBt.setBackground(new java.awt.Color(51, 215, 57));
        finalizarPedidoBt.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        finalizarPedidoBt.setForeground(new java.awt.Color(255, 255, 255));
        finalizarPedidoBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/add.png"))); // NOI18N
        finalizarPedidoBt.setText("<html>Finalizar<br>Pedido</html>");
        finalizarPedidoBt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        finalizarPedidoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarPedidoBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisaPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelarBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finalizarPedidoBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pesquisaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(finalizarPedidoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void buscarTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarTfFocusGained
        pesquisaPanel.setBorder(bordaSelecionada);
    }//GEN-LAST:event_buscarTfFocusGained
    private void buscarTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarTfFocusLost
        pesquisaPanel.setBorder(new EtchedBorder(null, null));
    }//GEN-LAST:event_buscarTfFocusLost
    private void buscarTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTfActionPerformed
    }//GEN-LAST:event_buscarTfActionPerformed
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        if (!getInformacao().isEmpty()) ControllerPedido.preencherTabelaClientes(getInformacao());
    }//GEN-LAST:event_buscarBtnActionPerformed
    private void cancelarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarBtActionPerformed
    private void finalizarPedidoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarPedidoBtActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente finalizar este pedido?", "Finalizar pedido",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (ControllerPedido.finalizarPedido()) {
                JOptionPane.showMessageDialog(this, "Pedido finalizado com sucesso");
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao realizar pedido");
            }
        }        
    }//GEN-LAST:event_finalizarPedidoBtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarTf;
    private javax.swing.JButton cancelarBt;
    private javax.swing.JTable clientesTb;
    private javax.swing.JButton finalizarPedidoBt;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel pesquisaPanel;
    // End of variables declaration//GEN-END:variables
}
