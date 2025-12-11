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
        int countAliveNeighbor = 0;

        // низ и право
        if ((i == 0) && (j == 0)) {
            // Низ
            if (matrix[i + 1][j]) {
                countAliveNeighbor++;
            }

            // Право
            if (matrix[i][j + 1]) {
                countAliveNeighbor++;
            }
        }

        //лево низ
        if ((i == 0) && (j == (matrix[1].length - 1))) {
            // Лево
            if (matrix[i][j - 1]) {
                countAliveNeighbor++;
            }

            // Низ
            if (matrix[i + 1][j]) {
                countAliveNeighbor++;
            }
        }

        //верх право
        if ((i == (matrix.length - 1)) && (j == 0)) {
            // Верх
            if (matrix[i - 1][j]) {
                countAliveNeighbor++;
            }

            // Право
            if (matrix[i][j + 1]) {
                countAliveNeighbor++;
            }
        }

        // верх лево
        if ((i == (matrix.length - 1)) && (j == (matrix.length - 1))) {
            // Верх
            if (matrix[i - 1][j]) {
                countAliveNeighbor++;
            }

            // Лево
            if (matrix[i][j - 1]) {
                countAliveNeighbor++;
            }
        }

        // лево право низ
        if ((i == 0) && (j > 0) && (j < (matrix[1].length - 1))) {
            // Лево
            if (matrix[i][j - 1]) {
                countAliveNeighbor++;
            }

            // Право
            if (matrix[i][j + 1]) {
                countAliveNeighbor++;
            }

            // Низ
            if (matrix[i + 1][j]) {
                countAliveNeighbor++;
            }
        }

        // верх право низ
        if ((i > 0) && (i < (matrix.length - 1)) && (j == 0)) {
            // Верх
            if (matrix[i - 1][j]) {
                countAliveNeighbor++;
            }

            // Право
            if (matrix[i][j + 1]) {
                countAliveNeighbor++;
            }

            // Низ
            if (matrix[i + 1][j]) {
                countAliveNeighbor++;
            }
        }

        // лево верх низ
        if ((i > 0) && (i < matrix.length - 1) && (j == matrix[1].length - 1)) {
            // Лево
            if (matrix[i][j - 1]) {
                countAliveNeighbor++;
            }

            // Верх
            if (matrix[i - 1][j]) {
                countAliveNeighbor++;
            }

            // Низ
            if (matrix[i + 1][j]) {
                countAliveNeighbor++;
            }
        }

        // лево верх право
        if ((i == matrix.length - 1) && (j > 0) && (j < (matrix[1].length - 1))) {
            // Лево
            if (matrix[i][j - 1]) {
                countAliveNeighbor++;
            }

            // Верх
            if (matrix[i - 1][j]) {
                countAliveNeighbor++;
            }

            // Право
            if (matrix[i][j + 1]) {
                countAliveNeighbor++;
            }
        }

        // все соседи
        if ((i > 0) && (i < (matrix.length - 1)) && (j > 0) && (j < (matrix[1].length - 1))) {
            // Верх
            if (matrix[i - 1][j]) {
                countAliveNeighbor++;
            }
            // Лево
            if (matrix[i][j - 1]) {
                countAliveNeighbor++;
            }
            // Низ
            if (matrix[i + 1][j]) {
                countAliveNeighbor++;
            }
            // Право
            if (matrix[i][j + 1]) {
                countAliveNeighbor++;
            }
        }

        return countAliveNeighbor;
    }
}


