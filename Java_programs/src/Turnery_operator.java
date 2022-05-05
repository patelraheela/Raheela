import java.util.Scanner;

public class Turnery_operator {

	public static void main(String[] args) {
		int a,b,c,r;
		System.out.println("Enter three numbers: ");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		System.out.println((a>b)?(a>c?a:c):(b>c?b:c));

	}

}
