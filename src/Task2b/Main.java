//loosecoupling
package Task2b;

import java.util.Date;



public class Main {
	public class matrix_Multi {
		public static void main(String[]args) {
			
			
			int matrixsize = 50;
			
			int[][] matrix1 = Matrix_gen.generateMatrix(matrixsize,matrixsize);
			int[][] matrix2 = Matrix_gen.generateMatrix(matrixsize,matrixsize);
			int[][] resultmatrix = new int[matrixsize][matrixsize];
			
			Threads master = new Threads(resultmatrix, resultmatrix, resultmatrix);
			
			
			master.run();
			

			
			//System.out.println("matrix 1: ");
			//Matrix_gen.print(matrix1);
			
			//System.out.println("\nmatrix 2: ");
			//Matrix_gen.print(matrix2);
			
			//System.out.println("\nOutput Matrix: ");
			//System.out.println(resultmatrix);
			
			
			
		}
		
public static class Threads extends Thread {
			
			int[][] matrix1;
			int[][] matrix2;
			int[][] resultmatrix;
			
			public Threads(int matrix1[][],int matrix2[][],int resultmatrix[][]) {
				
				this.matrix1 = matrix1;
				this.matrix2 = matrix2;
				this.resultmatrix = resultmatrix;
				
			}
s
			public void run() {
				
				Date start = new Date();
				int currentThreads = 0;
				int threadCount = 100;
				Threads[] Threads = new Threads[threadCount];
				 
				 
				 for (int i = 0; i < matrix1.length; i++) {
					   for (int j = 0; j < matrix1.length; j++) {
					    for (int k = 0; k < matrix1.length; k++) {
					    	Threads[currentThreads]= new Threads(matrix1[i][k],matrix2[k][j], resultmatrix, i ,j);
					    	Threads[currentThreads].start();
					    	
					    	if(currentThreads == threadCount) {
					    		currentThreads = 0;
					    		}
			    	
				 
				

				
					    	}			
		    
					   }
				 }
				 Date end = new Date();
			    	System.out.println("\nTime taken in milli seconds: " + (end.getTime() - start.getTime()));
			}
}
	}
}			
	
