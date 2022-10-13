package JavaPackage;



public class AustraliaTrafficRulesInterfaceImplementing implements CentralTrafficInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CentralTrafficInterface a=new AustraliaTrafficRulesInterfaceImplementing();
			a.greenGo();
			a.redStop();
			a.flashYellow();
	}


	@Override	
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("This is greenbutton");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("This redstop button");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("This is flashyellow button");
		
	}
}



