public class Produto{
	private String nome;
	private double preco;
	private String marca;
	private String descricao;
	private String dataDeFabricacao;

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public void setDataDeFabricacao(String dataDeFabricacao){
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public String getNome(){
		return this.nome;
	}

	public double getPreco(){
		return this.preco;
	}

	public String getMarca(){
		return this.marca;
	}

	public String getDescricao(){
		return this.descricao;
	}

	public String getDataDeFabricacao(){
		return this.dataDeFabricacao;
	}
}
