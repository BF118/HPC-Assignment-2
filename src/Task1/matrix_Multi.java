package Task1;


import	java.util.Date;


public class matrix_Multi {
	public static void main(String[]args) {
		
		
		int matrixsize = 10000;
		//uses the matrix generator class and generate matrix method to create the matrixes we need for the given size
		int[][] m1 = Matrix_generator.generateMatrix(matrixsize,matrixsize);
		int[][] m2 = Matrix_generator.generateMatrix(matrixsize,matrixsize);
		
		Date start = new Date();
		int[][] result = multiply(m1,m2);
		
		Date end = new Date();
		
		//System.out.println("matrix 1: ");
		//Matrix_generator.print(m1);
		
		//System.out.println("\n matrix 2: ");
		//Matrix_generator.print(m2);
		
		//System.out.println("\nOutput Matrix: ");
		//Matrix_generator.print(result);
		
		System.out.println("\nTime taken in milli seconds: " + (end.getTime() - start.getTime()));
	}
	public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
		  int resultRows = matrix1.length;
		  int resultColumns = matrix2[0].length;

		  int[][] result = new int[resultRows][resultColumns];

		  int columns2 = matrix2[0].length;

		  for (int i = 0; i < resultRows; i++) {
		   for (int j = 0; j < columns2; j++) {
		    result[i][j] = 0;
		    for (int k = 0; k < resultColumns; k++) {
		     result[i][j] += matrix1[i][k] * matrix2[k][j];
		    }
		   }
		  }

		  return result;

		 }

	
}
	

