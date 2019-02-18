import java.util.Scanner;

class Palindrome{

public static void main(String[] args){

	int inputValue,copyOfInput,rem, reverse = 0;

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number:");		
	inputValue = scanner.nextInt();
	copyOfInput = inputValue;
	
	while(inputValue>0){
		rem = inputValue%10;
		inputValue/=10;
		reverse = (reverse*10)+rem;	
	}

	if(reverse==copyOfInput){
		System.out.println(copyOfInput+" is a Palindrome");	
	}else{
		System.out.println(copyOfInput+" is not a Palindrome");
	}

      }
}