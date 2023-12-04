package shruti;
import java.util.*;
class Staff 
{
  protected int id;
  protected String name;
  Staff()
  {
	  int id=1;
	  String name="ss";
  }
  Staff(int id,String name)
  {
	  this.id=id;
	  this.name=name;
  }
  
}
class officestaff extends Staff
{
	String dept;
	void dis()
	{	
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("dept="+dept);
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		int n=sc.nextInt();
		Staff ob[]=new Staff[n];
		
	}
}