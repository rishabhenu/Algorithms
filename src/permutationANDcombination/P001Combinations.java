package permutationANDcombination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P001Combinations {
	
	public static void main(String...strings){
		int[] array = {3,4,5,6,7,8};
		for(int[] arr : generateCombinations(array, array.length, 6)){
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static List<int[]> generateCombinations(int[] array, int n, int r){
		List<int[]> combinationsList = new ArrayList<int[]>();
		combinationHelper(array, combinationsList, new int[r], 0, n-1, 0);
		return combinationsList;
	}
	
	private static void combinationHelper(int[] inputArray, List<int[]> combinationsList, int[] data, int startIndex, int endIndex, int index){
		if(index == data.length){
			combinationsList.add(data.clone());
		}else if(startIndex <= endIndex){
			data[index] = inputArray[startIndex];
			combinationHelper(inputArray, combinationsList, data, startIndex+1, endIndex, index+1);
			combinationHelper(inputArray, combinationsList, data, startIndex+1, endIndex, index);
		}
	}

}
