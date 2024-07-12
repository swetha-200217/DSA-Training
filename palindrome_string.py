def is_palindrome(s):
#checks if the string is equal to its reverse
  return s == s[::-1]
s=input("Enter the string":)
if is_palindrome(s):
  print(s,"is a palindrome")
else:
  print(s,"is not a palindrome")
