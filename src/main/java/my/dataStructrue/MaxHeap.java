package my.dataStructrue;

import java.util.Optional;

import static my.dataStructrue.SortInterface.swap;

/**
 *
 */
public class MaxHeap {

    private final int[] arr;
    private int count;
    private int capacity;

    public MaxHeap(int capacity) {
        this.arr = new int[capacity + 1];
        count = 0;
        this.capacity = capacity;
    }


    public void insert(int n) {
        if (count >= capacity) {
            return;
        }

        arr[count + 1] = n;
        count++;

        this.shiftUp(count);
    }

    public int extractMax() {
        assert count > 0;
        int i = arr[1];
        arr[1] = arr[count];

        count--;
        shiftDown(1);
        return i;
    }

    private void shiftDown(int k) {

        while ( k*2 <=count){

           int j = 2*k;

           if (j+1<=count && arr[j]<arr[j+1]){
               j=j+1;
           }

           swap(j,k,arr);

           k=j;

        }


    }


    private void shiftUp(int i) {

        while (i >= 1 && arr[i / 2] < arr[i]) {
            swap(i / 2, i, arr);
            i /= 2;

        }


    }


    public void print() {
        for (int i = 1; i <= count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return 0 == count;
    }


    public void treePrint() {

        if (size() >= 100) {
            System.out.println("This print function can only work for less than 100 integer");
            return;
        }

        System.out.println("The max heap size is: " + size());
        System.out.println("Data in the max heap: ");
        for (int i = 1; i <= size(); i++) {
            // 我们的print函数要求堆中的所有整数在[0, 100)的范围内
            assert arr[i] >= 0 && (Integer) arr[i] < 100;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();

        int n = size();
        int maxLevel = 0;
        int numberPerLevel = 1;
        while (n > 0) {
            maxLevel += 1;
            n -= numberPerLevel;
            numberPerLevel *= 2;
        }

        int maxLevelNumber = (int) Math.pow(2, maxLevel - 1);
        int curTreeMaxLevelNumber = maxLevelNumber;
        int index = 1;
        for (int level = 0; level < maxLevel; level++) {

            String line1 = new String(new char[maxLevelNumber * 3 - 1]).replace('\0', ' ');

            int curLevelNumber = Math.min(count - (int) Math.pow(2, level) + 1, (int) Math.pow(2, level));
            boolean isLeft = true;
            for (int indexCurLevel = 0; indexCurLevel < curLevelNumber; index++, indexCurLevel++) {
                line1 = putNumberInLine(arr[index], line1, indexCurLevel, curTreeMaxLevelNumber * 3 - 1,
                        isLeft);
                isLeft = !isLeft;
            }
            System.out.println(line1);

            if (level == maxLevel - 1)
                break;

            String line2 = new String(new char[maxLevelNumber * 3 - 1]).replace('\0', ' ');
            for (int indexCurLevel = 0; indexCurLevel < curLevelNumber; indexCurLevel++)
                line2 = putBranchInLine(line2, indexCurLevel, curTreeMaxLevelNumber * 3 - 1);
            System.out.println(line2);

            curTreeMaxLevelNumber /= 2;
        }
    }


    private String putNumberInLine(Integer num, String line, int indexCurLevel, int curTreeWidth, boolean isLeft) {

        int subTreeWidth = (curTreeWidth - 1) / 2;
        int offset = indexCurLevel * (curTreeWidth + 1) + subTreeWidth;
        assert offset + 1 < line.length();
        if (num >= 10)
            line = line.substring(0, offset + 0) + num.toString()
                    + line.substring(offset + 2);
        else {
            if (isLeft)
                line = line.substring(0, offset + 0) + num.toString()
                        + line.substring(offset + 1);
            else
                line = line.substring(0, offset + 1) + num.toString()
                        + line.substring(offset + 2);
        }
        return line;
    }

    private String putBranchInLine(String line, int indexCurLevel, int curTreeWidth) {

        int subTreeWidth = (curTreeWidth - 1) / 2;
        int subSubTreeWidth = (subTreeWidth - 1) / 2;
        int offsetLeft = indexCurLevel * (curTreeWidth + 1) + subSubTreeWidth;
        assert offsetLeft + 1 < line.length();
        int offsetRight = indexCurLevel * (curTreeWidth + 1) + subTreeWidth + 1 + subSubTreeWidth;
        assert offsetRight < line.length();

        line = line.substring(0, offsetLeft + 1) + "/" + line.substring(offsetLeft + 2);
        line = line.substring(0, offsetRight) + "\\" + line.substring(offsetRight + 1);

        return line;
    }
}
