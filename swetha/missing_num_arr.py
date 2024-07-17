def find_missing_number(arr):
    # since one number is missing
    n = len(arr) + 1  
    expected_sum = n * (n + 1) // 2
    actual_sum = sum(arr)
    missing_number = expected_sum - actual_sum
    return missing_number


arr = [3, 7, 1, 2, 8, 4, 5]
print(f"The missing number is: {find_missing_number(arr)}")
