package JavaTutorial;

public class AustralianTraffic implements centralTraffic, ContinentTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		centralTraffic a = new AustralianTraffic();
		ContinentTraffic a1= new AustralianTraffic();
		a1.asia();
		a.greenGo();
		a.redStop();
		a.flashYellow();

	}

	@Override
	public void greenGo() {
		System.out.println("This is Green Go method");
		
	}

	@Override
	public void redStop() {
		System.out.println("This is red Stop method");		
	}
	@Override
	public void flashYellow() {
		System.out.println("This is Flash Yellow method");
	}

	@Override
	public void asia() {
		// TODO Auto-generated method stub
		System.out.println("this is asia method from continential interface");
		
	}
	
	

}
