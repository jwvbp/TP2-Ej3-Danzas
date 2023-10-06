package ar.edu.unlu.danzas;



public class Profesor {
	private String nombre;
	
	
public Profesor(String nombre) {
		this.nombre = nombre;// TODO Auto-generated constructor stub
	}


private String getNombre() {
	return nombre;
}


private void setNombre(String nombre) {
	this.nombre = nombre;
}


@Override
public String toString() {
	return "Profesor [nombre=" + nombre + "]";
}

}
