import java.util.Scanner;

class RemoveWhiteSpace{

public static void main(String[] args){
	
	int count = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the String");		
	String inputValue = scanner.nextLine();
	String[] splitString = inputValue.split(" ");
	StringBuffer finalString = new StringBuffer();
	for(String temp: splitString){
	    finalString.append(temp);
	}
		
	System.out.println(finalString);	
      }
}