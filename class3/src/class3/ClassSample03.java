package class3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassSample03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		sample1();

		return;
	}


	//
	public static void sample1(){
		PrintWriter printer = null;

		try{
			printer = new PrintWriter( new BufferedWriter( new FileWriter("test.txt")));
		}catch(IOException e){
			e.printStackTrace();
		}
		printer.print("printによる出力(改行なし)");
		printer.println("printlnによる出力(改行あり)");
		printer.printf("printfによる出力 %s",5);
		System.out.println("Data Writting Finished.");

		printer.close();
		return;
	}

}
