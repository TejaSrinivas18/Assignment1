import java.util.*;

class User{
	
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
		
	public String toString(){
			return str;
	}
}
 
public class UserVariable {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		User u = new User();
		System.out.println(u.toString());		
	}
}


/*
class User{
	get input user and store in the variable of the class
	in another class get the data and print thru a method called as toString()//Object
}
*/