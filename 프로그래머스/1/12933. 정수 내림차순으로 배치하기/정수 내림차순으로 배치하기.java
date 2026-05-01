import java.util.*;

class Solution {
    public void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    public void bubbleSort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int exchg = 0;
            for(int j=n-1; j>i; j--){
                if(arr[j] > arr[j-1]){
                    swap(arr, j, j-1);
                    exchg++;
                }
            }
            if(exchg == 0) break;
        }
    }

    public long solution(long n){
        long result;
        String str = "" + n;
        String[] strArr = str.split("");

        int[] intArr = new int[strArr.length];
        for(int i=0; i<intArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        bubbleSort(intArr, intArr.length);

        String sortedStr = "";
        for(int i=0; i<intArr.length; i++){
            sortedStr += String.valueOf(intArr[i]);
        }

        result = Long.parseLong(sortedStr);
        return result;
    }
}