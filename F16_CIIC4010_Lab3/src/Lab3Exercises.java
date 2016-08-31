import javax.swing.JFrame;

public class Lab3Exercises 
{
	public static void main(String[] args) 
	{
		JFrame axvielBenitez = new JFrame("Hello, world");
		axvielBenitez.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		axvielBenitez.setLocation(540, 412);
		axvielBenitez.setSize(200, 200);
		
		MyPanelClass myPanel = new MyPanelClass();
		axvielBenitez.getContentPane().add(myPanel);
		
		axvielBenitez.setVisible(true);
	}
}