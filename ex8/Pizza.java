public class Pizza extends ProdutoNaoDuravel{
	private String sabor;
	private int qtdDeFatias;

	public void setSabor(String sabor){
		this.sabor = sabor;
	}

	public void setQtdDeFatias(int qtdDeFatias){
		this.qtdDeFatias = qtdDeFatias;
	}

	public String getSabor(){
		return this.sabor;
	}

	public int getQtdDeFatias(){
		return this.qtdDeFatias;
	}

}
