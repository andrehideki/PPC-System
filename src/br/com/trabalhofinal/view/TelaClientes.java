package br.com.trabalhofinal.view;

import br.com.trabalhofinal.conexao.Conexao;
import br.com.trabalhofinal.controller.ControllerCliente;
import br.com.trabalhofinal.model.Cliente;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class TelaClientes extends javax.swing.JInternalFrame {

    private EtchedBorder bordaSelecionada;
    private LineBorder bordaInfoSelecionada = new LineBorder(new Color(0, 191, 255),2,true);
    private boolean entradaValida = false;
    private ArrayList<Cliente> clientes;
    private Cliente cliente;//Variável auxialiar usada para apontar para um cliente da listas

 

    public TelaClientes() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null); //retirar o painel superior
        bordaSelecionada = new EtchedBorder(new Color(0, 191, 255), null);
        ControllerCliente.setRefTelaCli(this);
        ControllerCliente.inicializarTela();
    }
    
    


    //METODOS GETTERS E SETTERS
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public String getBuscarClienteTxt() {
        return buscarTf.getText();
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public boolean isEntradaValida() {
        return entradaValida;
    }

    public void setEntradaValida(boolean entradaValida) {
        this.entradaValida = entradaValida;
    }

    public JTextField getCpfTf() {
        return cpfTf;
    }


    public JRadioButton getFemRadio() {
        return femRadio;
    }

    public JTextField getIdTf() {
        return idTf;
    }


    public JRadioButton getMascRadio() {
        return mascRadio;
    }



    public JTextField getNomeTf() {
        return nomeTf;
    }

    public JTextField getSobrenomeTf() {
        return sobrenomeTf;
    }
    public JTable getTabelaClientes(){
        return infoClientesTb;
    }
    //--------------------------------------------------------------------------


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexoRadioGroup = new javax.swing.ButtonGroup();
        informaçãoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeTf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        idTf = new javax.swing.JTextField();
        limparBtn = new javax.swing.JButton();
        cadastrarBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        sobrenomeTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        cpfTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mascRadio = new javax.swing.JRadioButton();
        femRadio = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pesquisaPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        buscarBtn = new javax.swing.JButton();
        buscarTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoClientesTb = new javax.swing.JTable();
        deletarBtn = new javax.swing.JButton();
        salvarBtn = new javax.swing.JButton();
        atualizarBtn = new javax.swing.JButton();

        setBorder(null);
        setMinimumSize(new java.awt.Dimension(0, 0));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        informaçãoPanel.setBackground(new java.awt.Color(82, 92, 100));

        jLabel1.setBackground(new java.awt.Color(53, 56, 61));
        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(221, 216, 216));
        jLabel1.setText("ID");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(53, 56, 61));
        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(221, 216, 216));
        jLabel2.setText("Nome");
        jLabel2.setOpaque(true);

        nomeTf.setBackground(new java.awt.Color(82, 92, 100));
        nomeTf.setForeground(new java.awt.Color(235, 235, 235));
        nomeTf.setBorder(null);
        nomeTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeTfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeTfFocusLost(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(53, 56, 61));
        jLabel8.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(221, 216, 216));
        jLabel8.setText("Informações");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 20));

        idTf.setBackground(new java.awt.Color(82, 92, 100));
        idTf.setForeground(new java.awt.Color(235, 235, 235));
        idTf.setBorder(null);
        idTf.setEnabled(false);
        idTf.setMaximumSize(new java.awt.Dimension(0, 40));

        limparBtn.setBackground(new java.awt.Color(53, 56, 61));
        limparBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        limparBtn.setForeground(new java.awt.Color(221, 216, 216));
        limparBtn.setText("Limpar");
        limparBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBtnActionPerformed(evt);
            }
        });

        cadastrarBtn.setBackground(new java.awt.Color(53, 56, 61));
        cadastrarBtn.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        cadastrarBtn.setForeground(new java.awt.Color(221, 216, 216));
        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(221, 216, 216));
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 20));

        sobrenomeTf.setBackground(new java.awt.Color(82, 92, 100));
        sobrenomeTf.setForeground(new java.awt.Color(235, 235, 235));
        sobrenomeTf.setBorder(null);
        sobrenomeTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sobrenomeTfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sobrenomeTfFocusLost(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(53, 56, 61));
        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(221, 216, 216));
        jLabel5.setText("Sobrenome");
        jLabel5.setOpaque(true);

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(221, 216, 216));
        jSeparator4.setPreferredSize(new java.awt.Dimension(50, 20));

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator5.setForeground(new java.awt.Color(221, 216, 216));
        jSeparator5.setPreferredSize(new java.awt.Dimension(50, 20));

        cpfTf.setBackground(new java.awt.Color(82, 92, 100));
        cpfTf.setForeground(new java.awt.Color(235, 235, 235));
        cpfTf.setBorder(null);
        cpfTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpfTfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfTfFocusLost(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(53, 56, 61));
        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(221, 216, 216));
        jLabel6.setText("CPF");
        jLabel6.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(53, 56, 61));
        jLabel9.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(221, 216, 216));
        jLabel9.setText("Sexo");
        jLabel9.setOpaque(true);

        mascRadio.setBackground(new java.awt.Color(53, 56, 61));
        sexoRadioGroup.add(mascRadio);
        mascRadio.setFont(new java.awt.Font("Lucida Sans", 1, 10)); // NOI18N
        mascRadio.setForeground(new java.awt.Color(221, 216, 216));
        mascRadio.setText("Masculino");

        femRadio.setBackground(new java.awt.Color(53, 56, 61));
        sexoRadioGroup.add(femRadio);
        femRadio.setFont(new java.awt.Font("Lucida Sans", 1, 10)); // NOI18N
        femRadio.setForeground(new java.awt.Color(221, 216, 216));
        femRadio.setText("Feminino");

        javax.swing.GroupLayout informaçãoPanelLayout = new javax.swing.GroupLayout(informaçãoPanel);
        informaçãoPanel.setLayout(informaçãoPanelLayout);
        informaçãoPanelLayout.setHorizontalGroup(
            informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informaçãoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(informaçãoPanelLayout.createSequentialGroup()
                            .addComponent(limparBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastrarBtn))
                        .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(sobrenomeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(informaçãoPanelLayout.createSequentialGroup()
                        .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfTf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel9))
                    .addGroup(informaçãoPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(femRadio)
                            .addComponent(mascRadio))))
                .addGap(0, 58, Short.MAX_VALUE))
        );
        informaçãoPanelLayout.setVerticalGroup(
            informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informaçãoPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(nomeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mascRadio)
                    .addGroup(informaçãoPanelLayout.createSequentialGroup()
                        .addComponent(sobrenomeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(3, 3, 3)
                        .addComponent(cpfTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(femRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(informaçãoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limparBtn)
                    .addComponent(cadastrarBtn))
                .addGap(23, 23, 23))
        );

        jPanel2.setBackground(new java.awt.Color(67, 192, 152));

        jLabel7.setFont(new java.awt.Font("Liberation Mono", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/clientes.png"))); // NOI18N
        jLabel7.setText("Clientes");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        pesquisaPanel.setBackground(new java.awt.Color(255, 255, 255));
        pesquisaPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pesquisaPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhofinal/icons/procurar.png"))); // NOI18N

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

        javax.swing.GroupLayout pesquisaPanelLayout = new javax.swing.GroupLayout(pesquisaPanel);
        pesquisaPanel.setLayout(pesquisaPanelLayout);
        pesquisaPanelLayout.setHorizontalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buscarBtn)
                .addContainerGap())
            .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pesquisaPanelLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(buscarTf, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );
        pesquisaPanelLayout.setVerticalGroup(
            pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBtn)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pesquisaPanelLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(buscarTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        infoClientesTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        infoClientesTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoClientesTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(infoClientesTb);

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deletarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salvarBtn))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(atualizarBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pesquisaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(atualizarBtn)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletarBtn)
                    .addComponent(salvarBtn))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informaçãoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(informaçãoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    
    //AÇÕES DOS BOTÕES
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        ControllerCliente.consultarClientes();
    }//GEN-LAST:event_buscarBtnActionPerformed
    private void limparBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBtnActionPerformed
        ControllerCliente.limparCampos();
    }//GEN-LAST:event_limparBtnActionPerformed
    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        ControllerCliente.atualizarCliente();
    }//GEN-LAST:event_salvarBtnActionPerformed
    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
        ControllerCliente.cadastrarCliente();
    }//GEN-LAST:event_cadastrarBtnActionPerformed
    private void atualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBtnActionPerformed
        ControllerCliente.atualizarTela();
    }//GEN-LAST:event_atualizarBtnActionPerformed
    private void deletarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarBtnActionPerformed
        ControllerCliente.deletarCliente();
    }//GEN-LAST:event_deletarBtnActionPerformed

    
    
    private void buscarTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarTfFocusGained
        pesquisaPanel.setBorder(bordaSelecionada);
    }//GEN-LAST:event_buscarTfFocusGained
    private void buscarTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarTfFocusLost
        pesquisaPanel.setBorder(new EtchedBorder(null, null));
    }//GEN-LAST:event_buscarTfFocusLost
    private void nomeTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeTfFocusGained
        campoInfoFocado(nomeTf);
        entradaValida = true;
    }//GEN-LAST:event_nomeTfFocusGained
    private void nomeTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeTfFocusLost
        if (!nomeValido(nomeTf.getText())) {
            campoInfoInvalido(nomeTf);
            entradaValida = false;
        } else campoInfoDesfocado(nomeTf);
    }//GEN-LAST:event_nomeTfFocusLost
    private void infoClientesTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoClientesTbMouseClicked
        ControllerCliente.selecionarCliente();
    }//GEN-LAST:event_infoClientesTbMouseClicked
    private void sobrenomeTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sobrenomeTfFocusGained
        entradaValida = true;
        campoInfoFocado(sobrenomeTf);
    }//GEN-LAST:event_sobrenomeTfFocusGained
    private void sobrenomeTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sobrenomeTfFocusLost
        if (!sobrenomeValido(sobrenomeTf.getText())) {
            campoInfoInvalido(sobrenomeTf);
            entradaValida = false;
        } else campoInfoDesfocado(sobrenomeTf);
    }//GEN-LAST:event_sobrenomeTfFocusLost
    private void cpfTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfTfFocusGained
        campoInfoFocado(cpfTf);
        entradaValida = true;
    }//GEN-LAST:event_cpfTfFocusGained
    private void cpfTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfTfFocusLost
        if (!cpfValido(cpfTf.getText())) {
            campoInfoInvalido(cpfTf);
            entradaValida = false;
        } else campoInfoDesfocado(cpfTf);
    }//GEN-LAST:event_cpfTfFocusLost


    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ControllerCliente.limparCampos();
    }//GEN-LAST:event_formComponentShown

    //---------------------------------------------------------------------------
    //METODOS DE VALIDAÇÃO
    private boolean cpfValido(String cpf) {
        return cpf.trim().matches("^[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}");
    }

    private boolean nomeValido(String nome) {
        return nome.trim().matches("([A-Z]|[a-z])*");
    }

    private boolean sobrenomeValido(String sobrenome) {
        return sobrenome.trim().matches("([A-Z]|[a-z])*");
    }

    //METODS DE MODIFICAÇÃO DE APARENCIA DA TELA
    //---------------------------------------------------------------------------
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarBtn;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarTf;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JTextField cpfTf;
    private javax.swing.JButton deletarBtn;
    private javax.swing.JRadioButton femRadio;
    private javax.swing.JTextField idTf;
    private javax.swing.JTable infoClientesTb;
    private javax.swing.JPanel informaçãoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton limparBtn;
    private javax.swing.JRadioButton mascRadio;
    private javax.swing.JTextField nomeTf;
    private javax.swing.JPanel pesquisaPanel;
    private javax.swing.JButton salvarBtn;
    private javax.swing.ButtonGroup sexoRadioGroup;
    private javax.swing.JTextField sobrenomeTf;
    // End of variables declaration//GEN-END:variables
}
