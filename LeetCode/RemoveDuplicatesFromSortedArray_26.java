
public class RemoveDuplicatesFromSortedArray_26 {
	/*
	给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
	不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
	 */
	
	public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
			return 0;

		int cur1 = 0;
		int cur2 = 1;

		while (cur2 < nums.length) {
			if (nums[cur2] > nums[cur1]) {
                cur1++;
				nums[cur1] = nums[cur2];
			}
			cur2++;
		}
		return cur1 + 1;
    }
}
