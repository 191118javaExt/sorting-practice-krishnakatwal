package com.revature.sort;

public class MergeSort {

	public static void sort(int[] arr) {
		int mid = arr.length / 2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];

		if (arr.length < 2) {
			return;

		}
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];

		}
		for (int j = mid; j < arr.length - 1; j++) {
			right[j] = arr[j];

		}
		sort(left);
		sort(right);

		//merge(arr, left, right);

	}

	private static void merge(int[] arr, int[] left, int[] right) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		while (x < right.length && y < left.length) {
			if (left[y] < right[x]) {
				arr[y + x] = left[y];
				y++;

			} else {
				arr[y + x] = right[x];
				x++;
			}

		}
		for (; y < left.length; y++) {
			arr[y + x] = left[y];
		}
		for (; x < right.length; x++) {
			arr[y + x] = right[x];
		}
	}

}
