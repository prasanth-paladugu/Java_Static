//EXAMPLE ON STATIC VARIABLES
class Student													//USER DEFINED CLASS
{
	int sno;													//NON STATIC VARIABLES
	String name;
	static String course="CORE",time="11-1",faculty="Sk";		//STATIC VARIABLES
	public void setData(int sno,String name)					//SETTER METHOD
	{
		this.sno=sno;
		this.name=name;
	}
	public void showData()										//GETTER METHOD
	{
		System.out.println("SNO 		:"+this.sno);
		System.out.println("NAME 		:"+this.name);
		System.out.println("COURSE	 	:"+this.course);
		System.out.println("TIME	 	:"+this.time);
		System.out.println("FACULTY 	:"+this.faculty+"\n");
	}
}
public class EX2												//MAIN CLASS
{
	public static void main(String[]args)
	{
		Student s1=new Student();								//CREATING AN OBJECT AND ASSIGINING A REFERENCE TO OBJECT
		Student s2=new Student();
		s1.setData(01,"PP");									//CALLING METHOD USING OBJECT
		s2.setData(02,"DP");
		s1.showData();
		s2.showData();
	}
}