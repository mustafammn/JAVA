package com.syntax.class15;

public class Task4 {

	public static void main(String[] args) {
		// 5. How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever

		String str = "This is sentence i want to reverse";
		String[] strArr = str.split(" ");

		for (String word : strArr) {
			StringBuilder stringBuilder = new StringBuilder(word);
			System.out.print(stringBuilder.reverse() + " ");
		}

	}

}
