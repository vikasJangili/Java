package com.mycompany.test;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arrayoperations {
	static int i = 9;

	public static void main(String[] args) {
		StringTokens();
//		stringOperations();
//		System.out.println(subStringOperations("welcometojava", 3));
//		System.out.println(twoSum(new int[] { 3, 3 }, 6));

//			System.out.println(power(3, 5));
//			encrypt();
//		arrayOperations();
//		linkedListOperations();
//		arrayListOperations();
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

	public static void arrayOperations() {
		int[] array = new int[10000];
		for (int i = 0; i < 10000; i++) {
			array[i] = i;
		}
		long starttime = System.nanoTime();
		System.out.println("array  elements are ");
		long endtime = System.nanoTime();
		System.out.println(endtime - starttime);

	}

	public static void linkedListOperations() {
		LinkedList<Object> list = new LinkedList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		long starttime = System.nanoTime();
		System.out.println("linked list elements are " + list.get(2));
		long endtime = System.nanoTime();
		System.out.println(+endtime - starttime);
		list.add(null);
		System.out.println(list);

	}

	public static void arrayListOperations() {
		int count = 1000;
		ArrayList<Object> arraylist = new ArrayList(count);
		long starttime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			arraylist.add(i);
		}
		long endtime = System.nanoTime();
		System.out.println(endtime - starttime);
		System.out.println("Arraylist" + arraylist.size());
	}

	public void wierd() {
		System.out.println("please enter a number ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N % 2 == 0 && (N >= 2 && N <= 5)) {
			System.out.println("Not Weird");
		} else if (N % 2 == 0 && (N >= 6 && N <= 20)) {
			System.out.println("Weird");
		} else if (N % 2 == 0 && N > 20) {
			System.out.println("Not Weird");
		} else if (N % 2 != 0) {
			System.out.println("Weird");
		}
	}

	public void table() {
		System.out.println("please enter a number ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.println(N + "*" + i + "=" + N * i);
		}
	}

	public void shaAlgorithm() throws NoSuchAlgorithmException {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string");
		String mystring = sc.next();
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] messageDigest = md.digest(mystring.getBytes(StandardCharsets.UTF_8));
		BigInteger no = new BigInteger(1, messageDigest);
		StringBuilder hexString = new StringBuilder(no.toString(16));
		while (hexString.length() < 64) {
			hexString.insert(0, '0');
		}
		System.out.println(hexString.toString());
	}

	public void arrayList() {
		System.out.println("enter a number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter arraylist ");
		ArrayList<Integer> mylist = new ArrayList<>();
		while (sc.hasNextInt()) {
			int i = sc.nextInt();
			mylist.add(i);
		}

	}

	public static void sum() {
		int n;
		System.out.println("enter the array size");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] elements = new int[n];
		System.out.println("enter array elements");
		for (int i = 0; i < n; i++) {
			elements[i] = sc.nextInt();
			System.out.println("array is " + elements[i]);

		}
		int sum;
		System.out.println("enter sum ");
		sum = sc.nextInt();
		for (int j = 0; j < elements.length; j++) {
			int one = elements[j];
			for (int k = 0; k < elements.length; k++) {
				int two = elements[k];
				if (one + two == sum) {
					System.out.println("the sum is " + sum);
				}

			}
		}

	}

	public static void regularExpressions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
		String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
		String ipAddress = sc.next();
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(ipAddress);
		if (ipAddress.matches(regex)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.println("string is" + m.matches());

	}

	public static void StringTokens() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = scan.nextLine();
		
		String[] stringarray = s.split("[, . ' ? !]+");
		for (int i = 0; i < stringarray.length; i++) {
			
			System.out.println(stringarray[i]);
		}
		System.out.println(stringarray.length);

		scan.close();
	}

}
