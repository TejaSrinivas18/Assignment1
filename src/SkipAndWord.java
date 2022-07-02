import java.util.*;
public class SkipAndWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner("and hello world and india and delhi");
		scan.skip("and");
		System.out.println(scan.nextLine());
		
		scan.close();
	}

}


/*while(scan.hasNext()) {

scan.skip("and");
System.out.println(scan.next());
}*/