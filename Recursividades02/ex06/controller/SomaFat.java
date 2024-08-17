package controller;

public class SomaFat 
{
	public float somafat(int num)
	{
		if(num<=0)
		{
			return 0;
		}
		else
		{
			return (1/fat(num)) + somafat(--num);
		}
	}
	
	public float fat(int num)
	{
		if(num <= 0)
		{
			return 1;
		}
		else
		{
			return num*fat(--num);
		}
	}
}