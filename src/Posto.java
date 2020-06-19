import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		int op;
		Scanner entrada = new Scanner(System.in);
		Bomba b1,b2;
		b1 = new Bomba("Alcool", 4.99);
		b2 = new Bomba("Gasolina", 5.99);
		
		do {
			System.out.println("Deseja abastecer em 1 - litro ou 2 - reais?");
			op = entrada.nextInt();
			if (op == 1) {
				
			}
			else if (op ==2) {
				
			}
			else {
				System.out.println("Adeus!");
				op = -1;
			}
		}
		while( op != -1);

	}
	

}
