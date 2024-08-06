public class MergeSort {
    public void mergeSort(int[] array) {
        ///Base case
        if(array.length <=1) return;

        int mid = array.length/2;
        ///Split arrays in 2
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length-mid];
        int j = 0;
        for (int i = 0; i< array.length; i++){
            if(i < mid){
                leftArray[i]= array[i];
            }else{
                rightArray[j] = array[i];
                j++;
            }
        }

        //Recursive calls
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);
    }
    private void merge(int[] leftArray, int[] rightArray,int array[]){
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; ///index for original array, left array and right array

        ///Conditions for merging & merging
        while(l< leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        ///Elements remaining that the original iteration couldnt compare
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
