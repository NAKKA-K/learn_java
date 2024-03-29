package class5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ClassSample05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//sample01();
		//sample02();
		//sample03();
		sample04();
	}

	public static void sample01(){
		String str1 = "one,two,three", str2 = "apple orange pineapple";
		String strArray1[] = str1.split(","), strArray2[] = str2.split(" ");

		for(String str : strArray1){
			System.out.println(str);
		}
		System.out.println();
		for(String str : strArray2){
			System.out.println(str);
		}
	}

	public static void sample02(){
		String str1 = "one,two,three", str2 = "apple orange pinaapple";
		Scanner scan1 = new Scanner(str1);

		scan1.useDelimiter(",");
		while(scan1.hasNext()){
			System.out.println(scan1.next());
		}
		System.out.println();

		Scanner scan2 = new Scanner(str2);
		while(scan2.hasNext()){
			System.out.println(scan2.next());
		}

		scan1.close();
		scan2.close();
	}

	public static void sample03(){
		System.out.println("Input Data:");
		Scanner scan = new Scanner(System.in);

		int i = 1;
		while(scan.hasNext()){
			String str = scan.next();
			System.out.println(i + " : " + str);
			i++;
		}
	}

	public static void sample04(){
		String fileName = "csv_sample.csv";
		createCsvSample(fileName);

		Scanner scan = null;
		try{
			scan = new Scanner( new BufferedReader( new FileReader(fileName)));
			scan.useDelimiter(",");
			while(scan.hasNext()){
				System.out.print(scan.next() + " ");
			}
		}catch(IOException e){
			System.out.println("入出力エラーです。");
		}finally{
			if(scan != null) scan.close();
		}
		return;
	}

	public static void createCsvSample(String fileName){
		if(fileExists(fileName)) return; //sampleはもうあるみたいだ

		String NEW_LINE_WIN = "\r\n";
		FileWriter writeToFile;
		try{
			writeToFile = new FileWriter(fileName);
			writeToFile.write("1,2,3" + NEW_LINE_WIN);
			writeToFile.write("4,5,6"+NEW_LINE_WIN);
			writeToFile.write("7,8,9");
			writeToFile.flush();
		}catch(IOException e){
			System.out.println("csv_sample.csvが正常に作成できませんでした。");
		}
		return;
	}

	public static boolean fileExists(String fileName){
		File file = new File(fileName);
		return file.exists();
	}

}
