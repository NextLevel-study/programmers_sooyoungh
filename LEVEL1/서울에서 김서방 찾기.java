class Solution {
    public String solution(String[] seoul) {
        int i = 0;
        for (  ; i< seoul.length ; i++ ) {
            if ( seoul[i].equals("Kim") ) {
                break;
            }
        }
        
        return "김서방은 " + i + "에 있다" ;
    }
}

// Better
import java.util.Arrays;

public class FindKim {
    public String findKim(String[] seoul){
      
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+ x + "에 있다";
    }

}
