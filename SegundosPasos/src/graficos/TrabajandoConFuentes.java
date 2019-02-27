package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class FrameConFont extends JFrame{
	
	public FrameConFont() {//constructor
		
		setTitle("Prueba con font");
		setSize(400,400);
		
		PanelConFont mipanel=new PanelConFont();
		add(mipanel);
	}
}

class PanelConFont extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
	}
}
