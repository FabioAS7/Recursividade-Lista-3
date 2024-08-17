package view;

import javax.swing.JOptionPane;

import controller.Nnumeros;

public class Main01 
{
	public static void main(String arg[])
	{
		Nnumeros m = new Nnumeros();
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		System.out.println("O numero " + num + " possui " + m.nnumeros(num) + " digitos");
	}
}
