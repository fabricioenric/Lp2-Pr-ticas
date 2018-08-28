import java.util.*;

public class Deposito extends Produto{
	private ArrayList<Produto> deposito;

	public Deposito(){
		deposito = new ArrayList<Produto>();
	}

	public void adicionarProduto(Produto p){
		deposito.add(p);
		System.out.println("\nProduto adicionado com sucesso!!\n");
	}

	public void removerProduto(Produto p){
		deposito.remove(p);
	}

	public int qtdDeProdutos(){
		return deposito.size();
	}

	public boolean estaVazio(){
		if(deposito.size() == 0)
			return true;

		else
			return false;
	}

	public void listar(){
		System.out.println("\nListando\n");
	
		for(int i = 0; i < deposito.size(); i++){
			System.out.println("Nome: "+ deposito.get(i).getNome());
			System.out.println("Preco: "+ deposito.get(i).getPreco());
			System.out.println("Marca: "+ deposito.get(i).getMarca());
			System.out.println("Descricao: "+ deposito.get(i).getDescricao());
			System.out.println("Data de fabricacao: "+ deposito.get(i).getDataDeFabricacao());
			System.out.println("\n\n");
		}
	}
}
