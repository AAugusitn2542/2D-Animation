import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame {
	
	 MyPanel panel;
	
	 MyFrame() {
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null); // allows the frame to appaer in the middle o f the computer screen
		this.setVisible(true);
	}
	 
}
