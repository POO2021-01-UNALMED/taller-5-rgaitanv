package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
	
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	
	

	public Reptil( String nombre, int edad, String habitat, String genero, Zona zona,
			 String colorEscamas, int largoCola) {
		super( nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}

	public Reptil( String nombre, int edad, String habitat, String genero, 
			 String colorEscamas, int largoCola) {
		super( nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}

	public Reptil() {
		
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad,String genero) {
		Reptil iguana = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas++;
	}
	
	public void crearSerpiente(String nombre, int edad,String genero) {
		Reptil serpiente = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		serpientes++;
	}
	
	
}
