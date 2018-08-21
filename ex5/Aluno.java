public class Aluno{
	private Prova prova1;
	private Prova prova2;

	public Aluno(){
		this.prova1 = new Prova();
		this.prova2 = new Prova();
	}

	public double calcularMedia(){
		return ((this.prova1.calcularNotaTotal() + this.prova2.calcularNotaTotal())/2);
	}
}