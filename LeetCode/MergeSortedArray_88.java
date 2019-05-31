import java.util.Arrays;

/*
给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
示例:

输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]
 */
public class MergeSortedArray_88 {
	/*
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	System.arraycopy(nums2, 0, nums1, m, nums1.length-m);
    	Arrays.sort(nums1);
    }
    */
	
	//执行用时 : 1 ms, 在Merge Sorted Array的Java提交中击败了99.05% 的用户
	//内存消耗 : 34.8 MB, 在Merge Sorted Array的Java提交中击败了95.46% 的用户
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m--+--n;
        
        while(n>=0) {
            nums1[i--] = m>=0 && nums1[m]>nums2[n] ? nums1[m--] : nums2[n--];
        }
    }
    
    /*
		[0,0,3,0,0,0,0,0,0]
		3
		[-1,1,1,1,2,3]
		6
     */
    public static void main(String[] args) {
        int[] nums1 = new int[] {0,0,3,0,0,0,0,0,0};
        int m = 3;
        int[] nums2 = new int[] {-1,1,1,1,2,3};
        int n = 6;
        
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        new MergeSortedArray_88().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
