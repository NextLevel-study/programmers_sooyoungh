// My
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int cnt = 1;
        for (int i = 1; i <arr.length ; i++) {
            if ( arr[i] == arr[i-1] ) continue;
            cnt++;
        }
        
        int[] answer = new int[cnt];
        
        answer[0] = arr[0];
        for (int i = 1, j=1 ; i <arr.length ; i++) {
            if ( arr[i] == arr[i-1] ) continue;
            answer[j] = arr[i];
            j++;
        }

        return answer;
    }
}

//Better
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10; // 배열 arr의 값이 아닌 수
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
      
        int[] answer = new int[tempList.size()];
      
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}
