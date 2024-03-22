import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fenetre = new JFrame();
		fenetre.setTitle("HOTEL");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(900, 650) ;
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(false);
        fenetre.setAlwaysOnTop(true);
        fenetre.setVisible(true);
        ImageIcon image = new ImageIcon ("Royal Cliff Beach Hotel by DBALP");
        fenetre.setIconImage (image.getImage());
	}

}
