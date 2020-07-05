package aplicacao;



import entidades.Conta;
import entidades.ContaEmpresa;

public class ProgramaUpDown {

	public static void main(String[] args) {
		
		
		
		//UPCASTING
		
		//Vari�vel do tipo da classe pai, recebendo uma refer�ncia de um objeto da classe filho
		//Uma ContaEmpresa � uma Conta, logo, isso � poss�vel 
		Conta conta;
		ContaEmpresa contaEmpresa = new ContaEmpresa(22222,"marta", 300.00, 100);
		conta = contaEmpresa;
		System.out.println(conta.getTitular());
		
		//No entanto, n�o trnho acesso aos membros que s� existem na classe filho
		 //Conta2.setLimiteEmprestimo; :(
		
		//instanciando um objeto do tipo filho em uma vari�vel do tipo pai.
		Conta conta2;
		conta2 = new ContaEmpresa(33333, "fernando", 20.00, 500.00);
		
		
		
	
		//DOWNCASTING
		ContaEmpresa contaEmpresa2;
		
		// uma vari�vel da classe filho n�o pode receber uma refer�ncia de um objeto da classe pai 
		//contaEmpresa2 = conta2; :( WRONG
		//Para isso, precisamos fazer um cast manual na classe pai para a classe filho;
		contaEmpresa2 = (ContaEmpresa) conta2;
		//LEMBRE-SE isso s� � poss�vel pois conta2 faz uma refer�ncia a um objeto do tipo ContaEmpresa
		
		//O valor limiteEmprestimo da classe filho agora est� dispon�vel! 
		System.out.println(contaEmpresa2.getLimiteEmprestimo());
		
		
		Conta conta3 = new Conta(4444, "ronaldo", 20.00);
		ContaEmpresa contaEmpresa3; 
		contaEmpresa3 = (ContaEmpresa) conta3;
		/* A express�o acima vai retornar um erro
		pois o objeto instanciando em conta3 � do tipo conta
		Cuidado, o compilador n�o detecta esse erro
		*/
		
		//Como boa pr�tica � importante verificar o tipo do objeto antes de fazer um DOWNCASTING
		if(conta3 instanceof ContaEmpresa) {
			contaEmpresa3 = (ContaEmpresa) conta3;
		}
		
		
		
	}
	
	
	
}
