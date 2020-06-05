package leetcodechallenge;

import java.util.Random;

public class RandomPickwithWeight {
    int[] sumArr;
    int sum;

    public void Solution(int[] w) {
        sumArr= new int[w.length];
        sum=0;
        for(int i=0;i<w.length;i++){
            sum+=w[i];
            sumArr[i]=sum;
        }

    }

    public int pickIndex() {
        Random rand = new Random();
        int randomNumber=rand.nextInt(sum) + 1;
        int l=0,r=sumArr.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(sumArr[mid]<randomNumber)
                l=mid+1;
            else if(sumArr[mid]==randomNumber)
                return mid;
            else
                r=mid;
        }
        return l;
    }

    public static void main(String[] args) {

    }
}
