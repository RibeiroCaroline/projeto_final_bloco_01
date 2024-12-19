package produto.model;

public abstract class Produto {
	
	private int id;
	private String nome;
	private int quantidade;
	private Float preco;
	
	public Produto(int id, String nome, int quantidade, float preco) {
		
		this.quantidade = quantidade;
		this.id = id;
		this.preco = preco;
		this.nome = nome; 
		
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void visualizar() {
	
		System.out.println("\n\n*************************************");
		System.out.println("Dados do Produto:");
		System.out.println("*************************************");
		System.out.println("ID do Produto: " + this.id);
		System.out.println("Nome do Produto: " + this.nome);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Preço: " + this.preco);
	}
	
}
