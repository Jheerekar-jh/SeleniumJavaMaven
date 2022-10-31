package JavaPackage;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reverse="World";
		String empt="";
		char a;
		
		for(int i=0; i< reverse.length();i++)
		{
			a=reverse.charAt(i);
			empt=a+empt;
			
		}
		System.out.println(empt);
		

	}

}
