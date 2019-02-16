package graficos;


import javax.swing.*;
import java.awt.Toolkit;
import java.awt.*;
public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado marco1=new MarcoCentrado();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class MarcoCentrado extends JFrame{
	
	public MarcoCentrado(){
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla=miPantalla.getScreenSize();
		
		int alturaPantalla=tamanoPantalla.height;
		int anchoPantalla=tamanoPantalla.width;
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		//setTitle("marcoCentrado");
		Image miIcono=miPantalla.getImage("src/graficos/egg.png");
		
		setIconImage(miIcono);

		setTitle("MARCO CENTRADO y REMANGADO");
		//comentrio remangado
		//Cambio en la nube para el PULL
	}
}
