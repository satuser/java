import java.util.Scanner;

class BinaryToHexadecimal{

public static void main(String[] args){

	int inputValue, length, copyOfInput, powerValue=1, decimalValue=0, extraBit=0, count =0;;
             boolean isBinary = true;
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a binary number:");		
	inputValue = scanner.nextInt();
	
	length = String.valueOf(inputValue).length();

	if(length%4>0){
	 extraBit =1;
	}

              int intSize = (length/4)+extraBit; 
	int[] hexaValue = new int[intSize];
	copyOfInput = inputValue;
	
	for(int i=0; i<length;){
		powerValue =1; decimalValue = 0;
	    for(int j=0;j<4;j++){
                 
	      int temp = inputValue%10;
	      inputValue/=10;
	       if(temp==0 || temp==1){
	         decimalValue = decimalValue+ (temp*powerValue);  	
	         powerValue*=2;
	       } else{
	          isBinary = false;
                        i=length;     
	       }
	}
	
               hexaValue[count] = decimalValue;
               count+=1;
	  i+=4;
	}
	if(isBinary){
	System.out.print("\nEntered binary number is "+copyOfInput+ "\n The hexadecimal is");
                   for(int i=intSize-1;i>=0;i--){
		if(hexaValue[i]<10){
			System.out.print(hexaValue[i]);}
		else{
                                  switch(hexaValue[i]){
			case 10:
                                               System.out.print('a');break;
                                        case 11:
                                               System.out.print('b');break;
			case 12:
                                               System.out.print('c');break;
  			case 13:
                                               System.out.print('d');break;
			case 14:
                                               System.out.print('e');break;
			case 15:
                                               System.out.print('f');break;
			default:
			       System.out.print(0);break;    
                 }
	}
	}}
           else{
	     System.out.println("Entered number is not a binary number"); 
	}
	
      }
}