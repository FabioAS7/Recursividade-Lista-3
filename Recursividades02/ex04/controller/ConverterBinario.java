package controller;

public class ConverterBinario 
{
	public String converterBinario(int num, String p)
	{
		if(num == 0)
		{
			return p;
		}
		else
		{
			String valor = String.valueOf(num % 2);
			num = num/2;
			return converterBinario(num, p) + valor;
		}
	}
}
