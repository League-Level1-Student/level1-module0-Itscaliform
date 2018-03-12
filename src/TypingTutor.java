

	import java.awt.Dimension;
import java.awt.Frame;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
	import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
	import javax.swing.JTextField;

	


	public class TypingTutor implements ActionListener {
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
			frame.add(Panel);
			Panel.add(label);
			
			
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
}
