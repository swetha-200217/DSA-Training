#Description: To find the maximum element in an array, we can traverse the array while keeping track of the highest value encountered so far. This involves comparing each element in the array to a variable that stores the current maximum value and updating this variable whenever a larger element is found.

#Input: [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
#Output: 9
def find_maximum(arr):

    max_value = arr[0]


    for num in arr[1:]:

        if num > max_value:
            max_value = num

    return max_value


# Example
array = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
print("The maximum element in the array is:", find_maximum(array))
