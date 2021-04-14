package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	
	
	
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona,
			 String colorPiel, boolean venenoso) {
		super( nombre, edad, habitat, genero, zona);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}

	public Anfibio(String nombre, int edad, String habitat, String genero, 
			 String colorPiel, boolean venenoso) {
		super( nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}

	public Anfibio() {
		
	}

	
	
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad,String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true );
		ranas++;
	}
	
	public void crearSalamandra(String nombre, int edad,String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false );
		salamandras++;
	}
}
