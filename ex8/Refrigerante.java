public class Refrigerante extends ProdutoNaoDuravel{
	private String coloracao;
	private String gosto;

	public void setColoracao(String coloracao){
		this.coloracao = coloracao;
	}

	public void setGosto(String gosto){
		this.gosto = gosto;
	}

	public String getColoracao(){
		return this.coloracao;
	}

	public String getGosto(){
		return this.gosto;
	}
}
