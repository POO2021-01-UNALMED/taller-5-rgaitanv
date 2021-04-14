package zooAnimales;
import gestion.Zona;

public class Animal {
	 static int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	protected Zona zona;
	
	
	
	
	public Animal( String nombre, int edad, String habitat, String genero, Zona zona) {
		super();
		totalAnimales ++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}
	public Animal( String nombre, int edad, String habitat, String genero) {
		super();
		totalAnimales ++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}

	}
	
	public Animal() {

		totalAnimales++;
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}

	public String movimiento() {
		
		return "desplazarse";
	
	}
	
	public static String totalPorTipo() {
		
		return "Mamiferos: " + Mamifero.cantidadMamiferos()+ "\n" +
				"Aves: " + Ave.cantidadAves()+"\n" +
				"Reptiles: " + Reptil.cantidadReptiles()+ "\n" +
				"Peces: " + Pez.cantidadPeces()+"\n"+
				"Anfibios: "+ Anfibio.cantidadAnfibios();

		
	}
	
	public String toString() {
		if(this.zona != null) {
		return "Mi nombre es " + this.nombre +","+ "tengo una edad de " + this.edad+ ","
				+"habito en " + this.habitat + "y mi genero es "+ this.genero + ","+
				"la zona en la que me ubico es " + this.zona + "," +"en el " + this.zona.getZoo().getNombre();
		}else {
			return "Mi nombre es "+ this.nombre +", tengo una edad de "+ this.edad +", habito en "
					+ this.habitat +" y mi genero es "+ this.genero;
		
		}
		
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
