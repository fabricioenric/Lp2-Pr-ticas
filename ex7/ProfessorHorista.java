public class ProfessorHorista extends Professor{
	private int total_horas;
	private String salario_hora;

	public ProfessorHorista(){
		this.total_horas = 0;	
		this.salario_hora = "";
	}

	public void setTotal_horas(int total_horas){
		this.total_horas = total_horas;
	}
	
	public void setSalario_hora(String salario_hora){
		this.salario_hora = salario_hora;
	}	

	public int getTotal_horas(){
		return this.total_horas;
	}

	public String getSalario_hora(){
		return this.salario_hora;
	}

	public double salario(){
		double salario_hora = Double.parseDouble(this.salario_hora);
		
		return (this.total_horas * salario_hora);
	}
}
