class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();

        String[] strArr = sb.toString().split("");
        int[] result = new int [str.length()];
        for(int i=0; i<str.length(); i++){
            result[i] = Integer.parseInt(strArr[i]);
        }
        return result;
    }
}