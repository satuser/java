import java.util.Scanner;

class FreqOfChar{

public static void main(String[] args){
	
	int count = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the String");		
	String inputValue = scanner.nextLine();
	int length = inputValue.length();
	System.out.println("Enter the char to find the frequency");		
	char findFreq = scanner.next().charAt(0);
	
	for(int i =0;i<length;i++){
	    if(findFreq == inputValue.charAt(i)){
		count++;
		}	
	}
	
	System.out.println("The frequency of "+ findFreq + "is "+count);
      }
}