package dynamicProgramming;

public class GridTraveler {

	public static void main(String[] args) {
		// Given dimensions of the grid m, n, return all possible routes, 
		//from the top-left to the bottom-right corner, which a traveller can go moving only down or right.
		//Dimensions of the grid will always be integers. 
		//Dimensions can be zero or negative as well. In that case, the answer should be 0.
		int gridtraveler = gridTraveler(4,4);
		System.out.print(gridtraveler);
	}
	
	static int gridTraveler(int m,int n) {
		
		if (m*n <= 0 || m < 0) {
			return 0;
		}
		
		int[][] matrix = new int [m][n];
		for(int k=0;k<m;k++) {
			matrix[k][0] = 1; 
		}
		for(int l=0;l<n;l++) {
			matrix[0][l] = 1; 
		}
		for(int k=1;k<m;k++) {
			for(int l=1;l<n;l++) {
				matrix[k][l] = matrix[k-1][l]+matrix[k][l-1];
			}
		}
		
		return matrix[m-1][n-1];
	}
}
