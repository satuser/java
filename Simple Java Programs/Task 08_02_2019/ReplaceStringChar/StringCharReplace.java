import java.util.Scanner;

class StringCharReplace{

public static void main(String[] args){

	int length, loopCount;
	boolean isPalindrome = true;

	Scanner scanner = new Scanner(System.in);
		
	System.out.print("\nEnter a String:");		
	String inputValue = scanner.nextLine();
	
	length = inputValue.length();
	
	System.out.println("\nReplacing every vowel with @:");
	
	for(int i=0; i<length;i++){
	char singleChar = inputValue.charAt(i);
	if((singleChar=='a')||(singleChar=='e')||(singleChar=='i')||(singleChar=='o')||(singleChar=='u')||
		(singleChar=='A')||(singleChar=='E')||(singleChar=='I')||(singleChar=='O')||(singleChar=='U')){
	System.out.print('@');	
	} else{
	System.out.print(singleChar);
	}
	}

	System.out.println("\n\nReplacing every consonants with #");
	
	for(int i=0; i<length;i++){
	char singleChar = inputValue.charAt(i);
	if((singleChar=='a')||(singleChar=='e')||(singleChar=='i')||(singleChar=='o')||(singleChar=='u')||
		(singleChar=='A')||(singleChar=='E')||(singleChar=='I')||(singleChar=='O')||(singleChar=='U')){
		System.out.print(singleChar);
	} else if(((singleChar>='a')&&(singleChar<='z'))||((singleChar>='A')&&(singleChar<='Z'))){
		System.out.print('#');
	}
	}

	System.out.println("\n\nReplacing each character at odd place with 6");
	
	for(int i=0; i<length;i++){
	char singleChar = inputValue.charAt(i);
	if(i%2==1){
		System.out.print(singleChar);
	} else {	
		System.out.print('6');
	}
	}

	System.out.println("\n\nReplacing each character at even place with ^");
	
	for(int i=0; i<length;i++){
	char singleChar = inputValue.charAt(i);
	if(i%2==0){
		System.out.print(singleChar);
	} else {
		System.out.print('^');
	}
	}
	
      }
}