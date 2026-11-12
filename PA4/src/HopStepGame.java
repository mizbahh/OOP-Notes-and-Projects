/* Mizbah Ateeq
 * Dr. Steinberg
 * COP3503 Spring 2025
 * Programming Assignment 4
 */

public class HopStepGame 
{

	// top-down recursive approach
	public int minCost(int[] cost, int steps) 
	{
		// no cost if out of bounds
		if (steps < 0) 
			return 0;

		// if only one square to step on
		if (steps == 0) 
			return cost[0]; 

		// take either one step or hop, whichever is cheaper
		int step = cost[steps] + minCost(cost, steps - 1); // step to adjacent square
		int hop = cost[steps] + minCost(cost, steps - 2);  // hop over to next square

		// return lesser between steps & hops
		return Math.min(step, hop);
	}

	// top-down memoization approach
	public int minCostMemoization(int[] cost, int steps, int[] memo) 
	{
		// no cost if out of bounds
		if (steps < 0) 
			return 0; 

		// if only one square to step on 
		if (steps == 0)
			return cost[0]; 

		// if value already computed, return it
		if (memo[steps] != 0) 
			return memo[steps];

		// otherwise, compute cost and store it in memo
		int step = cost[steps] + minCostMemoization(cost, steps - 1, memo);
		int hop = cost[steps] + minCostMemoization(cost, steps - 2, memo);

		// store lesser of two as result in memoization array
		memo[steps] = Math.min(step, hop);

		return memo[steps];
	}

	// tabulation approach
	public int minCostTabulation(int[] cost) 
	{
		int steps = cost.length;

		// if only one square
		if (steps == 1) 
			return cost[0];

		// dynamic programming array to store min cost for each square
		int[] dp = new int[steps];
		dp[0] = cost[0]; // first square cost
		dp[1] = cost[1]; // second square cost if exists

		// calculate min cost to reach square
		for (int i = 2; i < steps; i++) 
			dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);

		// result is min cost to reach last or second-last square
		return Math.min(dp[steps - 1], dp[steps - 2]);
	}
}
