package aplicacao;

import java.util.ArrayList;
import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;
import java.util.List;

public class ProgramaPolimorfismo {
	
	public static void main(String[] args) {
		double soma = 0;
			
		List<Conta> listaContas = new ArrayList<>();
		
		//Upcasting de objetos de tipos diferentes em variaveis genericas de um mesmo tipo
		listaContas.add(new ContaEmpresa(1111, "Jo�o", 700, 300));
		listaContas.add(new ContaPoupanca(2222, "L�cio", 1100, 0.01));
		listaContas.add(new Conta(3333, "Roberto", 800));
		
		
		//Utilizando-se do polimorfismo, 
		//podemos trazer objetos de tipos diferentes para uma mesma cole��o 
		for(Conta cnt: listaContas) {
			cnt.depositar(10.00);
			System.out.printf("Somando 10 reais na conta %d; valor ap�s o acrescimo: %.2f%n", cnt.getNumero(), cnt.getSaldo());
			soma += cnt.getSaldo();
		}
		
		System.out.println("Soma do saldo de todas as Contas: "+soma);
		
		
	}
}