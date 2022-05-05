import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int marks;
		System.out.println("Enter Students marks: ");
		Scanner s= new Scanner(System.in);
		marks=s.nextInt();
		if(marks>80 && marks==100)
		{
			System.out.println("Topper***");
		}
		else if(marks>70 && marks<80)
		{
			System.out.println("First Class***");
		}
		else if(marks>=35)
		{
			System.out.println("");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
