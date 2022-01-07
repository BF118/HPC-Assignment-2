//Symmetric 
package Task2c;


class workerThread extends Thread {
	int matrix1value;
	int matrix2value;
	int [][]resultmatrix;
	int i;
	int j;
	
	
	public workerThread(int matrix1value, int matrix2value, int resultmatrix[][], int i, int j) {
		this.matrix1value = matrix1value;
		this.matrix2value = matrix2value;
		this.resultmatrix = resultmatrix;
		this.i = i;
		this.j = j;
	}
		
	public void run() {
	
	
			resultmatrix[i][j] = resultmatrix[i][j] +(matrix1value * matrix2value);
	
	}
	
}