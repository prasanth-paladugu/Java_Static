//EXAMPLE ON STATIC IMPORT
import static java.lang.System.*;				//IMPORTING STATIC CLASS SYSTEM
import static java.lang.Math.*;					//IMPORTING STATIC CLASS MATH
public class EX4
{
	public static void main(String[]arg)
	{
		long t=currentTimeMillis();
		out.println(t);
		out.println(pow(2,5));
	}
}