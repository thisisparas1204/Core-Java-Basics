import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{
		int number;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number which you want to check: ");
		number = sc.nextInt();
		
		int originalNumber = number;

		while(originalNumber != 0)
		{
			int rem = originalNumber % 10;
			result += rem * rem * rem;
			originalNumber /= 10;
		}

		if(number == result)
		{
			System.out.println("It is a armstrong number.");
		}else{
			System.out.println("It is not a armstrong number.");
		}
		sc.close();
	}
}