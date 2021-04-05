package session1;

import java.util.Arrays;

public class JavaEasyQuestions {

	
	/**
	 * Create a method that takes 2 integers and returns the sum
	 */
	
	public static int addTwoNumbers(int num1, int num2) {
		return num1+num2;
	}
	
	/**
	 * Create a method that takes an int array and prints each
	 * element line by line
	 */
	
	public static void printArrayLineByLine(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println( numbers[i] );
		}
	}
	
	
	/**
	 * Create a method that takes an int array 
	 * and returns the sum of this array
	 */
	public static int getArraySum(int[] numbers) {
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		
		return sum;
	}
	
	//get the sum of even elements in the array
	public static int getArrayEvenSum(int[] numbers) {
		
		int sumEven = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if ( numbers[i] % 2 == 0  ) {
				sumEven += numbers[i];
			}
		}
		return sumEven;
	}
	
	//Create a method that takes a String array
	//and returns items that starts with 'a' as an array
	// [abc, dhks,apl,dfjl,dfd,aop]
	
	public static String[] itemsStartingWithA (String[] items) {
		
//		int count = 0;
//		for (int i = 0; i < items.length; i++) {
//			if (items[i].startsWith("a")) {
//				count++;
//			}
//		}
//		String[] newArr = new String[count];		
//		
//		for (int i = 0, j = 0; i < items.length; i++) {
//			if (items[i].startsWith("a")) {
//				newArr[j] = items[i];
//				j++;
//			}
//		}
//		return newArr;
//		String tempItems = "";
//		for (int i = 0; i < items.length; i++) {
//			if (items[i].startsWith("a")) {
//				tempItems = tempItems + items[i] + " ";
//			}
//		}
//		return tempItems.trim().split("-");
		
		return Arrays.stream(items).filter(i -> i.startsWith("a")).toArray(String[]::new);
	}
	
	
	
	
	
	
}
