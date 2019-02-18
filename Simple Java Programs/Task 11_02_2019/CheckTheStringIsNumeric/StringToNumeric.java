import java.util.Scanner;

class StringToNumeric{

public static void main(String[] args){

	double outputValue;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the String:");		
	String inputValue = scanner.nextLine();
	try{
	outputValue = Double.parseDouble(inputValue);
	System.out.println("The value "+inputValue+" is a valid string to convert to number");
	} catch (Exception e){
	   System.out.println("The value "+ inputValue+"is not a valid string to convert to number");
	}  
      }
}