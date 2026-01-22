package Sorting;

import java.util.Arrays;

public class Quick {

    public static void main(String[] args) {
        int[] array = {4, 2, 1, 7, 8, 3, 5, 6};
        System.out.println(Arrays.toString(sort(array)));
    }

    private static void helper(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }

        int smaller = start;
        for (int j = start + 1; j < end; j++){
            if (a[j] < a[start]){
                int temp = a[smaller];
                a[smaller] = a[j];
                a[j] = temp;
                smaller++;
            }
        }


        int temp = a[smaller];
        a[smaller] = a[start];
        a[start] = temp;

        helper(a, start, smaller - 1);
        helper(a, smaller + 1, end);

        System.out.println(Arrays.toString(a));
    }

    public static int[] sort(int[] a) {
        helper(a, 0, a.length - 1);

        return a;
    }


}
