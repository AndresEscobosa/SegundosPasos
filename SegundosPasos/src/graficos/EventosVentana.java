package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class EventosVentana {
	
	public static void main(String[] args) {
		
		FrameWindow miFrame=new FrameWindow();
		
		miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFrame.setTitle("Ventana 1");
		miFrame.setBounds(300, 300, 500, 350);
		
		FrameWindow miFrame2=new FrameWindow();
		
		miFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		miFrame2.setTitle("Ventana 2");
		miFrame2.setBounds(800, 300, 500, 350);
	}
	
}

class FrameWindow extends JFrame{
	
	public FrameWindow() {//constructor
		
		setVisible(true);
		
		//M_Ventana oyente_ventana=new M_Ventana();
		addWindowListener(new M_Ventana());
	}
	
}

class M_Ventana extends WindowAdapter{

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana minimizada");	
	}

}