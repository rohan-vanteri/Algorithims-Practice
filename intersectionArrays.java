package Sorting;

public class intersectionArrays {

    public static void main(String[] args) {
        int[] a = {1,3,5,10,11};
        int[] b = {1,5,9,10};
        findIntersect(a,b);
        
    }

    public static void findIntersect(int[] a, int[] b){
        // only works if both arrays are sorted
        int i = 0;
        int j = 0;
        int pointer = 0;

        int[] result = new int[Math.max(a.length, b.length)];

        while(i < a.length && j<b.length){
            if(a[i] == b[j]){
                result[pointer] = a[i];
                pointer++;
                i++;
                j++;
            }  else if(a[i] < b[j]){
                    i++;
            } else{
                j++;
            }
        }

        int aux = 0;
        while (aux != pointer){
            System.out.println(result[aux]);
            aux++;
        }
    }
}

