package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,6,7,8};
		System.out.println("length of array: " +arr.length);
		int i;
		
		Arrays.sort(arr);
		
		for (i=0 ; i <arr.length;i++)
		{
		if (i!=arr[i])
		{
					System.out.println("Missing number: "+i);
					break;
		}
	}

}
}