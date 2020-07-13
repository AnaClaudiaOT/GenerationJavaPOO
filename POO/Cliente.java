package gPOO;

public class Cliente {
	private String nomeCliente;
	private int codCliente;
	private int cpfCliente;
	
	public Cliente(String nome, int cod, int cpf)
	{
		nomeCliente = nome;
		codCliente = cod;
		cpfCliente = cpf;
	}
	
	public String getmostrarNome()//metodo
	{
		String mostraNome = "O nome do cliente é: " + nomeCliente;
		return mostraNome;
	}
	
	public String getmostraCod()//metodo
	{
		String mostraCod = "Código: " + codCliente;
		return mostraCod;
	}
	
	public String getmostraCpf()//metodo
	{
		String mostraCpf = "CPF: " + cpfCliente;
		return mostraCpf;
	}
	
		
}
