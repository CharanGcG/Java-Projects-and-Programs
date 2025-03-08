import java.awt.*;
import java.awt.event.*;

public class MouseCharan extends Frame implements MouseListener
{

TextField tf;

public MouseCharan()
{

addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){System.exit(0);}
});
Label l = new Label("Click To Know My Name!");
tf = new TextField();
Button b = new Button("Display");

tf.setBounds(100,100,100,40);
b.setBounds(120,150,50,20);

b.addMouseListener(this);
add(l);add(tf);add(b);

setLayout(null);
setSize(1000,1000);
setVisible(true);
}

public void mouseClicked(MouseEvent e)
{
tf.setText("Charan");
}

public void mouseReleased(MouseEvent e){}
public void mousePressed(MouseEvent e){}
public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e){}


public static void main(String[] args)
{
MouseCharan m = new MouseCharan();


}

}