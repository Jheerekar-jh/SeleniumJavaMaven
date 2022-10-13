package JavaPackage;

public class AbstractChildClass extends AbstractParentclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractChildClass emirates=new AbstractChildClass();
		emirates.bodyColor();
		emirates.engine();
		emirates.safetyGudielines();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("This is coming from parent class from abstract method bodycolor which was unimplemented");
	}

}
