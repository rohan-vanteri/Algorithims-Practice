package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] sort = {3,2,1,6,5};
        System.out.println(Arrays.toString(BubbleSort(sort)));

    }
    public static int[] BubbleSort(int[] a){
        for (int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++){
                if (a[i] < a[j]){
                    int larger = a[i];
                    a[i] = a[j];
                    a[j] = larger;
                }
            }
        }
        return a;
    }

}
