
public class LengthOfLastWord_58 {
	public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        return arr[arr.length-1].length();
    }
}
