package problemex5_7;

//Math.random()をラッピング
public class MathRandom {

	public static int randInt(int rangeNum){
		return randInt(rangeNum,0); //startNumが設定されてないため、デフォルトの0を指定して再呼び出し
	}
	public static int randInt(int rangeNum,int startNum){
		return (int)(Math.random()*rangeNum)+startNum;
	}

}
