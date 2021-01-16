package utils;
import java.util.Scanner;

public class Campeonato { 
	
	boolean existeID=false;
	TablaDispersa campeonato = new TablaDispersa();
	
	
	public void insertarJugador() {	
		String nombre = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el nombre del jugador");
		
		if(input.hasNextLine()){
			  nombre = input.nextLine();
		}	
		Jugador j = new Jugador(nombre);

		campeonato.insertar(j);	
		
	}
	
	boolean isEmpty()
	{
		if(campeonato.numJugadores == 0) {
			return true;
		}
		return false;
	}
	
	public void anyadirPuntos()
	{
		String id = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el id del jugador");
		
		if(input.hasNextLine()){
			  id = input.nextLine();
		}
		
		Jugador j = campeonato.buscar(id);
		if(j != null) {
			
			int sumarP = 0;
			System.out.println("Introduce la puntuacion a anyadir al jugador");
			
			if(input.hasNextInt()){
				  sumarP = input.nextInt();
			}
			j.puntuacion += sumarP;
		} else System.out.println("El jugador no existe o se ha dado de baja en el sistema");
		
	}
	
	public void eliminarPuntos()
	{
		
		String id = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el id del jugador");
		
		if(input.hasNextLine()){
			  id = input.nextLine();
		}
		
		Jugador j = campeonato.buscar(id);
		if(j != null) {
			
			int restarP = 0;
			System.out.println("Introduce la puntuacion a restar al jugador");
			
			if(input.hasNextInt()){
				  restarP = input.nextInt();
			}
			j.puntuacion -= restarP;
		} else System.out.println("El jugador no existe o se ha dado de baja en el sistema");
		
	}
	
	
	public void eliminarJugador()
	{
		String id = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el nombre del jugador");
		
		if(input.hasNextLine()){
			  id = input.nextLine();
		}
				
		Jugador j = campeonato.buscar(id);
		if(j != null) {
			campeonato.eliminar(id);
		}
		else {
			System.out.println("No se ha encontrado el jugador");
		}
		
	}
	
	public void visualizarRonda(Jugador aux[])
	{
		Jugador auxiliar[] = new Jugador[aux.length];
		for(int i=0;i<aux.length;i++)
		{
			auxiliar[i] = aux[i];
		}
		QuickSort.quicksort(auxiliar, 0, auxiliar.length);
		
		for(int i=0;i<auxiliar.length;i++)
		{
			System.out.println((i+1)+" "+auxiliar[i].id +"con puntuacion "+auxiliar[i].puntuacion);
		}
	}
	
	public void verPuntuaciones(Jugador aux[])
	{
		Jugador auxiliar[] = new Jugador[aux.length];
		
		for(int i=0;i<aux.length;i++)
		{
			auxiliar[i].puntuacion = aux[i].puntuacion;
		}
		
		MergeSort.mergeSort(auxiliar);
		
		for(int i=0;i<auxiliar.length;i++)
		{
			System.out.println((i+1)+" "+auxiliar[i].puntuacion);
		}
	}

}
