package Manejo_de_archivos;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Random;
import java.io.IOException;

public class Archivo_modo_lectura
{
	static String delimitador = ","; //Separacion de datos
    public static float[] Leer_Contenido(String csvFile)
    {
        float calificacion_final[] =  new float[7]; //defines un arreglo que almacene números flotantes
        try
        {
            File archivo = new File(csvFile); //creas un 'archivo' de tipo File
            FileReader leer_archivo = new FileReader(archivo); //creas una forma de que se pueda leer el 'archivo' de tipo FileReader
            BufferedReader leer_texto = new BufferedReader(leer_archivo); //lee el contenido (texto) de un archivo de texto
            String linea = "";
            String[] arreglo; 
	            while((linea = leer_texto.readLine()) != null) //Mientras la linea no esté vacia
	            { 
	            	//Agrega desde el primer valor hasta el último valor del 'arreglo'
	            	//almacena los valores del archivo csv de forma separada para sólo tomar ciertos valores, gracias a delimiter
	            	arreglo = linea.split(delimitador); 
	                Random aleatorio = new Random(); 
	                for(int i=0; i<7; i++) 
	                {
	                	calificacion_final[i] =  S_F.String_Float(arreglo[aleatorio.nextInt(21)]);
	                }
	            }
	            leer_texto.close();
	            return calificacion_final;
        }
        //En caso contrario "catch" te devuelve un mensaje error
        catch(IOException ioe)
       	{
        	ioe.printStackTrace();
       	}
        return calificacion_final;
    }
}
