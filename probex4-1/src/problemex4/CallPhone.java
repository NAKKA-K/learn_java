package problemex4;

public class CallPhone implements IPhone,IComputer,IMailer{

	public void sendMail(){
		System.out.println("メールを送る");
	}
	public void recieveMail(){
		System.out.println("メールを受信する");
	}

	public void browseWeb(){
		System.out.println("ウェブを閲覧する");
	}
	public void playGame(){
		System.out.println("ゲームをする");
	}

	public void callPhone(){
		System.out.println("電話をかける");
	}
	public void recievePhone(){
		System.out.println("電話を受ける");
	}

}
