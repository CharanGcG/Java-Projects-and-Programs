import java.awt.*;
import java.awt.event.*;

public class Shapes extends Frame
{

public Shapes()
{
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
System.exit(0);
}
});
}

public void paint(Graphics g)
{
g.setColor(Color.blue);
g.drawRect(100,100,100,50);
g.fillRect(100,100,100,50);

g.setColor(Color.red);
g.drawOval(250,100,75,75);
g.fillOval(250,100,75,75);

g.setColor(Color.yellow);
g.drawRoundRect(400,100,100,50,20,20);
g.fillRoundRect(400,100,100,50,20,20);


g.setColor(Color.green);
g.drawRect(100,200,60,60);
g.fillRect(100,200,60,60);

g.setColor(Color.pink);
g.drawOval(200,200,100,50);
g.fillOval(200,200,100,50);

int xpoints[] = {100,150,180,100};
int ypoints[] = {350,380,440,440};
int number_of_points = 4;

g.setColor(Color.red);
g.drawPolygon(xpoints,ypoints,number_of_points);


int xpoints2[] = {100,200,100,200};
int ypoints2[] = {500,500,800,800};
int number_of_points2 = 4;

g.setColor(Color.red);
g.drawPolygon(xpoints2,ypoints2,number_of_points2);

}

public static void main(String[] args)
{
Shapes shapes = new Shapes();
shapes.setSize(1000,1000);
shapes.setVisible(true);
shapes.setTitle("Drawing Shapes");
}

}