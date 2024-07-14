#Description: You are given coins of different denominations and a total amount of money. Write a function to compute the minimum number of coins needed to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1. 
def coin_change(coins, amount):

    dp = [float('inf')] * (amount + 1)
    dp[0] = 0


    for coin in coins:

        for x in range(coin, amount + 1):
            dp[x] = min(dp[x], dp[x - coin] + 1)


    return dp[amount] if dp[amount] != float('inf') else -1


# Example
coins = [1, 2, 5]
amount = 11
print("The minimum number of coins needed is:", coin_change(coins, amount))

