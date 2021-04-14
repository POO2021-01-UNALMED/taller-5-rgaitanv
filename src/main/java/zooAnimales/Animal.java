package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	
	
	
	public Animal( String nombre, int edad, String habitat, String genero, Zona zona) {
		super();
		totalAnimales ++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
	public Animal( String nombre, int edad, String habitat, String genero) {
		super();
		totalAnimales ++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;

	}
	
	public Animal() {
		
	}

	public String movimiento() {
		
		return "desplazarse";
	
	}
	
	public void totalPorTipo() {
		System.out.println("Mamiferos: " + Mamifero.cantidadMamiferos());
		System.out.println("Aves: " + Ave.cantidadAves() );
		System.out.println("Reptiles: " + Reptil.cantidadReptiles() );
		System.out.println("Peces: " + Pez.cantidadPeces() );
		System.out.println("Anfibios: " + Anfibio.cantidadAnfibios() );
		
	}
	
	public String toString() {
		return "Mi nombre es " + this.nombre +","+ "tengo una edad de " + this.edad+ ","
				+"habito en " + this.habitat + "y mi genero es "+ this.genero + ","+
				"la zona en la que me ubico es " + this.zona + "," +"en el " + this.zona.getZoo().getNombre();
	}


	public static int getTotalAnimales() {
		return totalAnimales;
	}


	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public Zona getZona() {
		return zona;
	}


	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	
	
	
	
}
