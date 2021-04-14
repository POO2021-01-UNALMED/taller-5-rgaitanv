package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
	
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	
	


	public Pez( String nombre, int edad, String habitat, String genero, Zona zona,
			 String colorEscamas, int catidadAletas) {
		super( nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = catidadAletas;
		listado.add(this);
	}

	public Pez( String nombre, int edad, String habitat, String genero,
			 String colorEscamas, int catidadAletas) {
		super( nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = catidadAletas;
		listado.add(this);
	}
	public Pez() {
		
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static void crearSalmon(String nombre, int edad,String genero) {
		Pez salmon = new Pez(nombre, edad,"oceano", genero, "rojo", 6 );
		salmones ++;
	}
	
	public static void crearBacalao(String nombre, int edad,String genero) {
		Pez bacalao = new Pez(nombre, edad,"oceano", genero, "gris", 6 );
		bacalaos++;
	}

	public int getCantidadAletas() {
		// TODO Auto-generated method stub
		return cantidadAletas;
	}

	public Object getColorEscamas() {
		// TODO Auto-generated method stub
		return colorEscamas;
	}
}
