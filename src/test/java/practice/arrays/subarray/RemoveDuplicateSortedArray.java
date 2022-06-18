package practice.arrays.subarray;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4,5,5,6};
        int n = nums.length;
        int count = 1;
        int j=1;
        int k=nums[0];
        k++;
        for (int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1] && k==nums[i+1]){
                k++;
                count++;
                nums[j++] = nums[i+1];
            }
        }
        for (int i=j;i<n;i++){
            nums[i] = 0;
        }
        for (int i=0;i<n;i++){
            System.out.print(nums[i]);
        }
        System.out.println();
        System.out.println(count);
    }
}
