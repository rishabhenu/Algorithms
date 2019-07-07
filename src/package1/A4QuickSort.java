package package1;

import java.util.Arrays;

public class A4QuickSort {
	
	private static int count;
	
	public static void main(String args[]) {
		int[] input = new int[] {5,1,12,-5,16};
		input = quickSort(input, 0, input.length-1);
		System.out.println(Arrays.toString(input));
		System.out.println("count is "+count);
		count = 0;
		input = new int[]{2, 3, 1, 5};
		input = quickSort(input, 0, input.length-1);
		System.out.println(Arrays.toString(input));
		input = new int[]{1, 2, 3, 4};
		input = quickSort(input, 0, input.length-1);
		System.out.println(Arrays.toString(input));
	}
	
	private static int[] quickSort(int[] input, int startIndex, int endIndex) {
		if(input == null || input.length == 0 || startIndex >= endIndex)return input;
		int low = startIndex, high = endIndex;
		while(low<high) {
			count++;
			int middle = (low+high)/2, middleElement = input[middle];
			while(input[low]<middleElement) {
				low++;
			}
			while(input[high]>middleElement) {
				high--;
			}
			if(low <= high) {
				input = swap(input, low, high);
				low++;
				high--;
			}
			if(startIndex < high) {
				input = quickSort(input, startIndex, high);
			}
			if(endIndex > low) {
				input = quickSort(input, low, endIndex);
			}
		}
		return input;
	}
	private static int[] swap(int[] input, int index1, int index2) {
		int temp = input[index1];
		input[index1] = input[index2];
		input[index2] = temp;
		return input;
	}
}
