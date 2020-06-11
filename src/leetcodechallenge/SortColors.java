package leetcodechallenge;

public class SortColors {
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void sortColors(int[] nums) {
        int zeroIndex=0,i=0,twoIndex=nums.length-1;
        while(i<=twoIndex){
            if(nums[i]==0){
                swap(nums,zeroIndex++,i++);
            }
            else if(nums[i]==2){
                swap(nums,twoIndex--,i);
            }
            else{
                i++;
            }
        }

    }
    public static void main(String[] args) {
        int[] a={2,0,2,1,1,0};
        sortColors(a);
        for (Integer element: a){
            System.out.print(element+" ");
        }
    }
}
