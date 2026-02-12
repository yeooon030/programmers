class Solution {
    public int[] solution(int[] num_list) {
        //int[] answer = new int[]
        int length = num_list.length;
        for(int i=0; i<=length/2; i++){
            int tmp = num_list[i];
            num_list[i] = num_list[--length];
            num_list[length] = tmp;
        }
        return num_list;
    }
}