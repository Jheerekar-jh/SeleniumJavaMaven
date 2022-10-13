package JavaPackage;

public class ExampleChildInheritance extends ExampleparentInheritance{

	public void ParentClass()
	{
		System.out.println("This is from Child class");
		
	}
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public void getData(int b, int c)
	{
		System.out.println(b+c);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExampleChildInheritance driver= new ExampleChildInheritance();
		driver.ParentClass();
		driver.getData(2);
		driver.getData("Jaswanth");
		driver.getData(3, 5);
		
	}

}
