import java.util.ArrayList;

public class Assignment2 {
	
	
	public static <E extends Comparable<E>> void insertionSort(ArrayList<E> array) {
		
		for(int i = 0; i < array.size(); i++) {
			int j = i;
			
			while(j>0 && array.get(j-1).compareTo(array.get(j)) > 0) {
				E temp = array.get(j);
				array.set(j, array.get(j-1));
				array.set(j-1, temp);
				
				j--;
			}
		}
		
	}
	
	public static <E> E mostFrequentElement(ArrayList<E> array) {
		
		int[] frequentNums = new int[array.size()];
		ArrayList<E> usedNums = new ArrayList<E>(array.size());
		
		
		for (int i = 0; i < array.size(); i++) {
			
			int counter = 1;
			
			for (int j = 0; j < array.size(); j++) {
				
				if(j > i && !usedNums.contains(array.get(i))) {
					if(array.get(j).equals(array.get(i)))
						counter++;
				}
				
			}
			
			usedNums.add(array.get(i));
			frequentNums[i] = counter;
		}
		
		int maxIndex = 0;
		int maxNum = 0;
		
		for(int l = 0; l < frequentNums.length; l++) {
			if(frequentNums[l] > maxNum) {
				maxNum = frequentNums[l];
				maxIndex = l;
				
			}
		}
		
		System.out.println("Number of times element appears: " + frequentNums[maxIndex]);
		
		return array.get(maxIndex);
	}
	
	
	public static <E extends Comparable<E>> ArrayList<E> longestIncrSubsequence(ArrayList<E> array) {
		ArrayList<E> sequence = new ArrayList<E>(array.size());
		
		E maxValue = null;
		
		sequence = findLongestIncreasingSubsequence(array, array.size()-1, maxValue);
		return sequence;
	}
	
	private static <E extends Comparable<E>> ArrayList<E> findLongestIncreasingSubsequence(ArrayList<E> array, int end, E maxValue) {
		ArrayList<E> seq1 = new ArrayList<E>(array.size());
		
		if(end < 0) {
			return seq1;
		}
		
		seq1 = (ArrayList<E>) array.clone();
		seq1.remove(end);
		seq1 = findLongestIncreasingSubsequence(seq1, seq1.size()-1, maxValue);
		
		if(maxValue != null && array.get(end).compareTo(maxValue) == 1 ) {
			return seq1;
		}
		
		ArrayList<E> seq2 = findLongestIncreasingSubsequence(array, end-1, array.get(end));
		
		if(seq1.size() > seq2.size()) {
			return seq1;
		}
		
		else
			return seq2;
		
		
		
	}
	

}
