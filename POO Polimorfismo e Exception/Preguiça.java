package POOiEx_Polimorfismo;

public class Pregui�a extends Animal {
	
	public Pregui�a ()
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
	
	public String mostraPregui�a()
	{
		return "Nome pregui�a: " + nome + "\nIdade da pregui�a: " + idade;
	}
	
	

}
