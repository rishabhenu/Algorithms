package package1;

import java.util.Arrays;

public class A1BubbleSort {

	private static int count;
	public static void main(String...strings) {
		int input[] = new int[] {5,1,12,-5,16};
		input = bubbleSort(input);
		System.out.println(Arrays.toString(input));
		System.out.println("count is "+count);
	}
	
	private static int[] bubbleSort(int[] input) {
		for(int i=0; i<input.length; i++) {
			for(int j=i+1;j<input.length;j++) {
				count++;
				if(input[i]>input[j]) {
					input = swap(input,i,j);
				}
			}
		}
		return input;
	}
	
	private static int[] swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		return array;
	}
}
