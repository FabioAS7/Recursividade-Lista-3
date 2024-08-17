package view;

import javax.swing.JOptionPane;
import controller.SomaDigito;

public class Main07 {

	public static void main(String[] args) 
	{
		SomaDigito m = new SomaDigito();
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para saber a soma de seus digitos: "));
		
		System.out.println("A soma dos digitos do numero " + num + " e de " + m.somadigito(num));
	}
}
