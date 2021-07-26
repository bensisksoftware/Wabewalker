import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Bunraku extends JFrame {
	public static int fontSize = 22;
	public static JPanel panel1 = new JPanel();
	public static JLabel header1 = new JLabel(Room.gardenPatio.title);
	//public static JLabel header2 = new JLabel("Score: ");
	public static JTextArea body = new JTextArea(Room.intro);
	public static JTextField inputBox = new JTextField("");
	public static JScrollPane scroll = new JScrollPane(body);
	public static JTextPane pane = new JTextPane();
	
	public Bunraku() {
		setLayout(new BorderLayout());
		
		add(panel1);
		add(scroll, BorderLayout.CENTER);
		
		add(header1, BorderLayout.NORTH);
		header1.setFont(new Font("Serif", Font.PLAIN, fontSize));
		//header1.setBackground(Color.BLUE);
		//header1.setForeground(Color.BLACK);
		
		body.setForeground(Color.WHITE);
		body.setBackground(Color.BLACK);
		body.setEditable(false);
		body.setLineWrap(true);
		body.setWrapStyleWord(true);
		body.setFont(new Font("Serif", Font.PLAIN, fontSize));
		
		add(inputBox, BorderLayout.SOUTH);
		inputBox.setFont(new Font("Serif", Font.PLAIN, fontSize));
		//inputBox.setBackground(Color.BLACK);
		//inputBox.setForeground(Color.WHITE);
		
		inputBox.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent k) {
				// ESC				
				if (k.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.exit(0);
				}
				
				if ((k.getKeyCode() == KeyEvent.VK_ENTER) && (!inputBox.getText().equals(""))) {
					Parser.submitInput();
				} 
			}
		});
	}

	public static void main(String[] args) {
		JFrame frame = new Bunraku();
		frame.setTitle("Bunraku");
		frame.setSize(666, 666);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);	
		
		// set focus on inputBox
		frame.addWindowFocusListener(new WindowAdapter() {
			public void windowGainedFocus(WindowEvent e) {
				inputBox.requestFocusInWindow();
			}
		});
		
		body.setFocusable(false);
		
		Data.setUp();
		Story.printLocation();
		Story.newLine();
		Story.printDesc();
	}
}