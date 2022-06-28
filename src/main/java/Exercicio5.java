import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palavra;

		System.out.print("Escreva a palavra: ");
		palavra = sc.nextLine();

		System.out.println();

		System.out.printf("Entrada: %s\n", palavra);
		System.out.printf("Saida: %s\n", inverter(palavra));

		sc.close();
	}

	public static String inverter(String s) {
		int i, n;
		String Aux = "";

		n = s.length();

		for (i = (n - 1); i >= 0; i--) {
			Aux = Aux + s.charAt(i);
		}
		return Aux;

	}

}
