package permutationANDcombination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P002Permutations {
	
	public static void main(String...strings){
		int[] array = {1,2,3,4,5};
		for(int[] arr : generatePermuatations(array,0)){
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static List<int[]> generatePermuatations(int[] inputArray, int index){
		List<int[]> permutationList = new ArrayList<>();
		permutationHelper(inputArray, permutationList, index);
		return permutationList;
	}
	
	private static void permutationHelper(int[] inputArray, List<int[]> permutationList, int index){
		if(index == inputArray.length){
			permutationList.add(inputArray.clone());
//			return;
		}else{
			for(int i=index; i<inputArray.length; i++){
				inputArray = swap(inputArray, i, index);
				permutationHelper(inputArray, permutationList, index+1);
				inputArray = swap(inputArray, i, index);
			}
		}
	}
	
	private static int[] swap(int[] inputArray, int index1, int index2){
		int temp = inputArray[index1];
		inputArray[index1] = inputArray[index2];
		inputArray[index2] = temp;
		return inputArray;
	}

}
