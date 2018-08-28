public class Celular extends ProdutoDuravel{
	private int numeroDeFuncionalidades;
	private String numeroDoChip;

	public void setNumeroDeFuncionalidades(int numeroDeFuncionalidade){
		this.numeroDeFuncionalidades = numeroDeFuncionalidades;
	}

	public void setNumeroDoChip(String numeroDoChip){
		this.numeroDoChip = numeroDoChip;
	}

	public int getNumeroDeFuncionalidades(){
		return this.numeroDeFuncionalidades;
	}

	public String getNumeroDoChip(){
		return this.numeroDoChip;
	}
}
