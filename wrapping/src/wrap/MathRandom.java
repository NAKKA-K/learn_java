package wrap;

public class MathRandom {
	//整数の乱数を発生させる
	public static int randInt(int numRange){
		return randInt(numRange,0);
	}
	public static int randInt(int numRange,int numStart){
		return (int)(Math.random()*numRange)+numStart;
	}
}
