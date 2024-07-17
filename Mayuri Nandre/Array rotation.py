def rotate_array(nums, k):
    n = len(nums)
    k %= n 
    def reverse(nums, start, end):
        while start < end:
         nums[start], nums[end] = nums[end], nums[start]
        start += 1
        end -= 1
    reverse(nums, 0, n - 1)
    reverse(nums, 0, k - 1)
    reverse(nums, k, n - 1)
    return nums
array = [1, 2, 3, 4, 5, 6, 7]
k = 3
print(rotate_array(array, k))  # Output: [5, 6, 7, 1, 2, 3, 4]
