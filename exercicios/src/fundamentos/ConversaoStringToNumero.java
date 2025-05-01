package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringToNumero {

	public static void main(String[] args) {
		
		String v1 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		System.out.println(v1);
		String v2 = JOptionPane.showInputDialog(
				"Digite o segundo número: ");
		System.out.println(v2);
		
		System.out.println("Soma dos números: "+(v1 + v2)+" - "
				+ "apenas concatenou os valores v1 e v2.");
		
		double num1 = Double.parseDouble(v1);
		double num2 = Double.parseDouble(v2);
		double soma = num1 + num2;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + soma/2);
	}

}
