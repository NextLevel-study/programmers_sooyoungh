import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length ;
        if ( length == 1 ) {
            arr[0] = -1;
            return arr;
        }
        
        int[] answer = new int[length-1];
        int MIN = arr[0];
        System.out.println(MIN);
        
        for (int j = 0; j < length ; j++) {
            if (MIN >= arr[j]) MIN = arr[j];
            System.out.println(MIN);
        }

        for (int i =0, j =0; i <length ; i++ ) {
            if (arr[i] != MIN) {
                answer[j] = arr[i];
                j++;
            }
        }

        return answer;
    }
}
