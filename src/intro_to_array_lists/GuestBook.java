package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	ArrayList <String> b = new ArrayList <String> ();

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Mangy Mitch
	// Guest #2: Garrett the Carrot
	// Guest #3: Dad the Lad
	// Guest #4: Globglogabgalab
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();

	public static void main(String[] args) {
		GuestBook guest = new GuestBook();
		guest.globglogabgalab();
	}

	void globglogabgalab() {
		frame.add(panel);

		panel.add(button);
		panel.add(button1);

		button.addActionListener(this);
		button.setText("Add Name");

		button1.setText("View Names");
		button1.addActionListener(this);

		frame.setSize(1000, 1000);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(button)) {
			String s = JOptionPane.showInputDialog("Enter a Name");
			b.add(s);
		}
		if (event.getSource().equals(button1)) {
			JOptionPane.showMessageDialog(null, b);
		}
	}
}