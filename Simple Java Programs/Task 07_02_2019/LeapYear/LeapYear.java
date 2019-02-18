import java.util.Scanner;

class LeapYear{

public static void main(String[] args){

	int year;
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the Year:");		
	year = scanner.nextInt();
	
	if(((year%4)==0)&&((year%100)!=0)||((year%400)==0)){
		System.out.print(year+" is a Leap Year");
	} else{
		System.out.print(year+" is not a Leap Year");
	}
      }
}