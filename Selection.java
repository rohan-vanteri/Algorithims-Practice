package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] sort = {3,2,1,6,5};
        System.out.println(Arrays.toString(sort(sort)));
    }
    public static int[] sort(int[] a){
        for (int i = 0; i < a.length; i++){
            int minValue = a[i];
            int minindex = i;
            for (int j = i+1; j < a.length; j++){
                if (a[j] < minValue){
                    minValue = a[j];
                    minindex = j;
                }
            }

            int initial = a[i];
            a[i] = minValue;
            a[minindex] = initial;
        }
        return a;
    }
}
