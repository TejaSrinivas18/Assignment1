
public class SingleValue {
	
	static int addingNum(int num) {
		int sum=0;
		
		while(num >0 || sum>9) {
			if(num == 0) {
				num = sum;
				sum = 0;
			}
			sum +=num%10; 
			num = num/10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int n= 5622;
		System.out.println(addingNum(n));
		//System.out.println(5/10);
	}

}



/*
class SingleValue
{
  
	static int sum(int n)
	{
    if (n == 0)
    
        return 0;
    int temp = (n % 10 + sum(n / 10));
    if (temp < 10)
        return temp;
    return sum(temp);
	}
 
 
    public static void main(String args[])
    {
        int num =99;
        int result = sum(num);
        System.out.println( result);
    }
}

*/