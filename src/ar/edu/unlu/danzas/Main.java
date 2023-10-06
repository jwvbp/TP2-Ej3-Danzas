package ar.edu.unlu.danzas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Academia miAcademia = new Academia();

		Profesor profesor1 = new Profesor("profe juan");
		Clase clase = new Clase("Tango", "Inicial", "Lunes y Viernes", "tarde", profesor1);
		miAcademia.agregarProfesor(profesor1);
		miAcademia.agregarClase(clase);

		Profesor profesor2 = new Profesor("profe dante");
		Clase clase2 = new Clase("Tango", "Intermedio", "Martes y Sabado", "tarde", profesor2);
		miAcademia.agregarProfesor(profesor2);
		miAcademia.agregarClase(clase2);

		Profesor profesor3 = new Profesor("profe maria");
		Clase clase3 = new Clase("Tango", "Avanzado", "Miercoles y Jueves", "noche", profesor3);
		miAcademia.agregarProfesor(profesor3);
		miAcademia.agregarClase(clase3);

		Clase clase4 = new Clase("Arabe", "Inicial", "Lunes y Martes", "noche", profesor1);
		miAcademia.agregarClase(clase4);

		Clase clase5 = new Clase("Arabe", "Intermedio", "Miercoles y Jueves", "noche", profesor2);
		miAcademia.agregarClase(clase5);

		Profesor profesor4 = new Profesor("profe aladdin");
		Clase clase6 = new Clase("Arabe", "Avanzado", "Viernes y Sabado", "noche", profesor4);
		miAcademia.agregarProfesor(profesor4);
		miAcademia.agregarClase(clase6);

		Alumno alumno1 = new Alumno("alumno Gutierrez");
		miAcademia.agregarAlumno(alumno1);
		Alumno alumno2 = new Alumno("alumno Gonzales");
		miAcademia.agregarAlumno(alumno2);
		Alumno alumno3 = new Alumno("alumno Alberoni");
		miAcademia.agregarAlumno(alumno3);
		Alumno alumno4 = new Alumno("alumno Rosso");
		miAcademia.agregarAlumno(alumno4);
		System.out.println("----listar clases-----"); 
		miAcademia.listarClases();
		
		miAcademia.asistencia("Tango", "Inicial", "alumno Gutierrez");
		miAcademia.asistencia("Tango", "Inicial", "alumno Gonzales");
		miAcademia.asistencia("Tango", "Inicial", "alumno Alberoni");
		miAcademia.asistencia("Tango", "Intermedio", "alumno Rosso");
		System.out.println("----asistencia 4 alumnos-----"); 
		
		miAcademia.listarClases();
		miAcademia.asistencia("Tango", "Inicial", "alumno Gutierrez");
		System.out.println("----asistencia 1 alumno mas-----"); 
		
		miAcademia.listarClases();
		System.out.println("----sueldos (alumnos por profesor)-----"); 
		
		miAcademia.sueldos();
	}
}
