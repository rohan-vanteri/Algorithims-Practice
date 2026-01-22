package Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] a = {2,5,3,1};
        System.out.println(Arrays.toString(sort(a)));
    }

    public static int[] sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int temp=a[i];
            int red = i - 1;
            while( red>=0 && a[red] > temp){
                a[red + 1]=a[red];
                red--;
            }
            a[red+1]=temp;
        }
        return a;

    }
}
