package controller;

public class Qnum 
{
	public int qnum(int num, int compara)
	{
		if(num==0)
		{
			return 0;
		}
		else
		{
			if(num%10 == compara)
			{
				num = num/10;
				return 1 + qnum(num, compara);
			}
			else
			{
				num = num/10;
				return 0 + qnum(num, compara);
			}
		}
	}
}
