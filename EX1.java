//EXAMPLE ON STATIC VARIABLES
class Sample													//USER DEFINED CLASS
{
	static int x=111;											//DECLARING VARIABLE X AS STATIC
	int y=222;
	Sample(int y)												//CONSTRUCTER
	{
		this.y=y;
	}
}
public class EX1												//MAIN CLASS
{
	public static void main(String[]arg)
	{
		System.out.println(Sample.x);							//CALLING STATIC VARIABLE WITH CLASS NAME
		/*System.out.println(Sample.y);*/
		Sample ob1=new Sample(123);								//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT AND VALUE TO CONSTRUCTE
		System.out.println(ob1.x+"	"+ob1.y);					//CALLING BOTH STATIC AND NON STATIC USING OBJECT
		Sample ob2=new Sample(321);
		System.out.println(ob2.x+"	"+ob2.y);
	}
}
