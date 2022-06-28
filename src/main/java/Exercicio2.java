import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> repositorio = new ArrayList<Integer>();

		System.out.print("Digite o numero para sequência de fibonacci: ");
		int fib = sc.nextInt();

		for (int i = 1; i <= fib; i++) {
			System.out.printf("%d ", fibonacci(i));
			repositorio.add(fibonacci(i));
		}

		System.out.println();
		if (repositorio.contains(fib)) {
			System.out.println("O número " + fib + " pertence a sequência.");
		} else {
			System.out.println("O número " + fib + " não pertence a sequência.");
		}
		sc.close();
	}

	public static int fibonacci(int n) {
		if (n == 1)
			return (0);

		if (n == 2)
			return (1);

		int fib = 0, fib1 = 0, fib2 = 1;
		for (int i = 3; i <= n; i++) {
			fib = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib;

		}
		return fib;

	}

}
