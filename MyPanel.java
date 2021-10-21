import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
public class MyPanel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image Mario;
	//Image backgroundImage;
	Timer timer;
	int xVelocity = 2; //adjust how far the image is moving on the x axle  
	int yVelocity = 2; // same on the y axis 
	int x = 0; // starting position
	int y = 0; // starting position 
	
	
	MyPanel(){
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black); // this is setting the back ground color will be replace by an image 
		Mario = new ImageIcon("Mario.png").getImage(); // created the image it self 
		//backgroundImage = new ImageIcon("space.png").getImage();
		timer = new Timer(10, this); // how fast the image will go 
		timer.start();
		
	}

	public void paint(Graphics g) {
		 
		super.paint(g); //this will paint the background black
		
		Graphics2D g2D = (Graphics2D) g;
		 
		//g2D.drawImage(backgroundImage, 0, 0, null);
		g2D.drawImage(Mario, x, y, null);
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x>=PANEL_WIDTH-Mario.getWidth(null) || x<0) {
			xVelocity = xVelocity *-1;
		}
		x = x + xVelocity; //updated the 
		
		if(y>=PANEL_HEIGHT-Mario.getHeight(null) || y<0) {
			yVelocity = yVelocity *-1;	
		}
		y = y + yVelocity; //updated the 
		repaint();		
	}
}
	