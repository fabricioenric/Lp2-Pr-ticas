public class ProdutoNaoDuravel extends Produto{
	private String dataDeValidade;
	private String genero;

	public void setDataDeValidade(String dataDeValidade){
		this.dataDeValidade = dataDeValidade;
	}

	public void setGenero(String genero){
		this.genero = genero;
	}

	public String getDataDeValidade(){
		return this.dataDeValidade;
	}

	public String getGenero(){
		return this.genero;
	}
}
