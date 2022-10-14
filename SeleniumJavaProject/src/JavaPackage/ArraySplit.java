package JavaPackage;

public class ArraySplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String textSplit="This is 'Jaswanth heerekar' and this is my first name";

		String[] split=textSplit.split("'");
		System.out.println(split[0]);
		
		String textSplit2= split[1].split("'")[0];
		System.out.println(textSplit2);
		
		
		
		

	}

}
