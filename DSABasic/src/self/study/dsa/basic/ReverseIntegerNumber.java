package self.study.dsa.basic;

public class ReverseIntegerNumber {
	
	public static int reverseNumer(int number) {
		int revnum = 0;
		while (number > 0) {
			int ld = number % 10;
			revnum = (revnum*10)+ld; 
			number /= 10;
		}
		return revnum; 
	}
	public static void main(String[] args) {
		int n = 9877;
		System.out.println(reverseNumer(n));
	}

}
