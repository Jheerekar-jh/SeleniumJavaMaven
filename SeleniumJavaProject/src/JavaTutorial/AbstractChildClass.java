package JavaTutorial;

public class AbstractChildClass extends AbstractParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChildClass acc=new AbstractChildClass();
		acc.color();
		acc.safetyGuidelines();
		acc.engine();

	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	System.out.println("The color of the flight is red");
		
	}

}
