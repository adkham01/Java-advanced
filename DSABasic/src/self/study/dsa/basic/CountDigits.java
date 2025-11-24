package self.study.dsa.basic;

public class CountDigits {
	
	public static int countDigit(int number) {
		if(number == 0) {return 1;}
		int count = 0;
		int copyNum = number;
		while(copyNum > 0) {
			copyNum /= 10;
			count++;
		}
		return count;
	}
	
	public static int digitCount(int number) {
		if(number == 0) {return 1;}
		int count = ((int)Math.log10(number) + 1);
		return count;
	}
	
	public static void main(String[] args) {
		int number1 = 198741;
		int number2 = 0;
		
		System.out.println(digitCount(number1));
		System.out.println(digitCount(number2));
		
		System.out.println(countDigit(number1));
		System.out.println(countDigit(number2));
		

	}

}
