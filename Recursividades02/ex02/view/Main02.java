package view;

import javax.swing.JOptionPane;

import controller.Qnum;

public class Main02 
{
	public static void main(String args[])
	{
		Qnum m = new Qnum();
		int num, compara;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 10 a 999999: "));
		compara = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 0 a 9: "));
		
		System.out.println("No numero " + num + ", o numero " + compara + " aparece " + m.qnum(num, compara));
	}
}