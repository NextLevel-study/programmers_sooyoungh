class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int row = arr1.length;
        int col = arr1[0].length;
        
        int[][] answer = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            int[] arr1_row = arr1[i];
            int[] arr2_row = arr2[i];
            for (int j = 0; j < col; j++) {
                answer[i][j] = arr1_row[j] + arr2_row[j];
            }
        }

        return answer;
    }
}
