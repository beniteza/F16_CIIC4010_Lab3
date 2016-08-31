import javax.swing.JFrame;

public class Lab3Exercises 
{
	public static void main(String[] args) 
	{
		JFrame axvielBenitez = new JFrame("Hello, world");
		axvielBenitez.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		axvielBenitez.setLocation(585, 290);
		axvielBenitez.setSize(750, 500);
		
		MyPanelClass myPanel = new MyPanelClass();
		axvielBenitez.getContentPane().add(myPanel);
		
		axvielBenitez.setVisible(true);
	}
}