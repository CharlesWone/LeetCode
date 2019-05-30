/*
给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

示例 1:

输入: 1->1->2
输出: 1->2
示例 2:

输入: 1->1->2->3->3
输出: 1->2->3
 */
public class RemoveDuplicatesFromSortedList_83 {
	/*
	//双指针
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode lastNode = head;
		ListNode currentNode = head.next;

		while (currentNode != null) {
			if(lastNode.val==currentNode.val) {
				lastNode.next = currentNode.next;
			}else {
				lastNode = currentNode;
			}
			currentNode = currentNode.next;
		}
		return head;
	}
	*/
	
	//递归
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null){
            return head;
        }
		if(head.val==head.next.val) {
			head.next = head.next.next;
			deleteDuplicates(head);
		}else {
			deleteDuplicates(head.next);
		}
		return head;
	}
	
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}