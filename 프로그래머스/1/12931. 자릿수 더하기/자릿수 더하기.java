import java.util.*;

public class Solution {
    public int solution(int n) {
        int result = 0;
        String[] strArr = (String.valueOf(n)).split("");
        for(String str : strArr){
            result += Integer.valueOf(str);
        }

        return result;
    }
}