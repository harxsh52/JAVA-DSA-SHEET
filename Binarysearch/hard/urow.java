package Bianrysearch.hard;

public class urow {
    public int findMaxOnesRow(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return -1;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int currentRow = 0;
        int currentCol = cols - 1;
        int maxOnesRow = -1;

        while (currentRow < rows && currentCol >= 0) {
            if (matrix[currentRow][currentCol] == 1) {
                maxOnesRow = currentRow;
                currentCol--;
            } else {
                currentRow++;
            }
        }
        return maxOnesRow;
    }

}
