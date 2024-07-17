<<<<<<< HEAD:PalindromeDescendant.java
public class PalindromeDescendant {
    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
    public static Integer getDescendant(int num) {
        String str = Integer.toString(num);
        if (str.length() % 2 != 0) {
            return null;
        }
        StringBuilder descendant = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i += 2) {
            int sum = Character.getNumericValue(str.charAt(i)) + Character.getNumericValue(str.charAt(i + 1));
            descendant.append(sum);
        }
        return Integer.parseInt(descendant.toString());
    }
    public static boolean PalindromeDescendant(int num) {
        if (isPalindrome(num)) {
            return true;
        }
        while (num >= 10) { 
            Integer descendant = getDescendant(num);
            if (descendant == null) {
                return false;
            }
            if (isPalindrome(descendant)) {
                return true;
            }
            num = descendant;
        }
        
        return false; 
    }
    public static void main(String[] args) {
        System.out.println(PalindromeDescendant(11211)); 
        System.out.println(PalindromeDescendant(130011)); 
       
    }
}
=======
public class PalindromeDescendant {
    
    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    // Function to get the descendant of a number
    public static Integer getDescendant(int num) {
        String str = Integer.toString(num);
        // If the number of digits is odd, we can't create pairs
        if (str.length() % 2 != 0) {
            return null;
        }
        StringBuilder descendant = new StringBuilder();
        // Sum each pair of adjacent digits
        for (int i = 0; i < str.length() - 1; i += 2) {
            int sum = Character.getNumericValue(str.charAt(i)) + Character.getNumericValue(str.charAt(i + 1));
            descendant.append(sum);
        }
        return Integer.parseInt(descendant.toString());
    }

    // Main function to check if a number or any of its descendants is a palindrome
    public static boolean PalindromeDescendant(int num) {
        // Check if the number itself is a palindrome
        if (isPalindrome(num)) {
            return true;
        }
        
        // Generate and check descendants iteratively
        while (num >= 10) { // Continue as long as there are at least two digits
            Integer descendant = getDescendant(num);
            // If descendant cannot be formed, return false
            if (descendant == null) {
                return false;
            }
            // Check if the descendant is a palindrome
            if (isPalindrome(descendant)) {
                return true;
            }
            // Update num to be the new descendant
            num = descendant;
        }
        
        return false; // No palindromes found
    }

    // Test the function with various cases
    public static void main(String[] args) {
        System.out.println(PalindromeDescendant(11211)); 
        System.out.println(PalindromeDescendant(130011)); 
       
    }
}
>>>>>>> main:Mayuri Sathe/PalindromeDescendant.java
