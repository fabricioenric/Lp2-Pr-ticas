import java.util.Scanner;

public class Heater{
	private int temperature;
	private int max;
	private int min;
	private int increment;

	public Heater(int max, int min){
		this.max = max;
		this.min = min;
		this.temperature = 15;
		this.increment = 5;

	}

	public void Warmer(){		
		this.temperature += this.increment;
		if(this.temperature > max){
			this.temperature = max;
			System.out.println("A temperatura atingiu o seu maximo\n");		
		}
		
		else
			System.out.println("Ao aquecer "+ this.getIncrement() +" unidades, a temperatura ficara com "+ this.getTemperature() +" unidades\n");
	}	
	
	public void Cooler(){
		this.temperature -= this.increment;
		if(this.temperature < min){
			this.temperature = min;
			System.out.println("A temperatura atingiu o seu minimo\n");		
		}
	
		else
			System.out.println("Ao esfriar "+ this.getIncrement() +" unidades, a temperatura ficara com "+ this.getTemperature() +" unidades\n");	
	}

	public int getTemperature(){
		return this.temperature;
	}

	public void setTemperature(int temperature){
		this.temperature = temperature;	
	}

	public int getIncrement(){
		return this.increment;
	}	
	
	public void setIncrement(int increment){
		this.increment = increment;
	}

	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int max,min,increment,n;
		System.out.println("Escolha as temperaturas maximas e minimas do aquecedor:\n");		
		max = ler.nextInt(); 
		min = ler.nextInt();		
		Heater aquecedor = new Heater(max, min);
		System.out.println("A temperatura padrao do aquecedor eh: "+ aquecedor.getTemperature());

	do{
		System.out.println("Escolha uma das seguintes opcoes:\n1-Aquecer\n2-Esfriar\n3-Modificar variacao da temperatura(Atualmente "+ aquecedor.getIncrement() +" unidades sao variadas ao aquecer ou esfriar\n999-Sair\n");		
		n = ler.nextInt();
		
		if(n == 1){
			aquecedor.Warmer();	
			}

		else if(n == 2){
			aquecedor.Cooler();
			}

		else if(n == 3){
			System.out.println("Quanto de variacao de temperatura o aquecedor tera? ");
			n = ler.nextInt();
			if(n < 0)
				n = 0;

			aquecedor.setIncrement(n);
			}
		}while(n != 999);
	System.out.println("Saindo do sistema do aquecedor....\n");
	}
}
