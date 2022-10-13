package JavaPackage;

import java.lang.reflect.Constructor;

public class ConstructorClass {
	
	public ConstructorClass()
	{
		System.out.println("This is Constructor class");
	}
	public ConstructorClass(int a, int b)
	{
		int z = a+b;
		
	}
	
	public void getData()
	{
		System.out.println("This is getData");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorClass cd= new ConstructorClass();
		ConstructorClass cd1=new ConstructorClass(4,5);
		//System.out.println(cd1.);
		cd.getData();
		

	}

}
