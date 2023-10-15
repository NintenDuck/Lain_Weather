import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageInstancer extends JFrame{
	JFrame frame;
	ImageIcon image;
	JLabel displayField;
	public ImageInstancer() {
		frame = new JFrame("Image Display Test");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		try {
			image = new ImageIcon(getClass().getResource( "cloudy.png" ));
			Image originalImage = image.getImage();
			Image resizedImage = originalImage.getScaledInstance(200, 200, DO_NOTHING_ON_CLOSE);
			image = new ImageIcon( resizedImage );
			displayField = new JLabel( image );
			frame.add( displayField );
		} catch (Exception e) {
			System.out.println("Image couldn't be found");
		}
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		ImageInstancer image = new ImageInstancer();
	}
}
