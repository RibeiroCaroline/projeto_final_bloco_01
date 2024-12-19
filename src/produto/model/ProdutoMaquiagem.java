package produto.model;

public class ProdutoMaquiagem extends Produto{
	
	
	private String marca;

	public ProdutoMaquiagem(int id, String nome, int quantidade, float preco, String marca) {
		super(id, nome, quantidade, preco);
		
		this.marca = marca;
	}
	
	public ProdutoMaquiagem(int id, String nome, int quantidade, float preco) {
		super(id, nome, quantidade, preco);
		
		this.marca = "Sem Marca";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void visualizar() {
		super.visualizar();
		
		System.out.println("Marca: " + this.marca);
	}
	
}
