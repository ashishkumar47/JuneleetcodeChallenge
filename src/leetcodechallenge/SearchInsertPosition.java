package leetcodechallenge;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length==0)
            return 0;
        int l=0,r=nums.length-1;
        if(nums[r]<target){
            return nums.length;
        }

        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>target){
                r=mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                return mid;
            }

        }
        return l;
    }
    public static void main(String[] args) {
        int[] a={1,3,5,6};
        System.out.println(searchInsert(a,2));
    }
}
