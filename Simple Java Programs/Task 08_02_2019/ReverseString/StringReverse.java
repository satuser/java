import java.util.Scanner;

class StringReverse{

public static void main(String[] args){

	int length, loopCount;
	boolean isPalindrome = true;

	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Enter a String:");		
	String inputValue = scanner.nextLine();
	
	length = inputValue.length();
	
	System.out.println("The reverse of given String:"+ inputValue+ " is");
	
	for(int i=length-1; i>=0;i--){
		System.out.print(inputValue.charAt(i));
	    }
      }
}