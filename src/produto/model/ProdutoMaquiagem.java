package produto.model;

public class ProdutoMaquiagem extends Produto{
	
	
	private String tomDePele;

	public ProdutoMaquiagem(int quantidade, int id, float preco, String nome, String tomDePele) {
		super(id, nome, quantidade, preco);
		
		this.tomDePele = tomDePele;
	}
	
	public ProdutoMaquiagem(int id, String nome, int quantidade, float preco) {
		super(id, nome, quantidade, preco);
		
		this.tomDePele = "Pardo";
	}

	public String getTomDePele() {
		return tomDePele;
	}

	public void setTomDePele(String tomDePele) {
		this.tomDePele = tomDePele;
	}

	public void visualizar() {
		super.visualizar();
		
		System.out.println("Tom de Pele: " + this.tomDePele);
	}
	
}
