#Description: Given an array prices where prices[i] is the price of a given stock on day i, find the maximum profit you can achieve. You may complete as many transactions as you like (buy one and sell one share of the stock multiple times). However, you must sell the stock before you buy again. 
#Input: [7, 1, 5, 3, 6, 4]
# Output: 7 
def max_profit(prices):

    profit = 0


    for i in range(1, len(prices)):

        if prices[i] > prices[i - 1]:
            profit += prices[i] - prices[i - 1]

    return profit


# Example 
prices = [7, 1, 5, 3, 6, 4]
print("The maximum profit is:", max_profit(prices))