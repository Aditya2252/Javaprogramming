public class tut6 {

    public static void spiralmatrix(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcolumn = matrix[0].length-1;

        while (startrow <= endrow && startcol <= endcolumn) {
            for (int j = startcol; j <= endcolumn; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }

            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcolumn] + " ");
            }

            for (int j = endcolumn - 1; j >= startcol; j--) {
                if (startcol == endcolumn) {
                    return;
                }
                System.out.print(matrix[endrow][j] + " ");
            }

            for (int i = endrow - 1; i >= startrow + 1; i--) {
                System.out.print(matrix[i][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcolumn--;
            endrow--;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };
        spiralmatrix(matrix);
    }
}
