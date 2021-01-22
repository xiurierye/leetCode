package my.dataStructrue;

import static my.dataStructrue.SortInterface.print;

public class Main {

    public static final int N = 10;

    public static void main(String[] args) {


        int[] arr = SortInterface.generateRandomArray(N, 0, N*10);

        print(arr);

//        SortInterface insertionSort = new InsertionSort();
//        insertionSort.testSort(SortInterface.copy(arr));
//
//        SortInterface selectSorted = new SelectionSort();
//        selectSorted.testSort(SortInterface.copy(arr));


//        MergeSort mergeSort = new MergeSort();
//        mergeSort.testSort(SortInterface.copy(arr),false);


//        QuickSort quickSort = new QuickSort();
//        quickSort.testSort(SortInterface.copy(arr),true);


        MaxHeap maxHeap = new MaxHeap(N);

        for (int i = 0; i < arr.length; i++) {
            maxHeap.insert(arr[i]);
        }

        maxHeap.treePrint();

        for (int i = 0; i < N; i++) {
            System.out.print(maxHeap.extractMax()+" ");
        }

    }
}
