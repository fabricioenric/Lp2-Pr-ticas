public class Carro extends ProdutoDuravel{
	private double velMax;
	private String cor;

	public void setVelMax(double velMax){
		this.velMax = velMax;
	}

	public void setCor(String cor){
		this.cor = cor;
	}

	public double getVelMax(){
		return this.velMax;
	}

	public String getCor(){
		return this.cor;
	}
}
