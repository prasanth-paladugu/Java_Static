//EXAMPLE ON STATIC METHODS
class Maths												//USER DEFINED CLASS
{
	public static long power(long x,long y)				//STATIC METHOD
	{
		long p=1;
		for(;y>0;y--)									//FOR LOOP
		{
			p*=x;
		}
		return p;
	}
	static public long natSum(long n)					//STATIC METHOD
	{
		long s=n*(n+1)/2;
		return s;
	}
}
public class EX3										//MAIN CLASS
{
	public static void main(String[]args)
	{
		System.out.println(Maths.power(2,5));
		System.out.println(Maths.natSum(2));
		Maths ob=new Maths();							//NOT PREFERD BECAUSE CREATING OBJECT FOR STATIC IS USELESS WE CAN CALL DIRECTLY USING CLASSNAME
		System.out.println(ob.natSum(2));
	}
}