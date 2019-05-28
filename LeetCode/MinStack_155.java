

import java.util.Stack;

/*
155. 最小栈
设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

push(x) -- 将元素 x 推入栈中。
pop() -- 删除栈顶的元素。
top() -- 获取栈顶元素。
getMin() -- 检索栈中的最小元素。
示例:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.
*/
/*
通过双链表实现
执行用时 : 99 ms, 在Min Stack的Java提交中击败了88.86% 的用户
内存消耗 : 47.6 MB, 在Min Stack的Java提交中击败了22.61% 的用户
 */
class MinStack_155 {
    class Node {
        int val;
        Node pre;
        Node next;
        int min;

        Node(int val) {
            this.val = val;
        }
    }

    private Node node;

    public MinStack_155() {
    }

    public void push(int x) {
        if (node == null) {
            node = new Node(x);
            node.min = x;
        } else {
            node.next = new Node(x);
            node.next.pre = node;
            node.next.min = node.min < x ? node.min : x;
            node = node.next;
        }
    }

    public void pop() {
        node = node.pre;
    }

    public int top() {
        return node.val;
    }

    public int getMin() {
        return node.min;
    }
}

/*
通过栈实现
*/
class MinStack1 {
    private int min = Integer.MAX_VALUE;
    private Stack<Integer> stack;

    public MinStack1() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if(min >= x){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.pop() == min){
            min = stack.pop();
        }
    }

    public int top() {
      return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
