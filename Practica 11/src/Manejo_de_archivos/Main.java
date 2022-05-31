package Manejo_de_archivos;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        Alumno alumno0 = new Alumno("Josue Aguirre", 1278863);
        Alumno alumno1 = new Alumno("Rogelio Zepeda", 1266504);
        Alumno alumno2 = new Alumno("Cesar Lopez", 1272041);
        alumnos.add(alumno0);
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        String dirección = "C:/Users/jar_1/eclipse-workspace/Practica 11/practica11.csv";
        for(Alumno alumno: alumnos)
        {
            alumno.AgregarCalificaciones(Archivo_modo_lectura.Leer_Contenido(dirección));
            alumno.AgregarAlumno();
        }
        System.out.println("El archivo se ha generado junto a su información de manera existosa");
    }
}