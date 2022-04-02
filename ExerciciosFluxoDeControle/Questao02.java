import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		String nome;
		double nota1,nota2,media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		
		nome = sc.nextLine();
		
		System.out.println("Digite a primeira nota do aluno " + nome);
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno " + nome);
		nota2= sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 6) {
			System.out.println("Aluno aprovado! com média " + media);
		} else {
			System.out.println("Aluno reprovado... Nota final: " + media);
		}

		sc.close();
		
		

		
		
	}

}
