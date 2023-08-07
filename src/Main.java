import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];
		double soma = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}

		System.out.print("VALORES = ");
		for (int i = 0; i < n;  i++) {
			System.out.print(vetor[i] + " ");
		}

		double media = soma / n;

		System.out.printf("%nSOMA = %.2f", soma);
		System.out.printf("%nMEDIA = %.2f", media);

		sc.close();
		}
}
