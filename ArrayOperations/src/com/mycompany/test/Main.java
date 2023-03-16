package com.mycompany.test;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
		
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


