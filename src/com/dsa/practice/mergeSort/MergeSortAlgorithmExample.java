package com.dsa.practice.mergeSort;

public class MergeSortAlgorithmExample {

	private static void merge(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		int n1 = mid-l+1;
		int n2=r-mid;
			
	int lrr[]	= new int[n1];
	int rrr[]	= new int[n2];
	
	for(int x=0;x<n1;x++) {
		lrr[x] = arr[l+x];
	}
	for(int x=0;x<n2;x++) {
		rrr[x] = arr[mid+1+x];	
	}
	
	int i=0;
	int j=0;
	int k=l;
	while(i<n1&& j<n2) {
		if(lrr[i]<= rrr[j]) {
			arr[k] = lrr[i];
			i++;
		}else {
			arr[k]=rrr[j];
			j++;
		}
		k++;
	}
	while(i<n1) {
		arr[k]=lrr[i];
		i++;
		k++;
	}
	while(j<n2) {
		arr[k]=rrr[j];
		j++;
		k++;
	}
	
	}
	
	
	private static void mergeSort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
	
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			System.out.println("l is: "+l+" Right : "+mid);
			mergeSort(arr, mid+1, r);
			System.out.println("l is: "+(mid+1)+" Right : "+r);
			
			merge(arr,l,mid,r);
		}
		
	}
	
	



	public static void main(String[] args) {
		int[] arr = {1,5,6,2,7,9,10,11,17,15};
		System.out.println("Before sorting");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		mergeSort(arr,0,arr.length-1);
		
		
		
		System.out.println("After sorting");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}


}
