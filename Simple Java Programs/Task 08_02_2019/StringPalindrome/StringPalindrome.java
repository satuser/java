import java.util.Scanner;

class StringPalindrome{

public static void main(String[] args){

	int length, loopCount;
	boolean isPalindrome = true;

	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Enter a String:");		
	String inputValue = scanner.nextLine();
	
	length = inputValue.length();
	loopCount = length/2;
	
	char[] splitString = inputValue.toCharArray();
	
	for(int i=0; i<loopCount;i++){
	    if(splitString[i] == splitString[length-1]){
		length-=1;
	    }
	    else{
		isPalindrome = false;
		break;
	    }
	}
	
	if(isPalindrome){
	System.out.println("The given string "+inputValue+" is a Palindrome");
	} else{
	System.out.println("The given string "+inputValue+" is not a Palindrome");
	}

      }
}