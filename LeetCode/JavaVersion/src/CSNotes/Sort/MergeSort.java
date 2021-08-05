package CSNotes.Sort;

import java.util.Arrays;

public class MergeSort {
    void mergeSort1(int[] nums){
        int[]temp=new int[nums.length];
        mergeSort2(nums,0, nums.length-1, temp);
    }

    void mergeSort2(int[] nums,int left, int right, int[]temp){
        if(left<right){
            int mid=left+(right-left)/2;
            mergeSort2(nums,left,mid,temp);
            mergeSort2(nums,mid+1,right,temp);
            mergeSort3(nums,left,mid,right,temp);
        }
    }

    void mergeSort3(int[] nums,int left,int mid,int right,int[] temp){
        int i=left;
        int j=mid+1;
        int t=0;
        while (i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                temp[t++]=nums[i++];
            }
            else {
                temp[t++]=nums[j++];
            }
        }
        while (i<=mid){
            temp[t++]=nums[i++];
        }
        while (j<=right){
            temp[t++]=nums[j++];
        }
        t=0;
        while (left<=right){
            nums[left++]=temp[t++];
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,3,5,7,9,8,6,4,2,0};
        MergeSort mergeSort=new MergeSort();

        mergeSort.mergeSort1(nums);

        System.out.println(Arrays.toString(nums));
    }
}
