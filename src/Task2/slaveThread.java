package Task2;


class SlaveThread extends Thread {
	public int run(int matrix1, int matrix2, int resultmatrix[][], int i, int j) {
		
		return resultmatrix[i][j] = resultmatrix[i][j] +(matrix1 * matrix2);
		
		}
	
	
	
	
	
}