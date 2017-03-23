package problemex5_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problemex5_5 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> strList=new ArrayList<String>();

		//ArrayListに単語を入力し続ける
		stringInput(strList);

		for(int i=0; i<strList.size(); i++){
			if(strList.get(i).length()>=5){
				 //removeするとそれより後ろの要素が前に詰められるため、iの位置に次の要素が来てしまう。
				//そのためforのi++を見越してi--しておく必要がある。
				strList.remove(i--);
			}
		}

		System.out.print("5文字未満の単語:");
		for(String str:strList){
			System.out.print(str+" ");
		}

	}


	public static void stringInput(ArrayList<String> strList) throws IOException {
		BufferedReader br=new BufferedReader( new InputStreamReader( System.in));

		while(true){
			System.out.print("文字列を入力:");
			String buf=br.readLine();

			if(buf.equals("")){
				break;
			}
			strList.add(buf);
		}

	}

}
