/**
 * 
 */
package jafpl.calc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Erik Itter
 *
 */
public class Calculator extends JFrame implements ActionListener {

	/**
	 * @see Serializable
	 */
	private static final long serialVersionUID = 6514956977138255134L;
	private static final String APPLICATION_TITLE = "Simple Java Calculator";

	JFrame mainFrame;
	JTextField display;
	JPanel digitPanel;
	JButton buttonDigit0;
	JButton buttonDigit1;
	JButton buttonDigit2;
	JButton buttonDigit3;
	JButton buttonDigit4;
	JButton buttonDigit5;
	JButton buttonDigit6;
	JButton buttonDigit7;
	JButton buttonDigit8;
	JButton buttonDigit9;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Calculator();
			}

		});
	}

	public Calculator() {

		mainFrame = new JFrame(APPLICATION_TITLE);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(500, 400);
		mainFrame.setLocationRelativeTo(null);

		display = new JTextField("Test Text, 0");
		display.setEditable(false);
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setFont(new Font("Arial", Font.PLAIN, 20));

		mainFrame.add(display, BorderLayout.NORTH);
		initDigitPanel();
		mainFrame.add(digitPanel);

		mainFrame.setVisible(true);
	}

	/**
	 * 
	 */
	private void initDigitPanel() {
		digitPanel = new JPanel();
		buttonDigit0 = new JButton("0");
		digitPanel.add(buttonDigit0);
		buttonDigit1 = new JButton("1");
		digitPanel.add(buttonDigit1);
		buttonDigit2 = new JButton("2");
		digitPanel.add(buttonDigit2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		String action = ae.getActionCommand();
	}

}
