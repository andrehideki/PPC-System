package br.com.trabalhofinal.controller;

import br.com.trabalhofinal.model.Cliente;
import br.com.trabalhofinal.model.Pedido;
import br.com.trabalhofinal.model.Produto;
    import br.com.trabalhofinal.view.TelaPedido;
    import br.com.trabalhofinal.view.TelaSelecionarCliente;
    import br.com.trabalhofinal.view.TelaSelecionarProduto;
    import java.util.ArrayList;
    import javax.swing.JTable;
    import javax.swing.table.DefaultTableModel;

    public class ControllerPedido {

        private static TelaPedido refTelaPedido;
        private static TelaSelecionarProduto refTelaSelProd;
        private static TelaSelecionarCliente refTelaSelCli;


    public static void setRefTelaPedidos(TelaPedido refTelaPedido) {
        ControllerPedido.refTelaPedido = refTelaPedido;
    }
    public static void setRefTelaSelProd(TelaSelecionarProduto refTelaSelProd) {
        ControllerPedido.refTelaSelProd = refTelaSelProd;
    }
    public static void setRefTelaSelCli(TelaSelecionarCliente refTelaSelCli){
        ControllerPedido.refTelaSelCli = refTelaSelCli;
    }
//-----------------------------------------------------------------------------

    
    public static void selecionarProduto(){
        refTelaSelProd.abrirTelaPesquisandoInfo(refTelaPedido.getBuscarProduto());
    }
    
    public static void preencherTabelaProdutos(String info) {
        JTable t = refTelaSelProd.getTabela();
        refTelaSelProd.setProdutos( (ArrayList<Produto>) Produto.findByInformacao(info));
        DefaultTableModel dft = new DefaultTableModel(null, new String[]{"Id", "Descr.", "Preço venda"});
        
        for (Produto pro : refTelaSelProd.getProdutos()) 
            dft.addRow(new String[]{"" + pro.getId(), pro.getDescricao(), "" + pro.getPrecoVenda()});
        
        t.setModel(dft);
        //Se não encontrou nenhum produto então não seleciona nada
        if (t.getRowCount() != 0)   t.setRowSelectionInterval(0, 0);
    }
    
    public static void preencherItensTb() {
        
        String colunas[] = {"Codigo", "Descr.", "Preço venda", "Qtde"};
        DefaultTableModel dft = new DefaultTableModel(null, colunas);

        for (Produto pro : refTelaPedido.getListaItens()) {
            dft.addRow(new String[]{"" + pro.getCodigo(), pro.getDescricao(), "" + pro.getPrecoVenda(), "" + pro.getQtdSelecionada()});
           
        }

        refTelaPedido.getItensTb().setModel(dft);
        refTelaPedido.getTotal().setText(""+refTelaPedido.getPedido().getTotal());

    }
    
    public static void preencherTabelaClientes(String info){
        refTelaSelCli.setClientes((ArrayList<Cliente>) Cliente.findByInformacao(info));
        DefaultTableModel dft = new DefaultTableModel(null,new String[]{"Id","Nome","Sobrenome"});
        for(Cliente c:refTelaSelCli.getClientes()){
            dft.addRow(new String[]{""+c.getId(), c.getNome(), c.getSobrenome()});
        }
        refTelaSelCli.getTabelaClientes().setModel(dft);
    }
    

    public static Produto pegarProdutoSelecionado() {
        JTable t = refTelaSelProd.getTabela();
        int linhaSelecionada = t.getSelectedRow();
        return refTelaSelProd.getProdutos().get(linhaSelecionada);
    }
    
    public static Cliente pegarClienteSelecionado(){
        int linhaSelecionada = refTelaSelCli.getTabelaClientes().getSelectedRow(); 
        return refTelaSelCli.getClientes().get(linhaSelecionada);
    }

    
    public static void inserirProduto(){
        Produto p = pegarProdutoSelecionado();
        Pedido ped = refTelaPedido.getPedido();
        p.setQtdSelecionada(refTelaSelProd.getQtdeSelecionada());
        
        //Verifica se o itém seleciona já consta no pedido
        boolean consta = false;
        for(Produto pro: ped.getProdutos()){
            if( p.getId() == pro.getId() ){
                ped.setTotal(ped.getTotal() + (p.getQtdSelecionada() * p.getPrecoVenda()) );
                pro.setQtdSelecionada(pro.getQtdSelecionada() + p.getQtdSelecionada());
                consta = true;
                break;
            }
        }
        
        if(!consta) refTelaPedido.getPedido().adicionarProduto(p);
        preencherItensTb();
        refTelaSelProd.setVisible(false);
        refTelaPedido.limparTudo();
    }

    public static void abrirTelaCliente(){
        refTelaSelCli.setVisible(true);
    }


    public static void removerItem() {
        if (refTelaPedido.getItensTb().getRowCount() != 0) {
            int linhaSelecionada = refTelaPedido.getItensTb().getSelectedRow();
            refTelaPedido.getPedido().removerProduto(
            refTelaPedido.getListaItens().get(linhaSelecionada));
            refTelaPedido.limparTudo();
        }
    }

    public static void atualizarItem() {
        if (refTelaPedido.getItensTb().getRowCount() != 0) {
            int linhaSelecionada = refTelaPedido.getItensTb().getSelectedRow();

            Produto p = refTelaPedido.getListaItens().get(linhaSelecionada);
            Pedido ped = refTelaPedido.getPedido();
            ped.setTotal( ped.getTotal() - (p.getPrecoVenda() * p.getQtdSelecionada()));
            p.setQtdSelecionada(refTelaPedido.getQtdeSelecionada());
            ped.setTotal(ped.getTotal() + (p.getPrecoVenda() * p.getQtdSelecionada() ) );
            ControllerPedido.preencherItensTb();
        }
    }
    
    public static boolean finalizarPedido(){
        System.out.println("TOTAL DE PEDIDOS FEITOS = " + refTelaPedido.getPedido().getTotalPedidosFeitos()//teste
                + "-------------\nPedido código" + refTelaPedido.getPedido().getCodPedido());
        inserirInformacoesDoPedido();
        if(Pedido.insertPedido(refTelaPedido.getPedido())){
            Pedido.insertItems( refTelaPedido.getPedido());
            atualizarInformacoesItens();
            atualizarInformacoesCliente();
            
            refTelaPedido.getPedido().incrementarPedidosFeitos();
            System.out.println("Total de pedidos feitos : " + refTelaPedido.getPedido().getTotalPedidosFeitos());
            Pedido.gravarSerial(refTelaPedido.getPedido());
            refTelaPedido.resetarTela();
            refTelaSelCli.setVisible(false);
            return true;
        }
        refTelaSelCli.setVisible(false);
        refTelaPedido.resetarTela();
        return false;   
    }
    
    public static void atualizarInformacoesItens(){
        for(Produto p:refTelaPedido.getPedido().getProdutos()){
            p.setQtdeVendida(p.getQtdeVendida() + p.getQtdSelecionada());
            Produto.update(p);
        }
    }
    public static void atualizarInformacoesCliente(){
        Cliente cli = refTelaPedido.getPedido().getCliente();
        System.out.println("Atualizar informações do cliente : \n" + cli);
        Pedido p = refTelaPedido.getPedido();
        for(Produto pro : p.getProdutos()){
            System.out.println("qtde selecionada de:\n" + pro.getDescricao() + " = " + pro.getQtdSelecionada());
            cli.setQtdeProdutos((cli.getQtdeProdutos()) +(pro.getQtdSelecionada()));
        }
        cli.setValorGasto(cli.getValorGasto() + refTelaPedido.getPedido().getTotal() );
        Cliente.updateClienteCompra(cli);
    }
    
    public static void inserirInformacoesDoPedido(){
        refTelaPedido.getPedido().setCliente(pegarClienteSelecionado());
        refTelaPedido.getPedido().colocarDataAtual();
    }
    
    public static void inicializarPedido(){
        Pedido pedido = (Pedido) Pedido.lerSerial();
        System.out.println("Inicializando pedidos....");
        if(pedido == null){
            refTelaPedido.setPedido(new Pedido());
        }else{
            pedido.setProdutos(new ArrayList<>());
            refTelaPedido.setPedido(pedido);
            
        }
        System.out.println("CÓDIGO DO PEDIDO: "+refTelaPedido.getPedido().getCodPedido());
    }
    
}
