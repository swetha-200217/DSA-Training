def first_non_repeating_char(s):
    char_count = {}

    # Count the occurrences of each character
    for char in s:
        if char in char_count:
            char_count[char] += 1
        else:
            char_count[char] = 1

    # Identify the first non-repeating character
    for char in s:
        if char_count[char] == 1:
            return char
    # If there's no non-repeating character
    return None  

# Example usage
s = "swiss"
print(first_non_repeating_char(s))  # Output: 'w'
