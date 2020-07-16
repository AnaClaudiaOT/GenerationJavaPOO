package POOiEx_Polimorfismo;

public class Preguiça extends Animal {
	
	public Preguiça ()
	{
		
	}
	
	public void som()
	{
		System.out.println("ZZzZzzZZzZZZZzz");
	}
	public void corre()
	{
		System.out.println("Dormindo...\n");
	}
	
	public String mostraPreguiça()
	{
		return "Nome preguiça: " + nome + "\nIdade da preguiça: " + idade;
	}
	
	

}
