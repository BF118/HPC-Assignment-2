//MasterSlave
package Task2;


	import java.util.Random;

public class Matrix_gen {

		
		public static int[][] generateMatrix(int rows, int columns) {
			
			//Creates an output array to store matrix values in
			int[][] results = new int[rows][columns];
			
			
			//Creates a random integer using the Random utility that was imported
			Random random = new Random();
			
			for( int i = 0; i < rows; i++) {
				for (int j =0; j <columns; j++){
			//creates a random number between 1 and 1000 and places into the array which is then repeated using a for loop		
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


