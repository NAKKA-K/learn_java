package problemex5;

import java.util.ArrayList;

public class Problemex5_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> list=new ArrayList<Integer>();
		int rand;

		while(true){
			rand = MathRandom.randInt(10);
			System.out.print("0~10の値を出力:");
			System.out.println(rand);

			if(rand == 0){
				break;
			}
			list.add(rand);
		}


		for(int i = 0; i < list.size(); i++){
			if(list.get(i) == 2){
				list.remove(i--);
			}
		}


		System.out.println();
		for(int n:list){
			System.out.print(n+" ");
		}

	}

}
