package POOExerciciosHeranca;

public class TesteMain {
	public static void main (String args[])
	{
		Pessoa fulano = new Pessoa();
		Fornecedor saldo = new Fornecedor();
		Empregado sFinal = new Empregado();
		fulano.setNome("Ana");
		fulano.setEndereco("Rua 10");
		fulano.setTelefone("(11) 98765-4321");		
		saldo.setValorCredito(1000);
		saldo.setValorDivida(200);
		sFinal.setSalarioBase(2000);
		sFinal.setImposto(15);
		
		
							
		System.out.println(fulano.getNome());
		System.out.println(fulano.getEndereco());
		System.out.println(fulano.getTelefone());
		System.out.println(saldo.saldoAtual());
		System.out.println(sFinal.salarioFinal());
	
		

}
}
