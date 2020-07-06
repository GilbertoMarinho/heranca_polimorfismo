package entidades;

public class ContaPoupanca extends Conta {
	
	private Double taxaJuro;
	
	public ContaPoupanca() {
		
	}
	
	public ContaPoupanca(int numero, String titular, double saldo, Double taxaJuro) {
		super(numero, titular, saldo);
		this.taxaJuro = taxaJuro;
	}


	public Double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(Double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}

	

	public void atualizarSaldo() {
		saldo += saldo * taxaJuro;
	}
	
	/*utilizamos a palabvra reservada @Override
	para indicar ao compilador que estamos sobrepondo um método da classe pai*/
	@Override
	public void sacar(Double valor) {
		// metódo sacar para a classe ContaPoupanca
		saldo -= valor;
	}
	
	
	
	
	
}
