package com.mycompany.test;

public class Main {

	public static void main(String[] args) {
//		Theatre theatre = new Theatre("Atrium", 5, 12);
		int[] myarray = { 2, 3, 6, 8, 10, 1, 4, 5, 7, 9 };
		int n=9;
		
		int []a=new int[n];
		numbers(myarray);
	}

	public static void numbers(int[] myarray) {
		// 1,3,5,7,9,2,4,6,8,10
		int[] newarray = new int[myarray.length];
		int index = 0;
		for (int i = 0; i < myarray.length; i++) {
			if (myarray[i] % 2 != 0) {
				newarray[index] = myarray[i];
				index++;
			}
		}
		for (int i = 0; i < myarray.length; i++) {
			if (myarray[i] % 2 == 0) {
				newarray[index] = myarray[i];
				index++;
			}
		}

		for (int i = 0; i < newarray.length; i++) {
			System.out.println(newarray[i]);
		}

	}

}
