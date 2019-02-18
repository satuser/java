import java.util.Scanner;

class DecimalToBinary{

public static void main(String[] args){

	int inputValue,copyOfInput,count=0;
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number:");		
	inputValue = scanner.nextInt();
	copyOfInput = inputValue;

	while(inputValue>0){
	  count = count+1;
	  inputValue /=2;
	}

	inputValue = copyOfInput;
	int[] binaryValue = new int[count];
	int i =0;

	while(inputValue>0){
	  binaryValue[i]=inputValue%2;
	  inputValue/=2;
	  i++;
	}

	System.out.println("The binary value of decimal " +copyOfInput);

	for(int j=count-1;j>=0;j--){
	  System.out.print(binaryValue[j]);
	}

      }
}