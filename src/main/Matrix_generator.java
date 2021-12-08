package main;

import java.util.Random;


public class Matrix_generator {

	
	public static int[][] generateMatrix(int rows, int columns) {
		
		//Creates an output array to store matrix values in
		int[][] results = new int[rows][columns];
		
		
		//Creates a random integer using the Random utility that was imported
		Random random = new Random();
		
		for( int i = 0; i < rows; i++) {
			for (int j =0; j <columns; j++){
								
				results[i][j]= random.nextInt(1000);
								
			}
		}

		
		return results;	
	}
	public static void print(int[][] matrix) {
		System.out.println();
		
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		for(int i = 0; i < rows; i++) {
			for(int j= 0; j< columns; j++){
				
				
				System.out.print(matrix[i][j] + "  ");
				
			}
			System.out.println();
		}
		
		
		
	}
	
	 
	
	
}
