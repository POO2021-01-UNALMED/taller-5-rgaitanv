package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private static ArrayList<Animal> animales;
	
	


	public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales) {
		super();
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	public Zona(String nombre, Zoologico zoo) {
		super();
		this.nombre = nombre;
		this.zoo = zoo;

	}




	public Zona() {
		
	}
	
	
	
	
	public static void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		int numeroAnimales = this.animales.size();
		 	return numeroAnimales;
	}
	
	
	
	


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Zoologico getZoo() {
		return zoo;
	}


	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}





	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
}
