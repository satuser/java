import java.util.Scanner;

class ArmstrongNumber{

  public static void main(String[] args){
	int numberValue, length, copyOfNumber;
	long finalTotal=0;

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the number:");
	numberValue= scanner.nextInt();
	length = String.valueOf(numberValue).length();
	copyOfNumber = numberValue;

	   for(int i=0; i<length;i++){
		int valueOfDigit=1;
		int temp = numberValue%10;
		numberValue /=10;

		for(int j =0; j<length;j++){
			valueOfDigit*=temp;	
		}

		finalTotal+=valueOfDigit;
	}

	if(finalTotal==copyOfNumber){
	System.out.print("The given number "+copyOfNumber + " is an Armstrong number");
	} 
	else{
	System.out.print("The given number "+copyOfNumber + " is not an Armstrong number");
	}
   }

}