package br.com.trabalhofinal.controller;

import br.com.trabalhofinal.model.Cliente;
import br.com.trabalhofinal.model.Pedido;
import br.com.trabalhofinal.model.Produto;
import br.com.trabalhofinal.view.TelaInfoAdm;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerInfoAdm {

    public static TelaInfoAdm refTInfoAdm;

    public static void inicializarTela(){
        refTInfoAdm.setClientes((ArrayList<Cliente>) Cliente.findAll());
        refTInfoAdm.setProdutos((ArrayList<Produto>) Produto.findAll());
        preencherTabelaClientes();
        preencherTabelaProdutos();
    }
    
    
    public static void setRefTInfoAdm(TelaInfoAdm refTInfoAdm) {
        ControllerInfoAdm.refTInfoAdm = refTInfoAdm;
    }

    public static void buscarCliente() {
       //Pega nome do clienet e já preenche a tabela
       refTInfoAdm.setClientes((ArrayList<Cliente>) Cliente.findByInformacao(
               refTInfoAdm.getInformacaoBusca()));
       preencherTabelaClientes();
    }

    public static void preencherTabelaClientes() {

        String colunas[] = {"ID", "Nome", "Sobrenome", "Qtde.de Produtos", "Valor gasto"};
        DefaultTableModel dft = new DefaultTableModel(null, colunas);
        for (Cliente c : refTInfoAdm.getClientes()) {
            dft.addRow(new String[]{"" + c.getId(), c.getNome(), c.getSobrenome(),
                "" + c.getQtdeProdutos(), "" + c.getValorGasto()});
        }
        refTInfoAdm.getClientesTb().setModel(dft);
    }
    public static void preencherTabelaPedidos(){
        String colunas[] = {"ID", "Total", "Data"};
        DefaultTableModel dft = new DefaultTableModel(null, colunas);  
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for(Pedido ped:Pedido.findByIdCliente(refTInfoAdm.getCliente())){
            dft.addRow(new String[]{""+ped.getCodPedido(),""+ped.getTotal(),
                df.format(ped.getData())});
        }
        refTInfoAdm.getPedidosTb().setModel(dft);
    }
    
    public static void preencherTabelaItems(){
        String colunas[] = {"ID", "Desc.", "qtde.Selecionada"};
        DefaultTableModel dft = new DefaultTableModel(null, colunas);  
        for(Produto pro:Pedido.findByIdPedido(refTInfoAdm.getPedido())){
            System.out.println(pro);
            dft.addRow(new String[]{pro.getId()+"",pro.getDescricao(), pro.getQtdSelecionada()+""});
        }
        refTInfoAdm.getItemsTb().setModel(dft);
    }
    
    public static void preencherTabelaProdutos(){
        DefaultTableModel dft = new DefaultTableModel(null, new String[]{
            "Id", "Descr.", "Preço custo", "Margem", "Preço venda", "Qtde.Vendida"});
        JTable tab = refTInfoAdm.getProdutosTb();
        for (Produto pro : refTInfoAdm.getProdutos()) {
            dft.addRow(new String[]{"" + pro.getId(), pro.getDescricao(),
                "" + pro.getPrecoCusto(), "" + pro.getMargem(), "" + pro.getPrecoVenda(), "" + pro.getQtdeVendida()});
        }
        tab.setModel(dft);
    }

    public static void buscarPedidosDoCliente() {
        getClienteSelecionado();
        preencherTabelaPedidos();
    }

    public static void getClienteSelecionado() {
        int linhaSelecionada = refTInfoAdm.getClientesTb().getSelectedRow();
        refTInfoAdm.getCliente().setId(
                Integer.parseInt("" + refTInfoAdm.getClientesTb().getValueAt(linhaSelecionada, 0)));
        System.out.println(refTInfoAdm.getCliente());
    }
    
    public static void buscarItensDoPedido(){
        getPedidoSelecionado();
        preencherTabelaItems();
    }

    private static void getPedidoSelecionado() {
        int linhaSelecionada = refTInfoAdm.getPedidosTb().getSelectedRow();
        refTInfoAdm.getPedido().setCodPedido(
        Integer.parseInt("" +refTInfoAdm.getPedidosTb().getValueAt(linhaSelecionada, 0) ));
        
    }
    //private static void pegar

    /*
        0-Todos
        1-Qtde vendida
    */
    public static void organizarTabelaProdutos() {
        int itemSelecionado = refTInfoAdm.getItemComboProdutoSelecionado();
        if(itemSelecionado == 0){
            refTInfoAdm.setProdutos((ArrayList<Produto>) Produto.findAll());
        }else{
            refTInfoAdm.setProdutos((ArrayList<Produto>) Produto.findByQtdeVendia());
        }
        preencherTabelaProdutos();
    }
    /*
        0-Todos
        1-Financeiro
        2-Qtde vendida
        
    */
    public static void organizarTabelaClientes(){
        int itemSelecionado = refTInfoAdm.getItemComboClienteSelecionado();
        if(itemSelecionado == 0){
            refTInfoAdm.setClientes((ArrayList<Cliente>) Cliente.findAll());
        }else if(itemSelecionado == 1){
             refTInfoAdm.setClientes((ArrayList<Cliente>) Cliente.findByValorGasto());
        }else{
             refTInfoAdm.setClientes((ArrayList<Cliente>) Cliente.findByQtdeProdutos());
        }
        preencherTabelaClientes();
    }
    
    
    

}
