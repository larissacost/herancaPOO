package exercicio09_09_21;

public class Cavalo extends Animal {
	private double peso;
	private double altura;
	
	public Cavalo(double peso,double altura,String nome, int idade) {
		super(nome, idade);
		this.peso = peso;
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public void Som()
	   {
		   System.out.println("\n"+getNome()+" fez barulho");
	   }
	public void CorreCavalo()
	   {
		   
		   System.out.println("\nO cavalo "+getNome()+" está correndo");
	   }
}	
	

