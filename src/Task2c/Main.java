//Symmetric 
package Task2c;

import java.util.Date;


public class Main extends Thread {
	public class matrix_Multi extends Thread{
		
		public static void main(String[]args) {
	
			
			int matrixsize = 50;
			
			int[][] matrix1 = Matrix_gen.generateMatrix(matrixsize,matrixsize);
			int[][] matrix2 = Matrix_gen.generateMatrix(matrixsize,matrixsize);
			int[][] resultmatrix = new int[matrixsize][matrixsize];
			
			mainThread main = new mainThread(matrix1, matrix2, resultmatrix);
			
			main.run();
			
			
			
			
			//System.out.println("matrix 1: ");
			//Matrix_gen.print(matrix1);
			
			//System.out.println("\nmatrix 2: ");
			//Matrix_gen.print(matrix2);
			
			//System.out.println("\nOutput Matrix: ");
			//System.out.println(resultmatrix);
			
			
			
		}

public static class mainThread extends Thread {
		
		int[][] matrix1;
		int[][] matrix2;
		int[][] resultmatrix;
		
		public mainThread(int matrix1[][],int matrix2[][],int resultmatrix[][]) {
			
			this.matrix1 = matrix1;
			this.matrix2 = matrix2;
			this.resultmatrix = resultmatrix;
			
		}

		

		public void run() {
			
			Date start = new Date();
			int currentThreads = 0;
			int threadCount = 100;
			 workerThread Threads[] = new workerThread[threadCount];
			 // create slaves:
		    	for(int i = 0; i < threadCount; i++) {
		    		Threads[i] = new workerThread(i, i, matrix1, i, i);
		    		System.out.println("create Thread: " + i);
		    	}
		    	for(int i = 0; i < threadCount; i++) {
		    	Threads[currentThreads].start();
		    	currentThreads++;
		    	if(currentThreads == threadCount) {
		    		currentThreads = 0;
		    	}
		    	}
			 
			 for (int i = 0; i < matrix1.length; i++) {
				   for (int j = 0; j < matrix1.length; j++) {
				    for (int k = 0; k < matrix1.length; k++) {
				    	Threads[currentThreads]= new workerThread(matrix1[i][k],matrix2[k][j], resultmatrix, i ,j);

			
				    	}			
	    
				   }
			 }
			 Date end = new Date();
		    	System.out.println("\nTime taken in milli seconds: " + (end.getTime() - start.getTime()));
		}
	}
}
}