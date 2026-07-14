class Solution {

    public void mergeSort(int[] inpArr){
        int inpArrLen  = inpArr.length;
        if(inpArrLen<2) return;
        int mid = inpArrLen/2;

        int[] left = new int[mid];
        int[] right = new int[inpArrLen - mid];

        for(int i=0;i<mid;i++){
            left[i] = inpArr[i];
        }
        for(int i= mid;i<inpArrLen;i++){
            right[i-mid] = inpArr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(inpArr, left, right);
    }
    public void merge(int[] inpArr, int[] left,int[] right){
     int rightLen = right.length;
     int leftLen = left.length;
     int i=0,j=0,k=0;

     while(i< leftLen && j< rightLen){
        if(left[i] <= right[j]){
            inpArr[k] = left[i];
            i++;
        }else{
          inpArr[k] = right[j];
            j++;
        }
        k++;
     }

     while(i< leftLen){
         inpArr[k] = left[i];
            i++;
            k++;
     }
         while(j< rightLen){
         inpArr[k] = right[j];
            j++;
            k++;
     }


    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums);

        return nums;
    }
}