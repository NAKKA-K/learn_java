package problemex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problemex6_1 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		HashMap<String, String> hashList =new HashMap<String, String>();
		hashList.put("cat", "猫");
		hashList.put("dog", "犬");
		hashList.put("bird", "鳥");
		hashList.put("tiger", "虎");

		BufferedReader br =new BufferedReader( new InputStreamReader( System.in));

		String nameHash;
		while(true){
			System.out.print("英語で動物の名前を入力してください(終了はq):");
			nameHash=br.readLine();

			if(nameHash.equals("q")){ //quit
				break;
			}

			if(hashList.containsKey(nameHash)){
				System.out.println("「"+hashList.get(nameHash)+"」です。");
			}else{
				System.out.println("対応するデータは登録されていません。");
			}
		}

	}

}
