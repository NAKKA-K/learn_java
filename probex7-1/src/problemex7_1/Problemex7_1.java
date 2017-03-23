package problemex7_1;

public class Problemex7_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num[]={0,1,2};

		try{
			for(int i=0;i<4;i++){
				System.out.println("a["+i+"]="+num[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("配列の範囲を超えています。");
			System.out.println(e);
		}

	}

}
