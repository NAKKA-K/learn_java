package problemex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problemex5_4 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br=new BufferedReader( new InputStreamReader( System.in));
		ArrayList<String> strList=new ArrayList<String>();

		while(true){
			String buf;
			System.out.print("文字列を入力:");
			buf=br.readLine();

//			if(buf.compareTo("")==0){ //C言語で言うstrcmpに近いもの
			if(buf.equals("")){ //中身同士の比較  (buf==""ではオブジェクト同士の比較になってしまうため、Stringオブジェクト==xという状況になってしまう？)
				break;
			}
			strList.add(buf);
		}

		for(String s:strList){
			System.out.print(s+" ");
		}

	}

}
