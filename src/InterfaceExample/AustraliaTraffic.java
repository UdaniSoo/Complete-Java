package InterfaceExample;

public class AustraliaTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calling methods of the interface CentralTraffic
		CentralTraffic a=new AustraliaTraffic();
		a.GreenGo();
		a.RedStop();
		a.YellowFlash();
		
		//calling methods of the class AustraliaTraffic
		AustraliaTraffic at=new AustraliaTraffic();
		at.Walking();
		
		//Calling methods of interface ContinentalTraffic
		ContinentalTraffic ct=new AustraliaTraffic();
		ct.TrainSymble();
	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		
		System.out.println("GreenGo implementation");
		
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		
		System.out.println("Red Stop implementation");
		
	}

	@Override
	public void YellowFlash() {
		// TODO Auto-generated method stub
		
		System.out.println("YellowFlash implementation");
	}
	
	public void Walking()
	{
		System.out.println("Working symble");
		
	}

	@Override
	public void TrainSymble() {
		// TODO Auto-generated method stub
		
		System.out.println("Train symple implementation");
		
	}

}
