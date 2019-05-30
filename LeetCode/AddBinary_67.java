/*
给定两个二进制字符串，返回他们的和（用二进制表示）。

输入为非空字符串且只包含数字 1 和 0。

示例 1:

输入: a = "11", b = "1"
输出: "100"
示例 2:

输入: a = "1010", b = "1011"
输出: "10101"
 */
public class AddBinary_67 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int ia = a.length() - 1;
        int ib = b.length() - 1;
        int carry = 0;
        while (ia >= 0 || ib >= 0 || carry > 0) {
            carry += ia >= 0 ? a.charAt(ia--) - '0' : 0;
            carry += ib >= 0 ? b.charAt(ib--) - '0' : 0;
            res.insert(0, carry & 1);
            carry = (carry >>> 1) & 1;
        }
        return res.toString();
    }
}
