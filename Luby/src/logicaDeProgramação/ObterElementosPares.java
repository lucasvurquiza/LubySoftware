package logicaDeProgramação;

public class ObterElementosPares {
	public void obterElementosPares(int vetor[]) {
		int [] vetPar = new int[10];
		int i, tamPar = 0;
		
		for (i = 0; i < 10; i++) {
			if(vetor[i] % 2 == 0) {
				vetPar[tamPar] = vetor[i];
				tamPar++;
			}
		}
		System.out.println("Vetor Par:");
		for(i = 0; i < tamPar; i++) {
			System.out.print(vetPar[i] + ", ");
		}
	}
}
