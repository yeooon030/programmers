class Solution {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        String[] strArr = s.split("");
        for(int i=0; i<strArr.length; i++){
            if("p".equals(strArr[i].toLowerCase())){
                pCnt++;
            }else if("y".equals(strArr[i].toLowerCase())){
                yCnt++;
            }
        }

        if(pCnt == yCnt) return true;
        return false;
    }
}