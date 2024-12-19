package produto;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

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
			System.out.println("           6 - Sair                                 ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("Entre com a opção desejada:                         ");
			System.out.println("                                                    ");
			
			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\n");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Criar Produto\n\n");

	
				break;
			case 2:
				System.out.println("Listar Todos os Produtos\n\n");
				
				break;
			case 3:
				System.out.println("Buscar Produto - por ID\n\n");
				
				break;
			case 4:
				System.out.println("Atualizar dados do Produto\n\n");
				
					
				break;
			case 5:
				System.out.println("Excluir Produto\n\n");
				
	
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
