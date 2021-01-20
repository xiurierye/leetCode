package my.dataStructrue;

/**
 * @author zhaoji004
 * @Time 1/19/21
 */
public class ShellSort  implements SortInterface{


    public  int[] sort(int[] arr) {

        for (int gap = arr.length / 3; gap > 0; gap = gap / 3) {

            for (int j = 0; j < arr.length; j += gap) {


                for (int i = j + gap; i < arr.length; i += gap) {

                    for (int k = j; k < arr.length; k+=gap) {

                        int temp = arr[k];
                        int l = k ;
                        for (; l >0 && l<arr.length &&  arr[l-gap]>temp ; l-=gap) {
                            arr[l] = arr[l-gap];
                        }

                        arr[l] = temp;


                    }

                }


            }


        }

        return arr;

    }

    @Override
    public String name() {
        return "Shell Sort";
    }

}
