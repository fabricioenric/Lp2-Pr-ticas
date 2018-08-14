import java.util.ArrayList;
import java.util.Scanner;

public class MailServer{
	
	private ArrayList<String> MailClient;
	private ArrayList<String> Mail;	
	private int enviados;
	private int recebidos;

	public MailServer(){
		MailClient = new ArrayList<String>();
		Mail = new ArrayList<String>();
		this.enviados = 0;	
		this.recebidos = 0;
	}

	public void criarUsuario(String nome){
		Mail.add(nome);
	}	
	
	public void mandarEmail(String nomeEnviado, String mensagem, String nomeRecebido){
		if(Mail.size() >= 2 && Mail.contains(nomeEnviado) && Mail.contains(nomeRecebido)){
		MailClient.add(mensagem);
		System.out.println("Mensagem de "+ nomeEnviado +" para "+ nomeRecebido +"\n "+ mensagem);	
		}		
			
		else{
			System.out.println("ERRO: Cadastre pelo menos 2 usuarios no sistema ou usuarios não existem no sistema");
		}
	}

	public void qtdDeMensagens(){
		System.out.println("Quantidade total de emails enviados: "+ MailClient.size());
	}

	public void qtdDeUsuarios(){
		System.out.println("Quantidade total de usuarios no sistema: "+ Mail.size());
	}

	public int getEnviados(){
		return this.enviados;
	}	

	public int getRecebidos(){
		return this.recebidos;
	}

	public static void main(String args[]){
		int n;		
		String n1,n2,n3;		
		MailServer correio = new MailServer();		
		Scanner ler = new Scanner(System.in);
	
		do{
			System.out.println("Opcoes:\n1-Cadastrar usuario\n2-Mandar email\n3-Ver quantidade de emails\n4-Quantidade de ususarios\n999-Sair\n");

			n = ler.nextInt();

		if(n == 1){
			System.out.println("Digite o nome do novo usuario:\n");
			n1 = ler.next();
			correio.criarUsuario(n1);			
			}

		else if(n == 2){
			System.out.println("Digite o nome do usuario que vai enviar o email, sua mensagem e para o usuario que ira receber a mensagem\n");
			n1 = ler.next();
			n2 = ler.next();
			n3 = ler.next();
			correio.mandarEmail(n1, n2, n3);
			}
		
		else if(n == 3){
			correio.qtdDeMensagens();		
			}
		else if(n == 4){
			correio.qtdDeUsuarios();
			}


		}while(n != 999);
	System.out.println("Saindo....\n");
	}
}
