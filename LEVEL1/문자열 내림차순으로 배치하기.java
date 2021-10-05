import java.util.Arrays;
import java.util.Collections;
 
class Solution {
    public String solution(String s) {
        int length = s.length();
        String[] arr = s.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
 
        String answer = Arrays.toString(arr);
        answer = answer.replace(",", ""); 
        answer = answer.replace("[", ""); 
        answer = answer.replace("]", ""); 
        answer = answer.replace(" ", ""); 
        
        return answer;        
    }
}

//Better1
public class ReverseStr {
    public String reverseStr(String str){
    char[] sol = str.toCharArray();
    Arrays.sort(sol);
    return new StringBuilder(new String(sol)).reverse().toString();
    }
}

//Better2
public class ReverseStr {
    public String reverseStr(String str){
        return Stream.of(str.split(""))
                      .sorted(Comparator.reverseOrder())
                      .collect(Collectors.joining());
    }
}
