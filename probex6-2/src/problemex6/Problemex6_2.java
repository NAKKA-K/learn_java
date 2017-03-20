package problemex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problemex6_2 {

	public static void main(String args[]){
		String numJP[]={"〇","一","二","三","四","五","六","七","八","九"};

		HashMap<String, String> list = new HashMap<String, String>();
		for(int i=0;i<10;i++){
			list.put(String.valueOf(i), numJP[i]);
		}


		HashMap<Character, String> list1 = new HashMap<Character, String>();
		for(int i=0;i<10;i++){
			list1.put((char)(i+'0'), numJP[i]);
		}

		try{
			//toNumberJPE1(list1);
			//toNumberJPE2(list);
			toNumberJPE3(list);

		}catch(IOException e){
			System.out.println(e);
		}


	}


	//入力された文字列をtry文でparseIntして、catchでエラー文を出力する。
	//list.put(String.valueOf(i), numJP[i]);
	public static void toNumberJPE3(HashMap<String, String> list) throws IOException{
		BufferedReader reader=new BufferedReader( new InputStreamReader( System.in));

		System.out.print("整数の値を入力してください:");
		String num=reader.readLine();


		//入力された値が整数か？
		try{
			int num1=Integer.parseInt(num);
		}catch(NumberFormatException e){
			System.out.println("整数の値を入力してください。");
			return;
		}


		System.out.print("変換結果:");
		for(int i=0;i<num.length();i++){
			if((num.length() - i) % 3 == 0 && i != 0){ //3桁ごとにカンマを出力
				System.out.print(",");
			}
			System.out.print( list.get( String.valueOf( num.charAt( i)))); //入力されたString→ 1文字ずつCharとして取り出す→ 1文字をStringに戻す→ Hashとして使う
		}

		return;
	}



	//入力された文字列を走査して、数字以外の文字があればエラー文を出力してreturn
	//list.put(String.valueOf(i), numJP[i]);
	public static void toNumberJPE2(HashMap<String, String> list) throws IOException{
		BufferedReader reader=new BufferedReader( new InputStreamReader( System.in));

		System.out.print("整数の値を入力してください:");
		String num=reader.readLine();

		for(int i=0;i<num.length();i++){
			if(num.charAt(i) < '0' || num.charAt(i) > '9'){ //入力された数字が間違っているか？
				System.out.println("整数の値を入力してください。");
				return;
			}
		}

		System.out.print("変換結果:");
		for(int i=0;i<num.length();i++){
			if((num.length() - i) % 3 == 0 && i != 0){ //3桁ごとにカンマを出力
				System.out.print(",");
			}
			System.out.print( list.get( String.valueOf( num.charAt( i)))); //入力されたString→ 1文字ずつCharとして取り出す→ 1文字をStringに戻す→ Hashとして使う
		}

		return;
	}



	//list1.put((char)(i+'0'), numJP[i]);
	public static void toNumberJPE1(HashMap<Character, String> list) throws IOException{
		BufferedReader reader=new BufferedReader( new InputStreamReader( System.in));

		System.out.print("整数の値を入力してください:");
		String num=reader.readLine();

		for(int i=0;i<num.length();i++){
			if(num.charAt(i) < '0' || num.charAt(i) > '9'){ //入力された数字が間違っているか？
				System.out.println("整数の値を入力してください。");
				return;
			}
		}

		System.out.print("変換結果:");
		for(int i=0;i<num.length();i++){
			if((num.length() - i) % 3 == 0 && i != 0){ //3桁ごとにカンマを出力
				System.out.print(",");
			}
			//'0' と (char)0 は!=なので、正常に動作しない
			//が　'0' と (char)(0+'0') は==である。
			System.out.print( list.get( num.charAt( i)));
		}

		return;
	}

}
