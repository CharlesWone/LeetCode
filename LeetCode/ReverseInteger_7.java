
public class ReverseInteger_7 {
	/*
	给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
	
	示例 1:
	
	输入: 123
	输出: 321
	 示例 2:
	
	输入: -123
	输出: -321
	示例 3:
	
	输入: 120
	输出: 21
	 */
    public int reverse(int x) {
		long result = 0L;
		int temp;
		while(x!=0) {
			temp = x%10;
			x /=10;
			result = result*10 + temp;
			if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE) {
				return 0;
			}
		}
		return (int) result;
    }
}
