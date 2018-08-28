public class Chocolate extends ProdutoNaoDuravel{
	private String tipo;
	private double calorias;

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public void setCalorias(double calorias){
		this.calorias = calorias;
	}

	public String getTipo(){
		return this.tipo;
	}

	public double getCalorias(){
		return this.calorias;
	}
}
