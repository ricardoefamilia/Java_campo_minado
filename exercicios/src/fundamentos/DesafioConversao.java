package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.print("Digite o primeiro salário: ");
			double sal1 = Double.parseDouble(entrada.nextLine().replace(",", "."));
			
			System.out.print("\nDigite o segundo salário: ");
			double sal2 = Double.parseDouble(entrada.nextLine().replace(",", "."));

			System.out.print("\nDigite o terceiro salário: ");
			double sal3 = Double.parseDouble(entrada.nextLine().replace(",", "."));
			
			double soma = sal1 + sal2 + sal3;
			System.out.println("Montante salários: R$ " + soma);
			
			System.out.println("Média salarial: R$ " + (soma/3));
			
			
		} catch (NumberFormatException e) {
			System.out.println("Erro: " + e);
		}catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		
		
		entrada.close();
	}

}
