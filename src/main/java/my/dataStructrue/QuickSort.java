package my.dataStructrue;

/**
 * O( n log(n))
 */
public class QuickSort implements SortInterface {


    @Override
    public int[] sort(int[] arr) {
        this.innerSort(arr, 0, arr.length - 1);

        return arr;
    }

    /**
     * 对 [l,r] 的范围内 下标进行 快排
     *
     * @param arr
     * @param l   起始下标
     * @param r   结束下标
     */
    private void innerSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int index = partition(arr, l, r);

        innerSort(arr, l, index - 1);
        innerSort(arr, index + 1, r);
    }

    /**
     * 对 [l,r] 中的数据进行快排 ，返回 下标 k ，满足 一下
     * arr[l,k-1]  <  arr[k]  < arr[k+1,r]
     * 99, 1, 1, 1, 23, 4,116, 1117, 11118, 1119
     *                  j
     *                                             i
     * @param arr
     * @param l
     * @param r
     * @return
     */
    private int partition(int[] arr, int l, int r) {

        int flag = arr[l];

        int j = l;


        for (int i = l + 1; i <= r; i++) {
            if(arr[i]< flag){
                SortInterface.swap(j+1,i,arr);
                j++;
            }
        }

        SortInterface.swap(l, j, arr);

        return j;
    }


    @Override
    public String name() {
        return "Quick Sort";
    }

}