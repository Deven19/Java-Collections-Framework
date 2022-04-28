package DS.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        InsertionSort is = new InsertionSort();
        int[] ar1 = {3,5,2,0,44,4,6,7,7};
        is.sort(ar1);
        System.out.println(Arrays.toString(ar1));
    }

    public void sort(int[] array){
        for(int i = 1; i< array.length; i++){
            int current  = array[i];
            int j = i-1;
            while(j>=0 && array[j]>current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
}
