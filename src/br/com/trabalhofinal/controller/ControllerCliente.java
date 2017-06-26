package br.com.trabalhofinal.controller;

import br.com.trabalhofinal.model.Cliente;
import br.com.trabalhofinal.view.TelaClientes;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerCliente {

    private static Cliente cli;
    private static Connection conn;
    private static TelaClientes refTelaCli;

    public static void setRefTelaCli(TelaClientes refTelaCli) {
        ControllerCliente.refTelaCli = refTelaCli;
    }

    public static void inicializarTela() {
        refTelaCli.setClientes((ArrayList<Cliente>) Cliente.findAll());
        preencherTabelaClientes();
    }

    public static void atualizarTela() {
        consultarTodosClientes();
        preencherTabelaClientes();
    }

    private static void preencherTabelaClientes() {
        DefaultTableModel dft = new DefaultTableModel(null, new String[]{"Id", "Nome", "Sobrenome", "CPF", "Sexo"});

        for (Cliente cli : refTelaCli.getClientes()) {
            dft.addRow(new String[]{"" + cli.getId(), cli.getNome(), cli.getSobrenome(), cli.getCpf(), "" + cli.getSexo()});
        }
        refTelaCli.getTabelaClientes().setModel(dft);
    }

    public static void cadastrarCliente() {
        if (refTelaCli.isEntradaValida()) {
            pegarValoresCampos();
            if (Cliente.insert(refTelaCli.getCliente())) {
                JOptionPane.showMessageDialog(refTelaCli, "Cliente cadastrado com sucesso!");
                limparCampos();
                consultarTodosClientes();
                preencherTabelaClientes();
            } else {
                JOptionPane.showMessageDialog(refTelaCli, "Falha ao atualizar cliente!");
            }
        } else {
            JOptionPane.showMessageDialog(refTelaCli, "Algum dado digitado não é compátivel!");
        }
    }

    public static void atualizarCliente() {

        if (refTelaCli.isEntradaValida()) {

            pegarValoresCampos();
            Cliente cliente = refTelaCli.getCliente();
            if (Cliente.update(cliente)) {
                JOptionPane.showMessageDialog(refTelaCli, "Cliente atualizado com sucesso!");
                limparCampos();
                consultarTodosClientes();
                preencherTabelaClientes();
            } else {
                JOptionPane.showMessageDialog(refTelaCli, "Falha ao atualizar cliente!");
            }
        } else {
            JOptionPane.showMessageDialog(refTelaCli, "Algum dos valores digitados é inválido!");
        }
    }

    public static void consultarClientes() {
        String informacao = refTelaCli.getBuscarClienteTxt();
        if (!informacao.isEmpty()) {
            refTelaCli.setClientes((ArrayList<Cliente>) Cliente.findByInformacao(informacao));
            preencherTabelaClientes();
        }
    }

    public static void deletarCliente() {
        if (JOptionPane.showConfirmDialog(refTelaCli, "Tem certeza que deseja deletar este cliente?",
                "Deletar cliente", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (refTelaCli.isEntradaValida()) {
                if (Cliente.delete(refTelaCli.getCliente())) {
                    JOptionPane.showMessageDialog(refTelaCli, "Cliente deletado com sucesso!");
                    limparCampos();
                    consultarTodosClientes();
                    preencherTabelaClientes();
                } else {
                    JOptionPane.showMessageDialog(refTelaCli, "Faha ao deletar cliente!");
                    limparCampos();
                }

            } else {
                JOptionPane.showMessageDialog(refTelaCli, "Algum dado digitado é incompativel");
            }
        }
    }

    private static void preencherCampos() {
        Cliente c = refTelaCli.getCliente();
        refTelaCli.getIdTf().setText("" + c.getId());
        refTelaCli.getNomeTf().setText(c.getNome());
        refTelaCli.getSobrenomeTf().setText(c.getSobrenome());
        refTelaCli.getCpfTf().setText(c.getCpf());
        if (c.getSexo() == 'F') {
            refTelaCli.getFemRadio().setSelected(true);
        } else {
            refTelaCli.getMascRadio().setSelected(true);
        }
        refTelaCli.setEntradaValida(true);
    }

    public static void limparCampos() {
        refTelaCli.getIdTf().setText("");
        refTelaCli.getNomeTf().setText("");
        refTelaCli.getSobrenomeTf().setText("");
        refTelaCli.getCpfTf().setText("");
        refTelaCli.getMascRadio().setSelected(true);
        refTelaCli.setEntradaValida(false);
        refTelaCli.setCliente(new Cliente());
    }

    public static void selecionarCliente() {
        pegarClienteSelecionado();
        preencherCampos();
    }

    private static void pegarClienteSelecionado() {
        refTelaCli.setCliente(refTelaCli.getClientes().get(
                refTelaCli.getTabelaClientes().getSelectedRow()));
    }

    private static void consultarTodosClientes() {
        refTelaCli.setClientes((ArrayList<Cliente>) Cliente.findAll());
    }

    private static void pegarValoresCampos() {

        Cliente c = new Cliente();
        if (!refTelaCli.getIdTf().getText().isEmpty()) {
            c.setId(Integer.parseInt(new String(refTelaCli.getIdTf().getText())));
        }
        c.setCpf(refTelaCli.getCpfTf().getText());
        c.setNome(refTelaCli.getNomeTf().getText());
        c.setSobrenome(refTelaCli.getSobrenomeTf().getText());
        if (refTelaCli.getMascRadio().isSelected()) {
            c.setSexo('M');
        } else {
            c.setSexo('F');
        }
        refTelaCli.setCliente(c);
        System.out.println("O cliente esta sendo atualizado " + c);
    }

}
