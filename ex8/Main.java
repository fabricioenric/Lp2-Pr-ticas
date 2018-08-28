import java.util.*;

public class Main{
	public static void main(String[] args){
		Deposito d = new Deposito();
		Carro ca = new Carro();
		Livro l = new Livro();
		Celular ce = new Celular();
		Pizza p = new Pizza();
		Refrigerante r = new Refrigerante();
		Chocolate co = new Chocolate();
		
		ca.setNome("Astra");
		ca.setPreco(20.000);	
		ca.setMarca("Chevrolet");
		ca.setDescricao("Veloz e potente");
		ca.setDataDeFabricacao("12/12/2006");
		ca.setMaterialPredominante("Aluminio");
		ca.setDurabilidade("20 anos");
		ca.setVelMax(250);
		ca.setCor("Prata");

		l.setNome("Dom Casmurro");
		l.setPreco(200);	
		l.setMarca("Saraiva");
		l.setDescricao("Romance");
		l.setDataDeFabricacao("04/10/1889");
		l.setMaterialPredominante("Celulose");
		l.setDurabilidade("100 anos");
		l.setAutor("Machado de Assis");
		l.setEditora("Atica");

		ce.setNome("iPhone");
		ce.setPreco(7000);	
		ce.setMarca("Apple");
		ce.setDescricao("Rapido em downloads");
		ce.setDataDeFabricacao("23/08/2015");
		ce.setMaterialPredominante("Aluminio");
		ce.setDurabilidade("10 anos");
		ce.setNumeroDeFuncionalidades(20);
		ce.setNumeroDoChip("(84)99858-1585");

		d.adicionarProduto(ca);
		d.adicionarProduto(l);
		d.adicionarProduto(ce);	

		System.out.println("\nQuantidade de produtos: "+ d.qtdDeProdutos());

		d.listar();	
	}
} 
