package ar.edu.unlu.danzas;

public class Clase {
private String nombre;
private String nivel;
private String dias;
private String horario;
private Profesor profesor;
private int cantAlumnos = 0;


public String getNombre() {
	return nombre;
}


private void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getNivel() {
	return nivel;
}


private void setNivel(String nivel) {
	this.nivel = nivel;
}


private String getDias() {
	return dias;
}


private void setDias(String dias) {
	this.dias = dias;
}


private String getHorario() {
	return horario;
}


private void setHorario(String horario) {
	this.horario = horario;
}


public Profesor getProfesor() {
	return profesor;
}


private void setProfesor(Profesor profesor) {
	this.profesor = profesor;
}


int getCantAlumnos() {
	return cantAlumnos;
}


public void setCantAlumnos(int cantAlumnos) {
	this.cantAlumnos = cantAlumnos;
}


public Clase(String nombre, String nivel, String dias, String horario, Profesor profesor) {
	super();
	this.nombre = nombre;
	this.nivel = nivel;
	this.dias = dias;
	this.horario = horario;
	this.profesor = profesor;
}

public void marcarAsistencia() {
	cantAlumnos++;
}


@Override
public String toString() {
	return "Clase [nombre=" + nombre + ", nivel=" + nivel + ", dias=" + dias + ", horario=" + horario + ", profesor="
			+ profesor + ", cantAlumnos=" + cantAlumnos + "]";
}

}
