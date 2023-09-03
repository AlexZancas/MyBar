package Classes;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame{
	public void initialize() {
		setTitle("MyBar App");
		setSize(1920, 1080);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		AppFrame mainFrame = new AppFrame();
		//mainFrame.initialize();
	}
}
