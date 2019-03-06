package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {
	public static void main(String[] args) {
		
		FrameConTeclas miFrame=new FrameConTeclas();
		miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	}

}

class FrameConTeclas extends JFrame{
	
	public FrameConTeclas() {//constructor
		setVisible(true);
		setBounds (700,300,600,450);
		
		EventoDeTeclado tecla=new EventoDeTeclado();
		addKeyListener(tecla);
	}
}

class EventoDeTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//int codigo=e.getKeyCode();
		//System.out.println(codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		char letra=e.getKeyChar();
		System.out.println(letra);
		
	}
	
}