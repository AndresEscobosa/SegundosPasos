package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.*;

public class CambioEstado {
	public static void main(String[] args) {
		
		FrameEstado miFrame=new FrameEstado();
		miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class FrameEstado extends JFrame{
	
	public FrameEstado() {
		CambiaEstado CE=new CambiaEstado();
		setVisible(true);
		setBounds(400,300,500,350);
		addWindowStateListener(CE);
	}
	
}

class CambiaEstado implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Hubo un cambio de estado");
		
		//System.out.println(e.getNewState());
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana está a pantalla completa");
		}else if(e.getNewState()==Frame.NORMAL) {
			System.out.println("La ventana está normal");
		}else if(e.getNewState()==Frame.ICONIFIED) {
			System.out.println("La ventana está minimizada");
		}
	}
	
}
