import java.util.Scanner;

class BinaryToDecimal{

public static void main(String[] args){

	int inputValue, length, copyOfInput, powerValue=1, decimalValue=0;
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a binary number:");		
	inputValue = scanner.nextInt();
	
	length = String.valueOf(inputValue).length();
	copyOfInput = inputValue;
	
	for(int i=0; i<length;i++){
	    int temp = inputValue%10;
	    inputValue/=10;
	    if(temp==0 || temp==1){
	       decimalValue = decimalValue+ (temp*powerValue);  	
	       powerValue*=2;
	    } else{
	    decimalValue = -1;
	     break;
	    }
	}
	if(decimalValue>=0){
	     System.out.println("\nEntered binary number is "+copyOfInput+
		"\nDecimal value is "+decimalValue); 
	}else{
	     System.out.println("Entered number is not a binary number"); 
	}
	
      }
}