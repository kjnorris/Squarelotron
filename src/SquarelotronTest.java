import static org.junit.Assert.*;
import org.junit.Test;

public class SquarelotronTest {

	@Test
	public void testSquarelotron() {
		int[][] testArray3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		Squarelotron mySquare3 = new Squarelotron(3);
		assertTrue(mySquare3.equals(testArray3));
		
		int[][] testArray5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
		Squarelotron mySquare5 = new Squarelotron(5);
		assertTrue(mySquare5.equals(testArray5));
		
		int[][] testArray8 = {{1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15, 16},
				{17, 18, 19, 20, 21, 22, 23, 24}, {25, 26, 27, 28, 29, 30, 31, 32},
				{33, 34, 35, 36, 37, 38, 39, 40}, {41, 42, 43, 44, 45, 46, 47, 48},
				{49, 50, 51, 52, 53, 54, 55, 56}, {57, 58, 59, 60, 61, 62, 63, 64}};
		
		Squarelotron mySquare8 = new Squarelotron(8);
		assertTrue(mySquare8.equals(testArray8));
		assertFalse(mySquare5.equals(testArray8));
	}

	@Test
	public void testUpsideDownFlip() {
		int[][] testArray3 = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
		Squarelotron mySquare3 = new Squarelotron(3);
		Squarelotron myUpside3 = mySquare3.upsideDownFlip(1);
		assertTrue(myUpside3.equals(testArray3));
		
		int[][] testArray4 = {{13, 14, 15, 16}, {9, 6, 7, 12},
				{5, 10, 11, 8}, {1, 2, 3, 4}};
		Squarelotron mySquare4 = new Squarelotron(4);
		Squarelotron myUpside4 = mySquare4.upsideDownFlip(1);
		assertTrue(myUpside4.equals(testArray4));
		
		int[][] testArray8 = {{1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15, 16},
				{17, 18, 43, 44, 45, 46, 23, 24}, {25, 26, 35, 28, 29, 38, 31, 32},
				{33, 34, 27, 36, 37, 30, 39, 40}, {41, 42, 19, 20, 21, 22, 47, 48},
				{49, 50, 51, 52, 53, 54, 55, 56}, {57, 58, 59, 60, 61, 62, 63, 64}};
		Squarelotron mySquare8 = new Squarelotron(8);
		Squarelotron myUpside8 = mySquare8.upsideDownFlip(3);
		assertTrue(myUpside8.equals(testArray8));
	}

	@Test
	public void testMainDiagonalFlip() {
		int[][] testArray3 = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
		Squarelotron mySquare3 = new Squarelotron(3);
		Squarelotron myUpside3 = mySquare3.mainDiagonalFlip(1);
		assertTrue(myUpside3.equals(testArray3));
		
		int[][] testArray4 = {{1, 5, 9, 13}, {2, 6, 7, 14},
				{3, 10, 11, 15}, {4, 8, 12, 16}};
		Squarelotron mySquare4 = new Squarelotron(4);
		Squarelotron myUpside4 = mySquare4.mainDiagonalFlip(1);
		assertTrue(myUpside4.equals(testArray4));
		
		int[][] testArray8 = {{1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15, 16},
				{17, 18, 19, 27, 35, 43, 23, 24}, {25, 26, 20, 28, 29, 44, 31, 32},
				{33, 34, 21, 36, 37, 45, 39, 40}, {41, 42, 22, 30, 38, 46, 47, 48},
				{49, 50, 51, 52, 53, 54, 55, 56}, {57, 58, 59, 60, 61, 62, 63, 64}};
		Squarelotron mySquare8 = new Squarelotron(8);
		Squarelotron myUpside8 = mySquare8.mainDiagonalFlip(3);
		assertTrue(myUpside8.equals(testArray8));
	}

	@Test
	public void testRotateRight() {
		int[][] testArray3 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		Squarelotron mySquare3 = new Squarelotron(3);
		mySquare3.rotateRight(1);
		assertTrue(mySquare3.equals(testArray3));
		
		int[][] testArray3_2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		Squarelotron mySquare3_2 = new Squarelotron(3);
		mySquare3_2.rotateRight(2);
		assertTrue(mySquare3_2.equals(testArray3_2));
		
		int[][] testArray3_3 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		Squarelotron mySquare3_3 = new Squarelotron(3);
		mySquare3_3.rotateRight(-2);
		assertTrue(mySquare3_3.equals(testArray3_3));
		
		int[][] testArray3_4 = {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};
		Squarelotron mySquare3_4 = new Squarelotron(3);
		mySquare3_4.rotateRight(-1);
		assertTrue(mySquare3_4.equals(testArray3_4));
	}

}
