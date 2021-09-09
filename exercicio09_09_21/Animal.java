package exercicio09_09_21;

public class Animal {
   private String Nome;
   private int Idade;
   
   public Animal(String nome, int idade)
   {
	   this.Nome = nome;
	   this.Idade = idade;
   }

   public String getNome() {
	return Nome;
   }

   public void setNome(String nome) {
	Nome = nome;
   }

   public int getIdade() {
	return Idade;
   }

   public void setIdade(int idade) {
	Idade = idade;
   }
  
   public void Som(String som)
   {
	   som =Nome;
	   System.out.println("\n"+som+"fez barulho");
   }




}
