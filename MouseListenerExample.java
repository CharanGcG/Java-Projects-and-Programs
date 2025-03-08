import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame implements MouseListener {

    private String message = ""; // Message to be displayed

    public MouseListenerExample() {
        addMouseListener(this); // Register the mouse listener with the frame
        setSize(300, 300); // Set the size of the frame
        setVisible(true); // Make the frame visible
	addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
	System.exit(0);
	}
	});

    }

    public void mouseClicked(MouseEvent e) {
        message = "Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")";
        repaint(); // Request repainting to display the message
    }

    public void mousePressed(MouseEvent e) {
        message = "Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")";
        repaint(); // Request repainting to display the message
    }

    public void mouseReleased(MouseEvent e) {
        message = "Mouse Released at: (" + e.getX() + ", " + e.getY() + ")";
        repaint(); // Request repainting to display the message
    }

    public void mouseEntered(MouseEvent e) {
        message = "Mouse Entered";
        repaint(); // Request repainting to display the message
    }

    public void mouseExited(MouseEvent e) {
        message = "Mouse Exited";
        repaint(); // Request repainting to display the message
    }

    public void paint(Graphics g) {
        super.paint(g); // Call superclass paint method
        g.drawString(message, 20, 40); // Draw the message at (20, 40)
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
