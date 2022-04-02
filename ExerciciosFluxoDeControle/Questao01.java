import java.util.Random;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		int valor;
		int tentativa = 11;
		int totalDeTentativas = 0;

		Scanner sc = new Scanner(System.in);
		
		Random gerador = new Random(); 
		
		valor = gerador.nextInt(11); 

		while (tentativa != valor) {
			
			totalDeTentativas++;
			
			System.out.println("Digite um número entre 0 e 10");

			tentativa = sc.nextInt();
	
		
			if (tentativa == valor) {
				System.out.println("Número correto!");
			}		

			if (tentativa < valor) {
				System.out.println("Número menor que o valor!");
			}

			if (tentativa > valor) {
				System.out.println("Número maior que o valor!");
			}

		}
		
		System.out.println("Total de Tentativas = " + totalDeTentativas);
		
		sc.close();

	}

}