//EXAMPLE ON STATIC BLOCKS
class Test											//USER DEFINED CLASS
{
	static int x;									//STATIC VARIABLES
	static											//STATIC BLOCKS
	{
		x=100;										//INTIALIZING STATIC VARIABLES
		System.out.println("Static Block");
	}
}
public class EX6									//MAIN CLASS
{
	public static void main(String[]arg)
	{
		System.out.println("MAIN");
		System.out.println(Test.x);
	}
}