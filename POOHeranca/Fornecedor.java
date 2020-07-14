package POOExerciciosHeranca;

public class Fornecedor extends Pessoa {
	private int valorCredito;
	private int valorDivida;
	private int saldoAtual;
	
		public Fornecedor()
		{
			super();
		}
		public Fornecedor(String nome, String endereco, String telefone, int valorCredito, int valorDivida,
		int saldoAtual) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.saldoAtual = saldoAtual;
	}

	public int getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}

	public int getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}
	public int getSaldoAtual() {
		return saldoAtual;
	}
		
	public int saldoAtual()
	{
		int saldo = valorCredito - valorDivida;
		return saldo;
	}
		
	
	
	/*os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida
	 *  (montante da dívida para com o fornecedor). Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores, um método obterSaldo() 
	 *  que devolve a diferença entre os valores dos atributos valorCredito e valorDivida. 
	 * Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento dos métodos implementados na classe
	 *  Fornecedor e os herdados da classe Pessoa.
	 * 
	 */


}

	
