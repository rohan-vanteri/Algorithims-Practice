package Sorting;

public class Merge {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3};
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] a, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end)/2;
        sort(a, start, mid );
        sort(a, mid + 1, end);
        int i = start;
        int j = mid + 1;
        int[] aux = new int[end - start + 1];
        int apointer = 0;

        while (i <= mid && j <= end) {
            if (a[i] <= a[j]) {
                aux[apointer] = a[i];
                i++;
            } else if (a[i] >= a[j]){
                aux[apointer] = a[j];
                j++;
            }
            apointer++;
        }

        while (i <= mid) {
            aux[apointer] = a[i];
            i++;
            apointer++;
        }

        while (j <= end) {
            aux[apointer] = a[i];
            j++;
            apointer++;
        }

        int point = start;
        for (int element : aux) {
            a[point] = element;
            point++;
        }


    }

}
