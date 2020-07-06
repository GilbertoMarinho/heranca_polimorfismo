package entidades;

public class Conta {
	private Integer numero;
	private String titular;
	protected Double saldo;
	
	public Conta() {
	}

	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	
	public Double getSaldo() {
		return saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}
	
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	//método sacar para CONTA
	public void sacar(Double valor) {
		if(saldo >= valor + 5) {
			saldo -= valor + 5;
		}
	}
	
}
