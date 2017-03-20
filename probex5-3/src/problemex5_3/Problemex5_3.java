package problemex5_3;

import java.util.ArrayList;

public class Problemex5_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList allList[]=new ArrayList[10];
		for(int i=0;i<10;i++){
			allList[i]=new ArrayList<Integer>();
		}

		while(true){
			int rand=randInt(101);
			System.out.println("0~100の値を出力:"+rand);

			if(rand==0){
				break;
			}
			allList[rand%10].add(rand); //10個のArayListと、randの1の位を対応させて格納
		}

		/*出力*/
		for(int i=0; i < 10; i++){	//1の位順に出力
			System.out.print("1の位が"+i+":");

			for(int j=0; j < allList[i].size(); j++){
				System.out.print(allList[i].get(j)+" ");
			}
			System.out.println();
		}

	}

	//Math.random()をラッピング
	public static int randInt(int rangeNum){
		return randInt(rangeNum,0); //startNumが設定されてないため、デフォルトの0を指定して再呼び出し
	}
	public static int randInt(int rangeNum,int startNum){
		return (int)(Math.random()*rangeNum)+startNum;
	}

}
