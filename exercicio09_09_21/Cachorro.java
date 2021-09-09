package exercicio09_09_21;

public class Cachorro extends Animal {
	private String raca;
	private String dono;
	private String endereco;

	public Cachorro(String raca, String dono, String endereco,String nome, int idade)
	{
		super(nome, idade);
		this.raca = raca;
		this.dono = dono;
		this.endereco = endereco;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void Som()
	   {
		   System.out.println("\n"+getNome()+" fez barulho");
	   }
	public void CorreCachorro()
	   {
		   
		   System.out.println("\nO cachorro "+getNome()+" está correndo");
	   }
}

	
	
