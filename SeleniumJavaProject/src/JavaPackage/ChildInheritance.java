package JavaPackage;

public class ChildInheritance extends ParentInheritance{
	
	public void engine()
	{
		System.out.println("THis is engine from child class");
	}
	
	public void color()
	{
		System.out.println(colour);
		System.out.println(colour);
		System.out.println(colour);
		System.out.println(colour);
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ChildInheritance a=new ChildInheritance();
		a.breaks();
		a.audiosystem();
		a.breaks();
		a.color();
		a.engine();
		
		

	}

}
