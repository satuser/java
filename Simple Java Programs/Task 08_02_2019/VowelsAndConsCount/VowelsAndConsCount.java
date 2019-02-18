import java.util.Scanner;

class VowelsAndConsCount{

public static void main(String[] args){
	
	int vowels =0, consonents = 0;
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.print("Enter a String:");		
	String inputValue = scanner.nextLine();
	
	char[] splitString = inputValue.toCharArray();
	
	for(char singleChar: splitString){
	if((singleChar=='a')||(singleChar=='e')||(singleChar=='i')||(singleChar=='o')||(singleChar=='u')||
		(singleChar=='A')||(singleChar=='E')||(singleChar=='I')||(singleChar=='O')||(singleChar=='U')){
	vowels++;	
	} else if(((singleChar>='a')&&(singleChar<='z'))||((singleChar>='A')&&(singleChar<='Z'))){
	consonents++;
	}
	}
	
	System.out.println("No of Vowels: "+ vowels+"\n"+"No of Consonants: "+consonents);

      }
}