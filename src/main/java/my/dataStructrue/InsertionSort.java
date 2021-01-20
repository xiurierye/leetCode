package my.dataStructrue;

/**
 * 插入排序
 *
 * O（n^2）
 */
public class InsertionSort  implements SortInterface{
    @Override
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tempIndex = i;
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] < arr[j] ) {
                    tempIndex = j;
                    break;
                }

                arr[j]= arr[j-1];
            }
            arr[tempIndex] = arr[i];
        }
        return arr;

    }

    @Override
    public String name() {
        return "Insertion Sort";
    }
}
