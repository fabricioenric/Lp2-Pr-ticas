public class Livro extends ProdutoDuravel{
	private String autor;
	private String editora;

	public void setAutor(String autor){
		this.autor = autor;
	}

	public void setEditora(String editora){
		this.editora = editora;
	}

	public String getAutor(){
		return this.autor;
	}

	public String getEditora(){
		return this.editora;
	}
}
