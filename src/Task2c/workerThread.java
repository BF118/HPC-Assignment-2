//Symmetric 
package Task2c;


class workerThread extends Thread {
	public int start(int matrix1, int matrix2, int resultmatrix[][], int i, int j) {
		
		return resultmatrix[i][j] = resultmatrix[i][j] +(matrix1 * matrix2);
		
		}
}
	