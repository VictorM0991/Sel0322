package ciclos;

public class ForLoopBreak {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i == 8) {
				break;
			}
			System.out.println("i: "+i);
			}
		System.out.println("El ciclo se completo");
		}

}
