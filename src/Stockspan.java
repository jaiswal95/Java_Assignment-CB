/*
 Stock span.
 
   The stock span problem is a financial problem where we have a series of N daily price quotes for a stock and
    we need to calculate span of stock’s price for all N days. You are given an array of length N, where ith element of
     array denotes the price of a stock on ith. Find the span of stock's price on ith day, for every 1<=i<=N.
    A span of a stock's price on a given day, i, is the maximum number of consecutive days before the (i+1)th day, 
    for which stock's price on these days is less than or equal to that on the ith day.

        Input Format
          Enter the size of the array N and add N more numbers and store in the array.

            Constraints
              None

        Output Format
          Display the array containing stock span values.

            Sample Input
             5
             30
             35
             40
             38
             35
            Sample Output
             1 2 3 1 1 END
        Explanation
          For the given case  
            for day1 stock span =1
            for day2 stock span =2 (as 35>30 so both days are included in it)
            for day3 stock span =3 (as 40>35  so 2+1=3)
            for day4 stock span =1 (as 38<40 so only that day is included)
            for day5 stock span =1 (as 35<38 so only that day is included)
            hence output is 1 2 3 1 1 END
 */
import java.util.*;

public class Stockspan {

	public static void main(String args[]) throws Exception {
		// Your Code Here
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		Stockspan mainobj = new Stockspan();
		int[] prices = new int[N];
		for (int i = 0; i < N; i++) {
			prices[i] = s.nextInt();
		}
		StacksUsingArrays stack = mainobj.new StacksUsingArrays(prices.length);
		int[] ans = StockSpanUsingStacks(prices, stack);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println("END");

	}

	public static int[] StockSpanUsingStacks(int[] prices, StacksUsingArrays stack) throws Exception {

		int[] ans = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {

			while (!stack.isEmpty() && prices[i] > prices[stack.top()]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - stack.top();
			}

			stack.push(i);
		}

		return ans;

	}

	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {

			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}

}
