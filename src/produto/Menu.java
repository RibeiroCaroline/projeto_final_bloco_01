package produto;

import java.util.Scanner;

import produto.controller.ProdutoController;
import produto.model.ProdutoMaquiagem;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produtos = new ProdutoController();

		Scanner leia = new Scanner(System.in);

		String nome, marca;
		int opcao, id, quantidade;
		float preco;

		ProdutoMaquiagem prod1 = new ProdutoMaquiagem(produtos.gerarId(), "Blush", 5, 40f);
		produtos.cadastrar(prod1);

		ProdutoMaquiagem prod2 = new ProdutoMaquiagem(produtos.gerarId(), "Base", 10, 60.0f, "BocaRosa Beuty");
		produtos.cadastrar(prod2);

		ProdutoMaquiagem prod3 = new ProdutoMaquiagem(produtos.gerarId(), "Batom", 15, 30.0f);
		produtos.cadastrar(prod3);

		ProdutoMaquiagem prod4 = new ProdutoMaquiagem(produtos.gerarId(), "Corretivo", 12, 55.0f, "Vizzela");
		produtos.cadastrar(prod4);

		while (true) {
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("                    Loja HelloMakeUp                ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("           1 - Cadastrar Produto                    ");
			System.out.println("           2 - Listar Produtos                      ");
			System.out.println("           3 - Buscar Produto por ID                ");
			System.out.println("           4 - Atualizar Dados do Produto           ");
			System.out.println("           5 - Excluir um Produto                   ");
			System.out.println("           6 - Listar Produtos com Estoque Baixo    ");
			System.out.println("           7 - Sair                                 ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("Entre com a opção desejada:                         ");
			System.out.println("                                                    ");

			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println("\n");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Produto\n\n");

				System.out.println("Digite o Nome do Produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();

				System.out.println("Digite a Quantidade do Produto: ");
				quantidade = leia.nextInt();

				System.out.println("Digite o Preço do Produto (R$): ");
				preco = leia.nextFloat();

				System.out.println("Digite a marca do Produto: ");
				leia.skip("\\R?");
				marca = leia.nextLine();

				produtos.cadastrar(new ProdutoMaquiagem(produtos.gerarId(), nome, quantidade, preco, marca));

				break;
			case 2:
				System.out.println("Listar Todos os Produtos\n\n");
				produtos.listarPadrao();
				break;
			case 3:
				System.out.println("Buscar Produto - por ID\n\n");
				System.out.println("Digite o ID do Produto: ");
				id = leia.nextInt();
				produtos.procurarPorId(id);
				break;
			case 4:
				System.out.println("Atualizar dados do Produto\n\n");
				System.out.println("Digite o ID do produto: ");
				id = leia.nextInt();
				var buscaProduto = produtos.buscarNaCollection(id);
				if (buscaProduto != null) {

					System.out.println("Digite o Nome do Produto: ");
					leia.skip("\\R?");
					nome = leia.nextLine();

					System.out.println("Digite a Quantidade do Produto: ");
					quantidade = leia.nextInt();

					System.out.println("Digite o Preço do Produto (R$): ");
					preco = leia.nextFloat();

					System.out.println("Digite a marca do Produto: ");
					leia.skip("\\R?");
					marca = leia.nextLine();

					produtos.atualizar(new ProdutoMaquiagem(id, nome, quantidade, preco, marca));

				} else {
					System.out.println("O Produto não foi encontrado!");
				}
				break;
			case 5:
				System.out.println("Excluir Produto\n\n");
				System.out.println("Digite o ID do Produto: ");
				id = leia.nextInt();
				produtos.deletar(id);
				break;
			case 6:
				System.out.println("Listar Produto com Estoque Baixo");

				produtos.listarEstoqueBaixo();

				break;
			default:
				System.out.println("Opção Inválida!\n");

				break;
			}

		}
	}

	public static void sobre() {
		System.out.println("\n****************************************************");
		System.out.println("Projeto Desenvolvido por: Caroline Ribeiro");
		System.out.println("Caroline Ribeiro - carolineribeiro1996@gmail.com");
		System.out.println("github.com/RibeiroCaroline");
		System.out.println("****************************************************");
	}

}
