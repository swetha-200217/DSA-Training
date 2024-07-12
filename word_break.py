def word_break(s, word_dict):
    word_set = set(word_dict)
    dp = [False] * (len(s) + 1)
    # An empty string can always be segmented
    dp[0] = True

    for i in range(1, len(s) + 1):
        for j in range(i):
            if dp[j] and s[j:i] in word_set:
                dp[i] = True
                break
    
    return dp[-1]

s = "leetcode"
word_dict = ["leet", "code"]
print(word_break(s, word_dict))
