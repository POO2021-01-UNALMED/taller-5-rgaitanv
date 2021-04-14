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
		Animal.totalAnimales ++;
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}
	
	public Ave( String nombre, int edad, String habitat, String genero,
			  String colorPlumas) {
		super( nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
		Animal.totalAnimales ++;
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}
	
	public Ave() {
		totalAnimales ++;
		listado.add(this);
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
		
	}
		
	public static int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static void crearHalcon(String nombre, int edad,String genero) {
		Ave Halcon = new Ave(nombre, edad, "montanas",genero, "cafe glorioso");
		halcones ++;
		
	}
	
	public static void crearAguila(String nombre, int edad,String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas",genero, "blanco y amarillo");
		aguilas++;
	}

	public Object getColorPlumas() {
		// TODO Auto-generated method stub
		return colorPlumas;
	}

	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public static int getHalcones() {
		return halcones;
	}

	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}

	public static int getAguilas() {
		return aguilas;
	}

	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
}
