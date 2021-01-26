package logicaDeProgramação;

import java.text.NumberFormat;
import java.util.Locale;

public class CalcularValorComDescontoFormatado {
	public String calcularValorComDescontoFormatado(String valor, String porcentagem) {
		double numeroFormatado, porcentagemFormatado, valorDesconto, valorFinal;
		
		numeroFormatado = Double.parseDouble(valor.replace(",00", "").replaceAll("[^0-9]*", ""));
		porcentagemFormatado = Double.parseDouble(porcentagem.replaceAll("[^0-9]*", ""));
		
		valorDesconto = ((porcentagemFormatado * numeroFormatado) / 100);
		valorFinal = numeroFormatado - valorDesconto;
		
		Locale ptBr = new Locale("pt", "BR");
		String valorFinalString = NumberFormat.getCurrencyInstance(ptBr).format(valorFinal);
		
		return valorFinalString;
	}
}
