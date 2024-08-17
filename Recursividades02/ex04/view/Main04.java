package view;

import javax.swing.JOptionPane;

import controller.ConverterBinario;

public class Main04 
{
	public static void main (String args[])
	{
		ConverterBinario m = new ConverterBinario();
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero, limite 2000: "));
		
		System.out.println("A conversao de " + num + " para binerio e " + m.converterBinario(num, ""));
	}
}