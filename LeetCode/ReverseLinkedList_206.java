/*
反转一个单链表。

示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
进阶:
你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class ReverseLinkedList_206 {
    /*
    //迭代法
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
    */

    //尾递归
    public ListNode reverseList(ListNode head) {
        return reverse(null,head);
    }

    private static ListNode reverse(ListNode pre,ListNode cur){
        if(cur==null) return pre;
        ListNode nextNode = cur.next;
        cur.next = pre;
        return reverse(cur,nextNode);
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
