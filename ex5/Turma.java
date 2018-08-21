public class Turma{
	private Aluno aluno1;
	private Aluno aluno2;
	private Aluno aluno3;

	public Turma(){
		this.aluno1 = new Aluno();
		this.aluno2 = new Aluno();
		this.aluno3 = new Aluno();
	}

	public double calcularMedia(){
		return((this.aluno1.calcularMedia() + this.aluno2.calcularMedia() + this.aluno3.calcularMedia())/3);
	}



}