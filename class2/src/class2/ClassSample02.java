package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassSample02 {
	public static String NEW_LINE_WIN="\r\n"; //CR+LF(windows)
	public static String NEW_LINE_LIN="\n"; //LF(linux/unix)

	public static String CURRENT_PROJ_DIR = "c:/_cui_program/java/class1/";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//sample01();
		//sample02();
		inputToFile();

		return;
	}


	//指定ファイルに書き込み、行単位で読出し
	public static void sample01(){
		BufferedWriter writer = null;
		BufferedReader reader = null;
		String fileName = "file_sample2.txt";

		try{
			writer = new BufferedWriter( new FileWriter( fileName));
			writer.write("もも"+NEW_LINE_WIN);
			writer.write("うめ"+NEW_LINE_WIN);
			writer.write("さくら"+NEW_LINE_WIN);
			writer.flush();

			reader = new BufferedReader( new FileReader( fileName));
			String str;
			while((str = reader.readLine()) != null){
				System.out.println(str);
			}
		}catch(FileNotFoundException e1){
			System.out.println("ファイルエラーです。");
		}catch(IOException e2){
			System.out.println("入出力エラーです。");
		}finally{
			try{
				if(writer != null) writer.close();
				if(reader != null) reader.close();
			}catch(IOException e){
				System.out.println("ファイルが閉じられませんでした。");
			}
		}
		return;
	}


	//1行ずつ入力して、出力
	public static void sample02(){
		BufferedReader keyReader = null;
		try{
			keyReader = new BufferedReader( new InputStreamReader( System.in));

			while(true){
				System.out.print("Input (q : end):");
				String str = keyReader.readLine();

				if(str.equals("q")){
					break;
				}
				System.out.println("Data:"+str+"\n");
			}
		}catch(IOException e){
			System.out.println("入出力エラーです。");
		}finally{
			try{
				if(keyReader != null) keyReader.close();
			}catch(IOException e){
				System.out.println("ファイルが閉じられませんでした。");
			}
		}
		return;
	}


	//キーボードから読み取った文字列を、指定ファイルに書き込み
	public static void inputToFile(){
		BufferedReader keyReader = null;
		BufferedWriter fileWriter = null;
		String fileName = "intput_file.txt";

		try{
			keyReader = new BufferedReader( new InputStreamReader( System.in));
			fileWriter = new BufferedWriter( new FileWriter( fileName));

			while(true){
				System.out.print("Input (q : end):");
				String str = keyReader.readLine();

				if(str.equals("q")){
					break;
				}
				fileWriter.write(str + NEW_LINE_WIN);
			}
		}catch(IOException e){
			System.out.println("入出力エラーです。");
		}finally{
			try{
				if(keyReader != null) keyReader.close();
				if(fileWriter != null) fileWriter.close();
			}catch(IOException e){
				System.out.println("ファイルが閉じられませんでした。");
			}
		}
		return;
	}


}
