package my.dataStructrue;

import com.google.common.base.Stopwatch;
import my.leetcode.util.Utils;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public interface SortInterface {

    int[] sort(int[] arr);

    String name();

    default void testSort(int[] arr) {

        this.testSort(arr, false);
    }

    default void testSort(int[] arr, boolean isPrintSortedArray) {

        Stopwatch started = Stopwatch.createStarted();
        this.sort(arr);
        long elapsed = started.stop().elapsed(TimeUnit.MILLISECONDS);
        if (hasError(arr)) {
            throw new IllegalArgumentException("");
        }

        if (isPrintSortedArray) {
            print(arr);
        }

        System.out.println(String.format("[%s] %d elements elapsed %d ms", this.name(), arr.length, elapsed));
    }

    default boolean hasError(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println(String.format("第%d个元素错误",i));
                return true;
            }
        }
        return false;
    }

    static void swap(int index1, int index2, int[] arr) {
        int temp = arr[index1];

        arr[index1] = arr[index2];

        arr[index2] = temp;
    }

    /**
     * 生成n 个  [rangeL，rangeR] 范围内的 数组
     *
     * @param n
     * @param rangeL
     * @param rangR
     * @return
     */
    static int[] generateRandomArray(int n, int rangeL, int rangR) {

        assert rangeL < rangR;
        int[] integer = new int[n];
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 0; i < n; i++) {
            int i1 = secureRandom.nextInt(rangR - rangeL + 1) + rangeL;

            integer[i] = i1;
        }
        return integer;
    }

    static int[] generateNearlyOrderedArray(int n,int random) {
        int[] integer = new int[n];
        for (int i = 0; i < n; i++) {
            integer[i] = i;
        }
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < random; i++) {
            int l = secureRandom.nextInt(n);
            int r = secureRandom.nextInt(n);
            swap(l,r,integer);
        }
        return integer;
    }

    static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    static int[] copy(int[] arr) {

        return Arrays.copyOf(arr, arr.length);


    }

}
