import java.util.*;

public class IpAddress {

	public static void main(String[] args) {
		System.out.println("Enter IP Address: ");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = str.split("\\.");
		
		boolean output = true;

		for(String i:arr) {
			if  ((Integer.parseInt(i) >255) || (Integer.parseInt(i)< 0 ) ) {
				output =false;
				break;
			}	
		}
		
		if (output) {
			System.out.println("Valid Address");
		}else {
		    System.out.println("Invalid Address");
		}
	}
}


//System.out.println(arr[0]);

/*if  (Integer.parseInt(arr[0]) == 0 ) {
output = false;
break;
}*/	
