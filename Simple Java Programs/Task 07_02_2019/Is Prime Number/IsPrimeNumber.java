import java.util.Scanner;

class IsPrimeNumber{

  public static void main(String[] args){
	int numberValue,count=0, length;
	boolean isPrime = true;

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the number:");
	numberValue= scanner.nextInt();
	length=numberValue/2;

	if(numberValue<2){
	isPrime= false;
	}
	else{
		
	  for(int i =2; i<=length;i++){
	     if((numberValue%i)==0){
	       isPrime= false;
	       break;
	       }
	     }
	  }

	if(isPrime){
	   System.out.println(numberValue+" is a Prime number");
	} else{
	   System.out.println(numberValue+" is not a Prime number");
	}
   }

}