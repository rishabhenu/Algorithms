package package1;

import java.util.Arrays;

public class A3MergeSort {

	private static int count;
	public static void main(String...strings) {
		int[] input = new int[] {5,1,12,-5,16};
		mergeSort(input);
		System.out.println(Arrays.toString(input));
		System.out.println("count is "+count);
	}
	
	private static int[] mergeSort(int[] input) {
		count++;
		if(input.length <= 1)return input;
		int first[] = new int[(input.length)/2];
		int second[] = new int[input.length - first.length];
		System.arraycopy(input, 0, first, 0, first.length);
		System.arraycopy(input, first.length, second, 0, second.length);
		first = mergeSort(first);
		second = mergeSort(second);
		input = merge(first, second, input);
		return input;
	}
	
	/**
	 * This method is to merge first array and second array into third array in sorted form i.e. increasing order
	 * @param first-this is the first array
	 * @param second-this is the second array
	 * @param input-this is the final array in which first and second array would be copied and send back as result
	 * @return it returns sorted array which is formed by merging first and second array
	 */
	private static int[] merge(int[] first, int[] second, int[] input) {
		int firstIndex=0,secondIndex=0,mergedIndex=0;
		while(firstIndex < first.length && secondIndex < second.length) {
			if(first[firstIndex] < second[secondIndex]) {
				input[mergedIndex] = first[firstIndex];
				firstIndex++;
			}else {
				input[mergedIndex] = second[secondIndex];
				secondIndex++;
			}
			mergedIndex++;
		}
		System.arraycopy(first, firstIndex, input, mergedIndex, first.length-firstIndex);
		System.arraycopy(second, secondIndex, input, mergedIndex, second.length-secondIndex);
		return input;
	}
}
