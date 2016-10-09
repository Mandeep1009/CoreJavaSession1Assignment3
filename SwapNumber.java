//Write a program that swaps the values of two variables without using third variable.

class SwapNumber
{
	public static void main(String[] args)
	{
		int a = 100, b = 20;
		a += b; // a=a+b ==> a=30
		b = a - b; //b=a-b ==> b=10
		a = a - b; //a=a-b ==>a=20
		System.out.println("A after Swap is: " +a);
		System.out.println("B after Swap is: " +b);
	}
}