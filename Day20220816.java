//计算1000以内所有不能被7整除的整数之和

public class Day20220816
{
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 1; i <= 1000; i++)
		{
			if (0 == (i % 7))
				continue;
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
}
