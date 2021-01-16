package utils;

public class QuickSort {

	// TODO: adaptar método quicksort para que ordene jugadores
	public static void quicksort (Jugador a[], int primero, int ultimo)
	{
		Jugador pivote;
		Jugador tmp;
		int i, j, central;
		central= (primero+ultimo)/2;
		pivote= a[central];
		i=primero;
		j=ultimo;
		do
		{
			if(a[i].esAlta && a[j].esAlta)
			{
				while (a[i].puntuacion<pivote.puntuacion) i++;
				while (a[j].puntuacion>pivote.puntuacion) j--;
				
				if (i<=j)
				{
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
					i++;
					j--;
				}
			}
		}while(i<=j);
		if (primero<j) quicksort (a, primero, j);
		if (i<ultimo) quicksort (a, i, ultimo);
			
	}

}
