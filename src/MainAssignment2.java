import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainAssignment2 {
	
	public static void testInsertionSort() {
		Random rand = new Random();
		
		ArrayList<Integer> randomNums = new ArrayList<Integer>(20);
		
		for(int i = 0; i < 20; i++) {
			randomNums.add(rand.nextInt(101));
		}
		
		System.out.println(randomNums);
		
		Assignment2.insertionSort(randomNums);
		System.out.println(randomNums);
	}
	
	public static void testMostFrequentElement() {
		Random rand = new Random();
		
		ArrayList<Integer> randomNums = new ArrayList<Integer>(40);
		
		for(int i = 0; i < 40; i++) {
			randomNums.add(rand.nextInt(11));
		}
		
		// ArrayList<Integer> randomNums = new ArrayList<Integer>(Arrays.asList(1,1,1,3,4,5,4,4,1,4,1));
		
		System.out.println(randomNums);

		System.out.println("Most frequent element: " + Assignment2.mostFrequentElement(randomNums));
	}
	
	public static void testLongestIncrSubsequence() {
		Random rand = new Random();
		
		ArrayList<Integer> randomNums = new ArrayList<Integer>(40);
		
		for(int i = 0; i < 40; i++) {
			randomNums.add(rand.nextInt(11));
		}
		
		System.out.println(randomNums);
		
		ArrayList<Integer> result = Assignment2.longestIncrSubsequence(randomNums);
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testInsertionSort();
		testMostFrequentElement();
		testLongestIncrSubsequence();

	}

}
