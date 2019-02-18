import java.util.Scanner;

class NoOfPrimePrint{

  public static void main(String[] args){
	int numberOfTimes,count=0,numberValue=1;
	boolean isPrime= true;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the number:");
	numberOfTimes= scanner.nextInt();
	
	while(count<numberOfTimes){
                numberValue+=1;
                isPrime=true;		
	  for(int i =2; i<=numberValue/2;i++){
	     if((numberValue%i)==0){
	       	isPrime= false;
	     	i= numberValue;
	       }
	     }
	  

	if(isPrime){
	   System.out.println(numberValue);
	   count++;
	} 
	
	}
   }

}