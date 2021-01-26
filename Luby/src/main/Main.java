package main;

import java.text.ParseException;

import logicaDeProgramação.BuscarPessoa;
import logicaDeProgramação.CalcularDiferencaData;
import logicaDeProgramação.CalcularPremio;
import logicaDeProgramação.CalcularValorComDescontoFormatado;
import logicaDeProgramação.CalcularVogais;
import logicaDeProgramação.Fatorial;
import logicaDeProgramação.NumeroPrimo;
import logicaDeProgramação.ObterElementosPares;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		System.out.println("Questão 1.1:");
		Fatorial fatorial = new Fatorial(); int resp = fatorial.fatorial(5);
		System.out.println(resp);
		
		System.out.println("\nQuestão 1.2:");
		CalcularPremio calcularPremio = new CalcularPremio();
		double valor = calcularPremio.calcularPremio(100, "vip", null);
		double valor2 = calcularPremio.calcularPremio(100, "basic", 3.0);
		System.out.println(valor);
		System.out.println(valor2);
		
		System.out.println("\nQuestão 1.3:");
		NumeroPrimo numeroPrimo = new NumeroPrimo();
		numeroPrimo.numeroPrimo(10);
		
		System.out.println("\nQuestão 1.4:");
		CalcularVogais calcularVogais = new CalcularVogais();
		int numeroVogais = calcularVogais.calcularVogais("Luby Software");
		System.out.println(numeroVogais);
		
		System.out.println("\nQuestão 1.5:");
		CalcularValorComDescontoFormatado calcularValorComDescontoFormatado = new CalcularValorComDescontoFormatado();
		String valor3 = calcularValorComDescontoFormatado.calcularValorComDescontoFormatado("R$ 6.800,00", "30%");
		System.out.println(valor3);
		
		System.out.println("\nQuestão 1.6:");
		CalcularDiferencaData calcularDiferencaData = new CalcularDiferencaData();
		calcularDiferencaData.calcularDiferencaData("10122020", "25122020");
		
		System.out.println("\nQuestão 1.7:");
		ObterElementosPares obterElementosPares = new ObterElementosPares();
		int array [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		obterElementosPares.obterElementosPares(array);
		
		System.out.println("\n\nQuestão 1.8:");
		BuscarPessoa buscarPessoa = new BuscarPessoa();
		String[] vetor = new String[] {"John Doe","Jane Doe","Alice Jones","Bobby Louis","Lisa Romero"};
		buscarPessoa.buscarPessoa(vetor, "Doe");
		buscarPessoa.buscarPessoa(vetor, "Alice");
		buscarPessoa.buscarPessoa(vetor, "Louis");
	}

}
