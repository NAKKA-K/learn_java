package class6;

public class ClassSample06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		sample01();
		sample02();
		sample03();
	}

	public static void sample01(){
		StringBuffer buf = new StringBuffer("Apple ");
		buf.append("Banana ");
		buf.append("Pineapple");
		System.out.println(buf);
	}

	public static void sample02(){
		StringBuffer buf = new StringBuffer("Apple ");
		buf.append("Pineapple");
		buf.insert(6, "Banana ");
		System.out.println(buf);
	}

	public static void sample03(){
		StringBuffer buf = new StringBuffer("Apple Pineapple ");
		buf.append("Banana");
		System.out.println(buf);
		buf.delete(6, 16);
		System.out.println(buf);
	}
}
