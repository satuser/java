import java.util.Scanner;

class OddOrEven{

public static void main(String[] args){

	int inputValue;
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number:");		
	inputValue = scanner.nextInt();
	
	if((inputValue%2)==0){
	   	System.out.println("The entered number is Even");
	} 

	else{
	    	 System.out.println("The entered number is Odd");
	}

      }
}