package entidades;

public class Conta {
	//membros private não podem ser acessados em sublcasses
	private Integer numero;
	private String titular;
	//utilizamos protected para que o membro possa ser acessado em subclasses de outros pacotes
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
	
	public void sacar(Double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}
	}
	
}
