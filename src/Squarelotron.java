import java.util.Arrays;

public class Squarelotron {
	
	int[][] squarelotron;
	int size;
	
	Squarelotron(int n){
		// Initialize instance variables
		this.size = n;
		this.squarelotron = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				this.squarelotron[i][j] = n * i + j + 1;
			}
		}
	}
	
	public boolean equals (int[][] square) {
		// return Arrays.equals(this.squarelotron, square);
		boolean isEqual = true;
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				if (this.squarelotron[i][j] != square[i][j]) {
					isEqual = false;
				}
			}
		}
		return isEqual;
	}
	
	Squarelotron upsideDownFlip (int ring) {
		Squarelotron upside = new Squarelotron(this.size);
		int min = ring - 1;
		int max = this.size - ring;
		for (int j = min; j <= max; j++) {
			upside.squarelotron[min][j] = this.squarelotron[max][j];
			upside.squarelotron[max][j] = this.squarelotron[min][j];
		}
		if (max - min > 2) {
			for (int i = 1; i < max - min; i++) {
				upside.squarelotron[min + i][min] = this.squarelotron[max - i][min];
				upside.squarelotron[min + i][max] = this.squarelotron[max - i][max];
			}
		}
		return upside;
	}
	
	Squarelotron mainDiagonalFlip(int ring) {
		Squarelotron diagonal = new Squarelotron(this.size);
		int min = ring - 1;
		int max = this.size - ring;
		for (int i = min; i <= max; i++) {
			diagonal.squarelotron[i][min] = this.squarelotron[min][i];
			diagonal.squarelotron[i][max] = this.squarelotron[max][i];
			diagonal.squarelotron[min][i] = this.squarelotron[i][min];
			diagonal.squarelotron[max][i] = this.squarelotron[i][max];
		}
		return diagonal;
	}
	
	void rotateRightOnce() {
		int[][] rotated = new int[this.size][this.size];
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				rotated[j][this.size - (i + 1)] = this.squarelotron[i][j];
			}
		}
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				this.squarelotron[i][j] = rotated[i][j];
			}
		}
	}
	
	void rotateRight(int numberOfTurns) {
		// Do nothing
		if (numberOfTurns % 4 == 1 || numberOfTurns % 4 == -3) {
			rotateRightOnce();
		} else if (numberOfTurns % 4 == 2 || numberOfTurns % 4 == -2) {
			rotateRightOnce();
			rotateRightOnce();
		} else if (numberOfTurns % 4 == 3 || numberOfTurns % 4 == -1) {
			rotateRightOnce();
			rotateRightOnce();
			rotateRightOnce();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nDim = 3;
		// int[][] testArray = new int[nDim][nDim];
		Squarelotron mySquare = new Squarelotron(nDim);
		// boolean isEqual;
		
		/*
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				testArray[i][j] = nDim * i + j + 1;
			}
		}
		*/
		
		// System.out.println(Arrays.deepToString(testArray));
		System.out.println(Arrays.deepToString(mySquare.squarelotron));
		mySquare.rotateRight(1);
		System.out.println(Arrays.deepToString(mySquare.squarelotron));
		// isEqual = mySquare.equals(testArray);
		
		/*
		if (isEqual) {
			System.out.println("The arrays are equivalent");
		} else {
			System.out.println("The arrays diverge");
		}
		*/
	}


}
