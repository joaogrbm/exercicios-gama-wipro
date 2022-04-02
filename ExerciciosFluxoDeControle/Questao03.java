import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {

		String[] nomes = new String[4];
		int[] quantidadesDeVotos = new int[4];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite o nome do " + (i + 1) + "º candidato");
			nomes[i] = scanner.nextLine();
		}

		for (int i = 0; i < quantidadesDeVotos.length; i++) {
			quantidadesDeVotos[i] = 0;
		}

		int opcao = 0;

		do {
			System.out.println("Digite 1 para votar em "  + nomes[0] 
							+ "\nDigite 2 para votar em " + nomes[1]
						    + "\nDigite 3 para votar em " + nomes[2] 
						    + "\nDigite 4 para votar em " + nomes[3]
						    + "\nDigite 0 para sair");

			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				quantidadesDeVotos[0]++;
				break;
			case 2:
				quantidadesDeVotos[1]++;
				break;
			case 3:
				quantidadesDeVotos[2]++;
				break;
			case 4:
				quantidadesDeVotos[3]++;
				break;
			case 0:
				System.out.println("Votação Encerrada!");
				break;
			default:
				System.out.println("Opção Inválida");
			}

		} while (opcao != 0);
		
		String vencedor = "";
		int maior = 0;
		
		for (int i = 0; i < quantidadesDeVotos.length; i++) {
			
			if(quantidadesDeVotos[i] > maior) {
				  maior = quantidadesDeVotos[i];
				  vencedor = nomes[i];
			}
		}
		
		for(int i = 0; i<quantidadesDeVotos.length;i++) {
			System.out.println("O Candidato " + nomes[i] + " Teve " + quantidadesDeVotos[i] + " Votos.");
		}

		
		System.out.println("O Vencedor foi " + vencedor + " Com " + maior + " votos.");
		
		scanner.close();
		
	}

}
