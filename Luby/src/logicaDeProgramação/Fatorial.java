package logicaDeProgramação;

public class Fatorial {
	public int fatorial(int x) {
		if(x == 0) {
			return 1;
		}
		return x * fatorial(x - 1);
	}
}
