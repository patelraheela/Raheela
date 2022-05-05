//Single inheritance
class Student_info
{
	String Name;
	int Roll_no,marks;
	public void Input()
	{
		System.out.println("Student record...");
	}
}
public class Record extends Student_info
{
	void Disp()
	{
		Name="Raheela";
		Roll_no=8;
		marks=82;
		System.out.println("Name: "+Name+" Roll_Number= "+Roll_no+" Marks= "+marks);
	}
	public static void main(String args[])
	{
		Record r= new Record();
		r.Input();
		r.Disp();
	}
}
