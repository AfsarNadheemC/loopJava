

import java.util.Scanner;

public class array2 {
	public static void main ()
	{
		int a[] = new int[6];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the elements");
		
		for (int i=0;i<6;i++)
			a[i]=scanner.nextInt();
				
		for (int i=0;i<6;i++)
			System.out.println(a[i]);
		
		scanner.close();
	}

}
