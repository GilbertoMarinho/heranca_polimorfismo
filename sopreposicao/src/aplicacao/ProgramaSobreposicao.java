package aplicacao;



import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class ProgramaSobreposicao {

	public static void main(String[] args) {
		
		
		Conta conta = new Conta(1111, "Andr�", 1000);
		//m�todo sacar conta
		conta.sacar(200.00);
		System.out.println(conta.getSaldo());
		
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(2222, "Lucas", 1000, 0.1);
		//m�todo sacar poupanca sobreposi��o de conta
		contaPoupanca.sacar(200.00);
		System.out.println(contaPoupanca.getSaldo());
		
		
		ContaEmpresa contaEmpresa = new ContaEmpresa(3333, "Lucas", 1000, 200);
		//m�todo sacar conta empresa sobreposi��o de conta
		contaEmpresa.sacar(200.00);
		System.out.println(contaEmpresa.getSaldo());
		
	}
}
