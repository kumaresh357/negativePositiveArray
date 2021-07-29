package negativePositiveArray;

import java.util.Scanner;

public class NegativePositiveArray {
	
	public static void negPosArray(int arr[], int size) {
		int j=0;
        for (int i=0; i<size; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        System.out.println("rearranged array");
        for(int i=0; i<size; i++) {
        	System.out.print(arr[i] + " ");
        }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[] =new int[size];
		System.out.println("enter each element of array and press enter");
		for(int i=0; i<size; i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println("provided array");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		NegativePositiveArray.negPosArray(arr, size);
		sc.close();
	}
}
