package logicaDeProgramação;

import java.util.ArrayList;

public class NumeroPrimo {
	public void numeroPrimo(int ifinal) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int i, j;
		boolean primo;
		int iinicial = 1;
	
		for (i = iinicial ; i <= ifinal; i++) {
			primo = true;
			if(i == 1) {
				primo = false;
			}
			if(primo) {
				if((i % 2 == 0) && (i != 2)) {
					primo = false;
				}
			}
			if(primo) {
				for (j = 3; j <= (i / 2); j++) {
					if(i % j == 0) {
						primo = false;
						break;
					}
				}
			}
			if(primo) {
				arrayList.add(i);
			}
		}
		System.out.println(String.format("Há %d números primos entre %d e %d", arrayList.size(), iinicial, ifinal));
	}
}
