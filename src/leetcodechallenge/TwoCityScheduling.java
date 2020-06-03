package leetcodechallenge;

import java.util.Arrays;

public class TwoCityScheduling {
	public static int twoCitySchedCost(int[][] costs) {
		Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));
		int totalSum = 0;
		for (int i = 0; i < costs.length; i++) {
			if (i < costs.length / 2)
				totalSum += costs[i][0];
			else
				totalSum += costs[i][1];
		}
		return totalSum;
	}

	public static void main(String[] args) {
		int[][] a = { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } };
		System.out.println(twoCitySchedCost(a));
	}

}
