package problemex3_2;

public class Problemex3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Computer computer[]=new Computer[3];
		computer[0]=new PersonalComputer();
		computer[1]=new TabletPC();
		computer[2]=new SmartPhone();

		for(Computer com:computer){
			com.showType();
			com.input();
			com.output();
			com.communication();
			System.out.println("-----------------------------------------------");
		}
	}

}
