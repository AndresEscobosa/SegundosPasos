package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConDibujos mimarco=new MarcoConDibujos();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {//constructor
		
		setTitle("prueba de Dibujo");
		setSize(400,400);
		
		LaminaConFiguras milamina=new LaminaConFiguras();
		add(milamina);
	}
}

class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		Rectangle2D rectangulo=new Rectangle2D.Double(100, 100, 200, 150);
		g2.draw(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		double CentroEnX=rectangulo.getCenterX();
		double CentroEnY=rectangulo.getCenterY();
		double radio=150;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		circulo.setFrameFromCenter(CentroEnX, CentroEnY, CentroEnX+radio, CentroEnY+radio);
		g2.draw(circulo);
	}
}

