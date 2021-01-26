package logicaDeProgramação;

public class BuscarPessoa {
	public void buscarPessoa(String[] nomes, String texto) {
		int posicao = -1;

		for(int i = 0; i < nomes.length; i++) {
			if(nomes[i].contains(texto)) {
				posicao = i;
				if(posicao > -1) {
					System.out.println(nomes[posicao]);
				} else {
					System.out.println("Não encontrado");
				}
			}
		}
	}
}
