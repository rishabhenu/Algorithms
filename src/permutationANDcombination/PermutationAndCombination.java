package permutationANDcombination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationAndCombination {

	public static void main(String...strings){
		int[] array  = {1,2,3};
		for(int[] arr : generatePermuationAndCombination(array,2)){
			System.out.println(Arrays.toString(arr));
		}
	}

	private static List<int[]> generatePermuationAndCombination(int[] array, int i) {
		List<int[]> combinationsList = getCombinationsList(array, array.length, i);
		List<int[]> permutationsAndCombinationsList = new ArrayList<>();
		for(int[] arr : combinationsList){
			permutationsAndCombinationsList.addAll(getPermutationsList(arr,0));
		}
		return permutationsAndCombinationsList;
	}

	private static List<int[]> getPermutationsList(int[] arr, int i) {
		return P002Permutations.generatePermuatations(arr, i);
	}

	private static List<int[]> getCombinationsList(int[] array, int length, int i) {
		return P001Combinations.generateCombinations(array, length, i);
	}
	
}
