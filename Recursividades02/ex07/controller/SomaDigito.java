package controller;

public class SomaDigito 
{
	public int somadigito(int num)
	{
		if(num<=0)
		{
			return 0;
		}
		else
		{
			int valor;
			valor = num%10;
			num = num/10;
			
			return valor + somadigito(num);
		}
	}
}
