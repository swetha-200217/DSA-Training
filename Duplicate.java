public class Duplicate{
    public static boolean containsDuplicate(int[] nums){
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;  //Duplicate found
                }
            }
        }
        return false;  //No Duplicate Found
    }
    public static void main(String[] args) {
        int arr [] = {1,2,4,6,8,2,7,4,5};
        System.out.println(containsDuplicate(arr));
    }
}