//Symmetric 
package Task2c;

import java.util.Date;

public class Main extends Thread {
	public class matrix_Multi extends Thread{
		
		public static void main(String[]args) {
	
			
			int matrixsize = 250;
			
			int[][] matrix1 = Matrix_gen.generateMatrix(matrixsize,matrixsize);
			int[][] matrix2 = Matrix_gen.generateMatrix(matrixsize,matrixsize);
			int[][] resultmatrix = new int[matrixsize][matrixsize];
			Date start = new Date();
			mainthread main = new mainthread();
			
			main.start(matrix1, matrix2, resultmatrix);
			
			
			Date end = new Date();
	    	System.out.println("\nTime taken in milli seconds: " + (end.getTime() - start.getTime()));
			
			//System.out.println("matrix 1: ");
			//Matrix_gen.print(matrix1);
			
			//System.out.println("\nmatrix 2: ");
			//Matrix_gen.print(matrix2);
			
			//System.out.println("\nOutput Matrix: ");
			//System.out.println(resultmatrix);
			
			
			
		}
		public static class mainthread extends Thread {
			
		    public int[][] start(int matrix1[][],int matrix2[][],int resultmatrix[][]) {
		    	//setting the amount of slaves we want to create then saves that to an array
		    	
		    	int Threadpool = 100;
		        workerThread worker[] = new workerThread[Threadpool];
			    
		        // create slaves:
		    	for(int i = 0; i < Threadpool; i++) {
		    		worker[i] = new workerThread();
		    		//System.out.println("create thread: " + i);
		    	}
		    	
		    	int currentworker = 0;
		    	//similar nest for loop from the gold standard
		    	for (int i = 0; i < matrix1.length; i++) {
					   for (int j = 0; j < matrix1.length; j++) {
					    for (int k = 0; k < matrix1.length; k++) {
					    
					    	worker[currentworker].start(matrix1[i][k],matrix2[k][j], resultmatrix, i ,j);
					    	currentworker++;
					    	if(currentworker == Threadpool) {
					    		currentworker = 0;
					    		
					    	}
		    	
					    			
					    }
					   }
					   
		    	}
		    	
		    return resultmatrix;
		    
		    }
		}
	}
}