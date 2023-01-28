package JavaTutorial;

public class InheritanceChild extends InheritanceParent {
	
	int a =20;
	

	public static void main(String[] args) {
		
		InheritanceParent C= new InheritanceChild();
		System.out.println(C.a);
		// It will be value 10 from parent class

	}

}
