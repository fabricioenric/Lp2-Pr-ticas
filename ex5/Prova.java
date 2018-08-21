public class Prova{
	private double notaParte1;
	private double notaParte2;

	public Prova(){
		this.notaParte1 = 7.0d;
		this.notaParte2 = 2.0d;
	}

	public void setNotaParte1(double notaParte1){
		this.notaParte1 = notaParte1;
	}

	public void setNotaParte2(double notaParte2){
		this.notaParte2 = notaParte2;
	}

	public double calcularNotaTotal(){
		double soma = this.notaParte1 + this.notaParte2;

		if(soma >= 10)
			soma = 10;

		return soma;
	}
}