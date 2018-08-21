public class Main{
	public static void main(String[] args){
		Aluno aluno1 = new Aluno();
		Prova prova11 = new Prova();
		System.out.println("\nProva 1 do aluno 1: "+ prova11.calcularNotaTotal());
		
		Prova prova21 = new Prova();
		System.out.println("\nProva 2 do aluno 1: "+ prova21.calcularNotaTotal());

		Aluno aluno2 = new Aluno();
		Prova prova12 = new Prova();
		System.out.println("\nProva 1 do aluno 2: "+ prova12.calcularNotaTotal());
		
		Prova prova22 = new Prova();
		System.out.println("\nProva 2 do aluno 2: "+ prova22.calcularNotaTotal());

		Aluno aluno3 = new Aluno();
		Prova prova13 = new Prova();
		System.out.println("\nProva 1 do aluno 3: "+ prova13.calcularNotaTotal());
		
		Prova prova23 = new Prova();
		System.out.println("\nProva 2 do aluno 3: "+ prova23.calcularNotaTotal());

		System.out.println("\nMedia do aluno 1: "+ aluno1.calcularMedia());
		System.out.println("\nMedia do aluno 2: "+ aluno2.calcularMedia());
		System.out.println("\nMedia do aluno 3: "+ aluno3.calcularMedia());
	
		Turma turma = new Turma();
		System.out.println("\nMedia da turma: "+ turma.calcularMedia());
	}







}