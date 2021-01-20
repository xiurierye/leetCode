package my.dataStructrue;

import my.leetcode.util.Utils;

/**
 * @author xiurierye
 * @Time 1/19/21
 */
public class BubbleSort implements SortInterface {




    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length -i-1 ; j++) {
                if  (arr[j]>arr[j+1]){
                    this.swap(j,j+1,arr);
                }
            }

        }
        return arr;
    }

    @Override
    public String name() {
        return "Bubble Sort";
    }
}
