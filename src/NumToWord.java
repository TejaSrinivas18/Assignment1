
public class NumToWord {
	public static void changeValue(char s) {
		switch(s){
			case '0':
				System.out.print("Zero");
				break;
			case '1':
				System.out.print("One");
				break;
			case '2':
				System.out.print("Two");
				break;
			case '3':
				System.out.print("Three");
				break;
			case '4':
				System.out.print("Four");
				break;
			case '5':
				System.out.print("Five");
				break;
			case '6':
				System.out.print("Six");
				break;
			case '7':
				System.out.print("Seven");
				break;
			case '8':
				System.out.print("Eight");
				break;
			case '9':
				System.out.print("Nine");
				break;
		}
	}

	public static void main(String[] args) {
		String word = "123";
		
		for (int i=0; i<word.length();i++) {
			changeValue(word.charAt(i));
			//char l = word.charAt(i);
			//System.out.println(l);
		}
		//System.out.println();

	}

}

