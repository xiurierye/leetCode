package my.dataStructrue;

import my.dataStructrue.binarySearchTree.BinarySearchTree;

import static my.dataStructrue.SortInterface.print;

public class Main {

    public static final int N = 100000;

    public static void main(String[] args) {


//        int[] arr = SortInterface.generateRandomArray(N, 0, N );
//
//        print(arr);
        /*
        SortInterface insertionSort = new InsertionSort();
        insertionSort.testSort(SortInterface.copy(arr));

        SortInterface selectSorted = new SelectionSort();
        selectSorted.testSort(SortInterface.copy(arr));
        MergeSort mergeSort = new MergeSort();
        mergeSort.testSort(SortInterface.copy(arr),false);
        QuickSort quickSort = new QuickSort();
        quickSort.testSort(SortInterface.copy(arr),true);
        HeapSort1 heapSort1 = new HeapSort1();
        heapSort1.testSort(SortInterface.copy(arr));

        HeapSort2 heapSort2 = new HeapSort2();
        heapSort2.testSort(SortInterface.copy(arr));
*/


//        BinarySearchTree<Integer, Integer> bst = new BinarySearchTree<>();
//        for (int j : arr) {
//
//            bst.insert(j, j);
//        }
//
//
//        bst.midOrder((integer, integer2) -> System.out.print(integer+" "));
//
//        System.out.println();
//        for (int i : arr) {
//            bst.removeMinimum();
//            bst.midOrder((integer, integer2) -> System.out.print(integer+" "));
//            System.out.println();
//        }


//        bst.remove(arr[N/2]);
//
//        bst.midOrder((integer, integer2) -> System.out.print(integer+" "));



        UnionFindHelper.testUF1(N);





    }
}
