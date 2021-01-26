package logicaDeProgramação;

public class CalcularVogais {
	public int calcularVogais(String texto) {
		int contarVogais = 0;
		char vogais[] = {'a', 'e', 'i', 'o', 'u'};
		
		texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if(contem(vogais, c)) {
				contarVogais++;
			}
		}
		return contarVogais;
	}
	
	private static boolean contem (char vetor[], char comparacao){
        boolean flag = false;

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == comparacao)
                flag = true;
        }

        return flag;
    }
}
