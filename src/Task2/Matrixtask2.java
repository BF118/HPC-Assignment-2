package Task2;

import java.util.Date;


public class Matrixtask2 {
	public class matrix_Multi {
		public static void main(String[]args) {
			
			Date start = new Date();
			int matrixsize = 200;
			
			int[][] matrix1 = Matrix_gen.generateMatrix(matrixsize,matrixsize);
			int[][] matrix2 = Matrix_gen.generateMatrix(matrixsize,matrixsize);
			int[][] resultmatrix = new int[matrixsize][matrixsize];
			
			master master = new master();
			
			
			master.run(matrix1, matrix2, resultmatrix);
			
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
