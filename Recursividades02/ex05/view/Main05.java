package view;

import javax.swing.JOptionPane;
import controller.Fibonacci;

public class Main05 
{
	public static void main(String args[])
	{
		int posicao;
		Fibonacci m = new Fibonacci();
		
		posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para saber a serie de Finonnati"));
		System.out.println("Na posicao ("+posicao+") a sequencia de fibonnacci e de " + m.fibonacci(posicao));
	}
}
