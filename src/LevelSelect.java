
import java.awt.*; // Using AWT container and component classes
import java.awt.event.*; // Using AWT event classes and listener interfaces

public class LevelSelect extends Frame {

	private Label subTitle;
	private int frameSize;

	// Constructor to setup the GUI components
	public LevelSelect() {
		// setLayout(new FlowLayout());
		setLayout(null);

		subTitle = new Label("Select Level");
		subTitle.setFont(new Font("Arial", Font.PLAIN, 80));
		subTitle.setForeground(Color.YELLOW);
		subTitle.setBackground(Color.BLUE);
		subTitle.setBounds(frameSize / 2 + 250, 250, 450, 150);
		add(subTitle);

		LevelSelectButton Level1 = new LevelSelectButton("1", 300, 1);
		add(Level1);

		LevelSelectButton Level2 = new LevelSelectButton("2", 410, 2);
		add(Level2);

		LevelSelectButton Level3 = new LevelSelectButton("3", 520, 3);
		add(Level3);

		// add(message);
		setSize(1000, 500);
		setBackground(new Color(75, 0, 130));

		setVisible(true);
		setResizable(false);
		toFront();

	}

}
