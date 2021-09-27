import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Wabewalker extends JFrame {
	public static int fontSize = 22;
	
	public static JPanel bigPanel = new JPanel();
	public static JPanel smallPanel = new JPanel();
	public static JLabel locationHolder = new JLabel();
	public static JLabel scoreHolder = new JLabel();
	public static JTextArea body = new JTextArea();
	public static JTextField inputBox = new JTextField("");
	public static JScrollPane scroll = new JScrollPane(body);
	
	public Wabewalker() {
		add(bigPanel);
		bigPanel.setLayout(new BorderLayout());
		bigPanel.add(scroll, BorderLayout.CENTER);
		scroll.getVerticalScrollBar().setBackground(Color.BLACK);
		body.setForeground(Color.WHITE);
		body.setBackground(Color.BLACK);
		body.setEditable(false);
		body.setFocusable(false);
		body.setLineWrap(true);
		body.setWrapStyleWord(true);
		body.setFont(new Font("Serif", Font.PLAIN, fontSize));
		
		bigPanel.add(inputBox, BorderLayout.SOUTH);
		inputBox.setFont(new Font("Serif", Font.PLAIN, fontSize));
		
		inputBox.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent k) {
				if (k.getKeyCode() == KeyEvent.VK_ESCAPE) {
					Data.confirmQuit();
				} else if ((k.getKeyCode() == KeyEvent.VK_ENTER) && (!inputBox.getText().equals(""))) {
					Parser.submitInput();
				} 
			}
		});
		
		bigPanel.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent k) {
				if (Story.mustPressKey) {
					Story.pressedKey();
				}
			}
		});
	}
	
	public static void changeFocus(String s) {
		switch (s) {
			case "inputBox":
				bigPanel.setFocusable(false);
				inputBox.setEnabled(true);
				inputBox.setFocusable(true);
				inputBox.requestFocusInWindow();
				break;
			case "bigPanel":
				inputBox.setFocusable(false);
				bigPanel.setEnabled(true);
				bigPanel.setFocusable(true);
				bigPanel.requestFocusInWindow();
				break;
			default:
				System.out.println("Wabewalker.changeFocus() error");
				break;
		}
	}
	
	public static void deleteInputBox() {
		bigPanel.remove(inputBox);
		bigPanel.repaint();
	}
	
	public static void setInputBox() {
		bigPanel.add(inputBox, BorderLayout.SOUTH);
		inputBox.setFont(new Font("Serif", Font.PLAIN, fontSize));
	}

	public static void deleteHeader() {
		bigPanel.remove(smallPanel);
		bigPanel.repaint();
	}
	
	public static void setHeader() {
		bigPanel.add(smallPanel, BorderLayout.NORTH);
		smallPanel.setLayout(new BorderLayout());
		smallPanel.add(locationHolder, BorderLayout.WEST);
		locationHolder.setFont(new Font("Serif", Font.PLAIN, fontSize));
		smallPanel.add(scoreHolder, BorderLayout.EAST);
		scoreHolder.setFont(new Font("Serif", Font.PLAIN, fontSize));
	}
	
	public static void createFrame() {
		JFrame frame = new Wabewalker();
		frame.setTitle("Wabewalker");
		frame.setSize(999, 777);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);	
		
		// set focus on inputBox
		frame.addWindowFocusListener(new WindowAdapter() {
			public void windowGainedFocus(WindowEvent e) {
				inputBox.requestFocusInWindow();
			}
		});
	}

	public static void main(String[] args) {
		createFrame();
		Data.setUpGame();
	}
}