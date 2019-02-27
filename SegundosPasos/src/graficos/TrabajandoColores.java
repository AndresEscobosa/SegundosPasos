package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameConColor miframe=new FrameConColor();
		miframe.setVisible(true);
		miframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}

class FrameConColor extends JFrame{
	
	public FrameConColor() {//constructor
		
		setTitle("Prueba con color");
		setSize(400,400);
		PanelConColor mipanel=new PanelConColor();
		add(mipanel);
		mipanel.setBackground(new Color(60,60,70));
		
		
	}
}

class PanelConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2D=(Graphics2D)g;
		
		Rectangle2D mirectangulo=new Rectangle2D.Double(100, 100, 200, 150);
		Color micolor=new Color(10,90,130);
		g2D.setPaint(micolor);
		g2D.fill(mirectangulo);
		
		Ellipse2D mielipse=new Ellipse2D.Double();
		mielipse.setFrame(mirectangulo);
		g2D.setPaint(new Color(110,8,42));
		g2D.fill(mielipse);
		
		//g2D.draw(new Ellipse2D.Double(100, 100, 200, 150));
		
	}
	
}