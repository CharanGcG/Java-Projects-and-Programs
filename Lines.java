import java.awt.*;
import java.awt.event.*;

public class Lines extends Frame
{
public void paint(Graphics g)
{
super.paint(g);
g.setColor(Color.red);
g.drawLine(50,50,150,50);
g.setColor(Color.blue);
g.drawRect(100,100,100,50);
}

public Lines()
{
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
System.exit(0);}
});
}


public static void main(String[] args)
{
Lines lines = new Lines();
lines.setSize(1000,1000);
lines.setVisible(true);
//lines.setBackground(Color.black);
}

}