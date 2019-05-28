import java.util.Stack;

public class ValidParentheses_20 {

	/*
	 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

	有效字符串需满足：
	
	左括号必须用相同类型的右括号闭合。
	左括号必须以正确的顺序闭合。
	注意空字符串可被认为是有效字符串。
	 */
	
	public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (Character c : charArray) {
			switch (c) {
			case '(':
			case '[':
			case '{':
				stack.push(c);
				break;
			case ')':
				if (stack.isEmpty()||'(' != stack.pop())
					return false;
				break;
			case ']':
				if (stack.isEmpty()||'[' != stack.pop())
					return false;
				break;
			case '}':
				if (stack.isEmpty()||'{' != stack.pop()) {
					return false;
				}
				break;
			}
		}
		return stack.isEmpty();
    }
}
