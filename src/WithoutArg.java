import java.util.*;

public class WithoutArg {

	public static void main(String[] args) {
		System.out.println("Enter word");
		String s = "a ";
		Scanner sc = new Scanner(s);
		
		while(sc.hasNext("a")) {
			System.out.println(sc.next());
		}
		//sc.close();
	}
}





//System.out.println(sc.delimiter());
		/*String  s = sc.next();
		String  i = sc.next();
		String  in = sc.next();
		System.out.println(s);
		System.out.println(i);
		System.out.println(in);*/