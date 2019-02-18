import java.util.Scanner;

class DecimalToOcta{

public static void main(String[] args){

	int inputValue,copyOfInput,count=0;
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number:");		
	inputValue = scanner.nextInt();
	copyOfInput = inputValue;

	while(inputValue>0){
	  count = count+1;
	  inputValue /=8;
	}

	inputValue = copyOfInput;
	int[] octaValue = new int[count];
	int i =0;

	while(inputValue>0){
	  octaValue[i]=inputValue%8;
	  inputValue/=8;
	  i++;
	}

	System.out.println("The octa value of decimal " +copyOfInput);

	for(int j=count-1;j>=0;j--){
	  System.out.print(octaValue[j]);
	}

      }
}