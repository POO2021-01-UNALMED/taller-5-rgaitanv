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
		Animal.totalAnimales ++;
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}

	public Reptil( String nombre, int edad, String habitat, String genero, 
			 String colorEscamas, int largoCola) {
		super( nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
		Animal.totalAnimales ++;
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}

	public Reptil() {
		Animal.totalAnimales ++;
		listado.add(this);
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static void crearIguana(String nombre, int edad,String genero) {
		Reptil iguana = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas++;
	}
	
	public static void crearSerpiente(String nombre, int edad,String genero) {
		Reptil serpiente = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		serpientes++;
	}

	public int getLargoCola() {
		// TODO Auto-generated method stub
		return largoCola;
	}

	public Object getColorEscamas() {
		// TODO Auto-generated method stub
		return colorEscamas;
	}

	public static ArrayList<Reptil> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}

	public static int getIguanas() {
		return iguanas;
	}

	public static void setIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}

	public static int getSerpientes() {
		return serpientes;
	}

	public static void setSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	
}
