/*

	Author
	Date created
	Date last modified
	File name - Arrays, split, swapping
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void stringSwap(String[] arr, int num1, int num2) {
		
		String temp;
		temp = arr[num1];
		
		arr[num1] = arr[num2];
		arr[num2] = temp;

	}

	public static void reverse(int[] arr) {
		
		int[] temp = new int[arr.length];
		int count = arr.length - 1;
		
		for (int i = 0; i < arr.length; i++) {
			
			temp[i] = arr[count];
			count--;
		}
		
		for (int i2 = 0; i2 < arr.length; i2++) {
			 arr[i2] = temp[i2]; 
		}
	}

	public static String[] toWordArray(String word) {
		
		String[] arr = word.split(" ");
		int count = 0;
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals("")) {
				count++;
			}
		}
		
		String[] arr2 = new String[count];
		
		for (int i2 = 0; i2 < arr.length; i2++) {
			
			if (!arr[i2].equals("")) {
				
				arr2[index] = arr[i2];
				index++;
			}
		}
		
		return arr2;
		
		}
	}
