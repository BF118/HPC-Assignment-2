package Task2;


class SlaveThread extends Thread {
	int matrixvalue1;
	int matrixvalue2;
	int [][]resultmatrix;
	int i;
	int j;
	
	
	public int[][]slaveThread(int matrixvalue1, int matrixvalue2, int[][] resultmatrix, int i, int j) {
		
			this.matrixvalue1 = matrixvalue1;
			this.matrixvalue2 = matrixvalue2;
			this.resultmatrix = resultmatrix;
			this.i = i;
			this.j =j;
			return resultmatrix;
		
		}
	
	public void run() {
		
		resultmatrix[i][j] = resultmatrix[i][j] +(matrixvalue1 * matrixvalue2);
		
	}
	
	
	
}