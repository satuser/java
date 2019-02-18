import java.util.Scanner;

class TransposeOfMatrix{

public static void main(String[] args){

	int rowCount,columnCount;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number of rows in matrix");		
	rowCount= scanner.nextInt();
	System.out.println("Enter the number of rows in matrix");		
	columnCount = scanner.nextInt();
	
	int[][] inputMatrix = new int[rowCount][columnCount];
             	int[][] transposeMatrix = new int[columnCount][rowCount];

	for(int i=0;i<rowCount; i++){
	  for(int j=0;j<columnCount;j++){
		System.out.println("Enter a"+(i+1)+(j+1) +"number:");	
	 	inputMatrix[i][j] = scanner.nextInt();;
	  }
	}

	System.out.println("Input matrix is:\n");
	for(int i=0;i<rowCount; i++){
	  for(int j=0;j<columnCount;j++){
		System.out.print(inputMatrix[i][j]+" ");
			
	  }
		System.out.println("\n");
	}
             
	for(int i=0;i<rowCount; i++){
	  for(int j=0;j<columnCount;j++){
	 	transposeMatrix[j][i] = inputMatrix[i][j];	
	  }
	}
	
	System.out.println("Transpose matrix is:\n");
	for(int i=0;i<columnCount; i++){
	  for(int j=0;j<rowCount;j++){
		System.out.print(transposeMatrix[i][j]+" ");
			
	  }
		System.out.println("\n");
	}
	

      }
}