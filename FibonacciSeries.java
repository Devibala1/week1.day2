package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int firstNum=0;
		int secNum=1;
		int sum;
		System.out.println(firstNum);
		System.out.println(secNum);
for(range=1; range<8; range++) {
	sum=firstNum + secNum;
	firstNum=secNum;
	secNum=sum;
	System.out.println(sum);
}
	}

}
