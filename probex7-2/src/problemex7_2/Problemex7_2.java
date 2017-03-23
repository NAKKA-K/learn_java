package problemex7_2;

public class Problemex7_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i=0,j=-1; //jはループに入った時点で+1されるため、1少ない数で初期化

		while(i<3){ //catchされても続けるため
			try{
				while(i<3){
					while(j<2){
						j++;
						System.out.println(i+"/"+j+"="+i/j);
					}

					i++;  j=-1; //jは1少ない状態から
				}
			}catch(ArithmeticException e){
				System.out.println("0で割り算はできません");
			}
		}

	}

}
