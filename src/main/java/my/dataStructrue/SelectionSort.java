package my.dataStructrue;

/**
 * 选择排序
 * <p>
 * O（n^2）
 */
public class SelectionSort implements SortInterface {


    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] <= arr[max]) {
                    max = j;
                }
            }

            SortInterface.swap(i, max, arr);

        }

        return arr;
    }

    @Override
    public String name() {
        return "Selection Sort";
    }
}
