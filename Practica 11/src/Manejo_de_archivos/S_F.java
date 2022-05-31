package Manejo_de_archivos;

public class S_F
{
    public static float String_Float(String string)
    {
        //En "try" realiza la conversión y de igual manera regresarlo
    	try
        {
            float numero = Float.parseFloat(string);
            return numero;
        }
    	//En caso contrario "catch" te devuelve un mensaje error
        catch(NumberFormatException nfe)
        {
        	nfe.printStackTrace();
        }
        return 0;
    }
}
