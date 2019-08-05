import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class applet_4 extends Applet{
	public void init(){
		setBackground(Color.YELLOW);
		resize(400,400);
	}
	public void paint(Graphics g){
		g.drawString("Applet background changed to yellow",150,150);
	}
}