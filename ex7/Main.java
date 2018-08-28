public class Main{
	public static void main(String[] args){
		ProfessorRegime p1 = new ProfessorRegime();
		ProfessorHorista p2 = new ProfessorHorista();

		p1.setNome("Warthog");p1.setMatricula("124312-432534");p1.setIdade(35);p1.setSalario(3547.46);		

		System.out.println("\n\nProfessor regime:\nNome: "+ p1.getNome() +"\nMatricula: "+ p1.getMatricula() +"\nIdade: "+ p1.getIdade() +"\nSalario: "+ p1.getSalario() +"\n\n");
 
		p2.setNome("Yore");p2.setMatricula("42542-456544");p2.setIdade(30);p2.setTotal_horas(160);p2.setSalario_hora("75");

		System.out.println("Professor horista:\nNome: "+ p2.getNome() +"\nMatricula: "+ p2.getMatricula() +"\nIdade: "+ p2.getIdade() +"\nTotal de horas trabalhadas: "+ p2.getTotal_horas() +"\nSalario por hora: "+ p2.getSalario_hora() +"\nSalario: "+ p2.salario() +"\n\n");

	}
}
