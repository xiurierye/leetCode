package my.dataStructrue;

public class BinarySearch implements SearchInterface{



    @Override
    public int search(int[] arr, int n, int target) {
        return this.whileSearch(arr, n, target);
    }


    private int whileSearch(int[] arr, int n, int target){

        int l =0;
        int r = n-1;

        while (l<=r){
            int mid =   l + (r-l)/2;  //防止int 型index 溢出；
            if (arr[mid]== target){
                return mid;
            }

            if (arr[mid]< target){
                l = mid+1;
            }
            else {
                r=mid-1;
            }


        }
        return -1;

    }

    private int reverseSearch(int[] arr, int n, int target){

       return reverse(arr,0,n-1,target);
    }

    private int reverse(int [] arr, int l,int r,int target){
        if (l>=r){
            return  arr[l]== target? l : -1;
        }

        int mid = l + (r-l)/2;

        if (arr[mid] > target) {

            return  reverse(arr,l,mid-1,target);
        }
        else {
            return reverse(arr,mid+1,r,target);
        }

    }
}
