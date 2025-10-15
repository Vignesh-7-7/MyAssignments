package week1.day2Assignements;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int number=37;
		int flag= 0;
		if(number == 0 || number == 1)
		{
			System.out.println(number+ " is not a prime number");
		}
		
		else
		{
			for (int i = 2; i<=number/2;i++) {
				if(number%i==0)
				{
					System.out.println(number+ " is not a prime number");
					flag = 1;
					return;
				}
			}
				if (flag==0)
					System.out.println(number+ " is  a prime number");
				
			}
		
		
}
}



