def find_maximum(arr):
    max_value = arr[0]
    for num in arr[1:]:
        if num > max_value:
            max_value = num
    return max_value
array = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
print("The maximum element in the array is:", find_maximum(array))
