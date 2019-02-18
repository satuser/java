import java.util.Scanner;

class IndianMobileNumber{

  public static void main(String[] args){
	
	long mobileNumber,firstTwoDigit, thirdDigit;
	long longValue = 10000000000L;
	int lengthOfNumber; 

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the mobile numer:");
	mobileNumber = scanner.nextLong();
	lengthOfNumber = String.valueOf(mobileNumber).length();
		
	if(lengthOfNumber ==12){
	   
	   firstTwoDigit = mobileNumber/longValue;
	   thirdDigit = (mobileNumber*10)/longValue;
	   thirdDigit %=10;
	
	   if((firstTwoDigit==91)&&
		((thirdDigit==9)||(thirdDigit==8)||(thirdDigit==7)||(thirdDigit==6))){

	   	System.out.println("Number is valid Indian number");	

	   }
	    else{
		System.out.println("Number is invalid Indian number");
	  }

	}
	else{
		System.out.println("Number is invalid Indian number");	
      	}
   }

}