import java.util.Scanner;

class SmallestValueOfArray{

public static void main(String[] args){

	int totalNumbers;
	int smallestNumber =0;
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter number of values to be entered:");		
	totalNumbers= scanner.nextInt();
	int[] values = new int[totalNumbers];
             System.out.println("Enter the first number:");
	values[0]=scanner.nextInt();
	smallestNumber = values[0];
	for(int i=1;i<totalNumbers;i++){
	System.out.println("Enter the next number:");
	values[i]=scanner.nextInt();
	if(smallestNumber>values[i]){
	smallestNumber = values[i];
	}
	}
	System.out.println("The lowest value in the given numbers is: "+ smallestNumber);
      }
}