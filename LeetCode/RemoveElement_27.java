
public class RemoveElement_27 {
	/*
	给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
	不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
	元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
	 */
	
	public int removeElement(int[] nums, int val) {
        if(nums.length==0)    return 0;
        
        int cur1 = 0;
	    int cur2 = nums.length - 1;

        int temp;
        while (cur1 < cur2) {
            if (nums[cur2] == val) {
                cur2--;
                continue;
            }
            if (nums[cur1] == val) {
                temp = nums[cur1];
                nums[cur1] = nums[cur2];
                nums[cur2] = temp;
            }
            cur1++;
	    }

        if(nums[cur1]==val)    cur1--;
	    return cur1 + 1;
    }
}
