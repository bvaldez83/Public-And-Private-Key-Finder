//Many thanks to Joey Gonzales-Dones, who has been nothing but a patient helping hand throughout this project
import java.util.ArrayList;
import java.util.Scanner;

class PublicAndPrivateKeyFinder {
	//Declarations
	static ArrayList<Integer> coprimeFactorList = new ArrayList<Integer>();
	static ArrayList<Integer> primeFactorList = new ArrayList<Integer>();
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num1, num2, primeprod, function, coprime, privateExponent;
		System.out.print("Enter prime num1: ");
		num1 = input.nextInt();
		num1 = primeEnforcer(num1);
		System.out.print("Enter prime num2: ");
		num2 = input.nextInt();
		num2 = primeEnforcer(num2);
		primeprod = num1 * num2;
		function = ((num1 - 1) * (num2 - 1));
		listPrimeFactors(function);
		System.out.print(coprimeFactorList);
		System.out.print("\nSelect a Coprime from the list: ");
		coprime = input.nextInt();
		coprime = checkCoprimeList(coprime);
		System.out.print("Public key ("+ coprime +", "+ primeprod + ")");
		privateExponent = findPrivateDecryptExponent(coprime, function);
		System.out.print("\nPrivate key ("+ privateExponent +", "+ primeprod + ")");
	}
	
	//Method to find the Private Decrypt Exponent
	public static int findPrivateDecryptExponent(int coprime, int function) {
		int answer = 0;
		for (int i = 0; i < coprimeFactorList.size(); i++) {
			if ((coprimeFactorList.get(i)*coprime) % function == 1) {
				answer = coprimeFactorList.get(i);
			}
		}
		return answer;	
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
	
	//Method to check if a number is apart of the coprime factor list
		public static int checkCoprimeList(int num) {
			for (int i = 0; i < coprimeFactorList.size(); i++) {
				if (coprimeFactorList.contains(num)) {
					return num;					
				}
				System.out.print(num + " is not in the list. Try again: ");
				num = input.nextInt();
			}
			return num;
		}
	
	//Method to list prime numbers that are a factor of the function
		public static void listPrimeFactors(int num) {
			for(int i = 1; i < num; i++) {
				if((primeChecker(i) == true) && (num % i == 0)) {
					primeFactorList.add(i);					
				}
			}
			listCoprime(primeFactorList, num);
		}
	
	//Method to list coprime numbers that are a factor of the function
	public static ArrayList<Integer> listCoprime(ArrayList<Integer> primeFactorList, int num) {
		boolean isCoprime  = false;
		System.out.print("Coprimes are: ");
		for (int i = 1; i < num; i++) {
			if (isMultiple(i, primeFactorList) == false) {
				if (isCoprime = true && primeChecker(i) == true) {
					coprimeFactorList.add(i);
				}
			}
		}
		return coprimeFactorList;
	}
	
	//Method to check if a number is a multiple of another
	public static boolean isMultiple(int num1, ArrayList<Integer> factorList) {
		boolean isMultiple = false;
		for (int i = 0; i < factorList.size(); i++) {
			if (num1 % factorList.get(i) == 0) {
				isMultiple = true;
			}
		}
		return isMultiple;
	}
}
