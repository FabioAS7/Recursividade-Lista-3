package controller;

public class Nnumeros 
{
	public int nnumeros(int num)
	{
		if(num==0)
		{
			return 0;
		}
		else
		{
			num = num/10;
			return 1 + nnumeros(num);
		}
	}
}
