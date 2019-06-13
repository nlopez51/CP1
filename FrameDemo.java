import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");  // says that its new 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the text
		frame.setSize(10000, 10000); // makes the size 400
        
        DrawingProject r = new DrawingProject();
        frame.add(r);

		frame.setVisible(true); // makes the statement true
	}
}
