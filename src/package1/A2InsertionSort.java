package package1;

import java.util.Arrays;

public class A2InsertionSort {

	private static int count;

	public static void main(String...strings) {
		int[] input = new int[] {5,1,12,-5,16};
		input = insertionSort(input, 0, input.length);
		System.out.println(Arrays.toString(input));
		System.out.println("count is "+count);
	}

	private static int[] insertionSort(int[] input, int fromIndex, int toIndex) {
		for(int i=fromIndex+1; i<toIndex; i++) {
			int temp = input[i],j=i;
			while(j > fromIndex && input[j-1]>temp) {
				count++;
				input[j] = input[j-1];
				j--;
			}
			input[j] = temp;
		}
		return input;
	}
	
}
