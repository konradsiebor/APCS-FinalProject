
import javax.swing.JButton;

import javax.swing.JFrame;

import java.awt.*; // Using AWT container and component classes
import java.awt.event.*; // Using AWT event classes and listener interfaces
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MainMenu extends JFrame implements ActionListener {

	// private Image img = ImageIO.read(new File("background.jpg"));
	private Label gameTitle;
	private Button start;
	private Button quit;
	private Image backgroundImage;
	private final int frameSize = 1000;

	// Constructor to setup the GUI components
	public MainMenu() {
		// setLayout(new FlowLayout());

		setLayout(null);

		try {
			backgroundImage = ImageIO.read(new File("background.jpg"));
		} catch (IOException e) {
		}

		gameTitle = new Label("Galaga");
		gameTitle.setFont(new Font("Arial", Font.PLAIN, 100));
		gameTitle.setForeground(Color.RED);
		gameTitle.setBackground(new Color(75, 0, 130));
		gameTitle.setBounds(frameSize / 2 - 150, 200, 340, 150);

		add(gameTitle);

		start = new Button("Start");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LevelSelect levelMenu = new LevelSelect();
				// Makes main menu disappear
				setVisible(false);
			}
		});
		start.setFont(new Font("Arial", Font.PLAIN, 60));
		start.setForeground(Color.GREEN);
		start.setBackground(Color.BLUE);
		start.setBounds(frameSize / 2 - 50, 500, 150, 100);
		add(start);

		/*
		 * only works with button and not Jbutton MenuButtons startButton = new
		 * MenuButtons("start"); add(startButton);
		 */

		quit = new Button("Quit");
		quit.setFont(new Font("Arial", Font.PLAIN, 60));
		quit.setForeground(Color.RED);
		quit.setBackground(Color.BLUE);
		quit.setBounds(frameSize / 2 - 50, 700, 150, 100);
		add(quit);

		quit.addActionListener(this);

		setTitle("PFalls Galaga");

		setSize(frameSize, frameSize);

		setVisible(true);
		setResizable(false);
		toFront();

	}

	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
