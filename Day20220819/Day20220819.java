/*
//输入一个正整数，要求判断是否为质数
public class Day20220819
{
	public static void main(String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num, i;
		System.out.print("请输入您要输入的正整数(大于1)>:");
		num = s.nextInt();		
		System.out.println("您输入的数字是:" + num);
		while ( num <= 1)
		{
			System.out.print("您输入的不是正整数，请输入您要输入的正整数(大于1)>:");
			num = s.nextInt();
		}
		for (i = 2; i <= java.lang.Math.sqrt(num); i++)
		{
			if (num % i == 0)	//该数被1以外的数整除，说明不是质数
			{
				break;
			}
		}
		if (i > java.lang.Math.sqrt(num))
		{
			System.out.println(num + "是质数");
		}
		else
		{
			System.out.println(num + "不是质数");
		}
	}
}
*/
/*
//对以上代码进行优化
public class Day20220819
{
	public static void main(String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num, i;
		System.out.print("请输入您要输入的正整数(大于1)>:");
		num = s.nextInt();		
		System.out.println("您输入的数字是:" + num);
		while (num <= 1)
		{
			System.out.print("您输入的不是正整数，请输入您要输入的正整数(大于1)>:");
			num = s.nextInt();
		}
				while ( num <= 1)
		{
			System.out.print("您输入的不是正整数，请输入您要输入的正整数(大于1)>:");
			num = s.nextInt();
		}
		for (i = 2; i <= java.lang.Math.sqrt(num); i++)
		{
			if (num % i == 0)	//该数被1以外的数整除，说明不是质数
				break;
		}
		System.out.println(num + (i > java.lang.Math.sqrt(num) ? "是" : "不是") + "质数");
	}
}
*/

//输入行数，输出一个对应函数的星星金字塔
public class Day20220819
{
	public static void main(String[] args)
	{
		System.out.print("请输入星星金字塔的层数(大于等于0的整数)>:");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int numOfPlies = s.nextInt();
		while (numOfPlies < 0)
		{
			System.out.println("您输入的层数是:>" + numOfPlies);
			System.out.print("您输入的层数非法，请重新输入(大于等于0的整数)>:");
			numOfPlies = s.nextInt();
		}
		System.out.println("您输入的层数是:>" + numOfPlies);
		
		int i,j;
		for(i = 1; i <= numOfPlies; i++)	//行
		{
			for(j = 0; j < (numOfPlies - i); j++)
				System.out.print(" ");
			for(j = 0; j < (i - 1); j++)
				System.out.print("*");
			System.out.print("*");
			for(j = 0; j < (i - 1); j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
