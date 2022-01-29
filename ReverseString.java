package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";
		char[] test1 = test.toCharArray();
		for(int i=test1.length-1;i>=0;i--)
		{
System.out.print(test1[i]);
	}

}
}
