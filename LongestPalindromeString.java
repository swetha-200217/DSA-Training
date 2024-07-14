class LongestPalindromeString{
    public static String longestPalindrome(String S){
        String sub=S.substring(0,1);
        for (int i=0;i<S.length()-1;i++){
            if(S.charAt(i)==S.charAt(i+1)){
                int j=i,k=i+1;
                while(j>=0 && k<S.length()){
                    if(S.charAt(j)!=S.charAt(k)){
                        break;
                    }
                    j--;
                    k++;
                }
                if(sub.length()<k-j-1){
                    sub=S.substring(j+1,k);
                }
            }
            if(i>0){
                if(S.charAt(i-1)==S.charAt(i+1)){
                    int x=i-1,y=i+1;
                    while(x>=0 && y<S.length()){
                        if(S.charAt(x)!=S.charAt(y)) break;
                        x--;
                        y++;
                    }
                    if(sub.length()<y-x-1){
                        sub=S.substring(x+1,y);
                    }
                }
            }
        }
        return sub;
    }

    public static void main(String[] args) {
        System.out.println(LongestPalindromeString.longestPalindrome(new String("babad")));
    }
}