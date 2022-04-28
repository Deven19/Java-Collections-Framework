package DS.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] ar1 = {4,2,7,99,5,0,3,4,56,3};
        int n = ar1.length;
        QuickSort qs = new QuickSort();
        qs.sort(ar1,0, n-1);
        System.out.print(Arrays.toString(ar1));
    }

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for(int j=low; j<=high; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }
    void sort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}
