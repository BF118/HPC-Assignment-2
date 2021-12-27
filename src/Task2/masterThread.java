package Task2;

public class masterThread extends Thread {
	
    public int[][] start(int matrix1[][],int matrix2[][],int resultmatrix[][]) {
    	//setting the amount of slaves we want to create then saves that to an array
    	int slaveCount = 100;
        SlaveThread slaves[] = new SlaveThread[slaveCount];
	    
        // create slaves:
    	for(int i = 0; i < slaveCount; i++) {
    		slaves[i] = new SlaveThread();
    		System.out.println("create slave: " + i);
    	}
    
    	int currentslave = 0;
    	//similar nest for loop from the gold standard
    	for (int i = 0; i < matrix1.length; i++) {
			   for (int j = 0; j < matrix1.length; j++) {
			    for (int k = 0; k < matrix1.length; k++) {
			    
			    	slaves[currentslave].run(matrix1[i][k],matrix2[k][j], resultmatrix, i ,j);
			    	currentslave++;
			    	if(currentslave == slaveCount) {
			    		currentslave = 0;
			    		
			    	}
    	
			    			
			    }
			   }
			   
    	}
    
    return resultmatrix;
    
    }
}