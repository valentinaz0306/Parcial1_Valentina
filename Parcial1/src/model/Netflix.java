package model;

public class Netflix {
	
	private String año;
	private String categoria;
	private String reating;
	private String nombre;

	public Netflix(String nombre,String año,String reating,String categoria) {
		this.año=año;	
		this.categoria=categoria;	
		this.reating=reating;	
		this.nombre=nombre;	
	
}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getReating() {
		return reating;
	}

	public void setReating(String reating) {
		this.reating = reating;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

}
