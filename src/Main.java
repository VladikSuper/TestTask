public class Main {
    public static void main(String[] args) {
        // Сделать boolean чтоб заработало
        int[][] matrix = {{1, 0, 1}, {0, 0, 0}, {1, 1, 1}};

        //{1, 0, 1}
        //{0, 0, 0}
        //{1, 1, 1}

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!matrix[i][j]) {
                    break;
                } else {
                    int count = checkNeighbor(matrix, i, j);

                }
            }
        }


    }


    static int checkNeighbor(boolean[][] matrix, int i, int j) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int counter = 0;

        int[][] displacement = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1}, {0, 1},
                {1,-1}, {1, 0}, {1, 1}
        };

        for(int[] dir : displacement){
            int dirI = i + dir[0];
            int dirJ = j + dir[1];

            if (dirI >= 0 && dirI < rows && dirJ >= 0 && dirJ < columns) {
                if (matrix[dirI][dirJ]){
                    counter++;
                }
            }
        }
        return counter;
    }
}
