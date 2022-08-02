package Sorting;

import java.util.*;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void Sort(int[] arr) {

		for (int trun = 1; trun < arr.length; trun++) {
			for (int i = 0; i < arr.length - trun; i++) {
				if (arr[i] > arr[i + 1]) {
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}

			}
		}
	}
	}


