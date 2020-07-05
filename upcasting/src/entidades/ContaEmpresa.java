package entidades;

//Com extends Conta, ContaEmpresa herda todos os métodos e atributos de Conta
public class ContaEmpresa extends Conta{
	
	private double limiteEmprestimo;
	
	public ContaEmpresa() {
		super();
	}
	
	
	public ContaEmpresa(int numero, String titular, double saldo, double limiteEmprestimo) {
		//utilizamos a palavra reservada super para aproveitarmos o construtor da classe pai
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}


	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}


	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	
	
	public void Emprestar(double valor) {
		if(limiteEmprestimo >= valor) {
			//chamando função da classe pai
			saldo += valor;			
		}
	}
	
	
	

}
