package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {
	
	public static void main(String[] args) {
		
		FrameBotones miFrame=new FrameBotones();
		miFrame.setVisible(true);
		miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class FrameBotones extends JFrame{
	
	public FrameBotones() {//constructor
		
		setBounds(450,200,450,300);
		setTitle("Eventos y Botones");
		PanelBotones mipanel=new PanelBotones();
		add(mipanel);
	}
}

class PanelBotones extends JPanel{
	
	JButton botonAzul=new JButton("Azul");
	JButton botonRojo=new JButton("Rojo");
	JButton botonAmarillo=new JButton("Amarillo");
	
	public PanelBotones() {//constructor
		
		add(botonAzul);
		add(botonRojo);
		add(botonAmarillo);
		
		ColorFondo Amarillo=new ColorFondo(Color.YELLOW);
		ColorFondo Azul=new ColorFondo(Color.BLUE);
		ColorFondo Rojo=new ColorFondo(Color.RED);
		
		botonAzul.addActionListener(Azul);
		botonRojo.addActionListener(Rojo);
		botonAmarillo.addActionListener(Amarillo);
	}
	
	private class ColorFondo implements ActionListener{
		
		private Color colorDeFondo;
		
		public ColorFondo(Color c) {//constructor
			
			colorDeFondo=c;
			
		}
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setBackground(colorDeFondo);
		}
		
		
	}

}


