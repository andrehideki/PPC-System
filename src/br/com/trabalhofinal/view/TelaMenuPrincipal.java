package br.com.trabalhofinal.view;

import br.com.trabalhofinal.conexao.Conexao;
import java.awt.Color;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


public class TelaMenuPrincipal extends javax.swing.JFrame {

    Conexao con;
    Connection conn;

    TelaInformacao tInfo;
    TelaProdutos tProd;
    TelaClientes tCli;
    TelaPedido tPed;
    TelaSelecionarProduto tSelProd;
    TelaSelecionarCliente tSelCli;
    TelaInfoAdm tInfoAdm;

    ArrayList<JInternalFrame> janelasAbertas;

    {
        con = new Conexao();
    }

    public TelaMenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        userLabel.setText("Olá " + System.getProperty("user.name"));
        janelasAbertas = new ArrayList<>();

        tInfo = new TelaInformacao();
        tProd = new TelaProdutos();
        tCli = new TelaClientes();
        tSelProd = new TelaSelecionarProduto();
        tPed = new TelaPedido();
        tSelCli = new TelaSelecionarCliente();
        tInfoAdm = new TelaInfoAdm();
        
        this.areaPanel.add(tInfo);
        this.areaPanel.add(tProd);
        this.areaPanel.add(tCli);
        this.areaPanel.add(tPed);
        this.areaPanel.add(tSelProd);
        this.areaPanel.add(tSelCli);
        this.areaPanel.add(tInfoAdm);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoPanel = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        userLabel1 = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        btSair = new javax.swing.JButton();
        btInformacao = new javax.swing.JButton();
        btClientes = new javax.swing.JButton();
        btPedidos = new javax.swing.JButton();
        btProdutos = new javax.swing.JButton();
        btInfoAdm = new javax.swing.JButton();
        areaPanel = new javax.swing.JDesktopPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PPC.System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        infoPanel.setBackground(new java.awt.Color(0, 0, 0));

        userLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Bem vindo user.X");

        userLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userLabel1.setForeground(new java.awt.Color(255, 255, 255));
        userLabel1.setText("Bem vindo user.X");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLabel)
                    .addComponent(userLabel1))
                .addContainerGap(927, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(userLabel)
                .addGap(13, 13, 13)
                .addComponent(userLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.setBackground(new java.awt.Color(82, 92, 100));
        menuPanel.setMinimumSize(new java.awt.Dimension(0, 0));

        btSair.setBackground(new java.awt.Color(53, 56, 61));
        btSair.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        btSair.setForeground(new java.awt.Color(204, 204, 204));
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/sairsistema.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setBorder(null);
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSairMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSairMouseEntered(evt);
            }
        });
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btInformacao.setBackground(new java.awt.Color(53, 56, 61));
        btInformacao.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        btInformacao.setForeground(new java.awt.Color(204, 204, 204));
        btInformacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/infobotao.png"))); // NOI18N
        btInformacao.setText("Sobre");
        btInformacao.setBorder(null);
        btInformacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btInformacaoMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btInformacaoMouseEntered(evt);
            }
        });
        btInformacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInformacaoActionPerformed(evt);
            }
        });

        btClientes.setBackground(new java.awt.Color(53, 56, 61));
        btClientes.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        btClientes.setForeground(new java.awt.Color(204, 204, 204));
        btClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/clientesbotao.png"))); // NOI18N
        btClientes.setText("Clientes");
        btClientes.setToolTipText("");
        btClientes.setBorder(null);
        btClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btClientesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btClientesMouseEntered(evt);
            }
        });
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });

        btPedidos.setBackground(new java.awt.Color(53, 56, 61));
        btPedidos.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        btPedidos.setForeground(new java.awt.Color(204, 204, 204));
        btPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/pedidosbotao.png"))); // NOI18N
        btPedidos.setText("Pedidos");
        btPedidos.setBorder(null);
        btPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btPedidosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btPedidosMouseEntered(evt);
            }
        });
        btPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedidosActionPerformed(evt);
            }
        });

        btProdutos.setBackground(new java.awt.Color(53, 56, 61));
        btProdutos.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        btProdutos.setForeground(new java.awt.Color(204, 204, 204));
        btProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/produtosbotao.png"))); // NOI18N
        btProdutos.setText("Produtos");
        btProdutos.setBorder(null);
        btProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btProdutosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btProdutosMouseEntered(evt);
            }
        });
        btProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutosActionPerformed(evt);
            }
        });

        btInfoAdm.setBackground(new java.awt.Color(53, 56, 61));
        btInfoAdm.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        btInfoAdm.setForeground(new java.awt.Color(204, 204, 204));
        btInfoAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/infoadmbotao.png"))); // NOI18N
        btInfoAdm.setText("<html>Informações<br>administrativas</html>");
        btInfoAdm.setBorder(null);
        btInfoAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btInfoAdmMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btInfoAdmMouseEntered(evt);
            }
        });
        btInfoAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInfoAdmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btInfoAdm)
                    .addComponent(btClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btPedidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btInfoAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(btInformacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addContainerGap())
        );

        jLabel8.setBackground(new java.awt.Color(32, 94, 204));
        jLabel8.setFont(new java.awt.Font("Lucida Bright", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 94, 204));
        jLabel8.setText("P.P.C.System V.1.0");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Organize os seu produtos, pedidos e clientes de forma fácil e simplificada");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/logo.png"))); // NOI18N
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        areaPanel.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        areaPanel.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        areaPanel.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout areaPanelLayout = new javax.swing.GroupLayout(areaPanel);
        areaPanel.setLayout(areaPanelLayout);
        areaPanelLayout.setHorizontalGroup(
            areaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(401, Short.MAX_VALUE))
        );
        areaPanelLayout.setVerticalGroup(
            areaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaPanel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaPanel)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInfoAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfoAdmActionPerformed
        if(!tInfoAdm.isVisible()){
            tInfoAdm.setVisible(true);
            if(!janelasAbertas.isEmpty()){
                janelasAbertas.get(0).setVisible(false);
                janelasAbertas.remove(0);
            }
            janelasAbertas.add(tInfoAdm);
        }else{
            janelasAbertas.remove(0);
            tInfoAdm.setVisible(false);
        }
    }//GEN-LAST:event_btInfoAdmActionPerformed

    private void btProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutosActionPerformed
        if (!tProd.isVisible()) {

            tProd.setVisible(true);

            if (!janelasAbertas.isEmpty()) {
                janelasAbertas.get(0).setVisible(false);
                janelasAbertas.remove(0);
            }

            janelasAbertas.add(tProd);

        } else {
            janelasAbertas.remove(0);
            tProd.setVisible(false);
        }
    }//GEN-LAST:event_btProdutosActionPerformed

    private void btPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedidosActionPerformed
        if (!tPed.isVisible()) {
            tPed.setVisible(true);

            if (!janelasAbertas.isEmpty()) {
                janelasAbertas.get(0).setVisible(false);
                janelasAbertas.remove(0);
            }

            janelasAbertas.add(tPed);

        } else {
            janelasAbertas.remove(0);
            tPed.setVisible(false);
        }

    }//GEN-LAST:event_btPedidosActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
        if (!tCli.isVisible()) {
            tCli.setVisible(true);
            if (!janelasAbertas.isEmpty()) {
                janelasAbertas.get(0).setVisible(false);
                janelasAbertas.remove(0);
            }

            janelasAbertas.add(tCli);
        } else {
            janelasAbertas.remove(0);
            tCli.setVisible(false);
        }
    }//GEN-LAST:event_btClientesActionPerformed

    private void btInformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInformacaoActionPerformed
        if (!tInfo.isVisible()) {
            tInfo.setVisible(true);
        } else {
            tInfo.setVisible(false);
        }
    }//GEN-LAST:event_btInformacaoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente sair do sistema?", "Sair", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            System.exit(1);
        }
    }//GEN-LAST:event_btSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.setExtendedState(MAXIMIZED_BOTH);//Abre a tela já maximizada

    }//GEN-LAST:event_formWindowOpened

    private void btPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPedidosMouseEntered
        emCimaBotao(btPedidos);
    }//GEN-LAST:event_btPedidosMouseEntered

    private void btPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPedidosMouseExited
        foraBotao(btPedidos);
    }//GEN-LAST:event_btPedidosMouseExited

    private void btProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProdutosMouseEntered
        emCimaBotao(btProdutos);
    }//GEN-LAST:event_btProdutosMouseEntered

    private void btProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProdutosMouseExited
        foraBotao(btProdutos);
    }//GEN-LAST:event_btProdutosMouseExited

    private void btClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClientesMouseEntered
        emCimaBotao(btClientes);
    }//GEN-LAST:event_btClientesMouseEntered

    private void btClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClientesMouseExited
        foraBotao(btClientes);
    }//GEN-LAST:event_btClientesMouseExited

    private void btInfoAdmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInfoAdmMouseEntered
        emCimaBotao(btInfoAdm);
    }//GEN-LAST:event_btInfoAdmMouseEntered

    private void btInfoAdmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInfoAdmMouseExited
        foraBotao(btInfoAdm);
    }//GEN-LAST:event_btInfoAdmMouseExited

    private void btInformacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInformacaoMouseEntered
        emCimaBotao(btInformacao);
    }//GEN-LAST:event_btInformacaoMouseEntered

    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseEntered
        emCimaBotao(btSair);
    }//GEN-LAST:event_btSairMouseEntered

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseExited
        foraBotao(btSair);
    }//GEN-LAST:event_btSairMouseExited

    private void btInformacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInformacaoMouseExited
        foraBotao(btInformacao);
    }//GEN-LAST:event_btInformacaoMouseExited



    //---------------------------------------------------------------------------
    //METODOS AUXILIARES
    public String pegaDataAtual() {

        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(data);
    }

    private void emCimaBotao(JButton b) {
        b.setBackground(new Color(102, 153, 255));
    }

    private void foraBotao(JButton b) {
        b.setBackground(new Color(53, 56, 61));
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaPanel;
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btInfoAdm;
    private javax.swing.JButton btInformacao;
    private javax.swing.JButton btPedidos;
    private javax.swing.JButton btProdutos;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    // End of variables declaration//GEN-END:variables
}
