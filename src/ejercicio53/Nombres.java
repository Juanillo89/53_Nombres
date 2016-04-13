/**
 * Gestiona una lista de nombres, sin repetir, de
 * un tama�o determinado.
 */
package ejercicio53;

/**
 * @author Juan
 */
public class Nombres
{

	private int cont;
	private String[] nombres;

	/**
	 * Construye la lista nombres
	 * @param maxNombres Indica el maximo de nombres a guardar
	 */
	public Nombres(int maxNombres)
	{
		nombres = new String[maxNombres];
		cont = 0;
	}

	/**
	 * A�ade un nombre a la lista
	 * @param nombre Nombre a introducir
	 * @return false si lista llena o repetido true en caso contrario
	 */
	public boolean anadir(String nombre)
	{
		if(cont < nombres.length)
		{
			for(int i = 0; i < cont; i++)
			{
				if(nombres[i].equals(nombre))
				{
					return false;
				}
			}
			nombres[cont] = nombre;
			cont++;
			return true;
		}
		return false;
	}

	/**
	 * Elimina un nombre
	 * @param nombre Nombre a eliminar
	 * @return true Si el nombre esta en la lista false Si no esta
	 */
	public boolean eliminar(String nombre)
	{
		boolean encontrado = false;
		int i = 0;
		while(i < cont && !encontrado)
		{
			if(nombre.equals(nombres[i]))
			{
				encontrado = true;
			}
			else
			{
				i++;
			}
		}
		if(encontrado)
		{
			for(int j = i; j < cont - 1; j++)
			{
				nombres[j] = nombres[j + 1];
			}
			cont--;
			return true;
		}
		return false;
	}

	/**
	 * Vacia la lista entera
	 */
	public void vaciar()
	{
		cont = 0;
	}

	/**
	 * Muestra un nombre
	 * @param posicion Posición del nombre en la lista, el primero es 0
	 * @return El nombre o null si no es posición válida
	 */
	public String mostrar(int posicion)
	{
		if(posicion < 0 || posicion >= cont)
		{
			return null;
		}
		return nombres[posicion];
	}

	/**
	 * Número de nombres
	 * @return El número de nombres actual
	 */
	public int numNombres()
	{
		return cont;
	}

	/**
	 * Máximo de nombres
	 * @return El máximo de nombres que puede albergar la lista
	 */
	public int maxNombres()
	{
		return nombres.length;
	}

	/**
	 * Está llena
	 * @return true Si está llena false Si no lo está
	 */
	public boolean estaLlena()
	{
		if(cont < nombres.length)
		{
			return false;
		}
		return true;
	}
}
