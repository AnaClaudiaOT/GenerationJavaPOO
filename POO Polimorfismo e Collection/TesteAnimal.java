	package POOiEx_Polimorfismo;


public class TesteAnimal {
	public static void main(String args[])
	{
		Cachorro cao = new Cachorro();
		Cavalo spirit = new Cavalo();
		Pregui�a ronc = new Pregui�a();
		cao.setNome("Sam");
		cao.setIdade(2);		
		spirit.setNome("Ponei");
		spirit.setIdade(3);	
		ronc.setNome("Sleepy");
		ronc.setIdade(5);		
		
				
		System.out.println(cao.mostraCachorro());
		cao.som();
		cao.corre();
		
		System.out.println(spirit.mostraCavalo());
		spirit.som();
		spirit.corre();

		
		System.out.println(ronc.mostraPregui�a());
		ronc.som();
		ronc.corre();


		
		
	}

}
