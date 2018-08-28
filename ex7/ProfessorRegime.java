public class ProfessorRegime extends Professor{
	private double salario;

	public ProfessorRegime(){
		this.salario = 0.0;
	}	

	public void setSalario(double salario){
		this.salario = salario;
	}

	public double getSalario(){
		return this.salario;
	}
}
