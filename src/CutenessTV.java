import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV extends JPanel implements Runnable, MouseListener, ActionListener {
	JFrame realone= new JFrame();
	JPanel realtwo = new JPanel();
	JButton kittys = new JButton();
	JButton dogs = new JButton();
	JButton turtles = new JButton();
	
	public static void main(String[] args) {
		new CutenessTV().UI();
	}






	private void UI() {
		// TODO Auto-generated method stub
		realone.add(realtwo);
		kittys.setText("kittys");
		dogs.setText("dogs");
		turtles.setText("turtles");
		realtwo.add(dogs);
		realtwo.add(kittys);
		realtwo.add(turtles);
		realone.setVisible(true);
		kittys.addActionListener( this);
		dogs.addActionListener( this);
		turtles.addActionListener(this);
		
 realone.pack();
		
	}






	//Make a user interface with 3 buttons that will play different videos depending on which button is clicked. Use the methods below to play the cutest videos ever.

	void showDucks() {
	        playVideo("Drirjl5K9Yk");
	    }

	    void showFrog() {
	        playVideo("aSjCb-FfxhI");
	    }
	    
	    void showFluffyUnicorns() {
	        playVideo("qRC4Vk6kisY");
	    }

	    void playVideo(String videoID) {
	        try {
	    URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
	            java.awt.Desktop.getDesktop().browse(uri);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
	