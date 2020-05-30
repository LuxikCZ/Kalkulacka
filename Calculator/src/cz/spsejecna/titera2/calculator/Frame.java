package cz.spsejecna.titera2.calculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//12.05.2020
public class Frame implements ActionListener {
	
	static JFrame frame = new JFrame("Kalkulačka - Menu");
	JLabel label = new JLabel("Jakou operaci chcete provést?");
	JButton button1 = new JButton("Sčítání");
	JButton button2 = new JButton("Odčítání");
	JButton button3 = new JButton("Násobení");
	JButton button4 = new JButton("Dělení");
	
	public Frame() {
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		frame.add(label);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		
		frame.setLayout(new FlowLayout());
		frame.setSize(250, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			Frame1 frame1 = new Frame1();
			frame.setVisible(false);
		}
		if(e.getSource() == button2) {
			Frame2 frame2 = new Frame2();
			frame.setVisible(false);
		}
		if(e.getSource() == button3) {
			Frame3 frame3 = new Frame3();
			frame.setVisible(false);
		}
		if(e.getSource() == button4) {
			Frame4 frame4 = new Frame4();
			frame.setVisible(false);
		}
		
	}

}
