package fundamentos;

import java.util.Scanner;

public class Programa1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Programa1!!!");
		
		String s = "Bom dia";
		System.out.println(s.concat("!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.equals("bom dia"));
		System.out.println(s.equalsIgnoreCase("bom dia"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.printf("Nome: %s %s\n", nome, sobrenome);
		System.out.printf("Idade: %d\n", idade);
		System.out.printf("Salário: R$%.2f\n", salario);
		
		String frase = "Lorem ipsum dolor sit amet. Rem dolores soluta aut pariatur "
				+ "consequatur aut ratione debitis ut placeat recusandae. Ad suscipit "
				+ "natus ut dolor consequatur non perferendis dolor est rerum placeat "
				+ "et deleniti soluta.";
		
		System.out.println(frase.contains("dolor"));
		System.out.println(frase.indexOf("dolor"));
		System.out.println(frase.substring(6,10));
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String novonome = entrada.nextLine();
		System.out.print("Digite o seu sobrenome: ");
		String sobrenomenovo = entrada.nextLine();
		
		System.out.printf("\n\nNome: %s", novonome);
		System.out.printf("\nSobrenome: %s", sobrenomenovo);
	
		entrada.close();
	}
}
