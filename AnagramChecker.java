import java.util.*;
public class AnagramChecker {
    //To check Strings are anagram
    public static boolean isAnagram(String str1, String str2){

        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();

        //if length not same then they can't be anagram
        if(str1.length() != str2.length()){
            return false;
        }
        //Convert String to char Arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        //Sort the Array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String-1");
        String str1 = scan.nextLine();
        System.out.println("Enter the String-2");
        String str2 = scan.nextLine();

        if(isAnagram(str1, str2)){
            System.out.println(str1+" and "+str2+" are anagrams. ");
        }
        else{
            System.out.println(str1+" and "+str2+" are not anagrams");
        }
    }
}
