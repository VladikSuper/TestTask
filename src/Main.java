public class Main {
    public static void main(String[] args) {
        // Сделать boolean чтоб заработало
        int[][] matrix = {{1, 0, 1, 1}, {0, 0, 0, 1}, {1, 1, 1, 0}, {0, 0, 1, 1}};
        int [][] newMarix = new int[matrix.length][matrix[0].length];

        //{1, 0, 1, 1}
        //{0, 0, 0, 1}
        //{1, 1, 1, 0}
        //{0, 0, 1, 1}

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int livingNeighbors = checkNeighbor(matrix, i, j);

                if (matrix[i][j] == 0) {
                    if (livingNeighbors == 3) {
                        newMarix[i][j] = 1;
                    }
                    else {
                        newMarix[i][j] = 0;
                    }
                } else {
                    if (livingNeighbors < 2) {
                        newMarix[i][j] = 0;
                    }

                    if (livingNeighbors == 2 || livingNeighbors == 3) {
                        newMarix[i][j] = 1;
                    }

                    if (livingNeighbors > 3){
                        newMarix[i][j] = 0;
                    }
                }
            }
        }

        for (int[] mat : newMarix) {
            for (int m : mat){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }


    static int checkNeighbor(int[][] matrix, int i, int j) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int counter = 0;

        int[][] displacement = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1}, {0, 1},
                {1, -1}, {1, 0}, {1, 1}
        };

        for (int[] dir : displacement) {
            int dirI = i + dir[0];
            int dirJ = j + dir[1];

            if (dirI >= 0 && dirI < rows && dirJ >= 0 && dirJ < columns) {
                if (matrix[dirI][dirJ] == 1) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
