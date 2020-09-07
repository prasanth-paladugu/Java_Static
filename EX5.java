//EXAMPLE ON STATIC BLOCKS
public class EX5
{
	static										//STATIC METHOD
	{
		System.out.println("STATIC1");
	}
	{											//NON STATIC METHOD
		System.out.println("NON STATIC");
	}
	public static void main(String[]args)		//MAIN METHOD
	{
		new EX5();								//OBJECT CREATION ==>THEN ONLY NON STATIC BLOCK IS EXECUTED
		System.out.println("MAIN");
	}
	static										//STATIC METHOD
	{
		System.out.println("STATIC2");
	}
}
