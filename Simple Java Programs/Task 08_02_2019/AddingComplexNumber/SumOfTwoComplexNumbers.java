import java.util.Scanner;

class SumOfTwoComplexNumbers{

public static void main(String[] args){

	int[] realNumber = new int[3];
	int[] imaginaryNumber = new int[3];
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter first real number value:");
	realNumber[0] = scanner.nextInt();
	
	System.out.print("Enter first imaginary number value:");
	imaginaryNumber[0] = scanner.nextInt();

	System.out.print("Enter second real number value:");
	realNumber[1] = scanner.nextInt();
	
	System.out.print("Enter second imaginary number value:");
	imaginaryNumber[1] = scanner.nextInt();

	realNumber[2] = realNumber[0]+realNumber[1];
	imaginaryNumber[2] = imaginaryNumber[0]+imaginaryNumber[1];	
	System.out.println("The sum of complex numbers {"+ realNumber[0] + "+" + imaginaryNumber[0]+"i}"+ " {"+ realNumber[1] + "+" + imaginaryNumber[1]+"i}" +" is: "+
			realNumber[2] + "+" + imaginaryNumber[2]+"i");
      }
}