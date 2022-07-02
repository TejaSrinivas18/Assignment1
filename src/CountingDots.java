
public class CountingDots {

	public static void main(String[] args) {
		String s = "ram is.... a ..good boy";
		int oldLength = s.length();
		
		String str = s.replace(".", "");
		int newLength = str.length();
		
		System.out.println(oldLength - newLength);
	}

}
