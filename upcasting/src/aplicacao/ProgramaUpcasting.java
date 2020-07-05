package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresa;

public class ProgramaUpcasting {

	public static void man(String[] args) {
		Conta ContaUm = new Conta(111111,"giba",200.00);
		ContaEmpresa ContaEmpresa = new ContaEmpresa(22222,"marta", 300.00, 100);
		
		
		Conta ContaDois;
		
		ContaDois = ContaEmpresa;
		
		
		
		
		
		
		
		
	}
	
	
	
}
