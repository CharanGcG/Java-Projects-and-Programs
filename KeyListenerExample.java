import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends Frame implements KeyListener {

    private String message = ""; // Message to be displayed

    public KeyListenerExample() {
        addKeyListener(this); // Register the key listener with the frame
        setSize(300, 300); // Set the size of the frame
        setVisible(true); // Make the frame visible
	addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
	System.exit(0);
	}
	});

    }

    public void keyPressed(KeyEvent e) {
        message = "Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode());
        repaint(); // Request repainting to display the message
    }

    public void keyReleased(KeyEvent e) {
        message = "Key Released: " + KeyEvent.getKeyText(e.getKeyCode());
        repaint(); // Request repainting to display the message
    }

    public void keyTyped(KeyEvent e) {
        message = "Key Typed: " + e.getKeyChar();
        repaint(); // Request repainting to display the message
    }

    public void paint(Graphics g) {
        super.paint(g); // Call superclass paint method
        g.drawString(message, 20, 40); // Draw the message at (20, 40)
    }

    

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
