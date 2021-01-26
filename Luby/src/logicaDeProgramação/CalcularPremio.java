package logicaDeProgramação;

public class CalcularPremio {
	public double calcularPremio(double premio, String tipo, Double fatorProprio) {
		double valorTotal = 0;
		if(fatorProprio == null) {
			if(tipo == "basic") {
				valorTotal = premio;
			} else if(tipo == "vip") {
				valorTotal = (premio) * 1.2;
			} else if(tipo == "premium") {
				valorTotal = (premio ) * 1.5;
			} else if(tipo == "deluxe") {
				valorTotal = (premio) * 1.8;
			} else if(tipo == "special") {
				valorTotal = (premio) * 2;
			} else {
				System.out.println("Tipo informado errado");
			}
		} else if(tipo == "basic") {
			valorTotal = premio * fatorProprio;
		} else if(tipo == "vip") {
			valorTotal = (premio * fatorProprio) * 1.2;
		} else if(tipo == "premium") {
			valorTotal = (premio * fatorProprio) * 1.5;
		} else if(tipo == "deluxe") {
			valorTotal = (premio * fatorProprio) * 1.8;
		} else if(tipo == "special") {
			valorTotal = (premio * fatorProprio) * 2;
		} else {
			System.out.println("Tipo informado errado");
		}
		return valorTotal;
	}
}
