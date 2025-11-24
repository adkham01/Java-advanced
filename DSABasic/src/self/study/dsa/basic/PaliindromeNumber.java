package self.study.dsa.basic;

public class PaliindromeNumber {

	public static boolean isPalindrome(int num) {
		if(num == 0) { return true;}
		int ininum = num;
		int revnum = 0;
		while(num > 0) {
			int ld = num% 10; 
			revnum = (revnum * 10) + ld;
			num /= 10;
		}
		if(revnum == ininum) {return true;}
		else {return false;}
	}
	public static void main(String[] args) {
		int n = 121;
		System.out.println(isPalindrome(n));
	}

}
