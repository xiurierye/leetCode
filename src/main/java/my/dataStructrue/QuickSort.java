package my.dataStructrue;

/**
 * O( n log(n))
 */
public class QuickSort implements SortInterface {


    @Override
    public int[] sort(int[] arr) {
        this.innerSort(arr,0, arr.length-1);

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

        int index = quickSort(arr, l, r);

        innerSort(arr, l, index - 1);
        innerSort(arr, index + 1, r);
    }

    /**
     * 对 [l,r] 中的数据进行快排 ，返回 下标 k ，满足 一下
     * arr[l,k-1]  <  arr[k]  < arr[k+1,r]
     * 99, 1, 1, 1, 23, 6, 4, 7, 8, 9
     *                              i
     *                                j
     *                                v
     *
     * 其中最重要的部分是 控制 i  j  v 的初始位置
     * j 永远跟着 v 走
     * i 初始位置在 flag 处
     * @param arr
     * @param l
     * @param r
     * @return
     */
    private int quickSort(int[] arr, int l, int r) {

        int flag = arr[l];

        int i = l;
        int j = l + 1;
        int v = l + 1;

        for (; v <= r; v++) {
            if (arr[v] < flag) {
                i++;
                swap(i, v, arr);
                j=v;
            }

            if (arr[v]> flag){
                j = v;

            }
        }

        swap(i,l,arr);

        return i;
    }


    @Override
    public String name() {
        return "Quick Sort";
    }
}
