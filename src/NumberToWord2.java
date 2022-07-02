import java.util.*;

public class NumberToWord2{  

 public static void main(String args[]){  
	 String ones[] = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven",
			 "twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
     String tens[] = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
     
     System.out.println("Enter a Number");
     
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     
     if(num == 0) {
    	 System.out.println("zero");
     }
     else if (num <=19) {
    	 System.out.println(ones[num]);
     }
     else if (num >=20 && num <=99) {
    	 System.out.println(tens[num/10]+" " + ones[num%10]);
     }
     else if (num >=100 && num <=999) {
    	 System.out.println(ones[num/100]+" " +"hundred"+" "+ tens[(num/10)%10] +" "+ ones[num%10]);
     }
     else {
    	 System.out.println("Invalid Number: More than three digits are not allowed");
     }
 }  
}  
