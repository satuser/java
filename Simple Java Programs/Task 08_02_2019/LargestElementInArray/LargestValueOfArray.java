import java.util.Scanner;

class LargestValueOfArray{

public static void main(String[] args){

	int totalNumbers;
	int largestNumber =0;
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter number of values to be entered:");		
	totalNumbers= scanner.nextInt();
	int[] values = new int[totalNumbers];
             System.out.println("Enter the first number:");
	values[0]=scanner.nextInt();
	largestNumber = values[0];
	for(int i=1;i<totalNumbers;i++){
	System.out.println("Enter the next number:");
	values[i]=scanner.nextInt();
	if(largestNumber<values[i]){
	largestNumber = values[i];
	}
	}
	System.out.println("The highest value in the given numbers is: "+ largestNumber);
      }
}