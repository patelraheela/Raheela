
import java.util.Scanner;
abstract class Bank_Details
{
	public String bank_name="Equitas";
	public String IFSCCode="Equi123";
	abstract public void Deposit();
	abstract public void Withdraw();
	abstract public void Check_balance();
}
class Bank_Service extends Bank_Details
{
	
	private double bal=5000,amt;
	private int pass;
	Bank_Service()
	{
		System.out.println("Bank Name: "+bank_name+"\nIFSCCode: "+IFSCCode);
	}
	
	public void Deposit()
	{
	System.out.println("Eneter a password: ");
	Scanner s=new Scanner(System.in);
	pass=s.nextInt();
	if(pass==12345)
	{
		System.out.println("Enter Amount to deposit");
		Scanner s2=new Scanner(System.in);
		amt=s2.nextDouble();
		bal=bal+amt;
		System.out.println("Amount= "+amt);
		System.out.println("Balance= "+bal);
	}
	else
	{
		System.out.println("Incorrect password...!");
	}
	}
	public void Withdraw()
	{
		System.out.println("Eneter a password: ");
		Scanner s=new Scanner(System.in);
		pass=s.nextInt();
		if(pass==12345)
		{
			System.out.println("Enter Amount to Withdraw");
			Scanner s2=new Scanner(System.in);
			amt=s2.nextDouble();
			bal=bal-amt;
			System.out.println("Amount= "+amt);
			System.out.println("Balance= "+bal);
		}
		else
		{
			System.out.println("Incorrect password...!");
		}
	}
	public void Check_balance()
	{
		System.out.println("Eneter a password: ");
		Scanner s=new Scanner(System.in);
		pass=s.nextInt();
		if(pass==12345)
		{
			System.out.println("Balance= "+bal);
		}
		else
		{
			System.out.println("Incorrect password...!");
		}
	}
	}

public class Customer
{
	
	public static void main(String[] args)  {
		Bank_Service b=new Bank_Service();
		int ch;
		System.out.println("1.Deposit\n"+"2.Withdraw\n"+"3.Check Balance");
		System.out.println("Enter your choice: ");
		Scanner s1 = new Scanner(System.in);
		ch=s1.nextInt();
		
	switch(ch)
		{
		case 1:
			b.Deposit();
			break;
		case 2:
			b.Withdraw();
			break;
		case 3:
			b.Check_balance();
			break;
			default:
				System.out.println("Invalid Choice...!");
		}
		
	}

}


