import java.util.Scanner;

class MatrixCalculator{

public static void main(String[] args){
	int operationValue =0;
	int[][] aValue = new int[3][3] ;
	int[][] bValue = new int[3][3] ;
	Scanner scanner = new Scanner(System.in);
	
	MultiplicationOperation multiply = new MultiplicationOperation();
	DivisionOperation div = new DivisionOperation();
	AddOperation add = new AddOperation();
	ModuloOperation modulo = new ModuloOperation();
	SubtractionOperation subtracting = new SubtractionOperation();

	for(int i =0; i<3;i++){
	    for(int j=0; j<3; j++){
		System.out.println("Enter the value of a"+(i+1)+(j+1)+":");
		aValue[i][j]= scanner.nextInt();
	    }
	}
	for(int i =0; i<3;i++){
	    for(int j=0; j<3; j++){
		System.out.println("Enter the value of b"+(i+1)+(j+1)+":");
		bValue[i][j]= scanner.nextInt();
	    }
	}
	
	System.out.println(" Enter any one of the below operation to perform on matrix:"+
			"\n1. Multiplication"+
			"\n2. Division"+
			"\n3. Subtraction"+
			"\n4. Addition"+
			"\n5. Modulo");
	operationValue = scanner.nextInt();
	switch(operationValue){
	case 1: multiply.multiply(aValue,bValue);break;
             case 2: div.div(aValue,bValue);break;
             case 3: subtracting.subtract(aValue,bValue);break;
             case 4: add.adding(aValue,bValue);break;
             case 5: modulo.modulo(aValue,bValue);break;
             default: System.out.println("The entered option is invalid");
	}
      }
}