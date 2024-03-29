package class1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassSample01 {
	public static String NEW_LINE_WIN="\r\n"; //CR+LF(windows)
	public static String NEW_LINE_LIN="\n"; //LF(linux/unix)

	//public static String CURRENT_PROJ_DIR = "c:/_cui_program/java/learn_java/class1/";
	public static String CURRENT_PROJ_DIR = "d:/program/java/learn_java/class1/";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//sample01();
		//sample02();
		//sample03();
		//sample04();
		//sample05();

		printDirTree(CURRENT_PROJ_DIR,0);

		return;
	}


	//指定ファイルが無ければ新規ファイルを作成
	public static void sample01(){
		try{
			File file = new File(CURRENT_PROJ_DIR + "file_sample.txt");
			System.out.println(file.exists()); //ファイルが存在するか？
			System.out.println(file.createNewFile()); //ファイルが存在しなければ作成
		}catch(IOException e){
			System.out.println("処理に失敗しました。");
		}
		return;
	}


	//指定フォルダの内部を走査
	public static void sample02(){
		File file = new File(CURRENT_PROJ_DIR);
		File fileList[] = file.listFiles(); //File型の配列(配列に変換してから代入)
		System.out.println("指定したディレクトリは、"+file.getAbsolutePath()+"です。");

		for(int i = 0; i < fileList.length; i++){ //Listの要素数まで
			if(fileList[i].isFile()==true){ //要素がファイルであるか？
				System.out.println("ファイル名は"+fileList[i].getName()+"です。"); //要素の名前を取得
			}else  if(fileList[i].isDirectory()==true){ //要素がディレクトリでさるか？
				System.out.println("ディレクトリ名は、"+fileList[i].getName()+"です。");
			}
		}
		return;
	}


	//指定ファイルに書き込み
	public static void sample03(){
		try{
			FileWriter writer = new FileWriter(CURRENT_PROJ_DIR + "file_sample.txt");
			for(int i=0;i<5;i++){
				writer.write((i+1) + "行目"+NEW_LINE_WIN);
				System.out.print((i+1) + "行目"+NEW_LINE_LIN);
			}
			writer.close();
		}catch(IOException e){
			System.out.println("書き込みに失敗しました。");
		}
		return;
	}


	//指定ファイルを読み込んで表示
	public static void sample04(){
		FileReader reader = null;
		try{
			reader = new FileReader(CURRENT_PROJ_DIR + "file_sample.txt");
			int ch;
			while((ch = reader.read()) != -1){
				System.out.print((char)ch);
			}
		}catch(FileNotFoundException e1){
			System.out.println("ファイルが見つかりません。");
		}catch(IOException e2){
			System.out.println("ファイルエラーです。");
		}finally{ //終了処理
			try{
				if(reader!=null) reader.close();
			}catch(IOException e){
				System.out.println("ファイルが閉じられませんでした。");
			}
		}
		return;
	}


	//指定ファイルに書き込みながら、途中で読み込み
	public static void sample05(){
		FileReader reader = null;
		FileWriter writer = null;
		try{
			reader = new FileReader(CURRENT_PROJ_DIR + "file_sample.txt");
			writer = new FileWriter(CURRENT_PROJ_DIR+"file_sample.txt");

			writer.write("あいうえお"+NEW_LINE_WIN);
			writer.write("かきくけこ"+NEW_LINE_WIN);
			writer.flush();
			writer.write("さしすせそ"+NEW_LINE_WIN);
			int ch;
			while((ch = reader.read()) != -1){
				System.out.print((char)ch);
			}
		}catch(FileNotFoundException e1){
			System.out.println("ファイルが見つかりません。");
		}catch(IOException e2){
			System.out.println("ファイルエラーです。");
		}finally{
			try{
				if(reader!=null) reader.close();
				if(writer!=null) writer.close();
			}catch(IOException e){
				System.out.println("ファイルが閉じられませんでした。");
			}
		}
		return;
	}


	//指定ディレクトリ内部を再帰的に出力
	public static void printDirTree(String absPath,int dirNum){
		File fileList[] = ( new File(absPath).listFiles());

		for(int i = 0; i < fileList.length; i++){
			printTab(dirNum);
			if(i == fileList.length-1){
				System.out.print("┗");
			}else{
				System.out.print("┣");
			}

			if(fileList[i].isFile()){
				System.out.println(fileList[i].getName() + "ファイルです。");
			}else if(fileList[i].isDirectory()){
				System.out.println(fileList[i].getName() + "フォルダです。");
				printDirTree(fileList[i].getAbsolutePath(), dirNum+1); //再帰的にフォルダを出力
			}
		}

		return;
	}

	//指定数tabを出力
	public static void printTab(int tabNum){
		for(int i = 0; i < tabNum; i++){
			System.out.print("\t");
		}
	}
}
