import java.util.Scanner;

class FindNumber{

public static void main(String[] args){

	int inputSize, numberToCheck;
	Scanner scanner = new Scanner(System.in);
	boolean isFound = false;
	
	System.out.print("Enter number of Array values:");		
	inputSize = scanner.nextInt();
	
	int[] arrayOfValues = new int[inputSize];

	System.out.println("Enter the values for the array:");

	for(int i =0; i<inputSize;i++){
	         arrayOfValues[i] = scanner.nextInt();
	}

	System.out.print("Enter the number to Search:");		
	numberToCheck = scanner.nextInt();
	
	for(int i =0; i<inputSize;i++){
	    if(arrayOfValues[i]==numberToCheck){
	        isFound = true;
	        System.out.println("Number "+numberToCheck+" found at "+(i+1));
	        break;
	    }
	}

	if(isFound==false){
	    System.out.println("Number "+numberToCheck+" is not found ! ");
	}
      }
}