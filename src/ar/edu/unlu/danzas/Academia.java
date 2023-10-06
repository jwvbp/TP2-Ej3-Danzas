package ar.edu.unlu.danzas;

import java.util.ArrayList;

public class Academia {
	private ArrayList<Clase> miClase = new ArrayList<Clase>();
	private ArrayList<Alumno> miAlumno = new ArrayList<Alumno>();
	private ArrayList<Profesor> miProfesor = new ArrayList<Profesor>();

	public void agregarProfesor(Profesor profesor) {
		miProfesor.add(profesor);
	}

	public void agregarClase(Clase clase) {
		miClase.add(clase);
	}

	public void agregarAlumno(Alumno alumno) {
		miAlumno.add(alumno);
	}

	public void asistencia(String danza, String nivel, String alumno) {
		for (int i = 0; i < miAlumno.size(); i++) {
			if (alumno == (miAlumno.get(i).getNombre())) {
				for (int j = 0; j < miClase.size(); j++) {
					if ((danza == (miClase.get(j).getNombre()) && nivel == (miClase.get(j).getNivel()))) {
						miClase.get(j).marcarAsistencia();
					}
				}
			}
		}

	}
public void sueldos() {
	int cantidad = 0;
	for (int i = 0; i < miProfesor.size(); i++) {
		cantidad = 0;
		for (int j = 0; j < miClase.size(); j++) {
		if (miProfesor.get(i).equals(miClase.get(j).getProfesor())) {
			cantidad = cantidad + miClase.get(j).getCantAlumnos();
		}
	}
System.out.println("profe:" + miProfesor.get(i).toString() + "  "+cantidad + " alumnos" + " ->Total: " + (cantidad * 10));
	
}
}
public void listarClases() {
	for (int i = 0; i < miClase.size(); i++) {
		System.out.println(miClase.get(i).toString());
	}
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((miClase == null) ? 0 : miClase.hashCode());
	result = prime * result + ((miProfesor == null) ? 0 : miProfesor.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Academia other = (Academia) obj;
	if (miClase == null) {
		if (other.miClase != null)
			return false;
	} else if (!miClase.equals(other.miClase))
		return false;
	if (miProfesor == null) {
		if (other.miProfesor != null)
			return false;
	} else if (!miProfesor.equals(other.miProfesor))
		return false;
	return true;
}











}
