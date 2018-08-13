//Many thanks to Joey Gonzales-Dones, who has been nothing but a patient helping hand throughout this project
import java.util.ArrayList;
import java.util.Scanner;

class PublicKeyEncryptor {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		/*System.out.print("Enter prime num1: ");
		int num1 = input.nextInt();
		num1 = primeEnforcer(num1);
		System.out.print("Enter prime num2: ");
		int num2 = input.nextInt();
		num2 = primeEnforcer(num2);
		int primeprod = num1 * num2;
		int function = ((num1 - 1) * (num2 - 1));*/
		listPrimeFactors(66);
		//System.out.print(num1 + " * " + num2 + " = " + primeprod);
	}
	
	//Method to check if a num is Prime. 
	//If isPrime = true then it IS a prime num. If isPrime = false then it is NOT a prime num
	public static boolean primeChecker(int num) {
		while (num > 1) {
			for (int i = 2; i * i <= num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	//Method to enforce prime check
	public static int primeEnforcer(int num) {
		while (primeChecker(num) == false) {
			System.out.print(num + " is not a prime num. Try again: ");
			num = input.nextInt();
			primeChecker(num);
		}
		return num;
	}
	
	//Method to list prime numbers that are a factor of the function
		public static void listPrimeFactors(int num) {
			ArrayList<Integer> primeFactorList = new ArrayList<Integer>();
			for(int i = 1; i < num; i++) {
				if((primeChecker(i) == true) && (num % i == 0)) {
					primeFactorList.add(i);					
				}
			}
			listCoprime(primeFactorList, num);
		}
	
	//Method to list coprime numbers that are a factor of the function
	public static void listCoprime(ArrayList<Integer> primeFactorList, int num) {
		boolean isCoprime  = true;
		for (int i = 1; i < (num - 1); i++) {
			if ((i % primeFactorList) == 0) {
				
			}
		}
		//System.out.print(primeFactorList);
	}
	
}
