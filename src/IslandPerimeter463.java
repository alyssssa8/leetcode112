public class IslandPerimeter463 {

    public static void main(String[] args) {

    }

    public int islandPerimeter(int[][] grid) {

        int count = 0;
        int repeat = 0;
        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    if (i != 0 && grid[i - 1][j] == 1) {
                        repeat++;
                    }
                    if (j != 0 && grid[i][j - 1] == 1) {
                        repeat++;
                    }

                }
            }

        }
        return count * 4 - repeat * 2;
    }
}
