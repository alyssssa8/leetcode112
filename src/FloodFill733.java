import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill733 {

    public static void main(String[] args) {

        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        floodFill(image, 1, 1, 2);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println("?");
        }
    }

    //    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//        if (image[sr][sc] == newColor) return image;
//        int oldColor = image[sr][sc];
//        dfs(image, sr, sc, newColor, oldColor);
//        return image;
//    }
//    public static void dfs(int[][] image, int sr, int sc, int newColor,  int oldColor){
//
//        if (sr<0 || sr >=image.length || sc <0 ||  sc >=image[0].length || image[sr][sc]!=oldColor){
//            return;
//        }
//        image[sr][sc]  = newColor;
//        dfs(image, sr+1,sc,newColor,oldColor);
//        dfs(image, sr-1,sc,newColor,oldColor);
//        dfs(image, sr,sc+1,newColor,oldColor);
//        dfs(image, sr,sc-1,newColor,oldColor);
//    }
    private static int[] dr = new int[]{0, 0, 1, -1};
    private static int[] dc = new int[]{-1, 1, 0, 0};

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor == newColor) {
            return image;
        }

        int R = image.length;
        int C = image[0].length;
        Queue<ThePoint> myQueue = new ArrayDeque<ThePoint>();
        myQueue.add(new ThePoint(sr, sc));

        while (myQueue.isEmpty() == false) {
            ThePoint p = myQueue.poll();
            image[p.x][p.y] = newColor;

            for (int i = 0; i < 4; i++) {
                int x = p.x + dr[i];
                int y = p.y + dc[i];
                if (isValid(image, oldColor, x, y, R, C)) {
                    myQueue.add(new ThePoint(x, y));
                }
            }

        }
        return image;
    }

    private static boolean isValid(int[][] image, int oldColor, int x, int y, int R, int C) {
        if (x >= 0 && x < R && y >= 0 && y < C && image[x][y] == oldColor)
            return true;
        return false;
    }


}






