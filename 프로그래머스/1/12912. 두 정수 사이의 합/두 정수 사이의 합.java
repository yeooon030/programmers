class Solution {
    public long solution(int a, int b) {
        if(a==b) return a;
        long rtnVal = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for(int i=min; i<=max; i++){
            rtnVal += i;
        }
        return rtnVal;
    }
}