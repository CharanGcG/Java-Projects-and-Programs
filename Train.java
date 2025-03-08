import java.awt.*;
import java.awt.event.*;

public class Train extends Frame
{
public void paint(Graphics g)
{
super.paint(g);

g.drawRect(100,100,100,50);
g.drawOval(120,150,20,20);
g.drawOval(160,150,20,20);

g.drawLine(200,125,250,125);

g.drawRect(250,100,100,50);
g.drawOval(270,150,20,20);
g.drawOval(310,150,20,20);

g.drawLine(350,125,400,125);

g.drawRect(400,100,100,50);
g.drawOval(420,150,20,20);
g.drawOval(460,150,20,20);

g.drawRect(460,80,20,20);
g.drawArc(460, 60, 20, 20, -90, 180);
g.drawArc(465, 50, 10, 10, -90, 180);

}

public Train()
{
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
System.exit(0);}
});
}


public static void main(String[] args)
{
Train train = new Train();
train.setSize(1000,1000);
train.setVisible(true);

}

}