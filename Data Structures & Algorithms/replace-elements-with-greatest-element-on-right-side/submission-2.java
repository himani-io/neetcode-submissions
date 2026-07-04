class Solution {
    public int[] replaceElements(int[] arr) {
        int right ;
        int maxEl = 0;

        for(int i=0; i<arr.length-1; i++){
            maxEl = -1;

            for(int j=i+1; j<arr.length; j++){
                right = j;
                maxEl = Math.max(maxEl, arr[right]);
            }

            arr[i] = maxEl;
        }

        if(arr.length > 0){
            arr[arr.length-1] = -1;
        }

        return arr;

    }
}