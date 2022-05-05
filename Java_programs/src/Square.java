//ovverriding
class Draw
{
	void draw()
	{
		System.out.println("Draw a shape...");
	}
}
public class Square extends Draw
{
	void draw()
	{
		super.draw();
		System.out.println("Square");
	}

	public static void main(String[] args) {
		
		Square s= new Square();
		s.draw();
	}

}
