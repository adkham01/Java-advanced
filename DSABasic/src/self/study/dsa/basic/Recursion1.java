package self.study.dsa.basic;

public class Recursion1 {

	public static void main(String[] args) {
		int i = 0;
		String str = "madam";
		System.out.println(isPalindromeString(i, str));
	}

	public static void swap(int[] arry, int i) {
		if (i >= arry.length / 2)
			return;
		int num = arry[i];
		arry[i] = arry[arry.length - i - 1];
		arry[arry.length - i - 1] = num;
		swap(arry, i + 1);

	}

	public static boolean isPalindromeString(int i, String s) {
		if (i >= s.length() / 2)
			return true;
		if (s.charAt(i) != s.charAt(s.length() - i - 1))
			return false;
		return isPalindromeString(i + 1, s);
	}

}
