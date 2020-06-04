package leetcodechallenge;

public class ReverseString {
    public static void reverseString(char[] s) {
        int i=0,j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
    char[] ch= {'h','e','l','l','o'};
    reverseString(ch);
    System.out.println(ch);
    }
}
