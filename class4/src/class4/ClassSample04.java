package class4;

public class ClassSample04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//sample01();
		//sample02();
		//sample03();
		sample04();
		sample05();
	}

	public static void sample01(){
		String s1 = "あいうえお", s2 = "Hello";
		System.out.println("「" + s1 + "」の文字列の長さは" + s1.length() + "です。");
		System.out.println("「" + s2 + "」の文字列の長さは" + s2.length() + "です。");
	}

	public static void sample02(){
		String str1 = "ABCDEFGHIJKLMNOP";

		//引数1以上、引数2未満
		System.out.println(str1.substring(3, 8)); //0番目から数えて、3番目から7番目まで取り出す
		System.out.println(str1.substring(3)); //3番目からすべて取り出す
	}

	public static void sample03(){
		String str1 = "apple", str2 = "orange";

		//compareTo(y)と比べてx.の方が　前又は後ろである(正負,0の値が返る)
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str1));
		System.out.println(str2.compareTo(str1));
	}

	public static void sample04(){
		String str = "Apple";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}

	public static void sample05(){
		String str = "    Hello World.    ";
		System.out.println(str.trim());
	}
}
