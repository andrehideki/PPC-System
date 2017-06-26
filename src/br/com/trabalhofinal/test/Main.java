/*package br.com.trabalhofinal.test;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import br.com.trabalhofinal.model.Cliente;
import br.com.trabalhofinal.model.Pedido;
import br.com.trabalhofinal.model.Produto;

public class Main {

	public static void main(String[] args) {

		// Objetos que guardaram uma lista para 'CRUD' de Pedido, Produto,
		// Cliente
		ArrayList<Pedido> bdPedidos = new ArrayList<>();
		ArrayList<Produto> bdProdutos = new ArrayList<>();
		ArrayList<Cliente> bdClientes = new ArrayList<>();

		// Criando objetos do tipo cliente
		Cliente c1 = new Cliente("Maria Joaquina", "123.321.211-11");
		Cliente c2 = new Cliente("João Silva", "123.321.211-11");
		Cliente c3 = new Cliente("Luiz Joaquim", "123.321.211-11");
		Cliente c4 = new Cliente("Sergio Borges", "123.321.211-11");

		// Adicionando os clientes na lista
		bdClientes.add(c1);
		bdClientes.add(c2);
		bdClientes.add(c3);
		bdClientes.add(c4);

		Produto p1 = new Produto("Abóbora", 5.0);
		Produto p2 = new Produto("Maçã", 2);
		Produto p3 = new Produto("Arroz", 2);
		Produto p4 = new Produto("Maçã", 12.5);
		Produto p5 = new Produto("Batata frita 1kg", 15.5);
		Produto p6 = new Produto("Refrigerante do bolinha 300 ml", 3);

		cadProdutosBd(p1, bdProdutos);
		cadProdutosBd(p2, bdProdutos);
		cadProdutosBd(p3, bdProdutos);
		cadProdutosBd(p4, bdProdutos);
		cadProdutosBd(p5, bdProdutos);
		cadProdutosBd(p6, bdProdutos);

		Pedido pe1 = new Pedido(c1, LocalDate.of(2017, 5, 5));
		pe1.adicionarProduto(p1);
		pe1.adicionarProduto(p2);
		pe1.adicionarProduto(p3);

		Pedido pe2 = new Pedido(c1, LocalDate.of(2017, 4, 5));
		pe2.adicionarProduto(p3);
		pe2.adicionarProduto(p4);
		pe2.adicionarProduto(p5);

		Pedido pe3 = new Pedido(c3, LocalDate.of(2017, 4, 5));
		pe3.adicionarProduto(p3);
		pe3.adicionarProduto(p4);
		pe3.adicionarProduto(p5);

		Pedido pe4 = new Pedido(c4, LocalDate.of(2017, 4, 5));
		pe4.adicionarProduto(p3);
		pe4.adicionarProduto(p4);
		pe4.adicionarProduto(p5);

		Pedido pe5 = new Pedido(c4, LocalDate.of(2017, 4, 5));
		pe5.adicionarProduto(p3);
		pe5.adicionarProduto(p4);
		pe5.adicionarProduto(p5);

		Pedido pe6 = new Pedido(c4, LocalDate.of(2017, 4, 5));
		pe6.adicionarProduto(p3);
		pe6.adicionarProduto(p4);
		pe6.adicionarProduto(p5);
		
		Pedido pe7 = new Pedido(c2, LocalDate.of(2014, 1, 12));
		pe7.adicionarProduto(p2);
		pe7.adicionarProduto(p2);
		pe7.adicionarProduto(p2);
		pe7.adicionarProduto(p2);
		pe7.adicionarProduto(p2);
		pe7.adicionarProduto(p2);
		pe7.adicionarProduto(p2);
		pe7.adicionarProduto(p2);
		pe7.adicionarProduto(p2);
		pe7.adicionarProduto(p2);
		pe7.adicionarProduto(p2);
		pe7.adicionarProduto(p2);
		
		

		bdPedidos.add(pe1);
		bdPedidos.add(pe2);
		bdPedidos.add(pe3);
		bdPedidos.add(pe4);
		bdPedidos.add(pe5);
		bdPedidos.add(pe6);
		bdPedidos.add(pe7);
		

		// Encontrando os pedidos da dona Maria Joaquina
		System.out.println("\n**QUESTÃO 2.A***");
		System.out.println("Pedidos da Maria Joaquina");
		encontrarPedidosDoCliente("Maria Joaquina", bdPedidos);

		// Encontrando o produto mais vendido
		System.out.println("\n**QUESTÃO 2.B***");
		System.out.println("\n...\nAchando o Produto mais vendido");
		Produto maisVend = produtoMaisVendido(bdProdutos);
		System.out.println("O produto mais vendido é o(a): " + maisVend.getDescricao() + "\tqtde vendida: "
				+ maisVend.getQtdeVendida());

		// Encontrando o cliente com maior quantidade de produtos comprados
		System.out.println("\n**QUESTÃO 2.C***");
		System.out.println("\n..\nAchando os clientes com maior quantidade de produtos comprados");
		System.out.println("...obs: Foram escolhidos três...");
		mostrarClientesMaiorQtdeProdutos(bdClientes);

		System.out.println("...\n\nTeste");
		mostrarClientes(bdClientes);

		// Encontrando o cliente com maior gasto

		System.out.println("\n**QUESTÃO 2.D***");
		System.out.println("\n..\nAchando os clientes com maior valor gasto");
		System.out.println("...obs: Foram escolhidos três...");
		mostrarClientesMaiorQtdeFinanceiro(bdClientes);

	}

	public static ArrayList<Pedido> encontrarPedidosDoCliente(String nomeCliente, ArrayList<Pedido> bdPedidos) {
		ArrayList<Pedido> pedidos = new ArrayList<>();
		for (Pedido p : bdPedidos) {
			if (nomeCliente.equalsIgnoreCase(p.getCliente().getNome())) {
				pedidos.add(p);
			}
		}

		// Imprime pedidos
		for (Pedido p : pedidos)
			System.out.println(p.mostrarPedido());

		return pedidos;
	}

	public static Produto produtoMaisVendido(ArrayList<Produto> bdProdutos) {
		Produto prod = bdProdutos.get(0);
		for (int i = 1; i < bdProdutos.size(); i++) {
			Produto p = bdProdutos.get(i);
			if (p.getQtdeVendida() > prod.getQtdeVendida())
				prod = p;
		}
		return prod; // Somente o primeiro produto encontrado mais vendido (não
						// os mais vendidos)
	}

	public static void cadProdutosBd(Produto p, ArrayList<Produto> bdProdutos) {
		bdProdutos.add(p);
	}

	/*
	 * Mostra os 3 maiores comprados(quesito qtde de produtos)
	 */

            /*public static void mostrarClientesMaiorQtdeProdutos(ArrayList<Cliente> bdClientes) {// 3
																						// maiores
																						// compradores
																						// (qtde
																						// produtos)

		ArrayList<Cliente> aux = new ArrayList<>();// Usado para colocar
													// novamente os clientes
													// excluidos de bdClientes
		// Achando o 1º maior comprador (quesito qtde de produtos já comprados)
		if (!bdClientes.isEmpty()) {

			Cliente maior = bdClientes.get(0);
			for (Cliente c : bdClientes) {
				if (c.getQtdeProdutos() > maior.getQtdeProdutos()) {
					maior = c;
				}
			}

			System.out.println("1 maior Comprador:\n" + maior.mostrarInformacoes());
			aux.add(maior);
			bdClientes.remove(maior);

			// ...Achando o 2º maior
			if (!bdClientes.isEmpty()) {

				maior = bdClientes.get(0);
				for (Cliente c : bdClientes) {
					if (c.getQtdeProdutos() > maior.getQtdeProdutos()) {
						maior = c;
					}
				}

				System.out.println("2º maior Comprador:\n" + maior.mostrarInformacoes());
				aux.add(maior);
				bdClientes.remove(maior);

				// ...Achando o 3º maior
				if (!bdClientes.isEmpty()) {

					maior = bdClientes.get(0);
					for (Cliente c : bdClientes) {
						if (c.getQtdeProdutos() > maior.getQtdeProdutos()) {
							maior = c;
						}
					}

					System.out.println("3º maior Comprador:\n" + maior.mostrarInformacoes());

					bdClientes.add(aux.get(0));
					aux.remove(0);
				}
				bdClientes.add(aux.get(0));
				aux.remove(0);
			}

		}

	}

	public static void mostrarClientesMaiorQtdeFinanceiro(ArrayList<Cliente> bdClientes) {// 3
																							// compradores
																							// (qtde
																							// de
																							// dinheiro
																							// gasto)

		ArrayList<Cliente> aux = new ArrayList<>();// Usado para colocar
		// novamente os clientes
		// excluidos de bdClientes
		
		
		// Achando o 1º maior comprador (quesito finaceiro)
		if (!bdClientes.isEmpty()) {

			Cliente maior = bdClientes.get(0);
			for (Cliente c : bdClientes) {
				if (c.getValorGasto() > maior.getValorGasto()) {
					maior = c;
				}
			}

			System.out.println("1 maior Comprador:\n" + maior.mostrarInformacoes());
			aux.add(maior);
			bdClientes.remove(maior);

			// ...Achando o 2º maior
			if (!bdClientes.isEmpty()) {

				maior = bdClientes.get(0);
				for (Cliente c : bdClientes) {
					if (c.getValorGasto() > maior.getValorGasto()) {
						maior = c;
					}
				}

				System.out.println("2º maior Comprador:\n" + maior.mostrarInformacoes());
				aux.add(maior);
				bdClientes.remove(maior);

				// ...Achando o 3º maior
				if (!bdClientes.isEmpty()) {

					maior = bdClientes.get(0);
					for (Cliente c : bdClientes) {
						if (c.getValorGasto() > maior.getValorGasto()){
							maior = c;
						}
					}

					System.out.println("3º maior Comprador:\n" + maior.mostrarInformacoes());

					bdClientes.add(aux.get(0));
					aux.remove(0);
				}
				bdClientes.add(aux.get(0));
				aux.remove(0);
			}

		}

	}

	public static void mostrarClientes(ArrayList<Cliente> bdClientes) {
		for (Cliente c : bdClientes) {
			System.out.println("...");
			System.out.println(c.mostrarInformacoes());
			System.out.println("...");
		}
	}
}
*/