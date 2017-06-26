package br.com.trabalhofinal.view;

import br.com.trabalhofinal.controller.ControllerProduto;
import br.com.trabalhofinal.model.Produto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class TelaProdutos extends javax.swing.JInternalFrame {

    private EtchedBorder bordaSelecionada = new EtchedBorder(new Color(0, 191, 255), null);
    private LineBorder bordaInfoSelecionada = new LineBorder(new Color(0, 191, 255), 2, true);
    private boolean entradaValida = true;
    private Produto p = new Produto();
    private ArrayList<Produto> produtos;// = new ArrayList<>();

    public TelaProdutos() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        ControllerProduto.setRefTelaProduto(this);
        produtos = new ArrayList<>();
        ControllerProduto.consultarTodosProdutos();
        ControllerProduto.preencherTabela();        
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public Produto getProduto(){
        return p;
    }
    public void setProduto(Produto p){
        this.p = p;
    }
    public boolean getEntradaValida(){
        return this.entradaValida;
    }
    public int getCampoId(){
        return idTf.getText().isEmpty()?0:Integer.parseInt(idTf.getText());
    }
    public String getCampoDesc(){
        return descricaoTf.getText();
    }
    public Double getCampoPreCusto(){
        return Double.parseDouble(precoCustoTf.getText());
    }
    public Double getCampoPreVenda(){
        return Double.parseDouble(precoVendaTf.getText());
    }
    public int getCampoMargem(){
        return Integer.parseInt(margemTf.getText());
    }
    public JTable getTabela(){
        return infoProdutosTb;
    }
    public JTextField getIdTf() {
        return idTf;
    }

    public JTextField getDescricaoTf() {
        return descricaoTf;
    }
    

    public JTextField getPrecoCustoTF() {
        return precoCustoTf;
    }

    public JTextField getPrecoVendaTf() {
        return precoVendaTf;
    }

    public JTextField getMargemTf() {
        return margemTf;
    }
      
    
    //--------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pesquisaPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        buscarTf = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoProdutosTb = new javax.swing.JTable();
        deletarBtn = new javax.swing.JButton();
        salvarBtn = new javax.swing.JButton();
        atualizarBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        informaçãoPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        descricaoTf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        idTf = new javax.swing.JTextField();
        limparBtn = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        precoCustoTf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        margemTf = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        precoVendaTf = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        cadastrarBtn = new javax.swing.JButton();

        setBorder(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
                .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buscarBtn)
                .addContainerGap())
            .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pesquisaPanelLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(buscarTf, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(107, Short.MAX_VALUE)))
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

        infoProdutosTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        infoProdutosTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoProdutosTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(infoProdutosTb);

        deletarBtn.setBackground(new java.awt.Color(255, 101, 101));
        deletarBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        deletarBtn.setForeground(new java.awt.Color(255, 255, 255));
        deletarBtn.setText("Deletar");
        deletarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarBtnActionPerformed(evt);
            }
        });

        salvarBtn.setBackground(new java.awt.Color(101, 255, 134));
        salvarBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        salvarBtn.setForeground(new java.awt.Color(255, 255, 255));
        salvarBtn.setText("Salvar");
        salvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBtnActionPerformed(evt);
            }
        });

        atualizarBtn.setBackground(new java.awt.Color(102, 153, 255));
        atualizarBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        atualizarBtn.setForeground(new java.awt.Color(255, 255, 255));
        atualizarBtn.setText("Atualizar");
        atualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(atualizarBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 453, Short.MAX_VALUE)
                        .addComponent(deletarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salvarBtn)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pesquisaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(atualizarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletarBtn)
                    .addComponent(salvarBtn))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(pesquisaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(377, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(67, 192, 152));

        jLabel7.setFont(new java.awt.Font("Liberation Mono", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/produtos.png"))); // NOI18N
        jLabel7.setText("Produtos");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        informaçãoPanel.setBackground(new java.awt.Color(82, 92, 100));

        jLabel10.setBackground(new java.awt.Color(53, 56, 61));
        jLabel10.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(221, 216, 216));
        jLabel10.setText("ID");
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(53, 56, 61));
        jLabel11.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(221, 216, 216));
        jLabel11.setText("Descrição");
        jLabel11.setOpaque(true);

        descricaoTf.setBackground(new java.awt.Color(82, 92, 100));
        descricaoTf.setForeground(new java.awt.Color(235, 235, 235));
        descricaoTf.setBorder(null);
        descricaoTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descricaoTfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descricaoTfFocusLost(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(53, 56, 61));
        jLabel12.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(221, 216, 216));
        jLabel12.setText("Informações");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setOpaque(true);
        jLabel12.setPreferredSize(new java.awt.Dimension(150, 20));

        idTf.setBackground(new java.awt.Color(82, 92, 100));
        idTf.setForeground(new java.awt.Color(235, 235, 235));
        idTf.setBorder(null);
        idTf.setEnabled(false);

        limparBtn.setBackground(new java.awt.Color(53, 56, 61));
        limparBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        limparBtn.setForeground(new java.awt.Color(221, 216, 216));
        limparBtn.setText("Limpar");
        limparBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBtnActionPerformed(evt);
            }
        });

        jSeparator9.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator9.setForeground(new java.awt.Color(221, 216, 216));
        jSeparator9.setPreferredSize(new java.awt.Dimension(50, 20));

        precoCustoTf.setBackground(new java.awt.Color(82, 92, 100));
        precoCustoTf.setForeground(new java.awt.Color(235, 235, 235));
        precoCustoTf.setBorder(null);
        precoCustoTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                precoCustoTfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                precoCustoTfFocusLost(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(53, 56, 61));
        jLabel13.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(221, 216, 216));
        jLabel13.setText("Preço de custo");
        jLabel13.setOpaque(true);

        jSeparator10.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator10.setForeground(new java.awt.Color(221, 216, 216));
        jSeparator10.setPreferredSize(new java.awt.Dimension(50, 20));

        margemTf.setBackground(new java.awt.Color(82, 92, 100));
        margemTf.setForeground(new java.awt.Color(235, 235, 235));
        margemTf.setBorder(null);
        margemTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                margemTfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                margemTfFocusLost(evt);
            }
        });

        jSeparator11.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator11.setForeground(new java.awt.Color(221, 216, 216));
        jSeparator11.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel14.setBackground(new java.awt.Color(53, 56, 61));
        jLabel14.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(221, 216, 216));
        jLabel14.setText("Margem(%)");
        jLabel14.setOpaque(true);

        precoVendaTf.setBackground(new java.awt.Color(82, 92, 100));
        precoVendaTf.setForeground(new java.awt.Color(235, 235, 235));
        precoVendaTf.setBorder(null);
        precoVendaTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                precoVendaTfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                precoVendaTfFocusLost(evt);
            }
        });

        jSeparator12.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator12.setForeground(new java.awt.Color(221, 216, 216));
        jSeparator12.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel15.setBackground(new java.awt.Color(53, 56, 61));
        jLabel15.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(221, 216, 216));
        jLabel15.setText("Preço de venda");
        jLabel15.setOpaque(true);

        cadastrarBtn.setBackground(new java.awt.Color(53, 56, 61));
        cadastrarBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        cadastrarBtn.setForeground(new java.awt.Color(221, 216, 216));
        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout informaçãoPanelLayout = new javax.swing.GroupLayout(informaçãoPanel);
        informaçãoPanel.setLayout(informaçãoPanelLayout);
        informaçãoPanelLayout.setHorizontalGroup(
            informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informaçãoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informaçãoPanelLayout.createSequentialGroup()
                        .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(informaçãoPanelLayout.createSequentialGroup()
                                .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(precoCustoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(precoVendaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(margemTf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(informaçãoPanelLayout.createSequentialGroup()
                        .addComponent(limparBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastrarBtn)
                        .addGap(24, 24, 24))))
        );
        informaçãoPanelLayout.setVerticalGroup(
            informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informaçãoPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(informaçãoPanelLayout.createSequentialGroup()
                        .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(informaçãoPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(descricaoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precoCustoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(informaçãoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(margemTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precoVendaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limparBtn)
                    .addComponent(cadastrarBtn))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informaçãoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(informaçãoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarTfActionPerformed

    private void limparBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBtnActionPerformed
        ControllerProduto.limparCampos();
    }//GEN-LAST:event_limparBtnActionPerformed

    private void deletarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarBtnActionPerformed
        ControllerProduto.deletarProduto();
    }//GEN-LAST:event_deletarBtnActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        ControllerProduto.atualizarProduto();
    }//GEN-LAST:event_salvarBtnActionPerformed

    private void atualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBtnActionPerformed
        ControllerProduto.consultarTodosProdutos();
        ControllerProduto.preencherTabela();
    }//GEN-LAST:event_atualizarBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        String informacao = buscarTf.getText();

        if (!informacao.isEmpty()) {
            ControllerProduto.consultarProdutosInfo(informacao);
            ControllerProduto.preencherTabela();
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
        ControllerProduto.cadastrarProduto();
    }//GEN-LAST:event_cadastrarBtnActionPerformed

    private void infoProdutosTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoProdutosTbMouseClicked
        ControllerProduto.passarInformacoesDaTBPCampos();
    }//GEN-LAST:event_infoProdutosTbMouseClicked

    private void buscarTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarTfFocusGained
        pesquisaPanel.setBorder(bordaSelecionada);
    }//GEN-LAST:event_buscarTfFocusGained

    private void buscarTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarTfFocusLost
        pesquisaPanel.setBorder(new EtchedBorder(null, null));
    }//GEN-LAST:event_buscarTfFocusLost

    private void descricaoTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descricaoTfFocusGained
        campoInfoFocado(descricaoTf);
        entradaValida = true;
    }//GEN-LAST:event_descricaoTfFocusGained

    private void descricaoTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descricaoTfFocusLost
        if (descricaoValida(descricaoTf.getText())) {
            campoInfoDesfocado(descricaoTf);
        } else {
            campoInfoInvalido(descricaoTf);
            entradaValida = false;
        }
    }//GEN-LAST:event_descricaoTfFocusLost

    private void precoCustoTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precoCustoTfFocusGained
        entradaValida = true;
        campoInfoFocado(precoCustoTf);
    }//GEN-LAST:event_precoCustoTfFocusGained

    private void precoCustoTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precoCustoTfFocusLost

        if (precoCustoValido(precoCustoTf.getText())) {
            if (!margemTf.getText().isEmpty()) {
                p.setPrecoCusto(Double.parseDouble(precoCustoTf.getText()));
                precoVendaTf.setText("" + p.calcularPrecoVenda());
            }
            campoInfoDesfocado(precoCustoTf);
        } else {
            campoInfoInvalido(precoCustoTf);
            entradaValida = false;
        }

    }//GEN-LAST:event_precoCustoTfFocusLost

    private void margemTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_margemTfFocusGained
        campoInfoFocado(margemTf);
        entradaValida = true;
    }//GEN-LAST:event_margemTfFocusGained

    private void margemTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_margemTfFocusLost

        if (margemValida(margemTf.getText().trim())) {
            p.setMargem(Integer.parseInt(margemTf.getText()));
            if (precoCustoTf.getText().isEmpty()) {
                p.setPrecoCusto(0);
            } else {
                p.setPrecoCusto(Double.parseDouble(precoCustoTf.getText()));
            }
            precoVendaTf.setText("" + p.calcularPrecoVenda());
            campoInfoDesfocado(margemTf);
        } else {
            entradaValida = false;
            campoInfoInvalido(margemTf);
        }


    }//GEN-LAST:event_margemTfFocusLost

    private void precoVendaTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precoVendaTfFocusGained
        campoInfoFocado(precoVendaTf);
        entradaValida = true;
    }//GEN-LAST:event_precoVendaTfFocusGained

    private void precoVendaTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precoVendaTfFocusLost
        if (precoVendaValido(precoVendaTf.getText().trim())) {
            p.setPrecoVenda(Double.parseDouble(precoVendaTf.getText()));
            campoInfoDesfocado(precoVendaTf);
        } else {
            campoInfoInvalido(precoVendaTf);
            entradaValida = false;
        }

    }//GEN-LAST:event_precoVendaTfFocusLost

    //----------------------------------------------------------------------
    //METODOS
    public void campoInfoFocado(JTextField tf) {
        tf.setBorder(bordaInfoSelecionada);
        tf.setBackground(Color.WHITE);
        tf.setForeground(Color.BLACK);
    }

    public void campoInfoDesfocado(JTextField tf) {
        tf.setBorder(null);
        tf.setBackground(new Color(82, 92, 100));
        tf.setForeground(new Color(235, 235, 235));
    }

    private void campoInfoInvalido(JTextField tf) {
        tf.setBorder(null);
        tf.setBackground(new Color(255, 101, 101));
    }

    //--------------------------------------------------------------------------

    private boolean descricaoValida(String descricao) {
        return descricao.matches("([A-Z]|[a-z])+");
    }

    private boolean precoCustoValido(String precoCusto) {
        
        return precoCusto.matches("([0-9]+)|([0-9]+\\.{1}[0-9]*)");
    }

    private boolean precoVendaValido(String precoVenda) {
        return precoVenda.matches("([0-9]+)|([0-9]+\\.{1}[0-9]*)");
    }

    private boolean margemValida(String margem) {
        return margem.matches("^[0-9]+");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarBtn;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarTf;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JButton deletarBtn;
    private javax.swing.JTextField descricaoTf;
    private javax.swing.JTextField idTf;
    private javax.swing.JTable infoProdutosTb;
    private javax.swing.JPanel informaçãoPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton limparBtn;
    private javax.swing.JTextField margemTf;
    private javax.swing.JPanel pesquisaPanel;
    private javax.swing.JTextField precoCustoTf;
    private javax.swing.JTextField precoVendaTf;
    private javax.swing.JButton salvarBtn;
    // End of variables declaration//GEN-END:variables
}
