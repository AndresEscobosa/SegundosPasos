package serializacion;

import java.io.*;
import java.io.Serializable;
import java.util.*;

public class Serializando {
	public static void main(String[] args) {
		
		Administrador scrumMaster=new Administrador("Juan",80000,2020,8,13);
		scrumMaster.setIncentivo(5000);
		Empleado[] scrumTeam=new Empleado[4];
		scrumTeam[0]=scrumMaster;
		scrumTeam[1]=new Empleado("Ana",45000,2021,9,5);
		scrumTeam[2]=new Empleado("Andres",65000,2022,10,23);
		for(int i=0;i<3;i++) {
			System.out.println(scrumTeam[i].toString());
		}
		
		try {
			//ObjectOutputStream streamSerializar=new ObjectOutputStream(new FileOutputStream("C:/Users/Andres/Desktop/empleado.txt"));
			//streamSerializar.writeObject(scrumTeam);
			//streamSerializar.close();
			
			//ObjectInputStream streamDeserializar=new ObjectInputStream(new FileInputStream("C:/Users/Andres/Desktop/empleado.txt"));
			
			
		}catch(Exception e) {
			
		}
	}

}

class Empleado implements Serializable{
	
	private String nombre;
	private double sueldo;
	private Date fechaContrato;
	
	public Empleado(String n, double s, int agno, int mes, int dia) {//constructor
		
		nombre=n;
		sueldo=s;
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
		fechaContrato=calendario.getTime();	
	}

	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}
	
	public void subirSueldo(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}

	@Override
	public String toString() {
		return " [nombre=" + nombre + ", sueldo=" + sueldo + ", fechaContrato=" + fechaContrato + "]";
	}
}

class Administrador extends Empleado{
	
	private double incentivo;
	
	public Administrador(String n, double s, int agno, int mes, int dia) {
		
		super(n, s, agno, mes, dia);
		incentivo=0;
	}
	
	public double getSueldo() {
		
		double sueldoBase=super.getSueldo();
		return sueldoBase+incentivo;
	}
	
	public void setIncentivo(double b) {
		
		incentivo=b;
	}

	@Override
	public String toString() {
		return super.toString() +" [incentivo=" + incentivo + "]";
	}
	
}
