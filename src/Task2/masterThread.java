//MasterSlave

package Task2;

import java.util.Date;



public class masterThread extends Thread {
	
	int[][] matrix1;
	int[][] matrix2;
	int[][] resultmatrix;
	
	public masterThread(int matrix1[][],int matrix2[][],int resultmatrix[][]) {
		
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.resultmatrix = resultmatrix;
		
	}

	

	public void run() {
		
		Date start = new Date();
		int currentslave = 0;
		int slaveCount = 100;
		 SlaveThread slaves[] = new SlaveThread[slaveCount];
		 // create slaves:
	    	for(int i = 0; i < slaveCount; i++) {
	    		slaves[i] = new SlaveThread(i, i, matrix1, i, i);
	    		System.out.println("create slave: " + i);
	    	}
	    	
	    	slaves[currentslave].start();
	    	currentslave++;
	    	if(currentslave == slaveCount) {
	    		currentslave = 0;
	    	}
		 
		 
		 for (int i = 0; i < matrix1.length; i++) {
			   for (int j = 0; j < matrix1.length; j++) {
			    for (int k = 0; k < matrix1.length; k++) {
			    	slaves[currentslave]= new SlaveThread(matrix1[i][k],matrix2[k][j], resultmatrix, i ,j);

		
			    	}			
    
			   }
		 }
		 Date end = new Date();
	    	System.out.println("\nTime taken in milli seconds: " + (end.getTime() - start.getTime()));
	}
}