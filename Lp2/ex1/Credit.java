import java.util.Scanner;

public class Credit{
  	private int creditos;
	
	public Credit(){
		this.creditos = 1000;
	}

	public Credit(int creditos){
		this.creditos = creditos;
	}

	public int getCreditos(){
		return this.creditos;
	}
	
	public void setCreditos(int creditos){
		this.creditos = creditos;
	}

	public void topUp(int creditos){
		this.creditos+=creditos;
		System.out.println("Foram adicionados "+ creditos +" creditos.");
	}

	public void consumir(int creditos){
		
		if(creditos > this.creditos){
			System.out.println("Não possui creditos suficientes para retirar o montante selecionado. Todos os creditos foram retirados. Saldo zerado.");
			this.creditos = 0;
		}
			
		else{
			int total = this.creditos-creditos;
			this.creditos-=creditos;
			System.out.println("Creditos retirados com sucesso.\nForam retirados: "+ creditos +" creditos.");
		}
	} 

	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		Credit conta = new Credit(1000);		
		int n;	
		System.out.println("\nPor padrao, toda conta eh inicializada com 1000 creditos\n");
	
	do{
		System.out.println("Opcoes:\n1-Deposita creditos\n2-Sacar creditos\n3-Acessar a quantidade de creditos\n999-Sair\n");		
		n = ler.nextInt();

		if(n == 1){
			System.out.println("Quanto de credito gostaria de adicionar?\n");
			n = ler.nextInt();	
			conta.topUp(n);
			}

		else if(n == 2){
			System.out.println("Quanto de credito gostaria de retirar?\n");
			n = ler.nextInt();	
			conta.consumir(n);
			}	

		else if(n == 3){
			System.out.println("Creditos: "+ conta.getCreditos());			
			}
		
		}while(n != 999);
	System.out.println("\nSaindo do sistema de creditos....\n");
	}
}
