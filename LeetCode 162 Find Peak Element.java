class Solution {
    public int findPeakElement(int[] arr) {
       int l=0;
       int r = arr.length-1;
       int mid;
       while(l<=r){
        mid = l + (r-l)/2;
         if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) 
        {
            return mid;
        }
        if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
       }
       return -1;
    }
    }