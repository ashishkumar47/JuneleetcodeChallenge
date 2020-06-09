package leetcodechallenge;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int i=0,j=0;
        while(i<n&&j<m){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else
                j++;
        }
        if(i==s.length())
            return true;
        return false;
    }

    public static void main(String[] args) {
    System.out.println(isSubsequence("abc","ajhkjdkbjkc"));
    }
}
