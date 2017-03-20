package problemex3;

public class PersonalComputer extends Computer {

	public PersonalComputer(){
		super("パーソナルコンピューター");
	}

	public void input(){
		System.out.println("キーボード・マウスで入力");
	}

	public void output(){
		System.out.println("ディスプレイに出力");
	}
}
