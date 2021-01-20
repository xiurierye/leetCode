package my.dataStructrue;

/**
 * O( n log(n) )
 * 总结
 *   每次merg 操作 需要开辟一个新的数据空间，用来更新 原数组
 *
 *
 */
public class MergeSort implements SortInterface {


    @Override
    public int[] sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }


        this.mergeSort(arr, 0, arr.length - 1);

        return arr;
    }


    /**
     * 对  [l,r]  之间的数据 执行归并算法
     *
     * @param arr
     * @param l
     * @param r
     */
    private void mergeSort(int[] arr, int l, int r) {

        //递归退出点
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;
        this.mergeSort(arr, l, mid);
        this.mergeSort(arr, mid + 1, r);
        this.merge(arr, l, r);
    }


    /**
     * 对 [l,r] 之间的数做合并操作
     * @param arr
     * @param l
     * @param r
     */
    private void merge(int[] arr, int l, int r) {
        // 开辟新空间  每次复制 很麻烦
        int[] copy = new int[r - l + 1];
        for (int i = l; i <= r; i++) {
            copy[i-l] = arr[i];
        }

        int i = l;
        int mid = (l + r) / 2;
        int j = mid + 1;


        for (int k = i; k <= r; k++) {
            if (i > mid) {
                arr[k] = copy[j - l];
                j++;
            } else if (j > r) {
                arr[k] = copy[i - l];
                i++;

            } else if (copy[i-l]<copy[j-l]){
                arr[k] = copy[i-l];
                i++;
            }else {
                arr[k] = copy[j-l];
                j++;
            }
        }


    }

    @Override
    public String name() {
        return "Merge Sort";
    }
}
