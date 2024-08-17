package view;

import javax.swing.JOptionPane;
import controller.SomaFat;

public class Main06 
{
	public static void main(String args[])
	{
		SomaFat m = new SomaFat();
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		System.out.println("O resultado da Somatoria n("+ num +") e de " + m.somafat(num));
	}
}
