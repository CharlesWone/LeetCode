
public class ImplementStrStr_28 {
	/*
	 * 实现 strStr() 函数。 给定一个 haystack 字符串和一个 needle 字符串， 在 haystack 字符串中找出 needle
	 * 字符串出现的第一个位置 (从0开始)。 如果不存在，则返回 -1。
	 */

	public int contains(char[] str, char ch) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] == ch) {
				return i;
			}
		}
		return -1;
	}

	public int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}
		if (haystack.length() == 0) {
			return needle.length() == 0 ? 0 : -1;
		}

		char[] sarray = haystack.toCharArray();
		char[] parray = needle.toCharArray();
		int slen = haystack.length();
		int plen = needle.length();
		int len = slen - plen;
		int i = 0, j = 0;
		while (i <= len + j) {
			if (sarray[i] != parray[j]) {
				if (i == len + j) {
					break;
				}
				int pos = contains(parray, sarray[i + plen - j]);
				if (pos == -1) {
					i = i + plen + 1 - j;
					j = 0;
				} else {
					i = i + plen - pos - j;
					j = 0;
				}
			} else {
				if (j == plen - 1) {
					return i - j;
				} else {
					i++;
					j++;
				}
			}
		}
		return -1;
	}
}
