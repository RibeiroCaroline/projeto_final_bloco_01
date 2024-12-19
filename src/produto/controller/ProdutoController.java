package produto.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProduto = new ArrayList<Produto>();
	int id = 0;

	@Override
	public void procurarPorId(int id) {
		var produto = buscarNaCollection(id);

		if (produto != null) {
			produto.visualizar();
		} else {
			System.out.println("\nID do Produto: " + id + " não foi encontrado!");
		}
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProduto) {
			produto.visualizar();
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProduto.add(produto);
		System.out.println("Produto cadastrado com sucesso!!");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getId());

		if (buscaProduto != null) {
			listaProduto.set(listaProduto.indexOf(buscaProduto), produto);
			System.out.println("\nO Produto do ID: " + produto.getId() + " foi atualizado com sucesso");
		} else {
			System.out.println("\nO Produto do ID: " + produto.getId() + " não foi encontrado! ");
		}
	}

	@Override
	public void deletar(int id) {
		var produto = buscarNaCollection(id);

		if (produto != null) {
			if (listaProduto.remove(produto) == true)
				System.out.println("\nO Produto ID: " + id + " foi deletado com sucesso!");
			else
				System.out.println("Falha ao remover o produto!");

		} else {
			System.out.println("\nO Produto ID: " + id + " não foi encontrado");
		}

	}

	public int gerarId() {
		return ++id;
	}

	public Produto buscarNaCollection(int id) {
		for (var produto : listaProduto) {
			if (produto.getId() == id) {
				return produto;
			}
		}

		return null;
	}

	@Override
	public void listarEstoqueBaixo() {
		Collections.sort(listaProduto, Comparator.comparingInt(Produto::getQuantidade));

		this.listarTodos();

	}

	@Override
	public void listarPadrao() {
		Collections.sort(listaProduto, Comparator.comparingInt(Produto::getId));
		
		this.listarTodos();
	}

}
