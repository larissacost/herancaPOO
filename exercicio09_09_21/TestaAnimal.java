package exercicio09_09_21;

public class TestaAnimal {

	public static void main(String[] args) {
		Preguica animal1 = new Preguica("preguiça-bentinho","Brasil","Fofa",5);
		Cachorro animal2 = new Cachorro("dalmata","Jorge","Rua Araguaia,67 ","Caramelo",3);
		Cavalo animal3 = new Cavalo(400.5,1.90,"Valente",7);

		System.out.println("\nA preguiça chamada "+animal1.getNome()+" da espécie "+animal1.getEspecie()+" nascida no "+animal1.getOrigem()+" tem "+animal1.getIdade()+" anos");
		System.out.println("\nO cachorro "+animal2.getNome()+" da raça "+animal2.getRaca()+" cujo dono é "+animal2.getDono()+" e mora na "+animal2.getEndereco()+"tem "+animal2.getIdade()+" anos");
		System.out.println("\nO cavalo chamado "+animal3.getNome()+" que pesa "+animal3.getPeso()+" e tem de altura "+animal3.getAltura()+" tem "+animal3.getIdade()+"anos");
		animal1.Som();
		animal2.Som();
		animal3.Som();
		animal1.sobePreguica();
		animal2.CorreCachorro();
		animal3.CorreCavalo();
		
		
		
	}

}
