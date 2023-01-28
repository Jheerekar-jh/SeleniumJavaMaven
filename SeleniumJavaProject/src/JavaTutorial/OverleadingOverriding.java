package JavaTutorial;

public class OverleadingOverriding extends OverridingParentclass {
	public void getDataInheritance()
	{
		System.out.println("This is from just overleadingoverriding class and not from parent class");
	}
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		OverleadingOverriding oo=new OverleadingOverriding();
				oo.getData(2);
		oo.getData("Jaswanth");
		oo.getData(2, 3);
		oo.getDataInheritance();
		

	}

}
