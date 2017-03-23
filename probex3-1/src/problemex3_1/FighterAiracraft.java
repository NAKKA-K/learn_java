package problemex3_1;

public class FighterAiracraft extends AirPlane{

	public FighterAiracraft(){
		super("戦闘機");
	}

	public void fly(){
		System.out.println("攻撃に出るために飛行します。");
	}

	public void fight(){
		System.out.println("戦闘します。");
	}
}
