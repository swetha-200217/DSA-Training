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
