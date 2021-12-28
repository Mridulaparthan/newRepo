package com.stackroute;

import java.util.Scanner;

public class LargestDifference {

	// Do not print anything other than what's expected/asked in problem
	public static void main(String[] args) {
		// Use Scanner to get input from console
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		if (count <= 0) {
			return;
		}
		int[] input = new int[count];

		for (int i = 0; i < count; i++) {
			input[i] = Integer.parseInt(sc.next());
		}

		findLargestDifference(input);

	}

	public static int findLargestDifference(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return -1;
		}
		int max = 0, largeIndex = 0, temp = 0, index = 0, d = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			if (Math.abs(numbers[i] - numbers[i + 1]) > d) {
				d = Math.abs(numbers[i] - numbers[i + 1]);
				temp = Math.max(Math.abs(numbers[i]), Math.abs(numbers[i + 1]));

				if (temp == numbers[i]) {
					largeIndex = i;
				} else {
					largeIndex = i + 1;
				}

				if (max < Math.max(Math.abs(numbers[i]), Math.abs(numbers[i + 1]))) {
					max = temp;
					index = max;
				}
				max = temp;
				index = largeIndex;
			}
		}
		System.out.println(index);
		return index;
	}

}
