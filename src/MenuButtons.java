import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent; 

public class MenuButtons extends JButton {
	
	public MenuButtons(String name){
		   new Button();
		   setText(name);
		   setFont(new Font("Arial", Font.PLAIN, 60));
		   setForeground(Color.GREEN);
		   setBackground(Color.BLUE);
	       setBounds(100, 500, 200, 100);
	   }
}
