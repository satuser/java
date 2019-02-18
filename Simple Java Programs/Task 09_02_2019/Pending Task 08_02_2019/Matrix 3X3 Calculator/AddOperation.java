public class AddOperation{

public void adding(int[][] a, int[][] b){
	
	int[][] c = new int[3][3];
	System.out.println("The sum is \n");
	for(int i=0;i<3;i++){
	    for(int j=0;j<3;j++){
		c[i][j] = a[i][j]+b[i][j];
		System.out.print(c[i][j]+"  ");
	    }
		System.out.println("\n");	
	}
}
}