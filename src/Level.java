

import javax.swing.JFrame;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Level extends JFrame{

	 //private Image img = ImageIO.read(new File("background.jpg"));
	   private Label gameTitle;
	   private Button start;
	   private Button quit;
	   private Image backgroundImage;
	   private final int frameSize = 1000;

	   // Constructor to setup the GUI components
	   public Level(){ 
		  //setLayout(new FlowLayout());
		   
		  setLayout(null);
		  
		  setTitle("PFalls Galaga");
		   
		   setSize(frameSize, frameSize);
		   
		   setVisible(true);
		   setResizable(false);
		   toFront();
		   
		   
	   }

	
}
