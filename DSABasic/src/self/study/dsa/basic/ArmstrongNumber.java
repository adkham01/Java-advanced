package self.study.dsa.basic;

public class ArmstrongNumber {

	public static boolean isArmstrongNumber(int number) {
		int dupnum = number;
		int sum = 0;
		while(dupnum > 0) {
			int ld = dupnum % 10;
			for(int i = 0; i < ld; i++) {
				sum += ld*ld;
			}
			dupnum /= 10;
		}
		if(number == sum) {return true;}
		else {return false;}
	}
	
	public static void main(String[] args) {
		int num1 = 371;
		int zero = 0;
		int num2 = 653478;
		System.out.println(isArmstrongNumber(num1));
		System.out.println(isArmstrongNumber(num2));
		System.out.println(isArmstrongNumber(zero));

	}

}
