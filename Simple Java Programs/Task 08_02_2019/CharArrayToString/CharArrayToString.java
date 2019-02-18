import java.util.Scanner;

class CharArrayToString{

public static void main(String[] args){
	String convertedToString;
	

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter series of Characters:");
	String stringInput = scanner.nextLine();
	
	char[] stringSplit = stringInput.toCharArray();
	
	System.out.println("The char array is:");

	for(char c: stringSplit){
	System.out.println(c);
	}
	convertedToString = String.valueOf(stringSplit);

	System.out.println("Char Array converted to String is: " + convertedToString);
	
		
}
}