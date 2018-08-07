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
			System.out.println("Não possui creditos suficientes para retirar. Todos o créditos foram retirados. Saldo zerado.");
			this.creditos = 0;
		}
			
		else{
			int total = this.creditos-creditos;
			this.creditos-=creditos;
			System.out.println("Creditos retirados com sucesso.\nForam retirados: "+ creditos +" creditos.");
		}
	} 

	public static void main(String[] args){
		Credit s1 = new Credit(100);
		Credit s2 = new Credit(200);	
		Credit s3 = new Credit(300);
		Credit s4 = new Credit(400);
		s1.topUp(100);
		s2.consumir(300);
		System.out.println("Saldo de credito de s1: "+s1.getCreditos());
		System.out.println("Saldo de credito de s2: "+s2.getCreditos());
		System.out.println("Saldo de credito de s3: "+s3.getCreditos());
		System.out.println("Saldo de credito de s4: "+s4.getCreditos());
	}

}
