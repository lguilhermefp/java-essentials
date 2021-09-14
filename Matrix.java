import javax.sound.sampled.Line;

public class Matrix {
	private int x, y;
	private double[][] matrix = new double[x][y];

	Matrix(int x, int y) {
		this.x = x;
		this.y = y;
		this.matrix = new double[x][y];
	}

	public void setX (int x) {
		this.x = x;
		matrix = new double[x][y];
	}

	public void setY (int y) {
		this.y = y;
		matrix = new double[x][y];
	}

	public double[][] getMatrix() {
		return matrix;
	}

	public void setMatrixValue(int x, int y, double value) {
		matrix[x][y] = value;
	}

	public void printMatrix () {
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println("\n");
		}
	}

	public double cauculateSparsity() {
		double notNullCount = 0;
		double nullCount = 0;

		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				if(matrix[i][j] == 0)
					nullCount++;
				else
					notNullCount++;
			}
		}
		double sparsity = (nullCount) / (nullCount + notNullCount);
		return sparsity;
	}

	public double similarityTo (double[][] matrix) {
		double similarCount = 0;
		double notSimilarCount = 0;

		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				if (this.matrix[i][j] == matrix[i][j])
					similarCount++;
				else
					notSimilarCount++;
			}
		}
		double similarity = (similarCount) / (similarCount + notSimilarCount);
		return similarity;
	}

	public Matrix addedTo(Matrix matrix) {
		Matrix matrixSum = new Matrix(x, y);
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				matrixSum.getMatrix()[i][j] = this.matrix[i][j] + matrix.getMatrix()[i][j];
			}
		}
		return matrixSum;
	}

	public Matrix multipliedBy(Matrix matrix) {
		Matrix matrixProduct = new Matrix(x, y);
  
		for(int i=0;i<matrix.y;i++){  
			for(int j=0;j<x;j++){  
				matrixProduct.setMatrixValue(i, j, 0);
				for (int k=0;k<y;k++) {
					matrixProduct.setMatrixValue(i, j, matrixProduct.getMatrix()[i][j]+this.matrix[i][k]*matrix.getMatrix()[k][j]);
				}
			}
		}
		return matrixProduct;
	}

	public Matrix transpose() {
		Matrix matrixTranspose = new Matrix(x, y);
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				matrixTranspose.setMatrixValue(i, j, this.matrix[j][i]);
			}
		}
		return matrixTranspose;
	}

	public Matrix LinearVectorMultipliedByMatrix (Matrix linearVector) {
		Matrix matrixProduct = new Matrix(x, y);
  
		for(int i=0;i<1;i++){  
			for(int j=0;j<3;j++){  
				matrixProduct.setMatrixValue(i, j, 0);
				for (int k=0;k<3;k++) {
					matrixProduct.setMatrixValue(i, j, matrixProduct.getMatrix()[i][j]+linearVector.getMatrix()[i][k]*this.matrix[k][j]);
				}
			}
		}
		return matrixProduct;
	}

	public Matrix MatrixMultipliedByColumnVector (Matrix columnVector) {
		Matrix matrixProduct = new Matrix(x, y);
  
		for(int i=0; i<3; i++){  
			for(int j=0; j<3; j++){  
				matrixProduct.setMatrixValue(i, j, 0);
				for (int k=0;k<1;k++) {
					matrixProduct.setMatrixValue(i, j, matrixProduct.getMatrix()[i][j]+columnVector.getMatrix()[i][k]*this.matrix[k][j]);
				}
			}
		}
		return matrixProduct;
	}


	public static void main (String[] args) {
		Matrix matrix1 = new Matrix(3, 3);
		Matrix matrix2 = new Matrix(3, 3);
		Matrix linearMatrix = new Matrix(1, 3);
		Matrix ColumnMatrix = new Matrix(3, 1);

		ColumnMatrix.setMatrixValue(0, 0, 1);
		ColumnMatrix.setMatrixValue(1, 0, 1);
		ColumnMatrix.setMatrixValue(2, 0, 1);


		linearMatrix.setMatrixValue(0, 0, 2);
		linearMatrix.setMatrixValue(0, 1, 2);
		linearMatrix.setMatrixValue(0, 2, 2);

		matrix1.setMatrixValue(0, 0, 3);
		matrix1.setMatrixValue(0, 1, 3);
		matrix1.setMatrixValue(0, 2, 3);
		matrix1.setMatrixValue(1, 0, 3);
		matrix1.setMatrixValue(1, 1, 3);

		matrix2.setMatrixValue(1, 1, 3);
		matrix2.setMatrixValue(0, 1, 3);
		// matrix1.printMatrix();

		// System.out.println(matrix1.cauculateSparsity());
		// System.out.println(matrix1.similarityTo(matrix2.getMatrix()));

		// Matrix matrixSum = matrix1.addedTo(matrix2);
		// matrixSum.printMatrix();

		// Matrix matrixProduct = matrix1.multipliedBy(matrix2);
		// matrixProduct.printMatrix();

		// Matrix matrixTranspose = matrix1.transpose();
		// matrixTranspose.printMatrix();

		// Matrix matrixProductByLinearVector = matrix1.LinearVectorMultipliedByMatrix(linearMatrix);
		// matrixProductByLinearVector.printMatrix();

		// linearMatrix.printMatrix();

		Matrix matrixProduct = matrix1.MatrixMultipliedByColumnVector(ColumnMatrix);
		matrixProduct.printMatrix();

	}
}
