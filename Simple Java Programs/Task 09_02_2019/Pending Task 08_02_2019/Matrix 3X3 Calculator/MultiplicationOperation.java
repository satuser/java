public class MultiplicationOperation{

public void multiply(int[][] a, int[][] b){
	
	int[][] c = new int[3][3];
	System.out.println("The multiplication is \n");
	for(int i=0;i<3;i++){
	    for(int j=0;j<3;j++){
	        for(int k =0; k<3;k++){
		c[i][j] = c[i][j]+(a[i][k]*b[k][j]);
		}
		System.out.print(c[i][j]+"  ");
	    }
		System.out.println("\n");	
	}
}
}