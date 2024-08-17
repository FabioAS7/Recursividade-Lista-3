package controller;

public class Fibonacci 
{
	public int fibonacci(int posicao)
	{
		if(posicao == 1 || posicao == 2)
		{
			return 1;
		}
		else
		{
			return fibonacci(posicao-1) + fibonacci(posicao-2);
		}
	}
}