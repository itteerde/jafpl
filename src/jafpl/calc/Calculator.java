/**
 * 
 */
package jafpl.calc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * @author Erik Itter
 *
 */
public class Calculator extends JFrame implements ActionListener {

	private static final long serialVersionUID = 6514956977138255134L;
	private static final String APPLICATION_TITLE = "Simple Java Calculator";

	JFrame mainFrame;
	JTextField display;

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

		display = new JTextField("0");
		display.setEditable(false);
		display.setHorizontalAlignment(JTextField.RIGHT);

		mainFrame.add(display, BorderLayout.NORTH);

		mainFrame.setVisible(true);
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
