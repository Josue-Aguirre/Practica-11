package Manejo_de_archivos;

public class Alumno 
{
	String nombre;
	int matricula;
	float calificaciones[] = new float[7];
	float promedioGeneral;
	public Alumno(String nombre, int matricula)
	{
	    setNombre(nombre);
	    setMatricula(matricula);
	}
	public void setNombre(String nombre)
	{
	    this.nombre = nombre;
	}
	public String getNombre()
	{
	    return nombre;
	}
	public void setMatricula(int matricula)
	{
	    this.matricula = matricula;
	}
	public int getMatricula()
	{
	    return matricula;
	}
	public void setCalificaciones(float[] calificaciones)
	{
	    this.calificaciones = calificaciones;
	}
	public float[] getCalificaciones()
	{
	    return calificaciones;
	}
	public void setPromedioGeneral(float promedioGeneral)
	{
	    this.promedioGeneral = promedioGeneral;
	}
	public float getPromedioGeneral()
	{
	    CalcularPromedio();
	    return promedioGeneral;
	}
	//genera las calificaciones dentro del rango del arreglo float[7]
	public void AgregarCalificaciones(float[] Array)
	{
	    for(int i=0; i<7; i++)
	    {
	        setCalificaciones(Array); 
	    }
	}
	public void MostrarCalificaciones()
	{
	    for(float cal: calificaciones)
	    {
	        System.out.println(cal);
	    }
	}
	public void MostrarAlumno(Alumno alumno)
	{
	    System.out.println("Nombre: " + alumno.getNombre());
	    System.out.println("Matricula: " + alumno.getMatricula()); 
	    MostrarCalificaciones();
	    System.out.println("");
	}
	public void CalcularPromedio()
	{
	    float calificacionTemporal = 0;
	    for(float cal: calificaciones)
	    {
	        calificacionTemporal += cal;
	    }
	    setPromedioGeneral(calificacionTemporal/(calificaciones.length));
	}
	public void AgregarAlumno()
	{
		Archivo_modo_escritura.Texto("Nombre: "+ getNombre());
	    System.out.println("Nombre: " + getNombre());
	    Archivo_modo_escritura.Texto("Matricula: "+ Integer.toString(getMatricula()));
	    System.out.println("Matricula: " + getMatricula());
	    Archivo_modo_escritura.Texto("Calificaciones:");
	    System.out.println("Calificaciones:");
	    for(int i=0; i<7; i++)
	    {
	    	Archivo_modo_escritura.Texto(Float.toString(calificaciones[i]));
	        System.out.println(calificaciones[i]);
	    }
	    Archivo_modo_escritura.Texto("Promedio: "+ Float.toString(getPromedioGeneral()));
	    System.out.println("Promedio: " + getPromedioGeneral());
	    Archivo_modo_escritura.Texto("\n");
	    System.out.println("\n");
	}
}