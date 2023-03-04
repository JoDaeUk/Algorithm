import java.util.ArrayList;

public class robotPath {
    public static void main(String[] args) {
        int[][] room = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0}
        };
        int[] src = new int[]{4, 2};
        int[] dst = new int[]{2, 2};
        int output = robotPath(room, src, dst);
        System.out.println(output); // --> 8
    }

//    {
//        {0, 0, 0, 0, 0, 0},
//        {0, 1, 1, 0, 1, 0},
//        {0, 1, 4, 0, 0, 0},
//        {0, 0, 1, 1, 1, 0},
//        {1, 0, 3, 0, 0, 0}
//    }

    public static int robotPath(int[][] room, int[] src, int[] dst) {
        // TODO :
        int y = src[0];
        int x = src[1];
        room[y][x] = 1;
        int count = 1;

    }
    public static ArrayList<Integer> robotCount(int[][] room, int[] src, int[] dst,ArrayList<Integer> robotCount){

    }
}

