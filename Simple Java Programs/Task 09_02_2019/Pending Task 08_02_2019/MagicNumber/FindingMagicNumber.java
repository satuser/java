import java.util.Scanner;

class FindingMagicNumber{

public static void main(String[] args){
	
	int rangeStart, rangeEnd,startValueLength,divValue=1, startFirstNumber, endFirstNumber, count =0;
	boolean isMagicNotFound = false, atleastOne7 = false, atleastOne4 = false;

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the starting value of range:");
	rangeStart = scanner.nextInt();
	System.out.print("Enter the end value of range:");
	rangeEnd = scanner.nextInt();
	startValueLength = String.valueOf(rangeStart).length();
		
	if(rangeEnd>rangeStart){

	  for(int i=1;i<startValueLength;i++){

		divValue*=10;
	        }

	  startFirstNumber= rangeStart/divValue;
	  endFirstNumber= rangeEnd/divValue;

	  if((endFirstNumber-startFirstNumber)	<4){

		 System.out.println("No magic numbers found in the range!");
	  }else{

	         for(int i = rangeStart; i<=rangeEnd;i++){

		int tempValue = i;
		atleastOne7 = false;
		atleastOne4 = false;

		while(tempValue>0){

			int temp = tempValue%10;
			tempValue/=10;

			if(temp != 4 && temp != 7){

			  atleastOne7 = false;
			  atleastOne4 = false;
			  break;
			}

			if(temp==7){

			   atleastOne7=true;}
			   else if(temp ==4){
			  atleastOne4 = true;}			
		}

		if((atleastOne7)&&(atleastOne4)){
	
		  if(count==0){
		      System.out.println("Magic numbers:");
		  }

		System.out.println(i);
		count++;

		}
	 }
	  if(count==0){
		System.out.println("No magic numbers found in the range!");
		}
	}
	}
	else{
	  System.out.println("not a valid range values");
	}
      }
}