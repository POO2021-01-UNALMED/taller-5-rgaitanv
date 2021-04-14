package gestion;

import java.util.ArrayList;


public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zonas; 
	
	
	
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	public Zoologico(String nombre, String ubicacion) {

		this.nombre = nombre;
		this.ubicacion = ubicacion;

	}
	
	public Zoologico() {
		
	}
	
	
	
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int totalAnimales = 0;
		for(int i=0 ; i< zonas.size(); i++) {
			totalAnimales += zonas.get(i).cantidadAnimales();
		}
		return totalAnimales;
	}

	
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

	
	
	
	
}
