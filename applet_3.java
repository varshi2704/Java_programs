import java.applet.*;
import java.awt.*;
public class applet_3 extends Applet{
public void init(){
	resize(500,500);
}
public void paint(Graphics g){
	g.drawString("Window has been resized to size 500,500",50,50);
}
}