import java.awt.*;
import java.awt.event.*;

public class MouseMotionListenerExample extends Frame implements MouseMotionListener {

    Label label;

    public MouseMotionListenerExample() {
        setTitle("Mouse Motion Listener Example");
        
        label = new Label("Move the mouse...");
        label.setBounds(20, 50, 200, 30);
        add(label);
        
        addMouseMotionListener(this); // Registering the MouseMotionListener
        
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        
        // Handle closing of the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void mouseDragged(MouseEvent e) {
        // Invoked when the mouse is dragged with a button pressed
        String text = "Mouse dragged at (" + e.getX() + ", " + e.getY() + ")";
        label.setText(text);
    }

    public void mouseMoved(MouseEvent e) {
        // Invoked when the mouse is moved
        String text = "Mouse moved at (" + e.getX() + ", " + e.getY() + ")";
        label.setText(text);
    }

    public static void main(String[] args) {
        new MouseMotionListenerExample();
    }
}
