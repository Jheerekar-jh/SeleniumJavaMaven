package JavaPackage;

public class ClassAndObjects {

	public static void main(String[] args) 
	{

		ClassAndObjects	 gd=new ClassAndObjects();
		gd.getData();
		String s=gd.getString();
		System.out.println(s);
		System.out.println(getData1());
		int k=1;
		for(int i=0; i<4; i++)
		{
			for(int j=1; j<=4-i;j++)
			{
				System.out.print( k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");

		}





		int a=1;
		for(int b=0; b<5; b++)
		{
			for(int c=1; c<=b;c++)
			{
				System.out.print( a);
				System.out.print("\t");
				a++;
			}
			System.out.println("");

		}
	}






	public void getData()
	{
		System.out.println("This is getData method");
	}


	public String getString()
	{
		System.out.println("This methods return string");
		return" return string";
	}

	public static String getData1()
	{
		return"This returns Static getData";

	}
}
