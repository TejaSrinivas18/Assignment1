import java.util.*;

public class UserPassword {
	
	static boolean isValid(String user, String passwd){
		String userEx = "amazon";
		String passwordEx = "amazon123";
		
		if(user.equals(userEx) && passwd.equals(passwordEx)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		int count =1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter User Name: ");
		String username = sc.nextLine();
		
		System.out.println("Enter Password: ");
		String password = sc.nextLine();
		
		while(! isValid(username,password)) {
			System.out.println("Invalid username or password");
			
			count +=1;
			if(count == 4) {
				System.out.println("you have made too many attempts : ERROR MESSAGE");
				System.exit(1);
			}
			
			System.out.println("Enter User Name: ");
		    username = sc.nextLine();
			
			System.out.println("Enter Password: ");
			password = sc.nextLine();
			
		}
		
		System.out.println("Login Succesful");
	}

}
