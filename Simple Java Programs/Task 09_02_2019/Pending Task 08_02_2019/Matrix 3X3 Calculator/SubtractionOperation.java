public class SubtractionOperation{

public void subtract(int[][] a, int[][] b){
	
	int[][] c = new int[3][3];
	System.out.println("The subtraction is \n");
	for(int i=0;i<3;i++){
	    for(int j=0;j<3;j++){
		c[i][j] = a[i][j]-b[i][j];
		System.out.print(c[i][j]+"  ");
	    }
		System.out.println("\n");	
	}
}
}