package problemex5_7;

import java.util.ArrayList;

public class Problemex5_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> list = new ArrayList<Integer>();
		int rand;

		while(true){
			rand = MathRandom.randInt(10);
			System.out.println("0~10の値を出力:"+rand);

			if(rand==0){
				break;
			}

			//昇順ソート(挿入ソート)
			for(int i=0;i<=list.size();i++){
				if(list.size()==i){ //最後に追加
					list.add(rand);
					break;
				}else if(list.get(i)>=rand){ //randのほうが小さい(forの回転数を少なくするため>=)
					list.add(i, rand);
					break;
				}
			}

			System.out.print("出力された数:");
			for(int n:list){
				System.out.print(n+" ");
			}
			System.out.println("\n");

		}


	}

}
