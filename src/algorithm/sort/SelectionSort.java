package algorithm.sort;

import java.util.ArrayList;

public class SelectionSort {
    public static void main(String[] args) {
        Integer[] oneList = {21,1,5,7,22,42,12,31,100,3,9,76};
        selectionSort(oneList);
        for (Integer integer : oneList) {
            System.out.println(integer);
        }
    }

    public static void selectionSort(Comparable[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }
            swap(arr,minIndex,i);
        }
    }
    private static void swap(Object[] arr,int minIndex , int i){
        Object temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
