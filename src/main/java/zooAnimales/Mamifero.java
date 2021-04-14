package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
	
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	
	
	public Mamifero( String nombre, int edad, String habitat, String genero,  Zona zona,
			 boolean pelaje, int patas) {
		super( nombre, edad, habitat, genero, zona);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}

	
	public Mamifero( String nombre, int edad, String habitat, String genero, 
			 boolean pelaje, int patas) {
		super( nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	public Mamifero() {
		super();
		// TODO Auto-generated constructor stub
	}


	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static void crearCaballo(String nombre,int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre,edad,"pradera",genero,true,4);
		caballos ++;
		
	}
	
	public static void crearLeon(String nombre,int edad, String genero) {
		Mamifero leon = new Mamifero(nombre,edad,"selva",genero,true,4);
		leones ++;
		
	}


	public int getPatas() {
		// TODO Auto-generated method stub
		return patas;
	}


	public boolean isPelaje() {
		// TODO Auto-generated method stub
		return pelaje;
	}
}
