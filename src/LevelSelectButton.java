
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LevelSelectButton extends JButton {

	private int levelNumber;
	
	private static final int width = 100;
	private static final int height = 100;


	public LevelSelectButton(String name, int location, int level) {
		levelNumber = level;
		new Button();
		setText(name);
		setFont(new Font("Arial", Font.PLAIN, 60));
		setForeground(Color.RED);
		setBackground(Color.BLUE);
		setBounds(location, 100, width, height);

		this.addActionListener(new Listener());

	}
	 

	private class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Level instance = new Level();
			System.out.println("Event performed");

		}

	}

}