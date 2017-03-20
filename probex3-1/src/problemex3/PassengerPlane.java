package problemex3;

public class PassengerPlane extends AirPlane{

	public PassengerPlane(){
		super("旅客機");
	}

	public void fly(){
		System.out.println("乗客を乗せて目的地まで飛行します。");
	}

	public void carryPassengers(){
		System.out.println("乗客を目的地まで運びます。");
	}
}
