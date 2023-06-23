package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {34,52,1},
                {5,66,2,6},
                {1,78,5,9,5},
                {12,9,8}
        };
        int target = 2;
        int [] answer  = search(arr, target); //store the answer in this format {row, col}
        System.out.println(Arrays.toString(answer));
    }

    static int[] search(int [][] arr, int target){

        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr[i].length; j++){
                if (arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
