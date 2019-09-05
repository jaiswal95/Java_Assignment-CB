/*
 Books Allocatiion process.
 
   You are given number of pages in n different books and m students. 
   The books are arranged in ascending order of number of pages. Every student is assigned to read some consecutive books.
    The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.

   Input Format
     First line contains integer t as number of test cases. Next t lines contains two lines.
      For each test case, 1st line contains two integers n and m which represents the number of books and students and 
      2nd line contains n space separated integers which represents the number of pages of n books in ascending order.

       Constraints
        1 < t < 50
        1< n < 100 
        1< m <= 50

   Output Format
      Print the maximum number of pages assigned to students. (see input and output format)

       Sample Input
        1
        4 2
       12 34 67 90
      Sample Output
       113 
 */
import java.util.Scanner;

public class Book_Allocationprocess {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t= scn.nextInt();
		while(t-->0) {
		int n = scn.nextInt(); // No. of books.
		long k = scn.nextInt(); // No. of students.

		long[] books = new long[n];
		for (int i = 0; i < n; i++) {
			books[i] = scn.nextLong();
		}
		System.out.println(binarysearch_books(books, n, k));
		}
	}

	public static long binarysearch_books(long[] books, int n, long k) {

		long total_pages = 0;
		long s = 0, e = 0;

		for (int i = 0; i < n; i++) {
			total_pages += books[i];
			s = Math.max(s, books[i]);
		}
		e = total_pages;
		long finalans = s;

		while (s <= e) {
			long mid = (s + e) / 2;
			if (isValid(books, n, k, mid)) {
				finalans = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return finalans;
	}

	public static boolean isValid(long[] books, int n, long k, long ans) {

		int student = 1;
		long current_pages = 0;

		for (int i = 0; i < n; i++) {
			if (current_pages + books[i] > ans) {
				current_pages = books[i];
				student++;
				if (student >k) {
					return false;
				}
			} else {
				current_pages += books[i];

			}
		}

		return true;
	}

}
