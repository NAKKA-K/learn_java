package problemex5_1;

import java.util.ArrayList;

public class Problemex5_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<Integer> evenList=new ArrayList<Integer>();
		ArrayList<Integer> oddList=new ArrayList<Integer>();

		ArrayList<Integer> allList=new ArrayList<Integer>();

		while(true){
			int rand=randInt(11);
			System.out.println("0~10の値を出力:"+rand);

			if(rand==0){
				break;
			}
			else if(rand%2==0){
				evenList.add(rand);
				allList.add(rand);
			}
			else{
				oddList.add(rand);
				allList.add(rand);
			}
		}

		/*出力*/
		System.out.print("偶数:");
		for(int num:evenList){
			System.out.print(num+" ");
		}

		System.out.print("\n奇数:");
		for(int num:oddList){
			System.out.print(num+" ");
		}

		System.out.print("\n全数字の逆順:");
		for(int i=allList.size()-1;i>=0;i--){
			System.out.print(allList.get(i)+" ");
		}

		return;
	}


	//Math.random()をラッピング
	public static int randInt(int rangeNum){
		return randInt(rangeNum,0); //startNumが設定されてないため、デフォルトの0を指定して再呼び出し
	}
	public static int randInt(int rangeNum,int startNum){
		return (int)(Math.random()*rangeNum)+startNum;
	}

}
