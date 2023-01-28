package JavaTutorial;

public class StaticVar {

	String name, address;
	static String city="Brisbane";
	
	
	  StaticVar(String name, String address)
	  { 
		  this.name=name;
		  this.address=address;  
	  
	  }
	  
	  public void getAddress()
	  {
		  System.out.println(address + " "+ city);
	  }
	public static void main(String[] args)
	{
		
		StaticVar obj=new StaticVar("Jas","ForestLake");
		StaticVar obj1=new StaticVar("Jaswanth","Salisbury");		
		obj.getAddress();
		obj1.getAddress();

	}

}
