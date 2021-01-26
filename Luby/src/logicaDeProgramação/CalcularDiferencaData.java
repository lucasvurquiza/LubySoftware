package logicaDeProgramação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcularDiferencaData {
	public void calcularDiferencaData(String data1, String data2) throws ParseException{
		StringBuilder stringBuilder1 = new StringBuilder(data1);
		stringBuilder1.insert(data1.length() - 4, '-');
		stringBuilder1.insert(stringBuilder1.length() - 7, '-');
		
		StringBuilder stringBuilder2 = new StringBuilder(data2);
		stringBuilder2.insert(data2.length() - 4, '-');
		stringBuilder2.insert(stringBuilder2.length() - 7, '-');
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		Date dataFormatada1 = sdf1.parse(stringBuilder1.toString());
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		Date dataFormatada2 = sdf2.parse(stringBuilder2.toString());
		
		long diferenca = (dataFormatada2.getTime() - dataFormatada1.getTime()) + 3600000;
		
		System.out.println(diferenca / 86400000L);
	}
}
