
package br.com.trabalhofinal.controller;

import br.com.trabalhofinal.model.Pedido;
import br.com.trabalhofinal.model.Produto;
import br.com.trabalhofinal.view.TelaProdutos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ControllerProduto {
    
    
    private static TelaProdutos refTelaProduto;
    
    public static void setRefTelaProduto(TelaProdutos refTelaProduto) {
        ControllerProduto.refTelaProduto = refTelaProduto;
    }
    
    
    
    public static void preencherTabela() {
        DefaultTableModel dft = new DefaultTableModel(null, new String[]{
            "Id", "Descr.", "Preço custo", "Margem", "Preço venda", "Qtde.Vendida"});
        JTable tab = refTelaProduto.getTabela();
        for (Produto pro : refTelaProduto.getProdutos()) {
            dft.addRow(new String[]{"" + pro.getId(), pro.getDescricao(),
                "" + pro.getPrecoCusto(), "" + pro.getMargem(), "" + pro.getPrecoVenda(), "" + pro.getQtdeVendida()});
        }
        tab.setModel(dft);
    }


    public static boolean cadastrarProduto() {
        if(refTelaProduto.getEntradaValida()){
            Produto pro = refTelaProduto.getProduto();
            setValoresProduto();            
            Produto.insert(pro);
            JOptionPane.showMessageDialog(refTelaProduto,"Produto cadastrado com sucesso!");
            limparCampos();
            consultarTodosProdutos();
            preencherTabela();
            return true;
        }
        JOptionPane.showMessageDialog(refTelaProduto,"Falha ao cadastrar produto");
        limparCampos();
        return false;
    }

    public static boolean atualizarProduto() {
        if (refTelaProduto.getEntradaValida()) {
setValoresProduto();
            if (Produto.update(refTelaProduto.getProduto())) {
                consultarTodosProdutos();
                preencherTabela();
                limparCampos();
                JOptionPane.showMessageDialog(refTelaProduto,"Produto atualizado com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(refTelaProduto, "Falha ao atualizar produto");
                limparCampos();
                return false;
            }
        }
        return false;
    }



    public static boolean deletarProduto() {
        Produto pro = refTelaProduto.getProduto();
        if(Produto.delete(pro)){
            limparCampos();
            consultarTodosProdutos();
            preencherTabela();
            JOptionPane.showMessageDialog(refTelaProduto, "Produto deletado com sucesso!");
            return true;
        }
        JOptionPane.showMessageDialog(refTelaProduto, "Falha ao deletar produto");
        limparCampos();
        return false;
    }
    
    //Consultar Produtos já cadastrados
    public static void consultarTodosProdutos(){
        ArrayList<Produto> ps = (ArrayList<Produto>) Produto.findAll();
        
        refTelaProduto.setProdutos(ps);
    }
        public static void consultarProdutosInfo(String informacao) {
       refTelaProduto.setProdutos( (ArrayList<Produto>) Produto.findByInformacao(informacao));
    }
    
    
    private static void setValoresProduto(){
        Produto pro = refTelaProduto.getProduto();
        pro.setDescricao(refTelaProduto.getCampoDesc());
        pro.setPrecoCusto(refTelaProduto.getCampoPreCusto());
        pro.setPrecoVenda(refTelaProduto.getCampoPreVenda());
        pro.setMargem(refTelaProduto.getCampoMargem());
    }
    
    private static Produto getProdutoSelecionado(){
        Produto p;
        JTable tab = refTelaProduto.getTabela();
        int linhaSecionada = tab.getSelectedRow();
        return p = refTelaProduto.getProdutos().get(linhaSecionada);
    }
    
    private static void preencherCampos(Produto pro){
        refTelaProduto.getIdTf().setText(""+pro.getId());
        refTelaProduto.getDescricaoTf().setText(pro.getDescricao());
        refTelaProduto.getPrecoCustoTF().setText(pro.getPrecoCusto()+"");
        refTelaProduto.getPrecoVendaTf().setText(pro.getPrecoVenda()+"");
        refTelaProduto.getMargemTf().setText(pro.getMargem()+"");
    }
    public static void limparCampos(){
        refTelaProduto.getIdTf().setText("");
        refTelaProduto.getDescricaoTf().setText("");
        refTelaProduto.getPrecoCustoTF().setText("");
        refTelaProduto.getPrecoVendaTf().setText("");
        refTelaProduto.getMargemTf().setText("");
    }
    
    public static void passarInformacoesDaTBPCampos(){
        Produto p = getProdutoSelecionado();
        refTelaProduto.setProduto(p); 
        preencherCampos(p);
    }
    
    
    
    //CRUD
    
    
}
