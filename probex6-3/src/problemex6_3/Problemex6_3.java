package problemex6_3;

import java.util.HashSet;

public class Problemex6_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HashSet<Integer> distinctHash = new HashSet<Integer>();

		for(int i=0;i<10;i++){
			/*デバック用*/
			int num=randInt(10,1);
			distinctHash.add(num);
			System.out.print(num+" ");


			//distinctHash.add(randInt(10,1));
		}


		System.out.print("\n出現した数:");
		for(int num:distinctHash){
			System.out.print(num+" ");
		}

	}

	//整数の乱数を発生させる
	public static int randInt(int numRange){
		return randInt(numRange,0);
	}
	public static int randInt(int numRange,int numStart){
		return (int)(Math.random()*numRange)+numStart;
	}

}
