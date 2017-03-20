package problemex3;

public class Problemex3_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FighterAiracraft fighter=new FighterAiracraft();
		PassengerPlane passenger=new PassengerPlane();

		fighter.fly();
		fighter.fight();

		passenger.fly();
		passenger.carryPassengers();


		/*C++で言うUpper Cast*/
		AirPlane airPlane[]=new AirPlane[2];
		airPlane[0]=fighter;
		airPlane[1]=passenger;

		System.out.println("\n試行錯誤中:抽象メソッドを介してforを使うことによって、中身のサブクラスを意識せずに使う");
		for(AirPlane air:airPlane){
			air.fly();
		}


	}

}
