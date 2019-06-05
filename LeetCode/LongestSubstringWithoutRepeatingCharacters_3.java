import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class LongestSubstringWithoutRepeatingCharacters_3 {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int max = 0, left = 0 ,right = 0;
        
        for (; right < chars.length; right++) {
            char c = chars[right];
            for (int i = left; i < right; i++) {
                if(c == chars[i]) {
                    max = Math.max(max, right-left);
                    left = i + 1;
                }
            }
        }
        
        return Math.max(max, right-left);
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters_3()
                .lengthOfLongestSubstring("add"));
    }
}
