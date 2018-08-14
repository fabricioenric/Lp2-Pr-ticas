import java.util.ArrayList;
import java.util.Scanner;

public class MailServer{
	
	private ArrayList<String> MailClient;
	private ArrayList<String> Mail;	

	public MailServer(){
		MailClient = new ArrayList<String>();
		Mail = new ArrayList<String>();
	}

	public void criarUsuario(String nome){
		Mail.add(nome);
		System.out.println("\nUsuario cadrastado com sucesso!!\n");
	}	
	
	public void mandarEmail(String nomeEnviado, String mensagem, String nomeRecebido){
		if(Mail.size() >= 2 && Mail.contains(nomeEnviado) && Mail.contains(nomeRecebido)){
		MailClient.add(mensagem);
		System.out.println("\nMensagem de "+ nomeEnviado +" para "+ nomeRecebido +"\n "+ mensagem);	
		}		
			
		else{
			System.out.println("\nERRO: Cadastre pelo menos 2 usuarios no sistema ou usuarios não existem no sistema\n");
		}
	}

	public void qtdDeMensagens(){
		System.out.println("\nQuantidade total de emails enviados: "+ MailClient.size());
	}

	public void qtdDeUsuarios(){
		System.out.println("\nQuantidade total de usuarios no sistema: "+ Mail.size());
	}

	public void apagarEmail(int pos){	
		MailClient.remove(pos);
	}	

	public void apagarTodosEmails(){
		MailClient.clear();
	}

	public String getMailClient(int pos){
		if(MailClient.size() == 1)
			pos = 0;

		if(pos > MailClient.size()){
			System.out.println("\nNesta posicao nao esta armazenado nenhuma mensagem, portanto a mensagem indicada eh a ultima: \n");	
			pos = this.MailClient.size()-1;
		} 
		
		return this.MailClient.get(pos);
	
	}

	public int qtd(){
		return this.MailClient.size();
	}

	public static void main(String args[]){
		int n;		
		String n1,n2,n3;		
		MailServer correio = new MailServer();		
		Scanner ler = new Scanner(System.in);
	
		do{
			System.out.println("Opcoes:\n1-Cadastrar usuario\n2-Mandar email\n3-Ver quantidade de emails\n4-Quantidade de ususarios\n5-Remover email\n6-Remover todos os emails\n999-Sair\n");

			n = ler.nextInt();

		if(n == 1){
			System.out.println("\nDigite o nome do novo usuario:\n");
			n1 = ler.next();
			correio.criarUsuario(n1);			
			}

		else if(n == 2){
			System.out.println("\nDigite o nome do usuario que vai enviar o email, sua mensagem e para o usuario que ira receber a mensagem\n");
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

		else if(n == 5){
			if(correio.qtd() == 0)
				System.out.println("\nCaixa de emails está vazia\n");
				
			else{
				System.out.println("\nDigite uma posição: \n");
				n = ler.nextInt();
				System.out.println("\nDeseja apagar a mensagem: "+ correio.getMailClient(n) +" sim?1 ou nao?2\n");			
	
				int op = ler.nextInt();

				if(op == 1){
					correio.apagarEmail(n);
					System.out.println("\nEmail apagado com sucesso!!\n");
					}						
					
			
				else if(op == 2)			
					System.out.println("Cancelado\n");	
				}
			}			
				
		else if(n == 6){
			if(correio.qtd() == 0)
				System.out.println("\nCaixa de emails está vazia\n");			

			else{
				correio.apagarTodosEmails();
				System.out.println("\nTodos os email foram apagados com sucesso!!\n");				
				}
			}

		}while(n != 999);
	System.out.println("\nSaindo....\n");
	}
}
