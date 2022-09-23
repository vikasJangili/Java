package com.mycompany.test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.TreeSet;

public class Arrayoperations {
	public static void main(String[] args) {
//		stringOperations();
//		System.out.println(subStringOperations("welcometojava", 3));
		System.out.println(twoSum(new int[] { 3, 3 }, 6));
		try {
//			System.out.println(power(3, 5));
//			encrypt();
		} catch (Exception e) {

			// TODO Auto-generated catch block
			System.out.println(e);
		}
//	        Scanner scan = new Scanner(System.in);
//	        System.out.println("please enter a number");
//	        int n = scan.nextInt();
//	        int []a=new int[n];
//	        System.out.println("array length is "+a.length);
////	        scan.close();
//
//	        // Prints each sequential element in array a
//	        for (int i = 0; i < a.length; i++) {
//	        	int n1 = scan.nextInt();
//	        	a[i]=n1;
//	           
//	        }
//	        for (int i = 0; i < a.length; i++) {
//	            System.out.println(a[i]);
//	        }
	}

	public static void stringOperations() {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		int lengtha = A.length();
		int lengthb = B.length();

		int totalLength = lengtha + lengthb;
		System.out.println("total length of a String is " + totalLength);
		int value = A.compareTo(B);
		System.out.println(value);
		if (value >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		String FirstLetter = A.substring(0, 1).toUpperCase() + A.substring(1);
		String SecondLetter = B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(FirstLetter);
		System.out.println(SecondLetter);

	}

	public static String subStringOperations(String s, int k) {

		String smallest = "";
		String largest = "";
		try {
			String[] newstring = new String[s.length()];
			TreeSet<String> sortedset = new TreeSet();
			smallest = s.substring(0, k);
			for (int i = 0; i < s.length(); i++) {
				if (i > s.length() - k) {
					break;
				}
				sortedset.add(s.substring(i, i + k));
			}
			smallest = sortedset.first();
			largest = sortedset.last();
			System.out.println(sortedset);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return smallest + "\n" + largest;
	}
//leetcode two sum array 
	public static int[] twoSum(int[] nums, int target) {
		int one = 0;
		int two = 0;
		int[] outarr = new int[2];

		int i, j;
		for (i = 0; i < nums.length; i++) {
			one = nums[i];
			for (j = i + 1; j < nums.length; j++) {
				two = nums[j];
				if (one + two == target) {
					int k = 0, l = 0;

					if (one == two) {
						int p = 0;
						while (k < nums.length) {
							if (nums[k] == one) {

								outarr[p] = k;
								p++;
							}
							k += 1;
						}
					} else {
						while (k < nums.length) {
							if (nums[k] == one) {
								outarr[0] = k;

								break;
							} else {
								k += 1;
							}
						}
						while (l < nums.length) {
							if (nums[l] == two) {
								outarr[1] = l;

								break;
							} else {
								l += 1;
							}
						}
					}
				}
			}
		}
		return outarr;
	}

	public static long power(int n, int p) throws Exception {
		long value = 0;
		if (n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		} else if (n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		}
		value = (long) Math.pow(n, p);
		return value;
	}

	public static void encrypt() throws NoSuchAlgorithmException {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string");
		String mystring = sc.next();
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] messageDigest = md.digest(mystring.getBytes());
		BigInteger no = new BigInteger(1, messageDigest);
		String hashtext = no.toString(16);
		while (hashtext.length() < 32) {
			hashtext = "0" + hashtext;
		}
		System.out.println(hashtext);
	}

}
