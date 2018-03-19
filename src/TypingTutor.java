

	import java.awt.Dimension;
import java.awt.Frame;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
	import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
	import javax.swing.JTextField;

	


	public class TypingTutor implements ActionListener, KeyListener {
		 char currentLetter = generateRandomLetter();
		 JLabel label;
		 JPanel Panel;
		JFrame frame;
	String robert= currentLetter+ "";
		public void createUI() {
			  
		label= new JLabel();
			frame = new JFrame();
			Panel = new JPanel();
			frame.setPreferredSize(	new Dimension(800,600));
			label.setText(robert);
			label.setFont(label.getFont().deriveFont(28.0f));
			label.setHorizontalAlignment(JLabel.CENTER);  
			frame.add(Panel);
			Panel.add(label);
			frame.addKeyListener(this);
			
			frame.pack();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		
		public static void main(String[] args) {
			new TypingTutor().createUI();
			
		
		
	}
		char generateRandomLetter() {
		    Random r = new Random();
		    return (char) (r.nextInt(26) + 'a');
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("you typed: "+arg0.getKeyChar());
			if(arg0.getKeyChar()==currentLetter) {
				System.out.println("correct");
	
			}
			else {
				System.out.println("wrong");
			}
		}


		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
			currentLetter = generateRandomLetter();
			String roberto= currentLetter+ "";
		label.setText(roberto);
		
		}


		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
}
