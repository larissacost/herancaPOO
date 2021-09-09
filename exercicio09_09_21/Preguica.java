package exercicio09_09_21;

public class Preguica extends Animal {
	private String especie;
	private String origem;
	
	public Preguica(String especie, String origem,String nome,int idade) {
		super(nome,idade);
		this.especie = especie;
		this.origem = origem;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public void Som()
	   {
		   System.out.println("\n"+getNome()+" fez barulho");
	   }
	public void sobePreguica()
	   {
		   
		   System.out.println("\nA preguica "+getNome()+" está subindo na árvore");
	   }
}	


