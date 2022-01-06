
package Task2b;

import java.util.Date;


public class Main {
	public class matrix_Multi {
		public static void main(String[]args) {
			
			
			int matrixsize = 500;
			
			int[][] matrix1 = Matrix_gen.generateMatrix(matrixsize,matrixsize);
			int[][] matrix2 = Matrix_gen.generateMatrix(matrixsize,matrixsize);
			int[][] resultmatrix = new int[matrixsize][matrixsize];
			Date start = new Date();
			masterThread master = new masterThread();
			
			
			master.start(matrix1, matrix2, resultmatrix);
			
			Date end = new Date();

			
			//System.out.println("matrix 1: ");
			//Matrix_gen.print(matrix1);
			
			//System.out.println("\nmatrix 2: ");
			//Matrix_gen.print(matrix2);
			
			//System.out.println("\nOutput Matrix: ");
			//System.out.println(resultmatrix);
			
			System.out.println("\nTime taken in milli seconds: " + (end.getTime() - start.getTime()));
		}
		

		
	}
}