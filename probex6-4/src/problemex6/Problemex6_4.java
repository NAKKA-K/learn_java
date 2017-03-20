package problemex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Problemex6_4 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		HashSet<Character> distinctHash = new HashSet<Character>();
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in));

		System.out.print("英単語を入力:");
		String str = reader.readLine();

		for(int i=0;i<str.length();i++){
			distinctHash.add(str.charAt(i));
		}

		System.out.print("\n使用されているアルファベット:");
		for(char ch:distinctHash){
			System.out.print(ch+" ");
		}

	}

}
