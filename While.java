
import java.util.Scanner;

public class While {
	public static void main (String [] args) {
		int i=1,k;
		Scanner scanner = new Scanner(System.in);
		k=scanner.nextInt();
	/*	while (i<5) {
			System.out.println("*");
			i++;
		}*/
		
	do {
		System.out.println("*");
		i++;
	}while (i<k);

	scanner.close();
	}

}
