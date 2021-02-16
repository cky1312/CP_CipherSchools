package Assignment_1;

import java.util.*;

public class SpiralMatrix {

    public static  List<Integer> printSpiral(int[][] arr, int R, int C){
        ArrayList<Integer> spiralList = new ArrayList<>();

        if(arr.length == 0)
            return spiralList;

        boolean[][] seen = new boolean[R][C];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int r = 0, c = 0, di = 0;

        // Iterate from 0 to R * C - 1
        for (int i = 0; i < R * C; i++) {
            spiralList.add(arr[r][c]);
            seen[r][c] = true;
            int cr = r + dr[di];
            int cc = c + dc[di];

            if (0 <= cr && cr < R && 0 <= cc && cc < C
                    && !seen[cr][cc]) {
                r = cr;
                c = cc;
            }
            else {
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return spiralList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no of rows");
//        int R = sc.nextInt();
//        System.out.println("Enter the no of columns");
//        int C = sc.nextInt();

//        int[][] spiral= new int[R][C];
//        System.out.println("Enter the elements in the matrix");

//        for(int i = 0; i < R; i++){
//            for(int j = 0; j < C; j++){
//                spiral[i][j] = i+1;
//            }
//        }

        int[][] spiral= { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int R = spiral.length;
        int C = spiral[0].length;


        System.out.println(printSpiral(spiral,R,C));
    }
}
