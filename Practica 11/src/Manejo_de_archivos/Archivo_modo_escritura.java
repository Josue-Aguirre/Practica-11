package Manejo_de_archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo_modo_escritura
{
	public static void Texto(String string)
	 {
	        File archivo = new File("Historial.txt"); //Creas un archivo de texto de tipo File, en este caso se llama: Historial
	        try //Almacena los datos de cada alumno 
	        {
	            FileWriter escribir_archivo = new FileWriter(archivo, true);
	            escribir_archivo.write(string);
	            escribir_archivo.write(System.getProperty("line.separator"));
	            escribir_archivo.close();

	        }
	        //En caso contrario "catch" te devuelve un mensaje error
	        catch (IOException ioe) 
	        {
	            System.out.println("Ha ocurrido un error.");
	            ioe.printStackTrace();
	        }
	 }
}
