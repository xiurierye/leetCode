package my.dataStructrue;

/**
 * 通过 insert 方式  先生成堆
 */
public class HeapSort1 implements SortInterface{


    @Override
    public int[] sort(int[] arr) {
        MaxHeap maxHeap = new MaxHeap(arr.length);

        for (int i = 0; i < arr.length; i++) {
            maxHeap.insert(arr[i]);

        }

        for (int i = arr.length-1;i >=0; i--) {
            arr[i]  = maxHeap.extractMax();
        }

        return arr;

    }

    @Override
    public String name() {
        return "Heap Sort1 ";
    }
}
