
import java.util.Scanner;
public class Do_While {
		public static void main(String[] args) {
			int num;
			System.out.println("Enter a number: ");
			Scanner s =new  Scanner(System.in);
			num=s.nextInt();
			do
			{
				if(num%2==0)
				{
					System.out.println(num);
				}
				
				num++;
			}
			while(num<=10);
		}

	}


