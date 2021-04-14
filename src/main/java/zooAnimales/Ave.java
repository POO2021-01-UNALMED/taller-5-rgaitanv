package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	


	public Ave( String nombre, int edad, String habitat, String genero, Zona zona,
			  String colorPlumas) {
		super( nombre, edad, habitat, genero, zona);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public Ave( String nombre, int edad, String habitat, String genero,
			  String colorPlumas) {
		super( nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public Ave() {
		
	}
		
	public static int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad,String genero) {
		Ave Halcon = new Ave(nombre, edad, "montanas",genero, "cafe glorioso");
		halcones ++;
		
	}
	
	public void crearAguila(String nombre, int edad,String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas",genero, "blanco y amarillo");
		aguilas++;
	}
}
