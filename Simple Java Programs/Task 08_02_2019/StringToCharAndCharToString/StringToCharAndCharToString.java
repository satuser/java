import java.util.Scanner;

class StringToCharAndCharToString{

public static void main(String[] args){
	String stringInput,convertedToString;
	char charInput,convertedToChar;

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter single string:");
	stringInput = scanner.next();
	convertedToChar = stringInput.charAt(0);

	System.out.println("Enter a character");
	charInput= scanner.next().charAt(0);
	convertedToString = Character.toString(charInput);

	System.out.println("The Char converted to String is: " + convertedToString);
	
	System.out.println("The String value converted to Char is:" + convertedToChar);
	
}
}