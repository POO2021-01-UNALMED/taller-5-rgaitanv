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
		Animal.totalAnimales ++;
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}

	
	public Mamifero( String nombre, int edad, String habitat, String genero, 
			 boolean pelaje, int patas) {
		super( nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
		Animal.totalAnimales ++;
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}
	public Mamifero() {
		totalAnimales ++;
		listado.add(this);
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
		
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


	public static ArrayList<Mamifero> getListado() {
		return listado;
	}


	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}


	public static int getCaballos() {
		return caballos;
	}


	public static void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}


	public static int getLeones() {
		return leones;
	}


	public static void setLeones(int leones) {
		Mamifero.leones = leones;
	}


	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}


	public void setPatas(int patas) {
		this.patas = patas;
	}
	
}
