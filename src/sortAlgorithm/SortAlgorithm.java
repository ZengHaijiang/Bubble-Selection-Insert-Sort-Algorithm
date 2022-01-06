package sortAlgorithm;

import java.util.Arrays;

public class SortAlgorithm {
	/*bubble sort*/
	public static int[] bubbleSort(int[] arr1) {
		int temp;
		/*I do not want to change the original arr, so we copy it and make changes on the copy*/
		int[]arr=new int[arr1.length];
		for(int c=0;c<arr1.length;c++) {
			arr[c]=arr1[c];
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static int[] selectionSort(int[] arr1) {
		int temp;
		int min;
		int[]arr=new int[arr1.length];
		for(int c=0;c<arr1.length;c++) {
			arr[c]=arr1[c];
		}
		for(int i=0; i<arr.length-1;i++) {
			temp=arr[i];
			min=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			arr[i]=arr[min];
			arr[min]=temp;
		}
		return arr;
	}
	public static int[] insertSort(int[] arr1) {
		int temp;
		int[]arr=new int[arr1.length];
		for(int c=0;c<arr1.length;c++) {
			arr[c]=arr1[c];
		}
		for(int i=1; i<arr.length-1;i++) {
			for(int j=i+1; j>=1; j--) {
				temp=arr[j];
				if(arr[j]>temp) {
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr=new int[] {6,9,1,3,4,5,8,2,7,7};
		System.out.println(Arrays.toString(bubbleSort(arr)));
		System.out.println(Arrays.toString(selectionSort(arr)));
		System.out.println(Arrays.toString(selectionSort(insertSort(arr))));
		System.out.println(Arrays.toString(arr));
	}
}
