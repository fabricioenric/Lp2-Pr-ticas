public class Clock{
	private int segundos;
	private int minutos;
	private int horas;
	private String manhaOUnoite;

	public Clock(){
	this.segundos = 0;
	this.minutos = 0;
	this.horas = 1;
	this.manhaOUnoite = "";
	}

	public int getSegundos(){
		return this.segundos;
	}

	public int getMinutos(){
		return this.minutos;
	}

	public int getHoras(){
		return this.horas;
	}

	public String getManhaOUnoite(){
		return this.manhaOUnoite;
	}

	public void setSegundos(int segundos){
		this.segundos = segundos;
	}
	
	public void setMinutos(int minutos){
		this.minutos = minutos;
	}

	public void setHoras(int horas){
		this.horas = horas;
	}

	public void setManhaOUnoite(String manhaOUnoite){
		this.manhaOUnoite = manhaOUnoite;
	}
		
	public void contar(){
		int n = 0;		
		for(int i = 0; ; i++){
			this.segundos++;
			
			if(this.getSegundos() == 60){
				this.setSegundos(0);
				this.minutos++;
				if(this.getMinutos() == 60){
					this.setMinutos(0);
					this.horas++;
					if(this.getHoras() == 13){
						this.setHoras(1);
						n++;
					}
				}
			}
			if(n%2 == 0)
				this.setManhaOUnoite("AM");

			else
				this.setManhaOUnoite("PM");	
			
			System.out.println("Hora: "+ this.getHoras() +":"+ this.getMinutos() +":"+ this.getSegundos() +"  "+ this.getManhaOUnoite());	
		}
	}
	
	public static void main(String args[]){
		int i;
		Clock clock = new Clock();
	
		clock.contar();
	}
}
