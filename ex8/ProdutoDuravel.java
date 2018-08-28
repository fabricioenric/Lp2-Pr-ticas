public class ProdutoDuravel extends Produto{
	private String materialPredominante;		
	private String durabilidade;

	public void setMaterialPredominante(String materialPredominante){
		this.materialPredominante = materialPredominante;
	}

	public void setDurabilidade(String durabilidade){
		this.durabilidade = durabilidade;
	}

	public String getMaterialPredominante(){
		return this.materialPredominante;
	}

	public String getDurabilidade(){
		return this.durabilidade;
	}
}
