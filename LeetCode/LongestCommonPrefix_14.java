
public class LongestCommonPrefix_14 {
	/*
	 编写一个函数来查找字符串数组中的最长公共前缀。
	
	如果不存在公共前缀，返回空字符串 ""。
	
	示例 1:
	
	输入: ["flower","flow","flight"]
	输出: "fl"
	示例 2:
	
	输入: ["dog","racecar","car"]
	输出: ""
	解释: 输入不存在公共前缀。
	说明:
	
	所有输入只包含小写字母 a-z 。
	 */
	
	public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        if (length <= 0) {
            return "";
        }
        String cp = strs[0];
        int x = cp.length();
        String str;
        for (int i = 1; i < length; i++) {
            str = strs[i];
            while (!str.startsWith(cp.substring(0, x)) && x > 0) {
                x--;
            }
            if (x == 0) {
                return "";
            }
            cp = cp.substring(0, x);
        }
        return cp;
    }
}
