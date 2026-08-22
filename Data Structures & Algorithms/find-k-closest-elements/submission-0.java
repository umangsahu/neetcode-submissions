class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        
        int len = arr.length;

        int l = 0;
        int r = len - k;

        while(l < r){
            int mid = (l+r)/2;
             if( x - arr[mid] > arr[mid + k] - x){
               l = mid + 1;
             }else{
               r = mid; 
             }
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = l; i < l+k; i++){
           ans.add(arr[i]);
        }

        return ans;
        
    }
}