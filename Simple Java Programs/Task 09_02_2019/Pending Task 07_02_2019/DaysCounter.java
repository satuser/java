import java.util.Scanner;

class DaysCounter{

public static void main(String[] args){

	int startDay, endDay, startMonth, endMonth, startYear, endYear;
	int dayCount =0, monthCount=0, yearCount =0, finalDaysCount=0;

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("\nEnter the below details \n\nstart day:");		
	startDay = scanner.nextInt();
	System.out.print("\nstart month:");
	startMonth = scanner.nextInt();
	System.out.print("\nstart year:");
	startYear = scanner.nextInt();
	System.out.print("\nend day:");
	endDay = scanner.nextInt();
	System.out.print("\nend month:");
	endMonth = scanner.nextInt();
	System.out.print("\nend year:");
	endYear = scanner.nextInt();
	
	for(int i = startYear; i<endYear;i++){
	    if(((i%4)==0)&&((i%100)!=0)||((i%400)==0)){
		finalDaysCount = finalDaysCount+366;
	    }
	    else{
		finalDaysCount = finalDaysCount+365;
	    }
	}

	if(startMonth>1){
	
	   finalDaysCount = finalDaysCount-monthDays(startMonth-1);

	   if(((startYear%4)==0)&&((startYear%100)!=0)||((startYear%400)==0)){
		finalDaysCount -=1;
	   }
	}

	if(endMonth>1){

	    finalDaysCount = finalDaysCount+monthDays(endMonth-1);

	    if(((endYear%4)==0)&&((endYear%100)!=0)||((endYear%400)==0)){
		finalDaysCount +=1;
	    }
	}
	
	finalDaysCount = finalDaysCount+ endDay - startDay;
	System.out.println(finalDaysCount);

	}


	public static int monthDays(int month){

	switch(month){
		case 1: return 31;
		case 2: return 59;
		case 3: return 90;
		case 4: return 120;
		case 5: return 151;
		case 6: return 181;
		case 7: return 212;
		case 8: return 243;
		case 9: return 273;
		case 10: return 304;
		case 11: return 334;
		default: return 0;
	             }
	}  
}