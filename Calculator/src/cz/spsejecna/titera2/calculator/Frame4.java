package cz.spsejecna.titera2.calculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//13.05.2020
public class Frame4 implements ActionListener {
	
	JFrame frame = new JFrame("Kalkulačka - Dělení");
	JLabel label = new JLabel("Zadejte čísla která chce vydělit");
	JTextField textField1 = new JTextField("menšenec", 10);
	JTextField textField2 = new JTextField("menšitel", 10);
	JButton button = new JButton("VYDĚLIT");
	JButton button1 = new JButton("ZPĚT");
	JLabel res = new JLabel("Výsledek: ");
	
	public Frame4() {
		button.addActionListener(this);
		button1.addActionListener(this);

		textField1.setEditable(true);
		textField2.setEditable(true);

		frame.add(label);
		frame.add(textField1);
		frame.add(textField2);
		frame.add(button);
		frame.add(button1);
		frame.add(res);

		frame.setLayout(new FlowLayout());
		frame.setSize(290, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			int num1 = Integer.parseInt(textField1.getText());
			int num2 = Integer.parseInt(textField2.getText());
			long result = num1 / num2;
			res.setText("Výsledek: " + result);
		}
		if (e.getSource() == button1) {
			Frame.frame.setVisible(true);
			frame.setVisible(false);
		}

	}
}